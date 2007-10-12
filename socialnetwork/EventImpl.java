package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class EventImpl implements IEvent {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean active;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getActive()
	 */
	public Boolean getActive() {
		// begin-user-code
		return active;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setActive(java.lang.Boolean)
	 */
	public void setActive(Boolean theActive) {
		// begin-user-code
		active = theActive;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getName()
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setName(java.lang.String)
	 */
	public void setName(String theName) {
		// begin-user-code
		name = theName;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String location;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getLocation()
	 */
	public String getLocation() {
		// begin-user-code
		return location;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setLocation(java.lang.String)
	 */
	public void setLocation(String theLocation) {
		// begin-user-code
		location = theLocation;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer startDate;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getStartDate()
	 */
	public Integer getStartDate() {
		// begin-user-code
		return startDate;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setStartDate(java.lang.Integer)
	 */
	public void setStartDate(Integer theStartDate) {
		// begin-user-code
		startDate = theStartDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer endDate;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getEndDate()
	 */
	public Integer getEndDate() {
		// begin-user-code
		return endDate;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setEndDate(java.lang.Integer)
	 */
	public void setEndDate(Integer theEndDate) {
		// begin-user-code
		endDate = theEndDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent student;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getStudent()
	 */
	public IStudent getStudent() {
		// begin-user-code
		return student;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setStudent(socialnetwork.IStudent)
	 */
	public void setStudent(IStudent theStudent) {
		// begin-user-code
		student = theStudent;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getDescription()
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setDescription(java.lang.String)
	 */
	public void setDescription(String theDescription) {
		// begin-user-code
		description = theDescription;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IAlbum album;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getAlbum()
	 */
	public IAlbum getAlbum() {
		// begin-user-code
		return album;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setAlbum(socialnetwork.IAlbum)
	 */
	public void setAlbum(IAlbum theAlbum) {
		// begin-user-code
		album = theAlbum;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent arranges;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getArranges()
	 */
	public IStudent getArranges() {
		// begin-user-code
		return arranges;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setArranges(socialnetwork.IStudent)
	 */
	public void setArranges(IStudent theArranges) {
		// begin-user-code
		arranges = theArranges;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean _private;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#get_private()
	 */
	public Boolean get_private() {
		// begin-user-code
		return _private;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#set_private(java.lang.Boolean)
	 */
	public void set_private(Boolean the_private) {
		// begin-user-code
		_private = the_private;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<CommentImpl> comment;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getComment()
	 */
	public ArrayList<CommentImpl> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<CommentImpl> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>eventrole</code>
	 *     collection_type="EventRole"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<EventRoleImpl> eventrole;

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#getEventrole()
	 */
	public ArrayList<EventRoleImpl> getEventrole() {
		// begin-user-code
		return eventrole;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#setEventrole(java.util.ArrayList)
	 */
	public void setEventrole(ArrayList<EventRoleImpl> theEventrole) {
		// begin-user-code
		eventrole = theEventrole;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#addComment(socialnetwork.IComment)
	 */
	public void addComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.IEvent#removeComment(socialnetwork.IComment)
	 */
	public void removeComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}