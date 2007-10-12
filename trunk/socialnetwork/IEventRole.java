package socialnetwork;
public interface IEventRole {

	/** 
	 * @return the participant
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Boolean getParticipant();

	/** 
	 * @param theParticipant the participant to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setParticipant(Boolean theParticipant);

	/** 
	 * @return the organizer
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Boolean getOrganizer();

	/** 
	 * @param theOrganizer the organizer to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setOrganizer(Boolean theOrganizer);

	/** 
	 * @return the student
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IStudent getStudent();

	/** 
	 * @param theStudent the student to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setStudent(IStudent theStudent);

	/** 
	 * @return the event
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IEvent getEvent();

	/** 
	 * @param theEvent the event to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setEvent(IEvent theEvent);

}