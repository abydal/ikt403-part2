package tests;

import junit.framework.TestCase;
import socialnetwork.*;
public class TestBlogPostImpl extends TestCase {

	BlogPostImpl blogPost;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		blogPost = new BlogPostImpl();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	
		blogPost = null;
	}

	public void testAddComment() {
		CommentImpl theComment = new CommentImpl();
		
		blogPost.addComment(theComment);

		assertTrue(blogPost.getComment().get(0) == theComment);
		//fail("Not yet implemented");
	}

	public void testRemoveComment() {

	// First add
		CommentImpl theComment = new CommentImpl();
		blogPost.addComment(theComment);
		assertTrue(blogPost.getComment().get(0) == theComment);

	// Then remove
		blogPost.removeComment(theComment);

		assertTrue(blogPost.getComment().size() == 0);
		
	}

	public void testAddPicture() {

		PictureImpl thePicture = new PictureImpl();
		
		blogPost.addPicture(thePicture);

		assertTrue(blogPost.getPicture().get(0) == thePicture);
	}

	public void testRemovePicture() {
		
	// First add
		PictureImpl thePicture = new PictureImpl();
		blogPost.addPicture(thePicture);
		assertTrue(blogPost.getPicture().get(0) == thePicture);

	// Then remove
		blogPost.removePicture(thePicture);

		assertTrue(blogPost.getPicture().size() == 0);
		

	}

}
