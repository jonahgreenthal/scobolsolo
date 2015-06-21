package com.scobolsolo.application;

import com.scobolsolo.persistence.StaffAssignmentOpal;
import com.scobolsolo.persistence.StaffOpal;
import com.scobolsolo.persistence.RoomOpal;

public class StaffAssignmentImpl extends com.opal.AbstractIdentityImpl<StaffAssignment, StaffAssignmentOpal> implements StaffAssignment {
	private final StaffAssignmentOpal myStaffAssignmentOpal;

	public StaffAssignmentImpl(StaffAssignmentOpal argStaffAssignmentOpal) {
		super();
		myStaffAssignmentOpal = org.apache.commons.lang3.Validate.notNull(argStaffAssignmentOpal);
	}

	protected StaffAssignmentOpal getStaffAssignmentOpal() {
		return myStaffAssignmentOpal;
	}

	@Override
	protected com.opal.IdentityOpal<? extends StaffAssignment> getOpal() {
		return getStaffAssignmentOpal();
	}

	@Override
	protected com.opal.IdentityOpal<? extends StaffAssignment> getBottomOpal() {
		return getStaffAssignmentOpal();
	}

	@Override
	public java.lang.Integer getIdAsObject() {
		return getStaffAssignmentOpal().getIdAsObject();
	}

	@Override
	public StaffAssignmentImpl setId(java.lang.Integer argId) {
		getStaffAssignmentOpal().setId(argId);
		return this;
	}

	@Override
	public StaffAssignmentImpl setId(int argId) {
		getStaffAssignmentOpal().setId(argId);
		return this;
	}

	@Override
	public java.lang.Integer getRoomIdAsObject() {
		return getStaffAssignmentOpal().getRoomIdAsObject();
	}

	@Override
	public StaffAssignmentImpl setRoomId(java.lang.Integer argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public StaffAssignmentImpl setRoomId(int argRoomId) {
		getStaffAssignmentOpal().setRoomId(argRoomId);
		return this;
	}

	@Override
	public java.lang.String getNote() {
		return getStaffAssignmentOpal().getNote();
	}

	@Override
	public StaffAssignmentImpl setNote(java.lang.String argNote) {
		getStaffAssignmentOpal().setNote(argNote);
		return this;
	}

	@Override
	public java.lang.Integer getStaffIdAsObject() {
		return getStaffAssignmentOpal().getStaffIdAsObject();
	}

	@Override
	public StaffAssignmentImpl setStaffId(java.lang.Integer argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return this;
	}

	@Override
	public StaffAssignmentImpl setStaffId(int argStaffId) {
		getStaffAssignmentOpal().setStaffId(argStaffId);
		return this;
	}

	/* The following methods allow direct access to the user objects to which
	this object has references in the database. */

	/** Access to the Staff object created from staff_assignment through reference staff_assignment_staff_id_fkey */

	@Override
	public Staff getStaff() {
		StaffOpal lclStaffOpal = getStaffAssignmentOpal().getStaffOpal();
		return lclStaffOpal == null ? null : lclStaffOpal.getUserFacing();
	}

	@Override
	public StaffAssignment setStaff(Staff argStaff) {
		getStaffAssignmentOpal().setStaffOpal(argStaff == null ? null : ((StaffImpl) argStaff).getStaffOpal());
		return this;
	}

	/** Access to the Room object created from staff_assignment through reference staffer_assignment_room_id_fkey */

	@Override
	public Room getRoom() {
		RoomOpal lclRoomOpal = getStaffAssignmentOpal().getRoomOpal();
		return lclRoomOpal == null ? null : lclRoomOpal.getUserFacing();
	}

	@Override
	public StaffAssignment setRoom(Room argRoom) {
		getStaffAssignmentOpal().setRoomOpal(argRoom == null ? null : ((RoomImpl) argRoom).getRoomOpal());
		return this;
	}

	/* The following methods allow access to the user objects that have references
	to this object. */

	@Override
	public void unlink() {
		getStaffAssignmentOpal().unlink();
	}

	@Override
	public void reload() {
		getStaffAssignmentOpal().reload();
	}

	@Override
	public StaffAssignment copy() {
		return getStaffAssignmentOpal().copy().getUserFacing();
	}

}
