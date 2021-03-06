package com.scobolsolo.persistence;


/**
 * represents a {@code CategoryUse} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code category_use}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.CategoryUse}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.CategoryUseFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.CategoryUse} and the {@link com.scobolsolo.application.CategoryUseFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface CategoryUseUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code CategoryCode}
	 *
	 * <p>The {@code CategoryCode} field is a direct mapping of the {@code category_code} field in {@code category_use}.</p>
	 *
	 * @return an object value of {@code CategoryCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getCategoryCode();

	/**
	 * sets the {@code CategoryCode} to the value of {@code argCategoryCode}
	 *
	 * @param argCategoryCode the new value of {@code CategoryCode}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code category_code} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argCategoryCode is null
	 * @throws com.opal.ArgumentTooLongException if {@code argCategoryCode} is longer than 32 characters
	 * <p>The database column {@code category_code} is limited to 32 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.CategoryUse setCategoryCode(java.lang.String argCategoryCode);

	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code category_use}.</p>
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
	public com.scobolsolo.application.CategoryUse setTournamentCode(java.lang.String argTournamentCode);

	/**
	 * object accessor for the {@code Needs}
	 *
	 * <p>The {@code Needs} field is a direct mapping of the {@code needs} field in {@code category_use}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getNeeds() method.</p>
	 *
	 * @return an object value of {@code Needs} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getNeedsAsObject();

	/**
	 * object accessor for the {@code Needs} with substitution for a null value
	 *
	 * <p>The {@code Needs} field is a direct mapping of the {@code needs} database column in the table {@code category_use}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Needs} is {@code null}.
	 * @return an object value of {@code Needs} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNeedsAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getNeedsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code Needs}
	 *
	 * <p>The {@code Needs} field is a direct mapping of the {@code needs} database column in the table {@code category_use}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getNeedsAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code Needs} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getNeeds() throws com.opal.NullValueException {
		java.lang.Integer lclO = getNeedsAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getNeeds(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getNeedsAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getNeeds(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getNeedsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code Needs} to the value of {@code argNeeds}
	 *
	 * @param argNeeds the new value of {@code Needs}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.CategoryUse setNeeds(java.lang.Integer argNeeds);

	/**
	 * sets the {@code Needs} to the value of {@code argNeeds}
	 *
	 * @param argNeeds the new value of {@code Needs}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.CategoryUse setNeeds(int argNeeds);

	/**
	 * @return the {@code com.scobolsolo.application.Category}
	 * The returned {@code com.scobolsolo.application.Category} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code category} that is referenced by {@code category_use_category_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Category getCategory();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.CategoryUse setCategory(com.scobolsolo.application.Category argCategory);

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code category_use_tournament_code_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.CategoryUse setTournament(com.scobolsolo.application.Tournament argTournament);

	public com.scobolsolo.application.CategoryUse copy();

}
