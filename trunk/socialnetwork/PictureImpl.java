package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PictureImpl implements IPicture {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String filename;

	/* (non-Javadoc)
	 * @see IPicture#getFilename()
	 */
	public String getFilename() {
		// begin-user-code
		return filename;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setFilename(java.lang.String)
	 */
	public void setFilename(String theFilename) {
		// begin-user-code
		filename = theFilename;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/* (non-Javadoc)
	 * @see IPicture#getDescription()
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setDescription(java.lang.String)
	 */
	public void setDescription(String theDescription) {
		// begin-user-code
		description = theDescription;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>album</code>
	 *     collection_type="Album"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IAlbum> album = new ArrayList<IAlbum>();

	/* (non-Javadoc)
	 * @see IPicture#getAlbum()
	 */
	public ArrayList<IAlbum> getAlbum() {
		// begin-user-code
		return album;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setAlbum(java.util.ArrayList)
	 */
	public void setAlbum(ArrayList<IAlbum> theAlbum) {
		// begin-user-code
		album = theAlbum;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IComment> comment = new ArrayList<IComment>();

	/* (non-Javadoc)
	 * @see IPicture#getComment()
	 */
	public ArrayList<IComment> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<IComment> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>tagword</code>
	 *     collection_type="TagWord"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ITagWord> tagword = new ArrayList<ITagWord>();

	/* (non-Javadoc)
	 * @see IPicture#getTagword()
	 */
	public ArrayList<ITagWord> getTagword() {
		// begin-user-code
		return tagword;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setTagword(java.util.ArrayList)
	 */
	public void setTagword(ArrayList<ITagWord> theTagword) {
		// begin-user-code
		tagword = theTagword;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>blogpost</code>
	 *     collection_type="BlogPost"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IBlogPost> blogpost = new ArrayList<IBlogPost>();

	/* (non-Javadoc)
	 * @see IPicture#getBlogpost()
	 */
	public ArrayList<IBlogPost> getBlogpost() {
		// begin-user-code
		return blogpost;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setBlogpost(java.util.ArrayList)
	 */
	public void setBlogpost(ArrayList<IBlogPost> theBlogpost) {
		// begin-user-code
		blogpost = theBlogpost;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#addTag(TagWord)
	 */
	public void addTag(ITagWord tag) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.tagword.add(tag);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#removeTag(TagWord)
	 */
	public void removeTag(ITagWord tag) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.tagword.remove(tag);
		// end-user-code
	}

	public void addComment(IComment comment) {
		// TODO Auto-generated method stub
		this.comment.add(comment);
	}

	public void removeComment(IComment comment) {
		// TODO Auto-generated method stub
		this.comment.remove(comment);
	}
}