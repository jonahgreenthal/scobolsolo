package com.scobolsolo.persistence;


/**
 * represents a {@code Phase} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code phase}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Phase}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PhaseFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Phase} and the {@link com.scobolsolo.application.PhaseFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface PhaseUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code phase}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code phase}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setId(int argId);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code phase}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getTournamentCode();

	/**
	 * sets the {@code TournamentCode} to the value of {@code argTournamentCode}
	 *
	 * @param argTournamentCode the new value of {@code TournamentCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code tournament_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argTournamentCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argTournamentCode} is longer than 32 characters
	 * <p>The database column {@code tournament_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the {@code Name}
	 *
	 * <p>The {@code Name} field is a direct mapping of the {@code name} field in {@code phase}.</p>
	 *
	 * @return an object value of {@code Name} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	public java.lang.String getName();

	/**
	 * sets the {@code Name} to the value of {@code argName}
	 *
	 * @param argName the new value of {@code Name}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argName} is longer than 256 characters
	 * <p>The database column {@code name} is limited to 256 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 256L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setName(java.lang.String argName);

	/**
	 * object accessor for the {@code ShortName}
	 *
	 * <p>The {@code ShortName} field is a direct mapping of the {@code short_name} field in {@code phase}.</p>
	 *
	 * @return an object value of {@code ShortName} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getShortName();

	/**
	 * sets the {@code ShortName} to the value of {@code argShortName}
	 *
	 * @param argShortName the new value of {@code ShortName}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code short_name} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argShortName is null
	 * @throws com.opal.ArgumentTooLongException if {@code argShortName} is longer than 32 characters
	 * <p>The database column {@code short_name} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setShortName(java.lang.String argShortName);

	/**
	 * object accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} field in {@code phase}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSequence() method.</p>
	 *
	 * @return an object value of {@code Sequence} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getSequenceAsObject();

	/**
	 * primitive accessor for the {@code Sequence}
	 *
	 * <p>The {@code Sequence} field is a direct mapping of the {@code sequence} database column in the table {@code phase}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSequenceAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Sequence} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getSequence() {
		java.lang.Integer lclO = getSequenceAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code sequence} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argSequence is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setSequence(java.lang.Integer argSequence);

	/**
	 * sets the {@code Sequence} to the value of {@code argSequence}
	 *
	 * @param argSequence the new value of {@code Sequence}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setSequence(int argSequence);

	/**
	 * object accessor for the {@code CardSystem}
	 *
	 * <p>The {@code CardSystem} field is a direct mapping of the {@code card_system} field in {@code phase}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the isCardSystem() method.</p>
	 *
	 * @return an object value of {@code CardSystem} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Boolean isCardSystemAsObject();

	/**
	 * primitive accessor for the {@code CardSystem}
	 *
	 * <p>The {@code CardSystem} field is a direct mapping of the {@code card_system} database column in the table {@code phase}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the isCardSystemAsObject() method.</p>
	 *
	 * @return the primitive value of {@code CardSystem} (of the current {@link com.opal.TransactionContext})
	 */
	default public boolean isCardSystem() {
		java.lang.Boolean lclO = isCardSystemAsObject();
		return lclO.booleanValue();
	}

	/**
	 * sets the {@code CardSystem} to the value of {@code argCardSystem}
	 *
	 * @param argCardSystem the new value of {@code CardSystem}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code card_system} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCardSystem is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setCardSystem(java.lang.Boolean argCardSystem);

	/**
	 * sets the {@code CardSystem} to the value of {@code argCardSystem}
	 *
	 * @param argCardSystem the new value of {@code CardSystem}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setCardSystem(boolean argCardSystem);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code phase}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code phase}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setNote(java.lang.String argNote);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code phase_tournament_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Phase setTournament(com.scobolsolo.application.Tournament argTournament);

	public java.util.Set<com.scobolsolo.application.StaffAssignment> getStaffAssignmentSet();

	default public java.util.stream.Stream<com.scobolsolo.application.StaffAssignment> streamStaffAssignment() {
		return getStaffAssignmentSet().stream();
	}

	default public com.scobolsolo.application.StaffAssignment[] createStaffAssignmentArray() {
		java.util.Set<com.scobolsolo.application.StaffAssignment> lclS = getStaffAssignmentSet();
		return lclS.toArray(new com.scobolsolo.application.StaffAssignment[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Round> getRoundSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Round> streamRound() {
		return getRoundSet().stream();
	}

	default public com.scobolsolo.application.Round[] createRoundArray() {
		java.util.Set<com.scobolsolo.application.Round> lclS = getRoundSet();
		return lclS.toArray(new com.scobolsolo.application.Round[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Card> getCardSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Card> streamCard() {
		return getCardSet().stream();
	}

	default public com.scobolsolo.application.Card[] createCardArray() {
		java.util.Set<com.scobolsolo.application.Card> lclS = getCardSet();
		return lclS.toArray(new com.scobolsolo.application.Card[lclS.size()]);
	}

	public com.scobolsolo.application.Phase copy();

	/** This is a Comparator that can be used to compare Phase objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Phase> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Phase argFirst, com.scobolsolo.application.Phase argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Phase objects based on their {@code Name} values. */

	public static class NameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Phase> {
		private static final NameComparator ourInstance = new NameComparator();
		public static final NameComparator getInstance() { return ourInstance; }

		private NameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Phase argFirst, com.scobolsolo.application.Phase argSecond) {
			return argFirst.getName().compareToIgnoreCase(argSecond.getName());
		}
	}

	/** This is a Comparator that can be used to compare Phase objects based on their {@code ShortName} values. */

	public static class ShortNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Phase> {
		private static final ShortNameComparator ourInstance = new ShortNameComparator();
		public static final ShortNameComparator getInstance() { return ourInstance; }

		private ShortNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Phase argFirst, com.scobolsolo.application.Phase argSecond) {
			return argFirst.getShortName().compareToIgnoreCase(argSecond.getShortName());
		}
	}

	/** This is a Comparator that can be used to compare Phase objects based on their {@code Sequence} values. */

	public static class SequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Phase> {
		private static final SequenceComparator ourInstance = new SequenceComparator();
		public static final SequenceComparator getInstance() { return ourInstance; }

		private SequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Phase argFirst, com.scobolsolo.application.Phase argSecond) {
			return argFirst.getSequenceAsObject().compareTo(argSecond.getSequenceAsObject());
		}
	}

}
