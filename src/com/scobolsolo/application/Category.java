package com.scobolsolo.application;

import java.util.Comparator;

import com.scobolsolo.persistence.CategoryUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link CategoryFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Category extends CategoryUserFacing, Comparable<Category> {
	static final Comparator<Category> NATURAL_COMPARATOR = Comparator.comparing(Category::getCategoryGroup).thenComparing(Category::getSequence);
	
	@Override
	default int compareTo(Category that) {
		return NATURAL_COMPARATOR.compare(this, that);
	}
	
	default boolean isUsedAt(Tournament argT) {
		return argT != null && streamCategoryUse().anyMatch(argCU -> argCU.getTournament() == argT);
	}
}
