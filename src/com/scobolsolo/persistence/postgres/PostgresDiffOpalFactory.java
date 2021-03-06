package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.Diff;
import com.scobolsolo.persistence.DiffImpl;
import com.scobolsolo.persistence.DiffOpal;
import com.scobolsolo.persistence.DiffOpalFactory;

public class PostgresDiffOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Diff, DiffOpal> implements DiffOpalFactory {
	private static final PostgresDiffOpalFactory ourInstance = new PostgresDiffOpalFactory();

	public static final PostgresDiffOpalFactory getInstance() { return ourInstance; }

	protected PostgresDiffOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"editor_account_id", 
		"text", 
		"answer", 
		"note", 
		"remark", 
		"edit_distance", 
		"timestamp", 
		"question_id", 
		"revision_number", 
		"question_status_code", 
		"category_code", 
		"text_length", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return DiffOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return DiffOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return DiffOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return DiffOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected DiffOpal instantiate(Object[] argValues) {
		return new DiffOpal(this, argValues);
	}

	@Override
	public DiffOpal create() {
		DiffOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new DiffImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(DiffOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new DiffImpl(argO));
	}

	@Override
	public boolean hasGeneratedKeys() {
		return true;
	}

	@Override
	protected void processGeneratedKeys(java.sql.ResultSet argRS, DiffOpal argOpal) {
		try {
			argOpal.setId(argRS.getInt("id"));
		} catch (SQLException lclE) {
			throw new PersistenceException("Could not process generated keys.");
		}
	}

	protected void newObject(@SuppressWarnings("unused") DiffOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "diff";
	}

	@Override
	protected void registerNewOpal(DiffOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(DiffOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(DiffOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 13) { throw new IllegalStateException(); }
		OpalCache<DiffOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(DiffOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 13) { throw new IllegalStateException(); }
		OpalCache<DiffOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(DiffOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 13) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 13) { throw new IllegalStateException(); }
		OpalCache<DiffOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<DiffOpal> lclOldKey = null;
			OpalKey<DiffOpal> lclNewKey = null;
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
	protected OpalKey<DiffOpal> createOpalKeyForReloading(DiffOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<DiffOpal> forEditorAccountIdCollection(java.lang.Integer argEditorAccountId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argEditorAccountId };
		final String[] lclFieldNames = new String[] { "editor_account_id" };
		java.util.HashSet<DiffOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<DiffOpal> forQuestionIdCollection(java.lang.Integer argQuestionId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argQuestionId };
		final String[] lclFieldNames = new String[] { "question_id" };
		java.util.HashSet<DiffOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<DiffOpal> forQuestionStatusCodeCollection(java.lang.String argQuestionStatusCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argQuestionStatusCode };
		final String[] lclFieldNames = new String[] { "question_status_code" };
		java.util.HashSet<DiffOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public DiffOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<DiffOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<DiffOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.SingleValueDatabaseOpalKey<DiffOpal> {
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
	public DiffOpal forUniqueString(String argUniqueString) {
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
