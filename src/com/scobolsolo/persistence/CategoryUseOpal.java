package com.scobolsolo.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.scobolsolo.application.*;

public final class CategoryUseOpal extends com.opal.UpdatableOpal<CategoryUse> {

	private CategoryUseOpal() {
		super();
		setUserFacing(null);
	}

	public CategoryUseOpal(OpalFactory<CategoryUse, CategoryUseOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		myOldTournamentOpal = TournamentOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"CategoryCode",
		"TournamentCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.String.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
	};

	public static final CategoryUseOpal NOT_YET_LOADED = new CategoryUseOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[0];
	}

	public synchronized java.lang.String getTournamentCode() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized void setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryCode on " + this + " is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[0] = argCategoryCode;
		return;
	}

	public synchronized void setTournamentCode(final java.lang.String argTournamentCode) {
		tryMutate();
		if (argTournamentCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myTournamentCode on " + this + " to null.");
		}
		if (argTournamentCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myTournamentCode on " + this + " is 32.", argTournamentCode.length(), 32);
		}
		getNewValues()[1] = argTournamentCode;
		return;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewCategoryOpal = myOldCategoryOpal;
		myNewTournamentOpal = myOldTournamentOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldCategoryOpal = myNewCategoryOpal;
		myOldTournamentOpal = myNewTournamentOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getCategoryOpal() != null) {
			getCategoryOpal().removeCategoryUseOpalInternal(this);
		}
		if (getTournamentOpal() != null) {
			getTournamentOpal().removeCategoryUseOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<CategoryUse> argTarget) {
		/* Field 0 (CategoryCode) is part of a unique key. */
		/* Field 1 (TournamentCode) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryCode(myNewCategoryOpal == null ? null : myNewCategoryOpal.getCode());
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentCode(myNewTournamentOpal == null ? null : myNewTournamentOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredPriorCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewTournamentOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldTournamentOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldCategoryOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], getOldValues()[1], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("CategoryCode = " + getCategoryCode());
		argPW.println("TournamentCode = " + getTournamentCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("CategoryCode = " + getCategoryCode());
		argPS.println("TournamentCode = " + getTournamentCode());
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCode(getCategoryCode());
	}

	public synchronized CategoryOpal getCategoryOpal() {
		CategoryOpal lclCategoryOpal;
		boolean lclAccess = tryAccess();
		lclCategoryOpal = lclAccess ? myNewCategoryOpal : myOldCategoryOpal;
		if (lclCategoryOpal == CategoryOpal.NOT_YET_LOADED) {
			lclCategoryOpal = retrieveCategoryOpal(getReadValueSet());
			if (lclAccess) {
				myNewCategoryOpal = lclCategoryOpal;
			} else {
				myOldCategoryOpal = lclCategoryOpal;
			}
		}
		return lclCategoryOpal;
	}

	public synchronized void setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.removeCategoryUseOpalInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.addCategoryUseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	private TournamentOpal myOldTournamentOpal;
	private TournamentOpal myNewTournamentOpal;

	protected TournamentOpal retrieveTournamentOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getTournamentOpalFactory().forCode(getTournamentCode());
	}

	public synchronized TournamentOpal getTournamentOpal() {
		TournamentOpal lclTournamentOpal;
		boolean lclAccess = tryAccess();
		lclTournamentOpal = lclAccess ? myNewTournamentOpal : myOldTournamentOpal;
		if (lclTournamentOpal == TournamentOpal.NOT_YET_LOADED) {
			lclTournamentOpal = retrieveTournamentOpal(getReadValueSet());
			if (lclAccess) {
				myNewTournamentOpal = lclTournamentOpal;
			} else {
				myOldTournamentOpal = lclTournamentOpal;
			}
		}
		return lclTournamentOpal;
	}

	public synchronized void setTournamentOpal(TournamentOpal argTournamentOpal) {
		tryMutate();
		TournamentOpal lclTournamentOpal = getTournamentOpal();
		if (lclTournamentOpal == argTournamentOpal) { return; }
		if (lclTournamentOpal != null) {
			lclTournamentOpal.removeCategoryUseOpalInternal(this);
		}
		myNewTournamentOpal = argTournamentOpal;
		if (argTournamentOpal != null) {
			argTournamentOpal.addCategoryUseOpalInternal(this);
		}
		return;
	}

	protected synchronized void setTournamentOpalInternal(TournamentOpal argTournamentOpal) {
		tryMutate();
		myNewTournamentOpal = argTournamentOpal;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("CategoryUseOpal[");
		lclSB.append("myCategoryCode=");
		lclSB.append(toStringField(0));
		lclSB.append(',');
		lclSB.append("myTournamentCode=");
		lclSB.append(toStringField(1));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
		if (myNewTournamentOpal != TournamentOpal.NOT_YET_LOADED) {
			setTournamentOpal(retrieveTournamentOpal(getNewValues()));
		}
	}

}
