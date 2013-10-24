module.exports = function(grunt) {
  var manifest = require('./manifest.json');

  grunt.initConfig({

    assemble: {
      options: {
        flatten: true,
        assets: 'dist/docs/assets',
        data: ['doc/data/*.{json,yml}']
      },
      docs: {
        options: {
          partials: ['doc/includes/*.hbs'],
          helpers: ['doc/helpers/*.js'],
          layout: 'doc/layouts/default.hbs'
        },
        src: 'doc/pages/*.hbs',
        dest: 'dist/docs/'
      }
    },

    sass: {
      dist: {
        files: {
          'dist/assets/foundation.css': 'scss/foundation.scss',
        }
      },
      docs: {
        options: {
          includePaths: ['scss']
        },
        files: {
          'dist/docs/assets/css/docs.css': 'doc/assets/scss/docs.scss'
        }
      }
    },

    concat: {
      options: {},
      dist: {
        files: {
          'dist/assets/foundation.js': ['js/foundation/foundation.js', 'js/foundation/foundation.*.js'],
          'dist/assets/all.js': ['js/vendor/jquery.js', 'js/vendor/fastclick.js', 'dist/foundation.js'],
          'dist/assets/custom.modernizr.js': ['js/vendor/custom.modernizr.js'],
          'dist/assets/foundation.scss': manifest.sass
        }
      },
      docs: {
        files: {
          'dist/docs/assets/js/custom.modernizr.js': ['js/vendor/custom.modernizr.js'],
          'dist/docs/assets/js/all.js': ['js/vendor/jquery.js', 'js/vendor/fastclick.js', 'js/foundation/foundation.js', 'js/foundation/foundation.*.js']
        }
      }
    },

    copy: {
      docs: {
        cwd: 'doc/assets/img/',
        expand: true,
        filter: 'isFile',
        src: '**/*',
        dest: 'dist/docs/img/'
      }
    },

    clean: ['dist/'],

    watch: {
      styles: {
        files: ['scss/**/*.scss', 'doc/assets/scss/**/*.scss'],
        tasks: ['sass', 'assemble:docs']
      },
      js: {
        files: ['js/**/*.js', 'doc/assets/js/**/*.js'],
        tasks: ['concat:dist']
      },
      docs: {
        files: ['doc/**/*'],
        tasks: ['assemble:docs']
      },
      docs_assets: {
        files: ['doc/assets/img/**/*'],
        tasks: ['copy:docs']
      }
    }
  });
  
  grunt.loadNpmTasks('grunt-sass');
  grunt.loadNpmTasks('grunt-contrib-connect');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-contrib-concat');
  grunt.loadNpmTasks('grunt-contrib-copy');
  grunt.loadNpmTasks('grunt-contrib-clean');
  grunt.loadNpmTasks('assemble');

  grunt.registerTask('compile', ['clean', 'sass', 'concat', 'copy', 'assemble:docs'])
  grunt.registerTask('default', ['compile', 'watch']);
};