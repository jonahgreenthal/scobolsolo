package com.scobolsolo.persistence;

import com.scobolsolo.application.Card;

@com.opal.StoreGeneratedPrimaryKey
public final class CardOpal extends com.opal.UpdatableOpal<Card> {


	private CardOpal() {
		super();
		setUserFacing(null);
	}

	public CardOpal(com.opal.IdentityOpalFactory<Card, CardOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {

		/* Initialize the back Collections to empty sets. */

		myLosingMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourLosingMatchOpalLoader,
				true
				);
		myWinningMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
				this,
				ourWinningMatchOpalLoader,
				true
				);

		return;
	}

	@Override
	protected void initializeReferences() {
		myOldInitialPlayerOpal = PlayerOpal.NOT_YET_LOADED;
		myOldPhaseOpal = PhaseOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"Name",
		"ShortName",
		"Sequence",
		"FinalMessage",
		"PhaseId",
		"InitialPlayerId",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		false,
		false,
		true,
		false,
		true,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final CardOpal NOT_YET_LOADED = new CardOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public com.opal.FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static com.opal.FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.String getName() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getShortName() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getSequenceAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.String getFinalMessage() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.Integer getPhaseIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getInitialPlayerIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized CardOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public CardOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized CardOpal setName(final java.lang.String argName) {
		tryMutate();
		if (argName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myName on " + this + " to null.");
		}
		if (argName.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Cannot set myName on " + this + " to \"" + argName + "\" because that field's maximum length is 256.", argName.length(), 256);
		}
		getNewValues()[1] = argName;
		return this;
	}

	public synchronized CardOpal setShortName(final java.lang.String argShortName) {
		tryMutate();
		if (argShortName == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myShortName on " + this + " to null.");
		}
		if (argShortName.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myShortName on " + this + " to \"" + argShortName + "\" because that field's maximum length is 32.", argShortName.length(), 32);
		}
		getNewValues()[2] = argShortName;
		return this;
	}

	public synchronized CardOpal setSequence(final java.lang.Integer argSequence) {
		tryMutate();
		if (argSequence == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set mySequence on " + this + " to null.");
		}
		getNewValues()[3] = argSequence;
		return this;
	}

	public CardOpal setSequence(final int argSequence) {
		setSequence(java.lang.Integer.valueOf(argSequence));
		return this;
	}

	public synchronized CardOpal setFinalMessage(final java.lang.String argFinalMessage) {
		tryMutate();
		getNewValues()[4] = argFinalMessage;
		return this;
	}

	public synchronized CardOpal setPhaseId(final java.lang.Integer argPhaseId) {
		tryMutate();
		if (argPhaseId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPhaseId on " + this + " to null.");
		}
		getNewValues()[5] = argPhaseId;
		return this;
	}

	public CardOpal setPhaseId(final int argPhaseId) {
		setPhaseId(java.lang.Integer.valueOf(argPhaseId));
		return this;
	}

	public synchronized CardOpal setInitialPlayerId(final java.lang.Integer argInitialPlayerId) {
		tryMutate();
		getNewValues()[6] = argInitialPlayerId;
		return this;
	}

	public CardOpal setInitialPlayerId(final int argInitialPlayerId) {
		setInitialPlayerId(java.lang.Integer.valueOf(argInitialPlayerId));
		return this;
	}

	private boolean myClearOldCollections = false;

	protected boolean needsToClearOldCollections() {
		return myClearOldCollections;
	}

	protected final void setClearOldCollections(boolean argValue) {
		myClearOldCollections = argValue;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewInitialPlayerOpal = myOldInitialPlayerOpal;
		myNewPhaseOpal = myOldPhaseOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldInitialPlayerOpal = myNewInitialPlayerOpal;
		myOldPhaseOpal = myNewPhaseOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		getLosingMatchOpalSet().clear();
		getWinningMatchOpalSet().clear();
		if (getInitialPlayerOpal() != null) {
			getInitialPlayerOpal().setInitialCardOpalInternal(null);
		}
		if (getPhaseOpal() != null) {
			getPhaseOpal().getCardOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<Card> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		/* Field 1 (Name) is part of a unique key. */
		/* Field 2 (ShortName) is part of a unique key. */
		lclTargetNewValues[3] = lclValues[3]; /* Sequence (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* FinalMessage (immutable) */
		/* Field 5 (PhaseId) is part of a unique key. */
		/* Field 6 (InitialPlayerId) is part of a unique key. */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewInitialPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setInitialPlayerId(myNewInitialPlayerOpal == null ? null : myNewInitialPlayerOpal.getIdAsObject());
		}
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseId(myNewPhaseOpal == null ? null : myNewPhaseOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewInitialPlayerOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewPhaseOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		if (isNew()) {
			return java.util.Collections.emptySet();
		}
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		if ((lclUO = myOldInitialPlayerOpal) == PlayerOpal.NOT_YET_LOADED) {
			lclUO = myOldInitialPlayerOpal = retrieveInitialPlayerOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldPhaseOpal) == PhaseOpal.NOT_YET_LOADED) {
			lclUO = myOldPhaseOpal = retrievePhaseOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final java.io.PrintStream argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("FinalMessage = " + getFinalMessage());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
		argOutput.println("InitialPlayerId = " + getInitialPlayerIdAsObject());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("Name = " + getName());
		argOutput.println("ShortName = " + getShortName());
		argOutput.println("Sequence = " + getSequenceAsObject());
		argOutput.println("FinalMessage = " + getFinalMessage());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
		argOutput.println("InitialPlayerId = " + getInitialPlayerIdAsObject());
	}

	private PlayerOpal myOldInitialPlayerOpal;
	private PlayerOpal myNewInitialPlayerOpal;

	protected PlayerOpal retrieveInitialPlayerOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[6] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlayerOpalFactory().forId(getInitialPlayerIdAsObject());
	}

	public synchronized PlayerOpal getInitialPlayerOpal() {
		PlayerOpal lclPlayerOpal;
		boolean lclAccess = tryAccess();
		lclPlayerOpal = lclAccess ? myNewInitialPlayerOpal : myOldInitialPlayerOpal;
		if (lclPlayerOpal == PlayerOpal.NOT_YET_LOADED) {
			lclPlayerOpal = retrieveInitialPlayerOpal(getReadValueSet());
			if (lclAccess) {
				myNewInitialPlayerOpal = lclPlayerOpal;
			} else {
				myOldInitialPlayerOpal = lclPlayerOpal;
			}
		}
		return lclPlayerOpal;
	}

	public synchronized CardOpal setInitialPlayerOpal(PlayerOpal argPlayerOpal) {
		tryMutate();
		if (myNewInitialPlayerOpal != null && myNewInitialPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			myNewInitialPlayerOpal.setInitialCardOpalInternal(null);
		}
		myNewInitialPlayerOpal = argPlayerOpal;
		if (argPlayerOpal != null) {
			argPlayerOpal.setInitialCardOpalInternal(this);
		}
		return this;
	}

	protected synchronized void setInitialPlayerOpalInternal(PlayerOpal argPlayerOpal) {
		tryMutate();
		myNewInitialPlayerOpal = argPlayerOpal;
	}

	private PhaseOpal myOldPhaseOpal;
	private PhaseOpal myNewPhaseOpal;

	protected PhaseOpal retrievePhaseOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPhaseOpalFactory().forId(getPhaseIdAsObject());
	}

	public synchronized PhaseOpal getPhaseOpal() {
		PhaseOpal lclPhaseOpal;
		boolean lclAccess = tryAccess();
		lclPhaseOpal = lclAccess ? myNewPhaseOpal : myOldPhaseOpal;
		if (lclPhaseOpal == PhaseOpal.NOT_YET_LOADED) {
			lclPhaseOpal = retrievePhaseOpal(getReadValueSet());
			if (lclAccess) {
				myNewPhaseOpal = lclPhaseOpal;
			} else {
				myOldPhaseOpal = lclPhaseOpal;
			}
		}
		return lclPhaseOpal;
	}

	public synchronized CardOpal setPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		PhaseOpal lclPhaseOpal = getPhaseOpal();
		if (lclPhaseOpal == argPhaseOpal) { return this; }
		if (lclPhaseOpal != null) {
			lclPhaseOpal.getCardOpalSet().removeInternal(this);
		}
		myNewPhaseOpal = argPhaseOpal;
		if (argPhaseOpal != null) {
			argPhaseOpal.getCardOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		myNewPhaseOpal = argPhaseOpal;
	}

	private com.opal.types.OpalBackCollectionSet<MatchOpal, CardOpal> myLosingMatchSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<MatchOpal, CardOpal> ourLosingMatchOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forLosingCardOpalCollection,
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forLosingCardOpalCount,
					MatchOpal::setLosingCardOpal,
					MatchOpal::setLosingCardOpalInternal,
					MatchOpal::getLosingCardOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<MatchOpal, CardOpal> getLosingMatchOpalSet() {
		if (myLosingMatchSet == null) {
			myLosingMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourLosingMatchOpalLoader,
					isNew()
					);
		}
		return myLosingMatchSet;
	}

	private com.opal.types.OpalBackCollectionSet<MatchOpal, CardOpal> myWinningMatchSet = null;

	private static final com.opal.types.OpalBackCollectionLoader<MatchOpal, CardOpal> ourWinningMatchOpalLoader = 
			new com.opal.types.OpalBackCollectionLoader<>(
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forWinningCardOpalCollection,
					OpalFactoryFactory.getInstance().getMatchOpalFactory()::forWinningCardOpalCount,
					MatchOpal::setWinningCardOpal,
					MatchOpal::setWinningCardOpalInternal,
					MatchOpal::getWinningCardOpal,
					com.scobolsolo.application.FactoryMap.getNoArgCtorSetCreator(),
					com.scobolsolo.application.FactoryMap.getCollectionArgSetCreator(),
					true
					);

	/* package */ synchronized com.opal.types.OpalBackCollectionSet<MatchOpal, CardOpal> getWinningMatchOpalSet() {
		if (myWinningMatchSet == null) {
			myWinningMatchSet = new com.opal.types.OpalBackCollectionDoubleSet<>(
					this,
					ourWinningMatchOpalLoader,
					isNew()
					);
		}
		return myWinningMatchSet;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("CardOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewInitialPlayerOpal != PlayerOpal.NOT_YET_LOADED) {
			setInitialPlayerOpal(retrieveInitialPlayerOpal(getNewValues()));
		}
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseOpal(retrievePhaseOpal(getNewValues()));
		}
	}

	@Override
	protected void updateCollectionsAfterReload() {
		assert needsToClearOldCollections() == false;
		setClearOldCollections(true);
	}

}
