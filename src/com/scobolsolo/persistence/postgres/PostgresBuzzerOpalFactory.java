package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Buzzer;
import com.scobolsolo.persistence.BuzzerImpl;
import com.scobolsolo.persistence.BuzzerOpal;
import com.scobolsolo.persistence.BuzzerOpalFactory;

public class PostgresBuzzerOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Buzzer, BuzzerOpal> implements BuzzerOpalFactory {
	private static final PostgresBuzzerOpalFactory ourInstance = new PostgresBuzzerOpalFactory();

	public static final PostgresBuzzerOpalFactory getInstance() { return ourInstance; }

	protected PostgresBuzzerOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"school_registration_id", 
		"room_id", 
		"name", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return BuzzerOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return BuzzerOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return BuzzerOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return BuzzerOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected BuzzerOpal instantiate(Object[] argValues) {
		return new BuzzerOpal(this, argValues);
	}

	@Override
	public BuzzerOpal create() {
		BuzzerOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new BuzzerImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(BuzzerOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new BuzzerImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, BuzzerOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") BuzzerOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "buzzer";
	}

	@Override
	protected void registerNewOpal(BuzzerOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(BuzzerOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(BuzzerOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<BuzzerOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(BuzzerOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<BuzzerOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(BuzzerOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<BuzzerOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<BuzzerOpal> lclOldKey = null;
			OpalKey<BuzzerOpal> lclNewKey = null;
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
	protected OpalKey<BuzzerOpal> createOpalKeyForReloading(BuzzerOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<BuzzerOpal> forSchoolRegistrationIdCollection(java.lang.Integer argSchoolRegistrationId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argSchoolRegistrationId };
		final String[] lclFieldNames = new String[] { "school_registration_id" };
		java.util.HashSet<BuzzerOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<BuzzerOpal> forRoomIdCollection(java.lang.Integer argRoomId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argRoomId };
		final String[] lclFieldNames = new String[] { "room_id" };
		java.util.HashSet<BuzzerOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public BuzzerOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<BuzzerOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<BuzzerOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<BuzzerOpal> {
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
	public BuzzerOpal forUniqueString(String argUniqueString) {
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
