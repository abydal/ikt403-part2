package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommunityImpl implements ICommunity {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IBlog blog;

	/* (non-Javadoc)
	 * @see ICommunity#getBlog()
	 */
	public IBlog getBlog() {
		// begin-user-code
		return blog;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#setBlog(IBlog)
	 */
	public void setBlog(IBlog theBlog) {
		// begin-user-code
		blog = theBlog;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent founder;

	/* (non-Javadoc)
	 * @see ICommunity#getFounder()
	 */
	public IStudent getFounder() {
		// begin-user-code
		return founder;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#setFounder(Student)
	 */
	public void setFounder(IStudent theFounder) {
		// begin-user-code
		founder = theFounder;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>memberof</code>
	 *     collection_type="Student"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<StudentImpl> memberof;

	/* (non-Javadoc)
	 * @see ICommunity#getMemberof()
	 */
	public ArrayList<StudentImpl> getMemberof() {
		// begin-user-code
		return memberof;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#setMemberof(java.util.ArrayList)
	 */
	public void setMemberof(ArrayList<StudentImpl> theMemberof) {
		// begin-user-code
		memberof = theMemberof;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#addParticipant(Student)
	 */
	public void addParticipant(IStudent participant) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#removeParticipant(Student)
	 */
	public void removeParticipant(IStudent participant) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}