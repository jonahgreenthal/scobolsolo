package com.scobolsolo.persistence;


/**
 * represents a {@code Question} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code question}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Question}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.QuestionFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Question} and the {@link com.scobolsolo.application.QuestionFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface QuestionUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code question}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code question}.</p>
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
	public com.scobolsolo.application.Question setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Question setId(int argId);

	/**
	 * object accessor for the {@code Description}
	 *
	 * <p>The {@code Description} field is a direct mapping of the {@code description} field in {@code question}.</p>
	 *
	 * @return an object value of {@code Description} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	public java.lang.String getDescription();

	/**
	 * object accessor for the {@code Description} with substitution for a null value
	 *
	 * <p>The {@code Description} field is a direct mapping of the {@code description} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Description} is {@code null}.
	 * @return an object value of {@code Description} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getDescription(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getDescription();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Description} to the value of {@code argDescription}
	 *
	 * @param argDescription the new value of {@code Description}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * @throws com.opal.ArgumentTooLongException if {@code argDescription} is longer than 2147483647 characters
	 * <p>The database column {@code description} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Question setDescription(java.lang.String argDescription);

	/**
	 * object accessor for the {@code WriterAccountId}
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} field in {@code question}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWriterAccountId() method.</p>
	 *
	 * @return an object value of {@code WriterAccountId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getWriterAccountIdAsObject();

	/**
	 * object accessor for the {@code WriterAccountId} with substitution for a null value
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WriterAccountId} is {@code null}.
	 * @return an object value of {@code WriterAccountId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWriterAccountIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WriterAccountId}
	 *
	 * <p>The {@code WriterAccountId} field is a direct mapping of the {@code writer_account_id} database column in the table {@code question}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWriterAccountIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WriterAccountId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getWriterAccountId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getWriterAccountId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWriterAccountId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getWriterAccountIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * sets the {@code WriterAccountId} to the value of {@code argWriterAccountId}
	 *
	 * @param argWriterAccountId the new value of {@code WriterAccountId}.  May be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Question setWriterAccountId(java.lang.Integer argWriterAccountId);

	/**
	 * sets the {@code WriterAccountId} to the value of {@code argWriterAccountId}
	 *
	 * @param argWriterAccountId the new value of {@code WriterAccountId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Question setWriterAccountId(int argWriterAccountId);

	/**
	 * @return the {@code com.scobolsolo.application.Account}
	 * The returned {@code com.scobolsolo.application.Account} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code account} that is referenced by {@code question_writer_account_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Account getWriter();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Question setWriter(com.scobolsolo.application.Account argWriter);

	public java.util.Set<com.scobolsolo.application.Diff> getDiffSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Diff> streamDiff() {
		return getDiffSet().stream();
	}

	default public com.scobolsolo.application.Diff[] createDiffArray() {
		java.util.Set<com.scobolsolo.application.Diff> lclS = getDiffSet();
		return lclS.toArray(new com.scobolsolo.application.Diff[lclS.size()]);
	}

	public java.util.Set<com.scobolsolo.application.Placement> getPlacementSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Placement> streamPlacement() {
		return getPlacementSet().stream();
	}

	default public com.scobolsolo.application.Placement[] createPlacementArray() {
		java.util.Set<com.scobolsolo.application.Placement> lclS = getPlacementSet();
		return lclS.toArray(new com.scobolsolo.application.Placement[lclS.size()]);
	}

	public com.scobolsolo.application.Question copy();

	/** This is a Comparator that can be used to compare Question objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Question> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Question argFirst, com.scobolsolo.application.Question argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	/** This is a Comparator that can be used to compare Question objects based on their {@code Description} values. */

	public static class DescriptionComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Question> {
		private static final DescriptionComparator ourInstance = new DescriptionComparator();
		public static final DescriptionComparator getInstance() { return ourInstance; }

		private DescriptionComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Question argFirst, com.scobolsolo.application.Question argSecond) {
			return nullSafeCompareIgnoreCase(argFirst.getDescription(), argSecond.getDescription());
		}
	}

}
