package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Room;
import com.scobolsolo.persistence.RoomImpl;
import com.scobolsolo.persistence.RoomOpal;
import com.scobolsolo.persistence.RoomOpalFactory;

public class PostgresRoomOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Room, RoomOpal> implements RoomOpalFactory {
	private static final PostgresRoomOpalFactory ourInstance = new PostgresRoomOpalFactory();

	public static final PostgresRoomOpalFactory getInstance() { return ourInstance; }

	protected PostgresRoomOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"name", 
		"short_name", 
		"note", 
		"tournament_code", 
		"sequence", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return RoomOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return RoomOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return RoomOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return RoomOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected RoomOpal instantiate(Object[] argValues) {
		return new RoomOpal(this, argValues);
	}

	@Override
	public RoomOpal create() {
		RoomOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new RoomImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(RoomOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new RoomImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, RoomOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") RoomOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "room";
	}

	@Override
	protected void registerNewOpal(RoomOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(RoomOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(RoomOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<RoomOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameTournamentCodeOpalKey((java.lang.String) argValues[1], (java.lang.String) argValues[4]), argOpal, true);
			lclOC.addOpal(new ShortNameTournamentCodeOpalKey((java.lang.String) argValues[2], (java.lang.String) argValues[4]), argOpal, true);
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(RoomOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<RoomOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameTournamentCodeOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[4]));
			lclOC.removeOpal(new ShortNameTournamentCodeOpalKey((java.lang.String) lclOldValues[2], (java.lang.String) lclOldValues[4]));
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(RoomOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 6) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 6) { throw new IllegalStateException(); }
		OpalCache<RoomOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<RoomOpal> lclOldKey = null;
			OpalKey<RoomOpal> lclNewKey = null;
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[4].equals(lclOldValues[4]))) {
					lclNewKey = new NameTournamentCodeOpalKey((java.lang.String) lclNewValues[1], (java.lang.String) lclNewValues[4]);
						lclOldKey = new NameTournamentCodeOpalKey((java.lang.String) lclOldValues[1], (java.lang.String) lclOldValues[4]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[2].equals(lclOldValues[2]) && lclNewValues[4].equals(lclOldValues[4]))) {
					lclNewKey = new ShortNameTournamentCodeOpalKey((java.lang.String) lclNewValues[2], (java.lang.String) lclNewValues[4]);
						lclOldKey = new ShortNameTournamentCodeOpalKey((java.lang.String) lclOldValues[2], (java.lang.String) lclOldValues[4]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
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
	protected OpalKey<RoomOpal> createOpalKeyForReloading(RoomOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<RoomOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		java.util.HashSet<RoomOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public RoomOpal forNameTournamentCode(java.lang.String argName, java.lang.String argTournamentCode) throws PersistenceException {
		OpalKey<RoomOpal> lclOpalKey = new NameTournamentCodeOpalKey(argName, argTournamentCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public RoomOpal forShortNameTournamentCode(java.lang.String argShortName, java.lang.String argTournamentCode) throws PersistenceException {
		OpalKey<RoomOpal> lclOpalKey = new ShortNameTournamentCodeOpalKey(argShortName, argTournamentCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public RoomOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<RoomOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<RoomOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class NameTournamentCodeOpalKey extends com.opal.MultipleValueDatabaseOpalKey<RoomOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", "tournament_code", };

		public NameTournamentCodeOpalKey(java.lang.String argName, java.lang.String argTournamentCode) {
			super(new Object[] {argName, argTournamentCode, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNameTournamentCodeOpalKey extends com.opal.MultipleValueDatabaseOpalKey<RoomOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", "tournament_code", };

		public ShortNameTournamentCodeOpalKey(java.lang.String argShortName, java.lang.String argTournamentCode) {
			super(new Object[] {argShortName, argTournamentCode, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<RoomOpal> {
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
	public RoomOpal forUniqueString(String argUniqueString) {
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
