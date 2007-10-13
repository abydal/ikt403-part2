package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UserBoardImpl implements IUserBoard {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IBlog blog;

	/* (non-Javadoc)
	 * @see IUserBoard#getBlog()
	 */
	public IBlog getBlog() {
		// begin-user-code
		return blog;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IUserBoard#setBlog(Blog)
	 */
	public void setBlog(IBlog theBlog) {
		// begin-user-code
		blog = theBlog;
		// end-user-code
	}
}