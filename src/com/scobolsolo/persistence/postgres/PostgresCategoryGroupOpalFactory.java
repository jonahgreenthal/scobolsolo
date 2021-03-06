package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opal.OpalCache;
import com.opal.OpalKey;
import com.opal.OpalUtility;
import com.opal.PersistenceException;

import com.scobolsolo.application.CategoryGroup;
import com.scobolsolo.persistence.CategoryGroupImpl;
import com.scobolsolo.persistence.CategoryGroupOpal;
import com.scobolsolo.persistence.CategoryGroupOpalFactory;

public class PostgresCategoryGroupOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<CategoryGroup, CategoryGroupOpal> implements CategoryGroupOpalFactory {
	private static final PostgresCategoryGroupOpalFactory ourInstance = new PostgresCategoryGroupOpalFactory();

	public static final PostgresCategoryGroupOpalFactory getInstance() { return ourInstance; }

	protected PostgresCategoryGroupOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"code", 
		"name", 
		"short_name", 
		"sequence", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"code",};

	@Override
	protected String[] getFieldNames() { return CategoryGroupOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return CategoryGroupOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return CategoryGroupOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return CategoryGroupOpal.getStaticFieldValidators(); }

	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected CategoryGroupOpal instantiate(Object[] argValues) {
		return new CategoryGroupOpal(this, argValues);
	}

	@Override
	public CategoryGroupOpal create() {
		CategoryGroupOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new CategoryGroupImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(CategoryGroupOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new CategoryGroupImpl(argO));
	}

	protected void newObject(@SuppressWarnings("unused") CategoryGroupOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "category_group";
	}

	@Override
	protected void registerNewOpal(CategoryGroupOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(CategoryGroupOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(CategoryGroupOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<CategoryGroupOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.addOpal(new NameOpalKey((java.lang.String) argValues[1]), argOpal, true);
			lclOC.addOpal(new CodeOpalKey((java.lang.String) argValues[0]), argOpal, true);
			lclOC.addOpal(new ShortNameOpalKey((java.lang.String) argValues[2]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(CategoryGroupOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<CategoryGroupOpal> lclOC = getCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new NameOpalKey((java.lang.String) lclOldValues[1]));
			lclOC.removeOpal(new CodeOpalKey((java.lang.String) lclOldValues[0]));
			lclOC.removeOpal(new ShortNameOpalKey((java.lang.String) lclOldValues[2]));
		}
	}

	@Override
	public void updateKeys(CategoryGroupOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 4) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 4) { throw new IllegalStateException(); }
		OpalCache<CategoryGroupOpal> lclOC = getCache();
		synchronized (lclOC) {
			OpalKey<CategoryGroupOpal> lclOldKey = null;
			OpalKey<CategoryGroupOpal> lclNewKey = null;
				if (!(lclNewValues[1].equals(lclOldValues[1]))) {
					lclNewKey = new NameOpalKey((java.lang.String) lclNewValues[1]);
						lclOldKey = new NameOpalKey((java.lang.String) lclOldValues[1]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[0].equals(lclOldValues[0]))) {
					lclNewKey = new CodeOpalKey((java.lang.String) lclNewValues[0]);
						lclOldKey = new CodeOpalKey((java.lang.String) lclOldValues[0]);
				}
			if (lclOldKey != null) { lclOC.removeOpal(lclOldKey); lclOldKey = null; }
			if (lclNewKey != null) { lclOC.addOpal(lclNewKey, argOpal, true); lclNewKey = null; } /* true = SoftReference */
				if (!(lclNewValues[2].equals(lclOldValues[2]))) {
					lclNewKey = new ShortNameOpalKey((java.lang.String) lclNewValues[2]);
						lclOldKey = new ShortNameOpalKey((java.lang.String) lclOldValues[2]);
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
	protected OpalKey<CategoryGroupOpal> createOpalKeyForReloading(CategoryGroupOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new CodeOpalKey((java.lang.String) lclValues[0]);
	}

	@Override
	public CategoryGroupOpal forName(java.lang.String argName) throws PersistenceException {
		OpalKey<CategoryGroupOpal> lclOpalKey = new NameOpalKey(argName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public CategoryGroupOpal forCode(java.lang.String argCode) throws PersistenceException {
		OpalKey<CategoryGroupOpal> lclOpalKey = new CodeOpalKey(argCode);
		return forOpalKey(lclOpalKey);
	}

	@Override
	public CategoryGroupOpal forShortName(java.lang.String argShortName) throws PersistenceException {
		OpalKey<CategoryGroupOpal> lclOpalKey = new ShortNameOpalKey(argShortName);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<CategoryGroupOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new CodeOpalKey(
			OpalUtility.convertTo(java.lang.String.class, argRS.getObject("code"))
		);
	}

	/* package */ static class NameOpalKey extends com.opal.SingleValueDatabaseOpalKey<CategoryGroupOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"name", };

		public NameOpalKey(java.lang.String argName) {
			super(argName);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class CodeOpalKey extends com.opal.SingleValueDatabaseOpalKey<CategoryGroupOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"code", };

		public CodeOpalKey(java.lang.String argCode) {
			super(argCode);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	/* package */ static class ShortNameOpalKey extends com.opal.SingleValueDatabaseOpalKey<CategoryGroupOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"short_name", };

		public ShortNameOpalKey(java.lang.String argShortName) {
			super(argShortName);
		}

		@Override
		public Object[] getParameters() {
			return new Object[] { getKeyValue(), };
		}

		@Override
		public String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public CategoryGroupOpal forUniqueString(String argUniqueString) {
		if (argUniqueString == null || "".equals(argUniqueString)) {
			return null;
		}
		String[] lclArgs = argUniqueString.split("\\|");
		assert lclArgs.length == 1;
		return forOpalKey(
			new CodeOpalKey(
				lclArgs[0]
			)
		);
	}

}
