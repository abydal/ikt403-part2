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
	private ArrayList<AlbumImpl> album;

	/* (non-Javadoc)
	 * @see IPicture#getAlbum()
	 */
	public ArrayList<AlbumImpl> getAlbum() {
		// begin-user-code
		return album;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setAlbum(java.util.ArrayList)
	 */
	public void setAlbum(ArrayList<AlbumImpl> theAlbum) {
		// begin-user-code
		album = theAlbum;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>comment</code>
	 *     collection_type="Comment"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<CommentImpl> comment;

	/* (non-Javadoc)
	 * @see IPicture#getComment()
	 */
	public ArrayList<CommentImpl> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setComment(java.util.ArrayList)
	 */
	public void setComment(ArrayList<CommentImpl> theComment) {
		// begin-user-code
		comment = theComment;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>tagword</code>
	 *     collection_type="TagWord"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<TagWordImpl> tagword;

	/* (non-Javadoc)
	 * @see IPicture#getTagword()
	 */
	public ArrayList<TagWordImpl> getTagword() {
		// begin-user-code
		return tagword;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setTagword(java.util.ArrayList)
	 */
	public void setTagword(ArrayList<TagWordImpl> theTagword) {
		// begin-user-code
		tagword = theTagword;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>blogpost</code>
	 *     collection_type="BlogPost"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<BlogPostImpl> blogpost;

	/* (non-Javadoc)
	 * @see IPicture#getBlogpost()
	 */
	public ArrayList<BlogPostImpl> getBlogpost() {
		// begin-user-code
		return blogpost;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#setBlogpost(java.util.ArrayList)
	 */
	public void setBlogpost(ArrayList<BlogPostImpl> theBlogpost) {
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

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IPicture#removeTag(TagWord)
	 */
	public void removeTag(ITagWord tag) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}