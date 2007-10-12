package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class BlogImpl implements IBlog {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String title = "MyBlog";

	/* (non-Javadoc)
	 * @see IBlog#getTitle()
	 */
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#setTitle(java.lang.String)
	 */
	public void setTitle(String theTitle) {
		// begin-user-code
		title = theTitle;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean _private = true;

	/* (non-Javadoc)
	 * @see IBlog#get_private()
	 */
	public Boolean get_private() {
		// begin-user-code
		return _private;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#set_private(java.lang.Boolean)
	 */
	public void set_private(Boolean the_private) {
		// begin-user-code
		_private = the_private;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>blogpost</code>
	 *     collection_type="BlogPost"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IBlogPost> blogpost = new ArrayList<IBlogPost>();

	/* (non-Javadoc)
	 * @see IBlog#getBlogpost()
	 */
	public ArrayList<IBlogPost> getBlogpost() {
		// begin-user-code
		return blogpost;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#setBlogpost(java.util.ArrayList)
	 */
	public void setBlogpost(ArrayList<IBlogPost> theBlogpost) {
		// begin-user-code
		blogpost = theBlogpost;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#addBlogPost(BlogPost)
	 */
	public void addBlogPost(IBlogPost post) {
		blogpost.add(post);
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#removeBlogPost(BlogPost)
	 */
	public void removeBlogPost(IBlogPost post) {
				blogpost.remove(post);
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IBlog#searchBlogPosts(java.lang.String)
	 */
	public ArrayList<IBlogPost> searchBlogPosts(String searchString) {
		ArrayList<IBlogPost> result = new ArrayList<IBlogPost>();
		for(IBlogPost p: blogpost)
		{
			if(p.getTitle().contains(searchString) /*|| p.getContent().contains(searchString)*/)
			{
				result.add(p);
			}
		}
		// begin-user-code
		// TODO Auto-generated method stub
		return result;
		// end-user-code
	}

	
}