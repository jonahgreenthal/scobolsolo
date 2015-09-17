package com.scobolsolo.persistence;


/**
 * represents a {@code PlayerRecordV} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code player_record_v}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.PlayerRecordV}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PlayerRecordVFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.PlayerRecordV} and the {@link com.scobolsolo.application.PlayerRecordVFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface PlayerRecordVUserFacing extends com.opal.UserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code player_record_v}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.String getTournamentCode();

	/**
	 * object accessor for the {@code PlayerId}
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} field in {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of {@code PlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getPlayerIdAsObject();

	/**
	 * object accessor for the {@code PlayerId} with substitution for a null value
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PlayerId} is {@code null}.
	 * @return an object value of {@code PlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code PlayerId}
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code PlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code WinCount}
	 *
	 * <p>The {@code WinCount} field is a direct mapping of the {@code win_count} field in {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getWinCount() method.</p>
	 *
	 * @return an object value of {@code WinCount} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Long getWinCountAsObject();

	/**
	 * object accessor for the {@code WinCount} with substitution for a null value
	 *
	 * <p>The {@code WinCount} field is a direct mapping of the {@code win_count} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code WinCount} is {@code null}.
	 * @return an object value of {@code WinCount} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getWinCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code WinCount}
	 *
	 * <p>The {@code WinCount} field is a direct mapping of the {@code win_count} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getWinCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code WinCount} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public long getWinCount() throws com.opal.NullValueException {
		java.lang.Long lclO = getWinCountAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.longValue();
	}

	default public long getWinCount(long argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? lclO.longValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getWinCount(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getWinCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code LossCount}
	 *
	 * <p>The {@code LossCount} field is a direct mapping of the {@code loss_count} field in {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getLossCount() method.</p>
	 *
	 * @return an object value of {@code LossCount} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Long getLossCountAsObject();

	/**
	 * object accessor for the {@code LossCount} with substitution for a null value
	 *
	 * <p>The {@code LossCount} field is a direct mapping of the {@code loss_count} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code LossCount} is {@code null}.
	 * @return an object value of {@code LossCount} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getLossCountAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code LossCount}
	 *
	 * <p>The {@code LossCount} field is a direct mapping of the {@code loss_count} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getLossCountAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code LossCount} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public long getLossCount() throws com.opal.NullValueException {
		java.lang.Long lclO = getLossCountAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.longValue();
	}

	default public long getLossCount(long argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? lclO.longValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getLossCount(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getLossCountAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code Points}
	 *
	 * <p>The {@code Points} field is a direct mapping of the {@code points} field in {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPoints() method.</p>
	 *
	 * @return an object value of {@code Points} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getPointsAsObject();

	/**
	 * object accessor for the {@code Points} with substitution for a null value
	 *
	 * <p>The {@code Points} field is a direct mapping of the {@code points} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Points} is {@code null}.
	 * @return an object value of {@code Points} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPointsAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code Points}
	 *
	 * <p>The {@code Points} field is a direct mapping of the {@code points} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPointsAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code Points} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getPoints() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPointsAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPoints(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPoints(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPointsAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code TossupsHeard}
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} field in {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getTossupsHeard() method.</p>
	 *
	 * @return an object value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.Integer getTossupsHeardAsObject();

	/**
	 * object accessor for the {@code TossupsHeard} with substitution for a null value
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code TossupsHeard} is {@code null}.
	 * @return an object value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getTossupsHeardAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code TossupsHeard}
	 *
	 * <p>The {@code TossupsHeard} field is a direct mapping of the {@code tossups_heard} database column in the table {@code player_record_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getTossupsHeardAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code TossupsHeard} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getTossupsHeard() throws com.opal.NullValueException {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getTossupsHeard(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getTossupsHeard(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getTossupsHeardAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Tournament getTournament();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	public com.scobolsolo.application.Player getPlayer();
	public static class PlayerComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.PlayerRecordV> {
		private static final PlayerComparator ourInstance = new PlayerComparator();
		public static final PlayerComparator getInstance() { return ourInstance; }

		private PlayerComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.PlayerRecordV argFirst, com.scobolsolo.application.PlayerRecordV argSecond) {
			return com.scobolsolo.application.Player.NameComparator.getInstance().compare(argFirst.getPlayer(),  argSecond.getPlayer());
		}
	}

}
