package com.scobolsolo.application;

import java.util.Comparator;

import com.scobolsolo.persistence.CategoryUseUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link CategoryUseFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface CategoryUse extends CategoryUseUserFacing {
	public static final Comparator<CategoryUse> CATEGORY_COMPARATOR = Comparator.comparing(CategoryUse::getCategory);
	public static final Comparator<CategoryUse> TOURNAMENT_COMPARATOR = Comparator.comparing(CategoryUse::getTournament);
}
