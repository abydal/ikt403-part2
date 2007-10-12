package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommentImpl implements IComment {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String date;

	/* (non-Javadoc)
	 * @see IComment#getDate()
	 */
	public String getDate() {
		// begin-user-code
		return date;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IComment#setDate(java.lang.String)
	 */
	public void setDate(String theDate) {
		// begin-user-code
		date = theDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String content;

	/* (non-Javadoc)
	 * @see IComment#getContent()
	 */
	public String getContent() {
		// begin-user-code
		return content;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IComment#setContent(java.lang.String)
	 */
	public void setContent(String theContent) {
		// begin-user-code
		content = theContent;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent owns;

	/* (non-Javadoc)
	 * @see IComment#getOwns()
	 */
	public IStudent getOwns() {
		// begin-user-code
		return owns;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IComment#setOwns(Student)
	 */
	public void setOwns(IStudent theOwns) {
		// begin-user-code
		owns = theOwns;
		// end-user-code
	}
}