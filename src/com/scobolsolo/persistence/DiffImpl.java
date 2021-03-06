package com.scobolsolo.persistence;

public class DiffImpl extends com.opal.AbstractIdentityImpl<com.scobolsolo.application.Diff, com.scobolsolo.persistence.DiffOpal> implements com.scobolsolo.application.Diff {

	private final com.scobolsolo.persistence.DiffOpal myDiffOpal;

	public DiffImpl(DiffOpal argDiffOpal) {
		super();
		myDiffOpal = org.apache.commons.lang3.Validate.notNull(argDiffOpal);
	}

	protected com.scobolsolo.persistence.DiffOpal getDiffOpal() {
		return myDiffOpal;
	}

	@Override
	public com.scobolsolo.persistence.DiffOpal getOpal() {
		return getDiffOpal();
	}

	@Override
	public com.scobolsolo.persistence.DiffOpal getBottomOpal() {
		return getDiffOpal();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getIdAsObject() {
		return getDiffOpal().getIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.DiffImpl setId(java.lang.Integer argId) {
		getDiffOpal().setId(argId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.DiffImpl setId(int argId) {
		getDiffOpal().setId(argId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getEditorAccountIdAsObject() {
		return getDiffOpal().getEditorAccountIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.DiffImpl setEditorAccountId(java.lang.Integer argEditorAccountId) {
		getDiffOpal().setEditorAccountId(argEditorAccountId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.DiffImpl setEditorAccountId(int argEditorAccountId) {
		getDiffOpal().setEditorAccountId(argEditorAccountId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getText() {
		return getDiffOpal().getText();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setText(java.lang.String argText) {
		getDiffOpal().setText(argText);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getAnswer() {
		return getDiffOpal().getAnswer();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setAnswer(java.lang.String argAnswer) {
		getDiffOpal().setAnswer(argAnswer);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getNote() {
		return getDiffOpal().getNote();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setNote(java.lang.String argNote) {
		getDiffOpal().setNote(argNote);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public java.lang.String getRemark() {
		return getDiffOpal().getRemark();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.Length(maximum = 2147483647L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setRemark(java.lang.String argRemark) {
		getDiffOpal().setRemark(argRemark);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getEditDistanceAsObject() {
		return getDiffOpal().getEditDistanceAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.DiffImpl setEditDistance(java.lang.Integer argEditDistance) {
		getDiffOpal().setEditDistance(argEditDistance);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.DiffImpl setEditDistance(int argEditDistance) {
		getDiffOpal().setEditDistance(argEditDistance);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public java.time.LocalDateTime getTimestamp() {
		return getDiffOpal().getTimestamp();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = true)
	@com.opal.annotation.CurrentDateTimeDefault
	@Override
	public com.scobolsolo.persistence.DiffImpl setTimestamp(java.time.LocalDateTime argTimestamp) {
		getDiffOpal().setTimestamp(argTimestamp);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getQuestionIdAsObject() {
		return getDiffOpal().getQuestionIdAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.DiffImpl setQuestionId(java.lang.Integer argQuestionId) {
		getDiffOpal().setQuestionId(argQuestionId);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.DiffImpl setQuestionId(int argQuestionId) {
		getDiffOpal().setQuestionId(argQuestionId);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getRevisionNumberAsObject() {
		return getDiffOpal().getRevisionNumberAsObject();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.persistence.DiffImpl setRevisionNumber(java.lang.Integer argRevisionNumber) {
		getDiffOpal().setRevisionNumber(argRevisionNumber);
		return this;
	}

	@Override
	public com.scobolsolo.persistence.DiffImpl setRevisionNumber(int argRevisionNumber) {
		getDiffOpal().setRevisionNumber(argRevisionNumber);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getQuestionStatusCode() {
		return getDiffOpal().getQuestionStatusCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setQuestionStatusCode(java.lang.String argQuestionStatusCode) {
		getDiffOpal().setQuestionStatusCode(argQuestionStatusCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public java.lang.String getCategoryCode() {
		return getDiffOpal().getCategoryCode();
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@com.opal.annotation.Length(maximum = 32L)
	@Override
	public com.scobolsolo.persistence.DiffImpl setCategoryCode(java.lang.String argCategoryCode) {
		getDiffOpal().setCategoryCode(argCategoryCode);
		return this;
	}

	@com.opal.annotation.Updatability(updatable = true)
	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public java.lang.Integer getTextLengthAsObject() {
		return getDiffOpal().getTextLengthAsObject();
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** @return the Category object created from diff through reference diff_category_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Category getCategory() {
		CategoryOpal lclCategoryOpal = getDiffOpal().getCategoryOpal();
		return lclCategoryOpal == null ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Diff setCategory(com.scobolsolo.application.Category argCategory) {
		getDiffOpal().setCategoryOpal(argCategory == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Category, com.scobolsolo.persistence.CategoryOpal>) argCategory).getOpal());
		return this;
	}

	/** @return the Account object created from diff through reference diff_editor_account_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Account getEditor() {
		AccountOpal lclAccountOpal = getDiffOpal().getEditorOpal();
		return lclAccountOpal == null ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Diff setEditor(com.scobolsolo.application.Account argAccount) {
		getDiffOpal().setEditorOpal(argAccount == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Account, com.scobolsolo.persistence.AccountOpal>) argAccount).getOpal());
		return this;
	}

	/** @return the Question object created from diff through reference diff_question_id_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.Question getQuestion() {
		QuestionOpal lclQuestionOpal = getDiffOpal().getQuestionOpal();
		return lclQuestionOpal == null ? null : lclQuestionOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Diff setQuestion(com.scobolsolo.application.Question argQuestion) {
		getDiffOpal().setQuestionOpal(argQuestion == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.Question, com.scobolsolo.persistence.QuestionOpal>) argQuestion).getOpal());
		return this;
	}

	/** @return the QuestionStatus object created from diff through reference diff_question_status_code_fkey */

	@com.opal.annotation.Nullability(nullable = false)
	@Override
	public com.scobolsolo.application.QuestionStatus getStatus() {
		QuestionStatusOpal lclQuestionStatusOpal = getDiffOpal().getStatusOpal();
		return lclQuestionStatusOpal == null ? null : lclQuestionStatusOpal.getUserFacing();
	}

	@Override
	@SuppressWarnings("unchecked")
	public com.scobolsolo.application.Diff setStatus(com.scobolsolo.application.QuestionStatus argQuestionStatus) {
		getDiffOpal().setStatusOpal(argQuestionStatus == null ? null : ((com.opal.OpalBacked<com.scobolsolo.application.QuestionStatus, com.scobolsolo.persistence.QuestionStatusOpal>) argQuestionStatus).getOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public java.util.Set<com.scobolsolo.application.Response> getResponseSet() {
		return new com.opal.UserFacingBackCollectionSet<>(getDiffOpal().getResponseOpalSet());
	}

	@Override
	public void unlink() {
		getDiffOpal().unlink();
	}

	@Override
	public void reload() {
		getDiffOpal().reload();
	}

	@Override
	public com.scobolsolo.application.Diff copy() {
		return getDiffOpal().copy().getUserFacing();
	}

}
