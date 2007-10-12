package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class StudentImpl implements IStudent {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String firstName;

	/* (non-Javadoc)
	 * @see IStudent#getFirstName()
	 */
	public String getFirstName() {
		// begin-user-code
		return firstName;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setFirstName(java.lang.String)
	 */
	public void setFirstName(String theFirstName) {
		// begin-user-code
		firstName = theFirstName;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String lastName;

	/* (non-Javadoc)
	 * @see IStudent#getLastName()
	 */
	public String getLastName() {
		// begin-user-code
		return lastName;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setLastName(java.lang.String)
	 */
	public void setLastName(String theLastName) {
		// begin-user-code
		lastName = theLastName;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer birthday;

	/* (non-Javadoc)
	 * @see IStudent#getBirthday()
	 */
	public Integer getBirthday() {
		// begin-user-code
		return birthday;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setBirthday(java.lang.Integer)
	 */
	public void setBirthday(Integer theBirthday) {
		// begin-user-code
		birthday = theBirthday;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String gender;

	/* (non-Javadoc)
	 * @see IStudent#getGender()
	 */
	public String getGender() {
		// begin-user-code
		return gender;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setGender(java.lang.String)
	 */
	public void setGender(String theGender) {
		// begin-user-code
		gender = theGender;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String email;

	/* (non-Javadoc)
	 * @see IStudent#getEmail()
	 */
	public String getEmail() {
		// begin-user-code
		return email;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setEmail(java.lang.String)
	 */
	public void setEmail(String theEmail) {
		// begin-user-code
		email = theEmail;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String url;

	/* (non-Javadoc)
	 * @see IStudent#getUrl()
	 */
	public String getUrl() {
		// begin-user-code
		return url;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setUrl(java.lang.String)
	 */
	public void setUrl(String theUrl) {
		// begin-user-code
		url = theUrl;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/* (non-Javadoc)
	 * @see IStudent#getDescription()
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setDescription(java.lang.String)
	 */
	public void setDescription(String theDescription) {
		// begin-user-code
		description = theDescription;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String streetAddress;

	/* (non-Javadoc)
	 * @see IStudent#getStreetAddress()
	 */
	public String getStreetAddress() {
		// begin-user-code
		return streetAddress;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setStreetAddress(java.lang.String)
	 */
	public void setStreetAddress(String theStreetAddress) {
		// begin-user-code
		streetAddress = theStreetAddress;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String city;

	/* (non-Javadoc)
	 * @see IStudent#getCity()
	 */
	public String getCity() {
		// begin-user-code
		return city;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setCity(java.lang.String)
	 */
	public void setCity(String theCity) {
		// begin-user-code
		city = theCity;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String zipcode;

	/* (non-Javadoc)
	 * @see IStudent#getZipcode()
	 */
	public String getZipcode() {
		// begin-user-code
		return zipcode;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setZipcode(java.lang.String)
	 */
	public void setZipcode(String theZipcode) {
		// begin-user-code
		zipcode = theZipcode;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IEvent event;

	/* (non-Javadoc)
	 * @see IStudent#getEvent()
	 */
	public IEvent getEvent() {
		// begin-user-code
		return event;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setEvent(EventImpl)
	 */
	public void setEvent(IEvent theEvent) {
		// begin-user-code
		event = theEvent;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>album</code>
	 *     collection_type="Album"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IAlbum> album;

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IComment> comment;

	/** 
	 * @uml.annotations for <code>arrangedby</code>
	 *     collection_type="Event"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IEvent> arrangedby;

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String password;

	/* (non-Javadoc)
	 * @see IStudent#getPassword()
	 */
	public String getPassword() {
		// begin-user-code
		return password;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setPassword(java.lang.String)
	 */
	public void setPassword(String thePassword) {
		// begin-user-code
		password = thePassword;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>friendship</code>
	 *     collection_type="Friendship"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IFriendship> friendship;

	/**
	 * @return the friendship
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<IFriendship> getFriendship() {
		// begin-user-code
		return friendship;
		// end-user-code
	}

	/**
	 * @param theFriendship the friendship to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setFriendship(ArrayList<IFriendship> theFriendship) {
		// begin-user-code
		friendship = theFriendship;
		// end-user-code
	}
	
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean activeStudent;

	/* (non-Javadoc)
	 * @see IStudent#getActiveStudent()
	 */
	public Boolean getActiveStudent() {
		// begin-user-code
		return activeStudent;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setActiveStudent(java.lang.Boolean)
	 */
	public void setActiveStudent(Boolean theActiveStudent) {
		// begin-user-code
		activeStudent = theActiveStudent;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean isonline;

	/* (non-Javadoc)
	 * @see IStudent#getIsonline()
	 */
	public Boolean getIsonline() {
		// begin-user-code
		return isonline;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setIsonline(java.lang.Boolean)
	 */
	public void setIsonline(Boolean theIsonline) {
		// begin-user-code
		isonline = theIsonline;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IEventRole eventrole;

	/* (non-Javadoc)
	 * @see IStudent#getEventrole()
	 */
	public IEventRole getEventrole() {
		// begin-user-code
		return eventrole;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setEventrole(IEventRole)
	 */
	public void setEventrole(IEventRole theEventrole) {
		// begin-user-code
		eventrole = theEventrole;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>receives</code>
	 *     collection_type="ChatMessage"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ChatMessageImpl> receives;

	/** 
	 * @uml.annotations for <code>sends</code>
	 *     collection_type="ChatMessage"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ChatMessageImpl> sends;

	/** 
	 * @uml.annotations for <code>student</code>
	 *     collection_type="Student"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<StudentImpl> student;

	/** 
	 * @uml.annotations for <code>blog</code>
	 *     collection_type="Blog"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IBlog blog;

	/** 
	 * @uml.annotations for <code>exam</code>
	 *     collection_type="Exam"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ExamImpl> exam;
	
	/* (non-Javadoc)
	 * @see IStudent#addFriend(IStudent)
	 */
	public void addFriend(IStudent friend) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeFriend(IStudent)
	 */
	public void removeFriend(IStudent friend) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addExam(IExam)
	 */
	public void addExam(IExam exam) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeExam(IExam)
	 */
	public void removeExam(IExam exam) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addAlbum(IAlbum)
	 */
	public void addAlbum(IAlbum album) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeAlbum(IAlbum)
	 */
	public void removeAlbum(IAlbum album) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addEvent(EventImpl)
	 */
	public void addEvent(IEvent Parameter1) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeEvent(EventImpl)
	 */
	public void removeEvent(IEvent Parameter1) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#searchExams(java.lang.String)
	 */
	public void searchExams(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#joinCommunity(ICommunity)
	 */
	public void joinCommunity(ICommunity community) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#createCommunity(ICommunity)
	 */
	public void createCommunity(ICommunity community) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#createMessage(IChatMessage)
	 */
	public void createMessage(IChatMessage message) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeMessage(IChatMessage)
	 */
	public void removeMessage(IChatMessage message) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#searchMessages(java.lang.String)
	 */
	public void searchMessages(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public ArrayList<IAlbum> getAlbum() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<IEvent> getArrangedby() {
		// TODO Auto-generated method stub
		return null;
	}

	public IBlog getBlog() {
		// TODO Auto-generated method stub
		return this.blog;
	}

	public ArrayList<IComment> getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<IExam> getExam() {
		// TODO Auto-generated method stub
		return null;
	}


	public ArrayList<IChatMessage> getReceives() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<IChatMessage> getSends() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<IStudent> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAlbum(ArrayList<IAlbum> theAlbum) {
		// TODO Auto-generated method stub
		
	}

	public void setArrangedby(ArrayList<IEvent> theArrangedby) {
		// TODO Auto-generated method stub
		
	}

	public void setBlog(IBlog theBlog) {
		this.blog = theBlog;
		
	}

	public void setComment(ArrayList<IComment> theComment) {
		// TODO Auto-generated method stub
		
	}

	public void setExam(ArrayList<IExam> theExam) {
		// TODO Auto-generated method stub
		
	}


	public void setReceives(ArrayList<IChatMessage> theReceives) {
		// TODO Auto-generated method stub
		
	}

	public void setSends(ArrayList<IChatMessage> theSends) {
		// TODO Auto-generated method stub
		
	}

	public void setStudent(ArrayList<IStudent> theStudent) {
		// TODO Auto-generated method stub
		
	}
}