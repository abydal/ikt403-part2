package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class BlogPostImpl implements IBlogPost {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String title;

	/* (non-Javadoc)
	 * @see IBlogPost#getTitle()
	 */
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#setTitle(java.lang.String)
	 */
	public void setTitle(String theTitle) {
		// begin-user-code
		title = theTitle;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer date;

	/* (non-Javadoc)
	 * @see IBlogPost#getDate()
	 */
	public Integer getDate() {
		// begin-user-code
		return date;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#setDate(java.lang.Integer)
	 */
	public void setDate(Integer theDate) {
		// begin-user-code
		date = theDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String content;

	/* (non-Javadoc)
	 * @see IBlogPost#getContent()
	 */
	public String getContent() {
		// begin-user-code
		return content;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#setContent(java.lang.String)
	 */
	public void setContent(String theContent) {
		// begin-user-code
		content = theContent;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<CommentImpl> comment;

	/* (non-Javadoc)
	 * @see IBlogPost#getComment()
	 */
	public ArrayList<CommentImpl> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<CommentImpl> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>picture</code>
	 *     collection_type="Picture"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<PictureImpl> picture;

	/* (non-Javadoc)
	 * @see IBlogPost#getPicture()
	 */
	public ArrayList<PictureImpl> getPicture() {
		// begin-user-code
		return picture;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#setPicture(java.util.ArrayList)
	 */
	public void setPicture(ArrayList<PictureImpl> thePicture) {
		// begin-user-code
		picture = thePicture;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#addComment(Comment)
	 */
	public void addComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#removeComment(Comment)
	 */
	public void removeComment(IComment comment) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#addPicture(Picture)
	 */
	public void addPicture(IPicture picture) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlogPost#removePicture(Picture)
	 */
	public void removePicture(IPicture picture) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}