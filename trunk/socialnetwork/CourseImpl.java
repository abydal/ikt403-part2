package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CourseImpl implements ICourse {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String coursename;

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#getCoursename()
	 */
	public String getCoursename() {
		// begin-user-code
		return coursename;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#setCoursename(java.lang.String)
	 */
	public void setCoursename(String theCoursename) {
		// begin-user-code
		coursename = theCoursename;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer credit;

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#getCredit()
	 */
	public Integer getCredit() {
		// begin-user-code
		return credit;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#setCredit(java.lang.Integer)
	 */
	public void setCredit(Integer theCredit) {
		// begin-user-code
		credit = theCredit;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IComment> comment;

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#getComment()
	 */
	public ArrayList<IComment> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<IComment> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#addComment(socialnetwork.IComment)
	 */
	public void addComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see socialnetwork.ICourse#removeComment(socialnetwork.IComment)
	 */
	public void removeComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}