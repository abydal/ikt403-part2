package socialnetwork;
import java.util.ArrayList;

public interface ICommunity {

	/** 
	 * @return the blog
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IBlog getBlog();

	/** 
	 * @param theBlog the blog to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setBlog(IBlog theBlog);

	/** 
	 * @return the founder
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IStudent getFounder();

	/** 
	 * @param theFounder the founder to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setFounder(IStudent theFounder);

	/** 
	 * @return the memberof
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<StudentImpl> getMemberof();

	/** 
	 * @param theMemberof the memberof to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setMemberof(ArrayList<StudentImpl> theMemberof);

	/** 
	 * @param participant
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addParticipant(IStudent participant);

	/** 
	 * @param participant
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeParticipant(IStudent participant);

}