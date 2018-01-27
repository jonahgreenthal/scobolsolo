package com.scobolsolo.persistence;


/**
 * represents a {@code PlayerMatchV} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code player_match_v}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.PlayerMatchV}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PlayerMatchVFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.PlayerMatchV} and the {@link com.scobolsolo.application.PlayerMatchVFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = false)
	@com.opal.annotation.Updatability(updatable = false)
public interface PlayerMatchVUserFacing extends com.opal.UserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code TournamentCode}
	 *
	 * <p>The {@code TournamentCode} field is a direct mapping of the {@code tournament_code} field in {@code player_match_v}.</p>
	 *
	 * @return an object value of {@code TournamentCode} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	public java.lang.String getTournamentCode();

	/**
	 * object accessor for the {@code PlayerId}
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of {@code PlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getPlayerIdAsObject();

	/**
	 * object accessor for the {@code PlayerId} with substitution for a null value
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} database column in the table {@code player_match_v}.</p>
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
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} database column in the table {@code player_match_v}.</p>
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
	 * object accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getSchoolRegistrationId() method.</p>
	 *
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getSchoolRegistrationIdAsObject();

	/**
	 * object accessor for the {@code SchoolRegistrationId} with substitution for a null value
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code SchoolRegistrationId} is {@code null}.
	 * @return an object value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getSchoolRegistrationIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code SchoolRegistrationId}
	 *
	 * <p>The {@code SchoolRegistrationId} field is a direct mapping of the {@code school_registration_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getSchoolRegistrationIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code SchoolRegistrationId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getSchoolRegistrationId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getSchoolRegistrationId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getSchoolRegistrationId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getSchoolRegistrationIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code PerformanceId}
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPerformanceId() method.</p>
	 *
	 * @return an object value of {@code PerformanceId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getPerformanceIdAsObject();

	/**
	 * object accessor for the {@code PerformanceId} with substitution for a null value
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code PerformanceId} is {@code null}.
	 * @return an object value of {@code PerformanceId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code PerformanceId}
	 *
	 * <p>The {@code PerformanceId} field is a direct mapping of the {@code performance_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code PerformanceId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code OpponentPlayerId}
	 *
	 * <p>The {@code OpponentPlayerId} field is a direct mapping of the {@code opponent_player_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOpponentPlayerId() method.</p>
	 *
	 * @return an object value of {@code OpponentPlayerId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getOpponentPlayerIdAsObject();

	/**
	 * object accessor for the {@code OpponentPlayerId} with substitution for a null value
	 *
	 * <p>The {@code OpponentPlayerId} field is a direct mapping of the {@code opponent_player_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code OpponentPlayerId} is {@code null}.
	 * @return an object value of {@code OpponentPlayerId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getOpponentPlayerIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code OpponentPlayerId}
	 *
	 * <p>The {@code OpponentPlayerId} field is a direct mapping of the {@code opponent_player_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getOpponentPlayerIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code OpponentPlayerId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getOpponentPlayerId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOpponentPlayerId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOpponentPlayerId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPlayerIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code OpponentPerformanceId}
	 *
	 * <p>The {@code OpponentPerformanceId} field is a direct mapping of the {@code opponent_performance_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getOpponentPerformanceId() method.</p>
	 *
	 * @return an object value of {@code OpponentPerformanceId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getOpponentPerformanceIdAsObject();

	/**
	 * object accessor for the {@code OpponentPerformanceId} with substitution for a null value
	 *
	 * <p>The {@code OpponentPerformanceId} field is a direct mapping of the {@code opponent_performance_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code OpponentPerformanceId} is {@code null}.
	 * @return an object value of {@code OpponentPerformanceId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getOpponentPerformanceIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code OpponentPerformanceId}
	 *
	 * <p>The {@code OpponentPerformanceId} field is a direct mapping of the {@code opponent_performance_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getOpponentPerformanceIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code OpponentPerformanceId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getOpponentPerformanceId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getOpponentPerformanceId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getOpponentPerformanceId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getOpponentPerformanceIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code MatchId}
	 *
	 * <p>The {@code MatchId} field is a direct mapping of the {@code match_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getMatchId() method.</p>
	 *
	 * @return an object value of {@code MatchId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getMatchIdAsObject();

	/**
	 * object accessor for the {@code MatchId} with substitution for a null value
	 *
	 * <p>The {@code MatchId} field is a direct mapping of the {@code match_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code MatchId} is {@code null}.
	 * @return an object value of {@code MatchId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getMatchIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code MatchId}
	 *
	 * <p>The {@code MatchId} field is a direct mapping of the {@code match_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getMatchIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code MatchId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getMatchId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getMatchIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getMatchId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getMatchId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getMatchIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of {@code GameId} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getGameIdAsObject();

	/**
	 * object accessor for the {@code GameId} with substitution for a null value
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code GameId} is {@code null}.
	 * @return an object value of {@code GameId} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getGameIdAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getGameIdAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code GameId} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getGameId() throws com.opal.NullValueException {
		java.lang.Integer lclO = getGameIdAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getGameId(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getGameId(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code Score}
	 *
	 * <p>The {@code Score} field is a direct mapping of the {@code score} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getScore() method.</p>
	 *
	 * @return an object value of {@code Score} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Long getScoreAsObject();

	/**
	 * object accessor for the {@code Score} with substitution for a null value
	 *
	 * <p>The {@code Score} field is a direct mapping of the {@code score} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Score} is {@code null}.
	 * @return an object value of {@code Score} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getScoreAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code Score}
	 *
	 * <p>The {@code Score} field is a direct mapping of the {@code score} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getScoreAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code Score} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public long getScore() throws com.opal.NullValueException {
		java.lang.Long lclO = getScoreAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.longValue();
	}

	default public long getScore(long argStringToSubstituteIfNull) {
		java.lang.Long lclO = getScoreAsObject();
		return lclO != null ? lclO.longValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getScore(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Long lclO = getScoreAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * object accessor for the {@code AverageCorrectBuzzDepth}
	 *
	 * <p>The {@code AverageCorrectBuzzDepth} field is a direct mapping of the {@code average_correct_buzz_depth} field in {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getAverageCorrectBuzzDepth() method.</p>
	 *
	 * @return an object value of {@code AverageCorrectBuzzDepth} (of the current {@link com.opal.TransactionContext})  May be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = false)
	@com.opal.annotation.Nullability(nullable = true)
	public java.lang.Integer getAverageCorrectBuzzDepthAsObject();

	/**
	 * object accessor for the {@code AverageCorrectBuzzDepth} with substitution for a null value
	 *
	 * <p>The {@code AverageCorrectBuzzDepth} field is a direct mapping of the {@code average_correct_buzz_depth} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code AverageCorrectBuzzDepth} is {@code null}.
	 * @return an object value of {@code AverageCorrectBuzzDepth} (of the current {@link com.opal.TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getAverageCorrectBuzzDepthAsObject(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getAverageCorrectBuzzDepthAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * primitive accessor for the {@code AverageCorrectBuzzDepth}
	 *
	 * <p>The {@code AverageCorrectBuzzDepth} field is a direct mapping of the {@code average_correct_buzz_depth} database column in the table {@code player_match_v}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getAverageCorrectBuzzDepthAsObject() method.</p>
	 *
	 * <p>The underlying database table allows a {@code NULL} value for this column; calling this method when the value is null will result in an Exception.  To test for a null value, use the Object accessor mentioned above.</p>
	 *
	 * @return the primitive value of {@code AverageCorrectBuzzDepth} (of the current {@link com.opal.TransactionContext})
	 * @throws com.opal.NullValueException when the internal value is null
	 */
	default public int getAverageCorrectBuzzDepth() throws com.opal.NullValueException {
		java.lang.Integer lclO = getAverageCorrectBuzzDepthAsObject();
		if (lclO == null) {
			throw new com.opal.NullValueException("The internal value is null and cannot be returned as a primitive.");
		}
		return lclO.intValue();
	}

	default public int getAverageCorrectBuzzDepth(int argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getAverageCorrectBuzzDepthAsObject();
		return lclO != null ? lclO.intValue() : argStringToSubstituteIfNull;
	}

	default public java.lang.String getAverageCorrectBuzzDepth(java.lang.String argStringToSubstituteIfNull) {
		java.lang.Integer lclO = getAverageCorrectBuzzDepthAsObject();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}

	/**
	 * @return the {@code com.scobolsolo.application.Game}
	 * The returned {@code com.scobolsolo.application.Game} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code game} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Game getGame();
	/**
	 * @return the {@code com.scobolsolo.application.Tournament}
	 * The returned {@code com.scobolsolo.application.Tournament} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code tournament} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Tournament getTournament();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Player getOpponentPlayer();
	/**
	 * @return the {@code com.scobolsolo.application.Match}
	 * The returned {@code com.scobolsolo.application.Match} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code match} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Match getMatch();
	/**
	 * @return the {@code com.scobolsolo.application.SchoolRegistration}
	 * The returned {@code com.scobolsolo.application.SchoolRegistration} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code school_registration} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.SchoolRegistration getSchoolRegistration();
	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Performance getPerformance();
	/**
	 * @return the {@code com.scobolsolo.application.Performance}
	 * The returned {@code com.scobolsolo.application.Performance} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code performance} that is referenced by {@code UNNAMED_INFERRED_KEY}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = true)
	public com.scobolsolo.application.Performance getOpponentPerformance();
}
