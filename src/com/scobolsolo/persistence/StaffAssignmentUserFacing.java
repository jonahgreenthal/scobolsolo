package com.scobolsolo.persistence;

import com.opal.*;

/**
 * represents a {@code StaffAssignment} from the persistent store
 *
 * <p>This interface was automatically generated to represent objects loaded from {@code staff_assignment}.  Do not modify this class directly; instead, alter the permanent storage on which it is based, the Opal configuration file for the project, and/or the {@link com.scobolsolo.application.StaffAssignment}, and then regenerate the opals.  Any changes made to this file will be lost if the opals are regenerated.</p>
 *
 * <p>To create objects of this type from persistent data, use one of the various {@code forXXX} methods on the {@link com.scobolsolo.application.StaffAssignmentFactory} factory class.  To create new instances, use the {@code create()} method on the factory.</p>
 *
 * <p>Objects that implement this interface must provide Opal thread semantics; among other things this means that all modification of such objects must be done with an active {@link com.opal.TransactionContext}.</p>
 *
 * <p>This interface is not meant to be referenced in user code.  Only the {@link com.scobolsolo.application.StaffAssignment} and the {@link com.scobolsolo.application.StaffAssignmentFactory} class should be referenced directly.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */
public interface StaffAssignmentUserFacing extends IdentityUserFacing {
	/* Accessors and mutators for internal data. */
	/**
	 * object accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} field in {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getId() method.</p>
	 *
	 * @return an object value of {@code Id} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getIdAsObject();

	/**
	 * primitive accessor for the {@code Id}
	 *
	 * <p>The {@code Id} field is a direct mapping of the {@code id} database column in the table {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code Id} (of the current {@link TransactionContext})
	 */
	default public int getId() {
		java.lang.Integer lclO = getIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}.  May not be <code>null</code>.
	 * <p>The database column {@code id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argId is null
	 */
	@com.opal.annotation.NotNull
	public void setId(java.lang.Integer argId);

	/**
	 * sets the {@code Id} to the value of {@code argId}
	 *
	 * @param argId the new value of {@code Id}
	 */
	public void setId(int argId);

	/**
	 * object accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} field in {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getRoomId() method.</p>
	 *
	 * @return an object value of {@code RoomId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getRoomIdAsObject();

	/**
	 * primitive accessor for the {@code RoomId}
	 *
	 * <p>The {@code RoomId} field is a direct mapping of the {@code room_id} database column in the table {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getRoomIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code RoomId} (of the current {@link TransactionContext})
	 */
	default public int getRoomId() {
		java.lang.Integer lclO = getRoomIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}.  May not be <code>null</code>.
	 * <p>The database column {@code room_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argRoomId is null
	 */
	@com.opal.annotation.NotNull
	public void setRoomId(java.lang.Integer argRoomId);

	/**
	 * sets the {@code RoomId} to the value of {@code argRoomId}
	 *
	 * @param argRoomId the new value of {@code RoomId}
	 */
	public void setRoomId(int argRoomId);

	/**
	 * object accessor for the {@code Note}
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} field in {@code staff_assignment}.</p>
	 *
	 * @return an object value of {@code Note} (of the current {@link TransactionContext})  May be <code>null</code>.
	 */
	public java.lang.String getNote();

	/**
	 * object accessor for the {@code Note} with substitution for a null value
	 *
	 * <p>The {@code Note} field is a direct mapping of the {@code note} database column in the table {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the current value if it is not {@code null}, or {@code argStringToSubstituteIfNull} if the current value is {@code null}.</p>
	 *
	 * @param argStringToSubstituteIfNull the value to return if the {@code Note} is {@code null}.
	 * @return an object value of {@code Note} (of the current {@link TransactionContext}) if it is not {@code null}, or {@code argStringToSubstituteIfNull} if it is {@code null}.
	 */
	default public java.lang.String getNote(java.lang.String argStringToSubstituteIfNull) {
		java.lang.String lclO = getNote();
		return lclO != null ? String.valueOf(lclO) : argStringToSubstituteIfNull;
	}


	/**
	 * sets the {@code Note} to the value of {@code argNote}
	 *
	 * @param argNote the new value of {@code Note}.  May be <code>null</code>.
	 * @throws ArgumentTooLongException if {@code argNote} is longer than 2147483647 characters
	 * <p>The database column {@code note} is limited to 2147483647 characters.</p>
	 *
	 */
	@com.opal.annotation.Length(maximum = 2147483647L)
	public void setNote(java.lang.String argNote);

	/**
	 * object accessor for the {@code StaffId}
	 *
	 * <p>The {@code StaffId} field is a direct mapping of the {@code staff_id} field in {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the current value as an Object.  To retrieve the value as a primitive, use the getStaffId() method.</p>
	 *
	 * @return an object value of {@code StaffId} (of the current {@link TransactionContext})  Will not be <code>null</code>.
	 */
	public java.lang.Integer getStaffIdAsObject();

	/**
	 * primitive accessor for the {@code StaffId}
	 *
	 * <p>The {@code StaffId} field is a direct mapping of the {@code staff_id} database column in the table {@code staff_assignment}.</p>
	 *
	 * <p>This method returns the value as a primitive (for example, as an {@code int} rather than an {@code Integer}; to retrieve the value as an object, use the getStaffIdAsObject() method.</p>
	 *
	 * @return the primitive value of {@code StaffId} (of the current {@link TransactionContext})
	 */
	default public int getStaffId() {
		java.lang.Integer lclO = getStaffIdAsObject();
		return lclO.intValue();
	}

	/**
	 * sets the {@code StaffId} to the value of {@code argStaffId}
	 *
	 * @param argStaffId the new value of {@code StaffId}.  May not be <code>null</code>.
	 * <p>The database column {@code staff_id} to which this field is mapped is {@code NOT NULL}.</p>
	 *
	 * @throws IllegalNullArgumentException if argStaffId is null
	 */
	@com.opal.annotation.NotNull
	public void setStaffId(java.lang.Integer argStaffId);

	/**
	 * sets the {@code StaffId} to the value of {@code argStaffId}
	 *
	 * @param argStaffId the new value of {@code StaffId}
	 */
	public void setStaffId(int argStaffId);

	/**
	 * @return the {@code com.scobolsolo.application.Staff}
	 * The returned {@code com.scobolsolo.application.Staff} is the {@link UserFacing} object corresponding to the entry in {@code staff} that is referenced by {@code staff_assignment_staff_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Staff getStaff();
	public void setStaff(com.scobolsolo.application.Staff argStaff);

	/**
	 * @return the {@code com.scobolsolo.application.Room}
	 * The returned {@code com.scobolsolo.application.Room} is the {@link UserFacing} object corresponding to the entry in {@code room} that is referenced by {@code staffer_assignment_room_id_fkey}.
	 *
	 */
	public com.scobolsolo.application.Room getRoom();
	public void setRoom(com.scobolsolo.application.Room argRoom);

	public com.scobolsolo.application.StaffAssignment copy();

	/** This is a Comparator that can be used to compare StaffAssignment objects based on their {@code Id} values. */

	public static class IdComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffAssignment> {
		private static final IdComparator ourInstance = new IdComparator();
		public static final IdComparator getInstance() { return ourInstance; }

		private IdComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffAssignment argFirst, com.scobolsolo.application.StaffAssignment argSecond) {
			return argFirst.getIdAsObject().compareTo(argSecond.getIdAsObject());
		}
	}

	public static class StaffNameComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffAssignment> {
		private static final StaffNameComparator ourInstance = new StaffNameComparator();
		public static final StaffNameComparator getInstance() { return ourInstance; }

		private StaffNameComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffAssignment argFirst, com.scobolsolo.application.StaffAssignment argSecond) {
			return com.scobolsolo.application.Staff.NameComparator.getInstance().compare(argFirst.getStaff(),  argSecond.getStaff());
		}
	}

	public static class RoomSequenceComparator extends com.siliconage.util.NullSafeComparator<com.scobolsolo.application.StaffAssignment> {
		private static final RoomSequenceComparator ourInstance = new RoomSequenceComparator();
		public static final RoomSequenceComparator getInstance() { return ourInstance; }

		private RoomSequenceComparator() { super(); }

		@Override
		public int compareInternal(com.scobolsolo.application.StaffAssignment argFirst, com.scobolsolo.application.StaffAssignment argSecond) {
			return com.scobolsolo.application.Room.SequenceComparator.getInstance().compare(argFirst.getRoom(),  argSecond.getRoom());
		}
	}

}
