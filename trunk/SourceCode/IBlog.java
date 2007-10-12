package socialnetwork;
import java.util.ArrayList;

public interface IBlog {

	/** 
	 * @return the title
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract String getTitle();

	/** 
	 * @param theTitle the title to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setTitle(String theTitle);

	/** 
	 * @return the _private
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Boolean get_private();

	/** 
	 * @param the_private the _private to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void set_private(Boolean the_private);

	/** 
	 * @return the blogpost
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<IBlogPost> getBlogpost();

	/** 
	 * @param theBlogpost the blogpost to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setBlogpost(ArrayList<IBlogPost> theBlogpost);

	/** 
	 * @param post
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addBlogPost(IBlogPost post);

	/** 
	 * @param post
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeBlogPost(IBlogPost post);


	/** 
	 * @param searchString
	 * @return
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<IBlogPost> searchBlogPosts(String searchString);

}