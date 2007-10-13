package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommunityImpl extends UserBoardImpl implements ICommunity {
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
	private ArrayList<IStudent> memberof = new ArrayList<IStudent>();

	/* (non-Javadoc)
	 * @see ICommunity#getMemberof()
	 */
	public ArrayList<IStudent> getMemberof() {
		// begin-user-code
		return memberof;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#setMemberof(java.util.ArrayList)
	 */
	public void setMemberof(ArrayList<IStudent> theMemberof) {
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
		memberof.add(participant);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICommunity#removeParticipant(Student)
	 */
	public void removeParticipant(IStudent participant) {
		// begin-user-code
		// TODO Auto-generated method stub
		memberof.remove(participant);
		// end-user-code
	}
}