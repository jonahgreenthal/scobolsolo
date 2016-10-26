package com.scobolsolo.menu;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public class Menu extends MenuItem {
	private final String myUrl;
	private final List<MenuItem> myItems;
	private TopLevelMenu myTopLevelInstance = null; // will be lazily initialized
	
	public Menu(final String argName, final String argUrl, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		super(argName, argTitle, argDD);
		
		myUrl = argUrl; // may be null
		myItems = Validate.notEmpty(argItems);
	}
	
	public Menu(final String argName, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		this(argName, null, argTitle, argItems, argDD);
	}
	
	public Menu(final String argName, final String argUrl, final String argTitle, final List<MenuItem> argItems) {
		this(argName, argUrl, argTitle, argItems, DisplayDeterminer.Always);
	}
	
	public Menu(final String argName, final String argTitle, final List<MenuItem> argItems) {
		this(argName, argTitle, argItems, DisplayDeterminer.Always);
	}
	
	// For renaming a Menu, basically
	public Menu(final String argName, final String argTitle, final Menu argBase) {
		this(argName, argTitle, argBase.getItems(), argBase.getDisplayDeterminer());
	}
	
	// For renaming a Menu, basically
	public Menu(final String argName, final String argTitle, final Menu argBase, final DisplayDeterminer argDD) {
		this(argName, argTitle, argBase.getItems(), argDD);
	}
	
	public boolean hasUrl() {
		return myUrl != null;
	}
	
	public String getUrl() {
		return myUrl;
	}
	
	public List<MenuItem> getItems() {
		return Collections.unmodifiableList(myItems);
	}
	
	public TopLevelMenu asTopLevel() {
		if (myTopLevelInstance == null) {
			myTopLevelInstance = new TopLevelMenu(this);
		}
		
		return myTopLevelInstance;
	}
	
	// A Menu is highlighted if it specifically is active, or any of its items is active
	@Override
	public boolean isHighlighted(final String argCurrentPageName) {
		if (argCurrentPageName == null) {
			return false;
		}
		
		if (getName().equalsIgnoreCase(argCurrentPageName)) {
			return true;
		} else {
			for (final MenuItem lclItem : getItems()) {
				if (lclItem.isHighlighted(argCurrentPageName)) {
					return true;
				}
			}
			
			return false;
		}
	}
	
	@Override
	public String output(final MenuType argMT, final Account argUser, final String argCurrentPageName) {
		Validate.notNull(argMT);
		// argUser and argCurrentPageName may be null
		
		if (display(argUser)) {
			final StringBuilder lclSB = new StringBuilder();
			switch (argMT) {
				case BOOTSTRAP:
					if (this instanceof TopLevelMenu) {
						lclSB.append("<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\n")
						     .append("	<div class=\"container-fluid\">\n")
						     .append("		<div class=\"navbar-header\">\n")
						     .append("			<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\" style=\"width: 30pt;\">\n")
						     .append("				<span class=\"sr-only\">Toggle navigation</span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("			</button>\n")
						     .append("		</div>\n")
						     .append("		<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n")
						     .append("			<p class=\"navbar-text\"><b>" + getTitle() + "</b></p>\n")
						     .append("			<ul class=\"nav navbar-nav\">\n");
					} else {
						if (isHighlighted(argCurrentPageName)) {
							lclSB.append("				<li class=\"dropdown active\">");
						} else {
							lclSB.append("				<li class=\"dropdown\">");
						}
						
						lclSB.append("					<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">" + getTitle() + " <span class=\"caret\"></span></a>\n")
						     .append("<ul class=\"dropdown-menu\" role=\"menu\">\n");
					}
					
					
					for (final MenuItem lclItem : getItems()) {
						lclSB.append(lclItem.output(argMT, argUser, argCurrentPageName))
						     .append('\n');
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("			</ul>\n");
					} else {
						lclSB.append("				</li>\n")
						     .append("			</ul>\n");
					}
					
					if (this instanceof TopLevelMenu && argUser != null) {
						lclSB.append("			<ul class=\"nav navbar-nav navbar-right\">\n")
						     .append("				<li title=\"Logged in as " + argUser.getContact().getName() + "\"><a href=\"/logout.jsp\">Log Out</a></li>\n")
						     .append("			</ul>\n");
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("		</div>\n")
						     .append("	</div>\n")
						     .append("</nav>\n\n");
					}
					
					return lclSB.toString();
				
				case FOUNDATION:
					if (this instanceof TopLevelMenu) {
						lclSB.append("<div class=\"title-bar\" data-responsive-toggle=\"main-menu\" data-hide-for=\"medium\">\n")
							 .append("	<button class=\"menu-icon\" type=\"button\" data-toggle></button>\n")
							 .append("	<div class=\"title-bar-title\">" + getTitle() + "</div>\n")
							 .append("</div>\n")
							 .append("<div class=\"top-bar\" id=\"main-menu\">\n")
							 .append("	<div class=\"top-bar-left\">\n")
							 .append("		<ul class=\"menu\" data-responsive-menu=\"drilldown medium-dropdown\">\n")
							 .append("			<li class=\"menu-text show-for-medium\">" + getTitle() + "</li>\n");
					} else {
						lclSB.append("			<li class=\"has-submenu\">\n")
							 .append("				<a href=\"" + (hasUrl() ? getUrl() : "#") + "\">" + getTitle() + "</a>\n")
							 .append("				<ul class=\"submenu menu vertical\" data-submenu>\n");
					}
					
					for (final MenuItem lclItem : getItems()) {
						lclSB.append("			" + lclItem.output(argMT, argUser, argCurrentPageName) + '\n');
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("		</ul>\n")
							 .append("	</div>\n");
						
						if (argUser != null) {
						lclSB.append("	<div class=\"top-bar-right\">\n")
							 .append("		<ul class=\"dropdown menu logged-in-container\" data-dropdown-menu>\n");
						
						if (argUser.getUnreadMessages().isEmpty()) {
							lclSB.append("			<li><a class=\"messages none-unread\" title=\"Messages (none unread)\" href=\"/messages/\" target=\"_blank\"><i class=\"fa fa-envelope-o\"></i></a></li>\n");
						} else {
							lclSB.append("			<li><a class=\"messages unread\" title=\"Messages (new!)\" href=\"/messages/\"><i class=\"fa fa-envelope\"></i></a></li>\n");
						}
						
						lclSB.append("			<li><a class=\"account\" title=\"Account settings\" href=\"/account/\"><i class=\"fa fa-gear\"></i></a></li>\n")
							 .append("			<li><a class=\"log-out\" title=\"Log out (currently logged in as " + argUser.getContact().getName() + ")\" href=\"/logout.jsp\"><i class=\"fa fa-sign-out\"></i></a></li>\n")
							 .append("		</ul>\n")
							 .append("	</div>\n");
						}
						
						lclSB.append("</div>\n");
					} else {
						lclSB.append("			</li>")
							 .append("		</ul>");
					}
					
					return lclSB.toString();
					
				default:
					throw new MenuType.UnknownMenuTypeException(argMT);
			}
		} else {
			return "";
		}
	}
}
