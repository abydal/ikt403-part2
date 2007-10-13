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

	/** 
	 * @return the active
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean getActive() {
		// begin-user-code
		return active;
		// end-user-code
	}

	/** 
	 * @param theActive the active to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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

	/** 
	 * @return the name
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/** 
	 * @param theName the name to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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

	/** 
	 * @return the location
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getLocation() {
		// begin-user-code
		return location;
		// end-user-code
	}

	/** 
	 * @param theLocation the location to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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

	/** 
	 * @return the startDate
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getStartDate() {
		// begin-user-code
		return startDate;
		// end-user-code
	}

	/** 
	 * @param theStartDate the startDate to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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

	/** 
	 * @return the endDate
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getEndDate() {
		// begin-user-code
		return endDate;
		// end-user-code
	}

	/** 
	 * @param theEndDate the endDate to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEndDate(Integer theEndDate) {
		// begin-user-code
		endDate = theEndDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/** 
	 * @return the description
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/** 
	 * @param theDescription the description to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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

	/** 
	 * @return the album
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IAlbum getAlbum() {
		// begin-user-code
		return album;
		// end-user-code
	}

	/** 
	 * @param theAlbum the album to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAlbum(IAlbum theAlbum) {
		// begin-user-code
		album = theAlbum;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean _private;

	/** 
	 * @return the _private
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean get_private() {
		// begin-user-code
		return _private;
		// end-user-code
	}

	/** 
	 * @param the_private the _private to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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
	private ArrayList<IComment> comment = new ArrayList<IComment>();

	/** 
	 * @return the comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<IComment> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/** 
	 * @param theComment the comment to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setComment(ArrayList<IComment> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>eventrole</code>
	 *     collection_type="EventRole"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<IEventRole> eventrole = new ArrayList<IEventRole>();

	/** 
	 * @return the eventrole
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<IEventRole> getEventrole() {
		// begin-user-code
		return eventrole;
		// end-user-code
	}

	/** 
	 * @param theEventrole the eventrole to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEventrole(ArrayList<IEventRole> theEventrole) {
		// begin-user-code
		eventrole = theEventrole;
		// end-user-code
	}

	/** 
	 * @param comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addComment(IComment comment) {
		// begin-user-code
		this.comment.add(comment);
		// end-user-code
	}

	/** 
	 * @param comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void removeComment(IComment comment) {
		// begin-user-code
		this.comment.remove(comment);
		comment = null;
		// end-user-code
	}
	

	/* (non-Javadoc)
	 * @see IEvent#addParticipant(EventRole)
	 */
	public void addParticipant(IEventRole role) {
		// begin-user-code
		this.eventrole.add(role);

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IEvent#removeParticipant(EventRole)
	 */
	public void removeParticipant(IEventRole role) {
		// begin-user-code
		this.eventrole.remove(role);
		role = null;
		// end-user-code
	}

}