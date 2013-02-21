;(function ($, window, document, undefined) {
  'use strict';

  $.fn.timer = function(time_in_ms) {
    var INTERVAL_TIME = 250,
        time = time_in_ms,
        timer,
        start,
        $el = this;

    this.stop = function() {
      clearInterval(timer);
      time = time - (new Date().getTime() - start);
    };

    this.start = function() {
      clearInterval(timer);
      start = new Date().getTime();
      timer = setInterval(function() {
        var now = time - (new Date().getTime() - start);
        if (now <= 0) {
          clearInterval(timer);
          $el.trigger('timer:complete');
          $el.unbind('timer:progress');
          $el.unbind('timer:complete');
          $el.unbind('timer:start');
          $el.unbind('timer:stop');
        } else {
          $el.trigger('timer:progress', [(time-now)/time]);
        }
      }, INTERVAL_TIME);
    };

    $el.bind('timer:start', this.start);
    $el.bind('timer:stop', this.stop);

    return this;
  };

  Foundation.libs = Foundation.libs || {};

  Foundation.libs.orbit = {
    version: '4.0.0.alpha',

    settings: {
      timer: 1500,
      slide_delay: 500
    },

    init: function(scope, method, options) {
      var self = this;
      $('[data-orbit]', scope).each($.proxy(self._init, self));
    },

    _init: function(idx, slider) {
      var data = {};
      data.$container = $(slider).wrap('<div class="orbit-container"></div>').parent();
      data.$container.append('<a data-orbit-prev href="#">Prev</a>');
      data.$container.append('<a data-orbit-next href="#">Next</a>');
      data.$slides_container = $(slider).addClass('orbit-slides');
      data.$slides = data.$slides_container.children();
      data.activeIndex = 0;
      data.self = this;
      this._init_events(data);
      this._init_dimensions(data);
      this._start_timer(data);
    },

    _init_events: function(data) {
      $(window).on('resize', function() {
        data.$slides_container.height('');
        data.$slides_container.height(data.$slides_container.height(data.$container.height()));
      });
      data.$container.on('click', '[data-orbit-prev]', function(e) {
        e.preventDefault();
        data.$container.trigger('timer:stop');
        data.self.goto(data, 'prev');
      });
      data.$container.on('click', '[data-orbit-next]', function(e) {
        e.preventDefault();
        data.$container.trigger('timer:stop');
        data.self.goto(data, 'next');
      });
    },

    _init_dimensions: function(data) {
      data.$slides_container.css('width', data.$slides.length * 100 + '%');
      data.$slides.css('width', 100 / data.$slides.length + '%');
      data.$slides_container.height(data.$container.height());
      data.$slides_container.css('width', data.$slides.length * 100 + '%');
    },

    _start_timer: function(data) {
      data.$container.timer(data.self.settings.timer);
      data.$container.on('timer:complete', function() {
        data.$container.unbind('timer:complete');
        data.self.goto(data, 'next', function() {
          data.self._start_timer(data);
        });
      });
      data.$container.trigger('timer:start');
    },

    goto: function(data, index_or_direction, callback) {
      if (index_or_direction === 'prev') {
        if (data.activeIndex === 0) {
          data.activeIndex = data.$slides.length - 1;
        }
        else {
          data.activeIndex--;
        }
      }
      else if (index_or_direction === 'next') {
        data.activeIndex = (data.activeIndex+1)%data.$slides.length;
      }
      else if (typeof index_or_direction === 'number') {
        data.activeIndex = (index%data.$slides.length);
      }
      data.$slides_container.animate({
        'marginLeft' : '-' + (data.activeIndex*100) + '%'
      }, 'linear', data.self.settings.slide_delay, callback);
    }
  }

}(Foundation.zj, this, this.document));
