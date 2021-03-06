package com.scobolsolo.persistence;

import com.scobolsolo.application.StaffAssignment;

@com.opal.StoreGeneratedPrimaryKey
public final class StaffAssignmentOpal extends com.opal.UpdatableOpal<StaffAssignment> {


	private StaffAssignmentOpal() {
		super();
		setUserFacing(null);
	}

	public StaffAssignmentOpal(com.opal.IdentityOpalFactory<StaffAssignment, StaffAssignmentOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void initializeReferences() {
		myOldPhaseOpal = PhaseOpal.NOT_YET_LOADED;
		myOldStaffOpal = StaffOpal.NOT_YET_LOADED;
		myOldRoleOpal = StaffRoleOpal.NOT_YET_LOADED;
		myOldRoomOpal = RoomOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"RoomId",
		"Note",
		"StaffId",
		"PhaseId",
		"StaffRoleCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.lang.Integer.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		true,
		false,
		false,
		false,
	};

	/* package */ static final com.opal.FieldValidator[] ourFieldValidators = new com.opal.FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final StaffAssignmentOpal NOT_YET_LOADED = new StaffAssignmentOpal();

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

	public synchronized java.lang.Integer getRoomIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[1];
	}

	public synchronized java.lang.String getNote() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.Integer getStaffIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[3];
	}

	public synchronized java.lang.Integer getPhaseIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[4];
	}

	public synchronized java.lang.String getStaffRoleCode() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized StaffAssignmentOpal setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return this;
	}

	public StaffAssignmentOpal setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return this;
	}

	public synchronized StaffAssignmentOpal setRoomId(final java.lang.Integer argRoomId) {
		tryMutate();
		if (argRoomId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myRoomId on " + this + " to null.");
		}
		getNewValues()[1] = argRoomId;
		return this;
	}

	public StaffAssignmentOpal setRoomId(final int argRoomId) {
		setRoomId(java.lang.Integer.valueOf(argRoomId));
		return this;
	}

	public synchronized StaffAssignmentOpal setNote(final java.lang.String argNote) {
		tryMutate();
		getNewValues()[2] = argNote;
		return this;
	}

	public synchronized StaffAssignmentOpal setStaffId(final java.lang.Integer argStaffId) {
		tryMutate();
		if (argStaffId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myStaffId on " + this + " to null.");
		}
		getNewValues()[3] = argStaffId;
		return this;
	}

	public StaffAssignmentOpal setStaffId(final int argStaffId) {
		setStaffId(java.lang.Integer.valueOf(argStaffId));
		return this;
	}

	public synchronized StaffAssignmentOpal setPhaseId(final java.lang.Integer argPhaseId) {
		tryMutate();
		if (argPhaseId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myPhaseId on " + this + " to null.");
		}
		getNewValues()[4] = argPhaseId;
		return this;
	}

	public StaffAssignmentOpal setPhaseId(final int argPhaseId) {
		setPhaseId(java.lang.Integer.valueOf(argPhaseId));
		return this;
	}

	public synchronized StaffAssignmentOpal setStaffRoleCode(final java.lang.String argStaffRoleCode) {
		tryMutate();
		if (argStaffRoleCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myStaffRoleCode on " + this + " to null.");
		}
		if (argStaffRoleCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Cannot set myStaffRoleCode on " + this + " to \"" + argStaffRoleCode + "\" because that field's maximum length is 32.", argStaffRoleCode.length(), 32);
		}
		getNewValues()[5] = argStaffRoleCode;
		return this;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewPhaseOpal = myOldPhaseOpal;
		myNewStaffOpal = myOldStaffOpal;
		myNewRoleOpal = myOldRoleOpal;
		myNewRoomOpal = myOldRoomOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldPhaseOpal = myNewPhaseOpal;
		myOldStaffOpal = myNewStaffOpal;
		myOldRoleOpal = myNewRoleOpal;
		myOldRoomOpal = myNewRoomOpal;

		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getPhaseOpal() != null) {
			getPhaseOpal().getStaffAssignmentOpalSet().removeInternal(this);
		}
		if (getStaffOpal() != null) {
			getStaffOpal().getStaffAssignmentOpalSet().removeInternal(this);
		}
		if (getRoleOpal() != null) {
			getRoleOpal().getStaffAssignmentOpalSet().removeInternal(this);
		}
		if (getRoomOpal() != null) {
			getRoomOpal().getStaffAssignmentOpalSet().removeInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(com.opal.UpdatableOpal<StaffAssignment> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* RoomId (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* Note (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* StaffId (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* PhaseId (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* StaffRoleCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseId(myNewPhaseOpal == null ? null : myNewPhaseOpal.getIdAsObject());
		}
		if (myNewStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setStaffId(myNewStaffOpal == null ? null : myNewStaffOpal.getIdAsObject());
		}
		if (myNewRoleOpal != StaffRoleOpal.NOT_YET_LOADED) {
			setStaffRoleCode(myNewRoleOpal == null ? null : myNewRoleOpal.getCode());
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomId(myNewRoomOpal == null ? null : myNewRoomOpal.getIdAsObject());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		com.opal.UpdatableOpal<?> lclUO;
		lclUO = myNewPhaseOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewStaffOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoleOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewRoomOpal;
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
		if ((lclUO = myOldPhaseOpal) == PhaseOpal.NOT_YET_LOADED) {
			lclUO = myOldPhaseOpal = retrievePhaseOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldStaffOpal) == StaffOpal.NOT_YET_LOADED) {
			lclUO = myOldStaffOpal = retrieveStaffOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldRoleOpal) == StaffRoleOpal.NOT_YET_LOADED) {
			lclUO = myOldRoleOpal = retrieveRoleOpal(getOldValues());
		}
		if (lclUO != null && (lclUO.exists() == false)) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		if ((lclUO = myOldRoomOpal) == RoomOpal.NOT_YET_LOADED) {
			lclUO = myOldRoomOpal = retrieveRoomOpal(getOldValues());
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
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("StaffId = " + getStaffIdAsObject());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
		argOutput.println("StaffRoleCode = " + getStaffRoleCode());
	}

	@Override
	public synchronized void output(final java.io.PrintWriter argOutput) {
		argOutput.println("Id = " + getIdAsObject());
		argOutput.println("RoomId = " + getRoomIdAsObject());
		argOutput.println("Note = " + getNote());
		argOutput.println("StaffId = " + getStaffIdAsObject());
		argOutput.println("PhaseId = " + getPhaseIdAsObject());
		argOutput.println("StaffRoleCode = " + getStaffRoleCode());
	}

	private PhaseOpal myOldPhaseOpal;
	private PhaseOpal myNewPhaseOpal;

	protected PhaseOpal retrievePhaseOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
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

	public synchronized StaffAssignmentOpal setPhaseOpal(PhaseOpal argPhaseOpal) {
		tryMutate();
		PhaseOpal lclPhaseOpal = getPhaseOpal();
		if (lclPhaseOpal == argPhaseOpal) { return this; }
		if (lclPhaseOpal != null) {
			lclPhaseOpal.getStaffAssignmentOpalSet().removeInternal(this);
		}
		myNewPhaseOpal = argPhaseOpal;
		if (argPhaseOpal != null) {
			argPhaseOpal.getStaffAssignmentOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setPhaseOpalInternal(PhaseOpal argPhaseOpal) {
		tryMutate();
		myNewPhaseOpal = argPhaseOpal;
	}

	private StaffOpal myOldStaffOpal;
	private StaffOpal myNewStaffOpal;

	protected StaffOpal retrieveStaffOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[3] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffOpalFactory().forId(getStaffIdAsObject());
	}

	public synchronized StaffOpal getStaffOpal() {
		StaffOpal lclStaffOpal;
		boolean lclAccess = tryAccess();
		lclStaffOpal = lclAccess ? myNewStaffOpal : myOldStaffOpal;
		if (lclStaffOpal == StaffOpal.NOT_YET_LOADED) {
			lclStaffOpal = retrieveStaffOpal(getReadValueSet());
			if (lclAccess) {
				myNewStaffOpal = lclStaffOpal;
			} else {
				myOldStaffOpal = lclStaffOpal;
			}
		}
		return lclStaffOpal;
	}

	public synchronized StaffAssignmentOpal setStaffOpal(StaffOpal argStaffOpal) {
		tryMutate();
		StaffOpal lclStaffOpal = getStaffOpal();
		if (lclStaffOpal == argStaffOpal) { return this; }
		if (lclStaffOpal != null) {
			lclStaffOpal.getStaffAssignmentOpalSet().removeInternal(this);
		}
		myNewStaffOpal = argStaffOpal;
		if (argStaffOpal != null) {
			argStaffOpal.getStaffAssignmentOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setStaffOpalInternal(StaffOpal argStaffOpal) {
		tryMutate();
		myNewStaffOpal = argStaffOpal;
	}

	private StaffRoleOpal myOldRoleOpal;
	private StaffRoleOpal myNewRoleOpal;

	protected StaffRoleOpal retrieveRoleOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[5] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getStaffRoleOpalFactory().forCode(getStaffRoleCode());
	}

	public synchronized StaffRoleOpal getRoleOpal() {
		StaffRoleOpal lclStaffRoleOpal;
		boolean lclAccess = tryAccess();
		lclStaffRoleOpal = lclAccess ? myNewRoleOpal : myOldRoleOpal;
		if (lclStaffRoleOpal == StaffRoleOpal.NOT_YET_LOADED) {
			lclStaffRoleOpal = retrieveRoleOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoleOpal = lclStaffRoleOpal;
			} else {
				myOldRoleOpal = lclStaffRoleOpal;
			}
		}
		return lclStaffRoleOpal;
	}

	public synchronized StaffAssignmentOpal setRoleOpal(StaffRoleOpal argStaffRoleOpal) {
		tryMutate();
		StaffRoleOpal lclStaffRoleOpal = getRoleOpal();
		if (lclStaffRoleOpal == argStaffRoleOpal) { return this; }
		if (lclStaffRoleOpal != null) {
			lclStaffRoleOpal.getStaffAssignmentOpalSet().removeInternal(this);
		}
		myNewRoleOpal = argStaffRoleOpal;
		if (argStaffRoleOpal != null) {
			argStaffRoleOpal.getStaffAssignmentOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setRoleOpalInternal(StaffRoleOpal argStaffRoleOpal) {
		tryMutate();
		myNewRoleOpal = argStaffRoleOpal;
	}

	private RoomOpal myOldRoomOpal;
	private RoomOpal myNewRoomOpal;

	protected RoomOpal retrieveRoomOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getRoomOpalFactory().forId(getRoomIdAsObject());
	}

	public synchronized RoomOpal getRoomOpal() {
		RoomOpal lclRoomOpal;
		boolean lclAccess = tryAccess();
		lclRoomOpal = lclAccess ? myNewRoomOpal : myOldRoomOpal;
		if (lclRoomOpal == RoomOpal.NOT_YET_LOADED) {
			lclRoomOpal = retrieveRoomOpal(getReadValueSet());
			if (lclAccess) {
				myNewRoomOpal = lclRoomOpal;
			} else {
				myOldRoomOpal = lclRoomOpal;
			}
		}
		return lclRoomOpal;
	}

	public synchronized StaffAssignmentOpal setRoomOpal(RoomOpal argRoomOpal) {
		tryMutate();
		RoomOpal lclRoomOpal = getRoomOpal();
		if (lclRoomOpal == argRoomOpal) { return this; }
		if (lclRoomOpal != null) {
			lclRoomOpal.getStaffAssignmentOpalSet().removeInternal(this);
		}
		myNewRoomOpal = argRoomOpal;
		if (argRoomOpal != null) {
			argRoomOpal.getStaffAssignmentOpalSet().addInternal(this);
		}
		return this;
	}

	protected synchronized void setRoomOpalInternal(RoomOpal argRoomOpal) {
		tryMutate();
		myNewRoomOpal = argRoomOpal;
	}

	@Override
	public java.lang.String toString() {
		java.lang.StringBuilder lclSB = new java.lang.StringBuilder(64);
		lclSB.append("StaffAssignmentOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewPhaseOpal != PhaseOpal.NOT_YET_LOADED) {
			setPhaseOpal(retrievePhaseOpal(getNewValues()));
		}
		if (myNewStaffOpal != StaffOpal.NOT_YET_LOADED) {
			setStaffOpal(retrieveStaffOpal(getNewValues()));
		}
		if (myNewRoleOpal != StaffRoleOpal.NOT_YET_LOADED) {
			setRoleOpal(retrieveRoleOpal(getNewValues()));
		}
		if (myNewRoomOpal != RoomOpal.NOT_YET_LOADED) {
			setRoomOpal(retrieveRoomOpal(getNewValues()));
		}
	}

}
