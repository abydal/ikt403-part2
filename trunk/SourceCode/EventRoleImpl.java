package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class EventRoleImpl implements IEventRole {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean participant;

	/* (non-Javadoc)
	 * @see IEventRole#getParticipant()
	 */
	public Boolean getParticipant() {
		// begin-user-code
		return participant;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IEventRole#setParticipant(java.lang.Boolean)
	 */
	public void setParticipant(Boolean theParticipant) {
		// begin-user-code
		participant = theParticipant;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean organizer;

	/* (non-Javadoc)
	 * @see IEventRole#getOrganizer()
	 */
	public Boolean getOrganizer() {
		// begin-user-code
		return organizer;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IEventRole#setOrganizer(java.lang.Boolean)
	 */
	public void setOrganizer(Boolean theOrganizer) {
		// begin-user-code
		organizer = theOrganizer;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent student;

	/* (non-Javadoc)
	 * @see IEventRole#getStudent()
	 */
	public IStudent getStudent() {
		// begin-user-code
		return student;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IEventRole#setStudent(Student)
	 */
	public void setStudent(IStudent theStudent) {
		// begin-user-code
		student = theStudent;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IEvent event;

	/* (non-Javadoc)
	 * @see IEventRole#getEvent()
	 */
	public IEvent getEvent() {
		// begin-user-code
		return event;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IEventRole#setEvent(EventImpl)
	 */
	public void setEvent(IEvent theEvent) {
		// begin-user-code
		event = theEvent;
		// end-user-code
	}
}