package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Player;
import com.scobolsolo.persistence.PlayerImpl;
import com.scobolsolo.persistence.PlayerOpal;
import com.scobolsolo.persistence.PlayerOpalFactory;

public class PostgresPlayerOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Player, PlayerOpal> implements PlayerOpalFactory {
	private static final PostgresPlayerOpalFactory ourInstance = new PostgresPlayerOpalFactory();

	public static final PostgresPlayerOpalFactory getInstance() { return ourInstance; }

	protected PostgresPlayerOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"contact_id", 
		"school_registration_id", 
		"school_year_code", 
		"rank_within_school", 
		"seed", 
		"note", 
		"exhibition", 
		"final_place", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return PlayerOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return PlayerOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return PlayerOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return PlayerOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected PlayerOpal instantiate(Object[] argValues) {
		return new PlayerOpal(this, argValues);
	}

	@Override
	public PlayerOpal create() {
		PlayerOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new PlayerImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(PlayerOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new PlayerImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, PlayerOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") PlayerOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "player";
	}

	@Override
	protected void registerNewOpal(PlayerOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(PlayerOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(PlayerOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PlayerOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(PlayerOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PlayerOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(PlayerOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 9) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 9) { throw new IllegalStateException(); }
		OpalCache<PlayerOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<PlayerOpal> lclOldKey = null;
			OpalKey<PlayerOpal> lclNewKey = null;
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new IdOpalKey((java.lang.Integer) lclNewValues[0]);
						lclOldKey = new IdOpalKey((java.lang.Integer) lclOldValues[0]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
		}
		return;
	}

	@Override
	protected String[] getPrimaryKeyWhereClauseColumns() {
		return ourPrimaryKeyWhereClauseColumns;
	}

	@Override
	protected OpalKey<PlayerOpal> createOpalKeyForReloading(PlayerOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<PlayerOpal> forContactIdCollection(java.lang.Integer argContactId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argContactId };
		final String[] lclFieldNames = new String[] { "contact_id" };
		java.util.HashSet<PlayerOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<PlayerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argSchoolRegistrationId };
		final String[] lclFieldNames = new String[] { "school_registration_id" };
		java.util.HashSet<PlayerOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public PlayerOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<PlayerOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<PlayerOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<PlayerOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(argId);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public PlayerOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 1;
		return forOpalKey(
			new IdOpalKey(
				java.lang.Integer.valueOf(lclArgs[0])
			)
		);
	}

}
