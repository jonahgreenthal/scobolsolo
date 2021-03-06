package com.scobolsolo.persistence;


/**
 * represents a {@code Performance} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code performance}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.Performance}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.PerformanceFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.Performance} and the {@link com.scobolsolo.application.PerformanceFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
	@com.opal.annotation.Creatability(creatable = true)
	@com.opal.annotation.Updatability(updatable = true)
public interface PerformanceUserFacing extends com.opal.IdentityUserFacing {

	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code performance}.</p>
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
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code performance}.</p>
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
	public com.scobolsolo.application.Performance setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setId(int argId);

	/**
	 * object accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} field in {@code performance}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getGameId() method.</p>
	 *
	 * @return an object value of {@code GameId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getGameIdAsObject();

	/**
	 * primitive accessor for the {@code GameId}
	 *
	 * <p>The {@code GameId} field is a direct mapping of the {@code game_id} database column in the table {@code performance}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getGameIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code GameId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getGameId() {
		java.lang.Integer lclO = getGameIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code GameId} to the value of {@code argGameId}
	 *
	 * @param argGameId the new value of {@code GameId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code game_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argGameId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setGameId(java.lang.Integer argGameId);

	/**
	 * sets the {@code GameId} to the value of {@code argGameId}
	 *
	 * @param argGameId the new value of {@code GameId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setGameId(int argGameId);

	/**
	 * object accessor for the {@code PlayerId}
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} field in {@code performance}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getPlayerId() method.</p>
	 *
	 * @return an object value of {@code PlayerId} (of the current {@link com.opal.TransactionContext})  Will not be <code>null</code>.
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	public java.lang.Integer getPlayerIdAsObject();

	/**
	 * primitive accessor for the {@code PlayerId}
	 *
	 * <p>The {@code PlayerId} field is a direct mapping of the {@code player_id} database column in the table {@code performance}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getPlayerIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code PlayerId} (of the current {@link com.opal.TransactionContext})
	 */
	default public int getPlayerId() {
		java.lang.Integer lclO = getPlayerIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code PlayerId} to the value of {@code argPlayerId}
	 *
	 * @param argPlayerId the new value of {@code PlayerId}.  May not be <code>null</code>.
	 * @return itself, so that mutator calls can be chained fluently
	 * <p>The database column {@code player_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws com.opal.IllegalNullArgumentException if argPlayerId is null
	 */
	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setPlayerId(java.lang.Integer argPlayerId);

	/**
	 * sets the {@code PlayerId} to the value of {@code argPlayerId}
	 *
	 * @param argPlayerId the new value of {@code PlayerId}
	 * @return itself, so that mutators may be chained fluently
	 */
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setPlayerId(int argPlayerId);

	/**
	 * @return the {@code com.scobolsolo.application.Game}
	 * The returned {@code com.scobolsolo.application.Game} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code game} that is referenced by {@code performance_game_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Game getGame();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setGame(com.scobolsolo.application.Game argGame);

	/**
	 * @return the {@code com.scobolsolo.application.Player}
	 * The returned {@code com.scobolsolo.application.Player} is the {@link com.opal.UserFacing} object corresponding to the entry in {@code player} that is referenced by {@code performance_player_id_fkey}.
	 *
	 */
	@com.opal.annotation.Nullability(nullable = false)
	public com.scobolsolo.application.Player getPlayer();
	@com.opal.annotation.RequiresActiveTransaction
	public com.scobolsolo.application.Performance setPlayer(com.scobolsolo.application.Player argPlayer);

	public java.util.Set<com.scobolsolo.application.Response> getResponseSet();

	default public java.util.stream.Stream<com.scobolsolo.application.Response> streamResponse() {
		return getResponseSet().stream();
	}

	default public com.scobolsolo.application.Response[] createResponseArray() {
		java.util.Set<com.scobolsolo.application.Response> lclS = getResponseSet();
		return lclS.toArray(new com.scobolsolo.application.Response[lclS.size()]);
	}

	public com.scobolsolo.application.Performance copy();

	/** This is a Comparator that can be used to compare Performance objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Performance> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Performance argFirst, com.scobolsolo.application.Performance argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class PlayerNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.Performance> {
		private static final PlayerNameComparator ourInstance = new PlayerNameComparator();
		public static final PlayerNameComparator getInstance() { return ourInstance; }

		private PlayerNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.Performance argFirst, com.scobolsolo.application.Performance argSecond) {
			return com.scobolsolo.application.Player.NameComparator.getInstance().compare(argFirst.getPlayer(),  argSecond.getPlayer());
		}
	}

}
