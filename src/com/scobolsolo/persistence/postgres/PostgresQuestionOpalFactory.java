package com.scobolsolo.persistence.postgres;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opal.*;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.QuestionImpl;
import com.scobolsolo.persistence.QuestionOpal;
import com.scobolsolo.persistence.QuestionOpalFactory;

public class PostgresQuestionOpalFactory extends com.opal.AbstractDatabaseIdentityOpalFactory<Question, QuestionOpal> implements QuestionOpalFactory {
	private static final PostgresQuestionOpalFactory ourInstance = new PostgresQuestionOpalFactory();

	public static final PostgresQuestionOpalFactory getInstance() { return ourInstance; }

	protected PostgresQuestionOpalFactory() {
		super();
	}

	private static final String[] ourColumnNames = new String[] {
		"id", 
		"description", 
		"category_code", 
		"tournament_code", 
		"note", 
		"writer_account_id", 
		"text", 
		"answer", 
	};

	protected static String[] getStaticColumnNames() { return ourColumnNames; }

	@Override
	protected String[] getColumnNames() { return ourColumnNames; }

	private static final String[] ourPrimaryKeyWhereClauseColumns = new String[] {"id",};

	@Override
	protected String[] getFieldNames() { return QuestionOpal.getStaticFieldNames(); }

	@Override
	protected Class<?>[] getFieldTypes() { return QuestionOpal.getStaticFieldTypes(); }

	@Override
	protected boolean[] getFieldNullability() { return QuestionOpal.getStaticFieldNullability(); }

	@Override
	protected com.opal.FieldValidator[] getFieldValidators() { return QuestionOpal.getStaticFieldValidators(); }


	@Override
	protected javax.sql.DataSource getDataSource() {
		return PostgresOpalFactoryFactory.getSpecificInstance().getDataSource();
	}

	@Override
	protected QuestionOpal instantiate(Object[] argValues) {
		return new QuestionOpal(this, argValues);
	}

	@Override
	public QuestionOpal create() {
		QuestionOpal lclOpal;
		synchronized (lclOpal = instantiate((Object[]) null)) {
			assert lclOpal.getUserFacing() == null;
			lclOpal.setUserFacing(new QuestionImpl(lclOpal));
			lclOpal.newObject();
			newObject(lclOpal);
		}
		return lclOpal;
	}

	@Override
	protected void determineUserFacing(QuestionOpal argO, boolean argConcrete) {
		assert argO != null;
		assert argConcrete == false;
		assert argO.getUserFacing() == null;
		argO.setUserFacing(new QuestionImpl(argO));
	}

	@Override
	protected void afterInsert(TransactionParameter argTP, QuestionOpal argOpal) throws PersistenceException {
		assert argTP != null;
		assert argOpal != null;
		try {
			argOpal.setId(
				com.siliconage.database.DatabaseUtility.executeIntQuery(
					((DatabaseTransactionParameter) argTP).getConnection(),
					"SELECT last_value FROM question_id_seq AS id_value",
					null
				)
			);
			return;
		} catch (SQLException lclE) {
			throw new PersistenceException("Unable to retrieve last value for sequence column question_id_seq", lclE);
		}
	}

	protected void newObject(@SuppressWarnings("unused") QuestionOpal argOpal) {
		return;
	}

	@Override
	protected String getFullyQualifiedTableName() {
		return "question";
	}

	@Override
	protected void registerNewOpal(QuestionOpal argOpal) {
		registerOpal(argOpal, argOpal.getNewValues());
	}

	@Override
	protected void registerOldOpal(QuestionOpal argOpal) {
		registerOpal(argOpal, argOpal.getOldValues());
	}

	protected void registerOpal(QuestionOpal argOpal, Object[] argValues) {
		if (argValues == null) { throw new IllegalStateException(); }
		if (argValues.length != 8) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.addOpal(new IdOpalKey((java.lang.Integer) argValues[0]), argOpal, true);
		}
	}

	@Override
	protected void unregisterOpal(QuestionOpal argOpal) {
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			lclOC.removeOpal(new IdOpalKey((java.lang.Integer) lclOldValues[0]));
		}
	}

	@Override
	public void updateKeys(QuestionOpal argOpal) {
		org.apache.commons.lang3.Validate.notNull(argOpal);
		Object[] lclOldValues = argOpal.getOldValues();
		if (lclOldValues == null) { throw new IllegalStateException(); }
		if (lclOldValues.length != 8) { throw new IllegalStateException(); }
		Object[] lclNewValues = argOpal.getNewValues();
		if (lclNewValues == null) { throw new IllegalStateException(); }
		if (lclNewValues.length != 8) { throw new IllegalStateException(); }
		OpalCache lclOC = getOpalCache();
		synchronized (lclOC) {
			OpalKey<QuestionOpal> lclOldKey = null;
			OpalKey<QuestionOpal> lclNewKey = null;
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
	protected OpalKey<QuestionOpal> createOpalKeyForReloading(QuestionOpal argOpal) {
		Object[] lclValues = argOpal.getNewValues();
		return new IdOpalKey((java.lang.Integer) lclValues[0]);
	}

	@Override
	public java.util.HashSet<QuestionOpal> forCategoryCodeCollection(java.lang.String argCategoryCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argCategoryCode };
		final String[] lclFieldNames = new String[] { "category_code" };
		java.util.HashSet<QuestionOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<QuestionOpal> forTournamentCodeCollection(java.lang.String argTournamentCode) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argTournamentCode };
		final String[] lclFieldNames = new String[] { "tournament_code" };
		java.util.HashSet<QuestionOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public java.util.HashSet<QuestionOpal> forWriterAccountIdCollection(java.lang.Integer argWriterAccountId) /* throws PersistenceException */ {
		final Object[] lclParameters = new Object[] { argWriterAccountId };
		final String[] lclFieldNames = new String[] { "writer_account_id" };
		java.util.HashSet<QuestionOpal> lclCollection = new java.util.HashSet<>();
		load(getFullyQualifiedTableName(), lclFieldNames, lclParameters, null, lclCollection);
		return lclCollection;
	}

	@Override
	public QuestionOpal forId(java.lang.Integer argId) throws PersistenceException {
		OpalKey<QuestionOpal> lclOpalKey = new IdOpalKey(argId);
		return forOpalKey(lclOpalKey);
	}

	@Override
	protected OpalKey<QuestionOpal> createOpalKeyForRow(ResultSet argRS) throws SQLException {
		return new IdOpalKey(
			OpalUtility.convertTo(java.lang.Integer.class, argRS.getObject("id"))
		);
	}

	/* package */ static class IdOpalKey extends com.opal.DatabaseOpalKey<QuestionOpal> {
		private static final String[] ourKeyColumnNames = new String[] {"id", };

		public IdOpalKey(java.lang.Integer argId) {
			super(new Object[] {argId, });
		}

		@Override
		protected Object[] getParameters() { return getFields(); }

		@Override
		protected String[] getColumnNames() { return ourKeyColumnNames; }

	}

	@Override
	public QuestionOpal forUniqueString(String argUniqueString) {
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
