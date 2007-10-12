package socialnetwork;
import java.util.ArrayList;

public interface IPicture {

	/** 
	 * @return the filename
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract String getFilename();

	/** 
	 * @param theFilename the filename to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setFilename(String theFilename);

	/** 
	 * @return the description
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract String getDescription();

	/** 
	 * @param theDescription the description to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setDescription(String theDescription);

	/** 
	 * @return the album
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<AlbumImpl> getAlbum();

	/** 
	 * @param theAlbum the album to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setAlbum(ArrayList<AlbumImpl> theAlbum);

	/** 
	 * @return the comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<CommentImpl> getComment();

	/** 
	 * @param theComment the comment to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setComment(ArrayList<CommentImpl> theComment);

	/** 
	 * @return the tagword
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<TagWordImpl> getTagword();

	/** 
	 * @param theTagword the tagword to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setTagword(ArrayList<TagWordImpl> theTagword);

	/** 
	 * @return the blogpost
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<BlogPostImpl> getBlogpost();

	/** 
	 * @param theBlogpost the blogpost to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setBlogpost(ArrayList<BlogPostImpl> theBlogpost);

	/** 
	 * @param tag
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addTag(ITagWord tag);

	/** 
	 * @param tag
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeTag(ITagWord tag);

}