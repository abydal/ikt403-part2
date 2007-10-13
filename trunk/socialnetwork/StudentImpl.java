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
	 * @uml.annotations for <code>album</code>
	 *     collection_type="Album"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IAlbum> album = new ArrayList<IAlbum>();
	

	/* (non-Javadoc)
	 * @see IStudent#getAlbum()
	 */
	public ArrayList<IAlbum> getAlbum() {
		// begin-user-code
		return album;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setAlbum(java.util.ArrayList)
	 */
	public void setAlbum(ArrayList<IAlbum> theAlbum) {
		// begin-user-code
		album = theAlbum;
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
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IComment> comment = new ArrayList<IComment>();



	/* (non-Javadoc)
	 * @see IStudent#getComment()
	 */
	public ArrayList<IComment> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}
	
	/* (non-Javadoc)
	 * @see IStudent#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<IComment> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}
	/** 
	 * @uml.annotations for <code>arrangedby</code>
	 *     collection_type="Event"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IEvent> arrangedby = new ArrayList<IEvent>();

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
	private ArrayList<IFriendship> friendship = new ArrayList<IFriendship>();

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
	 * @uml.annotations for <code>eventrole</code>
	 *     collection_type="EventRole"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IEventRole> eventrole = new ArrayList<IEventRole>();

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
	 * @uml.annotations for <code>receives</code>
	 *     collection_type="ChatMessage"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IChatMessage> receives = new ArrayList<IChatMessage>();
	
	public ArrayList<IChatMessage> getReceives() {
		// begin-user-code
		return receives;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setReceives(java.util.ArrayList)
	 */
	public void setReceives(ArrayList<IChatMessage> theReceives) {
		// begin-user-code
		receives = theReceives;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>sends</code>
	 *     collection_type="ChatMessage"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IChatMessage> sends = new ArrayList<IChatMessage>();

	/* (non-Javadoc)
	 * @see IStudent#getSends()
	 */
	public ArrayList<IChatMessage> getSends() {
		// begin-user-code
		return sends;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setSends(java.util.ArrayList)
	 */
	public void setSends(ArrayList<IChatMessage> theSends) {
		// begin-user-code
		sends = theSends;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>blog</code>
	 *     collection_type="Blog"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IBlog blog;
	
	public IBlog getBlog() {
		// begin-user-code
		return blog;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setBlog(Blog)
	 */
	public void setBlog(IBlog theBlog) {
		// begin-user-code
		blog = theBlog;
		// end-user-code
	}
	
	/** 
	 * @uml.annotations for <code>exam</code>
	 *     collection_type="Exam"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IExam> exam = new ArrayList<IExam>();
	
	/* (non-Javadoc)
	 * @see IStudent#addFriend(IStudent)
	 */
	public void addFriend(IStudent friend) {
		// begin-user-code
		// TODO Auto-generated method stub
		//Creating friendship and sets the one initiating and the future friend
		
		FriendshipImpl f = new FriendshipImpl();
		f.setInitates(this);
		f.setFriend(friend);
		
		//Add the friendship to the lists in the objects
		this.friendship.add(f);
		ArrayList<IFriendship> modified = friend.getFriendship();
		modified.add(f);
		friend.setFriendship(modified);
		
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeFriend(IStudent)
	 */
	public void removeFriend(IStudent friend) {
		// begin-user-code
		// TODO Auto-generated method stub
		for(IFriendship i: friendship )
		{
			if(i.getFriend()==friend)
			{
				//Remove from my list
				this.friendship.remove(i);
				break;
			}
			
		}
		
		
		for(IFriendship friends: friend.getFriendship() )
		{	
			if(friends.getFriend()==friend)
			{	
				//Remove from my previous friends lsit
				ArrayList<IFriendship> modified = friend.getFriendship();
				modified.remove(friends);
				friend.setFriendship(modified);

				break;
			}
		}
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addExam(IExam)
	 */
	public void addExam(IExam exam) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.exam.add(exam);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeExam(IExam)
	 */
	public void removeExam(IExam exam) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.exam.remove(exam);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addAlbum(IAlbum)
	 */
	public void addAlbum(IAlbum album) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.album.add(album);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeAlbum(IAlbum)
	 */
	public void removeAlbum(IAlbum album) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.album.remove(album);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#addEvent(EventImpl)
	 */
	public void addEvent(IEventRole eventrole) {
		// begin-user-code
		// TODO Auto-generated method stub
		//this..e(evenrole);
		// end-user-code
		EventImpl event = new EventImpl();
		event.addParticipant(eventrole);
		
	}

	/* (non-Javadoc)
	 * @see IStudent#removeEvent(EventImpl)
	 */
	public void removeEvent(IEventRole eventrole) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#searchExams(java.lang.String)
	 */
	public ArrayList<IExam> searchExams(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub
		
		return null;
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
		this.community.add(community);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#createMessage(IChatMessage)
	 */
	public void createMessage(IChatMessage message) {
		// begin-user-code,
		// TODO Auto-generated method stub
		this.sends.add(message);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#removeMessage(IChatMessage)
	 */
	public void removeMessage(IChatMessage message) {
		// begin-user-code
		// TODO Auto-generated method stub
		
		//Removes/deletes a received message
		this.receives.remove(message);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#searchMessages(java.lang.String)
	 */
	public ArrayList<IChatMessage> searchMessages(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub
		
		ArrayList<IChatMessage> result = new ArrayList<IChatMessage>();
		
		//Search the recieved
		for(IChatMessage m: receives)
		{
			if(m.getContent().contains(searchString))
			{
				result.add(m);
			}
		}
		
		//Search the sent
		for(IChatMessage m: sends)
		{
			if(m.getContent().contains(searchString))
			{
				result.add(m);
			}
		}
		// end-user-code
		
		return result;
	}

	public ArrayList<IExam> getExam() {
		// begin-user-code
		return exam;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IStudent#setExam(java.util.ArrayList)
	 */
	public void setExam(ArrayList<IExam> theExam) {
		// begin-user-code
		exam = theExam;
		// end-user-code
	}
	
	private ArrayList<ICommunity> community = new ArrayList<ICommunity>();

	/** 
	 * @return the community
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<ICommunity> getCommunity() {
		// begin-user-code
		return community;
		// end-user-code
	}

	/** 
	 * @param theCommunity the community to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCommunity(ArrayList<ICommunity> theCommunity) {
		// begin-user-code
		community = theCommunity;
		// end-user-code
	}
}