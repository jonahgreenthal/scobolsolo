package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Response;
import com.scobolsolo.application.ResponseImpl;
import com.scobolsolo.persistence.ResponseOpal;
import com.scobolsolo.persistence.ResponseOpalFactory;

public class PostgresResponseOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Response, ResponseOpal> implements ResponseOpalFactory {
	private static final PostgresResponseOpalFactory ourInstance = new PostgresResponseOpalFactory();

	public static final PostgresResponseOpalFactory getInstance() { return ourInstance; }

	protected PostgresResponseOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"performance_id", 
		"placement_id", 
		"response_type_code", 
		"replacement_for_placement_id", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return ResponseOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return ResponseOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return ResponseOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return ResponseOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected ResponseOpal instantiate(Object[] argValues) {
		return new ResponseOpal(this, argValues);
	}

	@Override
	public ResponseOpal create() {
		ResponseOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new ResponseImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(ResponseOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new ResponseImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, ResponseOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") ResponseOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "response";
	}

	@Override
	protected void registerNewOpal(ResponseOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(ResponseOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(ResponseOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 5) { throw new IllegalStateException(); }
		OpalCache<ResponseOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new PerformanceIdPlacementIdOpalKey((java.lang.Integer) argValues[1], (java.lang.Integer) argValues[2]), argOpal, true);
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(ResponseOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		OpalCache<ResponseOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new PerformanceIdPlacementIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]));
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(ResponseOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 5) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 5) { throw new IllegalStateException(); }
		OpalCache<ResponseOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<ResponseOpal> lclOldKey = null;
			OpalKey<ResponseOpal> lclNewKey = null;
			if (true) {
				if (!(lclNewValues[1].equals(lclOldValues[1]) && lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new PerformanceIdPlacementIdOpalKey((java.lang.Integer) lclNewValues[1], (java.lang.Integer) lclNewValues[2]);
					if (true) {
						lclOldKey = new PerformanceIdPlacementIdOpalKey((java.lang.Integer) lclOldValues[1], (java.lang.Integer) lclOldValues[2]);
					}
				}
			}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
			if (true) {
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new IdOpalKey((java.lang.Integer) lclNewValues[0]);
					if (true) {
						lclOldKey = new IdOpalKey((java.lang.Integer) lclOldValues[0]);
					}
				}
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
	protected OpalKey<ResponseOpal> createOpalKeyForReloading(ResponseOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<ResponseOpal> forPerformanceIdCollection(java.lang.Integer argPerformanceId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argPerformanceId };
		final String[] lclFieldNames = new String[] { "performance_id" };
		java.util.HashSet<ResponseOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<ResponseOpal> forPlacementIdCollection(java.lang.Integer argPlacementId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argPlacementId };
		final String[] lclFieldNames = new String[] { "placement_id" };
		java.util.HashSet<ResponseOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public com.siliconage.util.Fast3Set<ResponseOpal> forReplacementForPlacementIdCollection(java.lang.Integer argReplacementForPlacementId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argReplacementForPlacementId };
		final String[] lclFieldNames = new String[] { "replacement_for_placement_id" };
		com.siliconage.util.Fast3Set<ResponseOpal> lclCollection = new com.siliconage.util.Fast3Set<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public ResponseOpal forPerformanceIdPlacementId(java.lang.Integer argPerformanceId, java.lang.Integer argPlacementId) throws PersistenceException {
		OpalKey<ResponseOpal> lclOpalKey = new PerformanceIdPlacementIdOpalKey(argPerformanceId, argPlacementId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public ResponseOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<ResponseOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<ResponseOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class PerformanceIdPlacementIdOpalKey extends com.opal.MultipleValueDatabaseOpalKey<ResponseOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"performance_id", "placement_id", };

		public PerformanceIdPlacementIdOpalKey(java.lang.Integer argPerformanceId, java.lang.Integer argPlacementId) {
			super(new Object[] {argPerformanceId, argPlacementId, });
		}

		@Override
		public Object[] getParameters() {
			return getFields();
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<ResponseOpal> {
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
	public ResponseOpal forUniqueString(String argUniqueString) {
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
