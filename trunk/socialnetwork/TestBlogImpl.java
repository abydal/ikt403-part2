package socialnetwork;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestBlogImpl extends TestCase {

	BlogImpl testObject;
	
	public TestBlogImpl(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		testObject = new BlogImpl();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddBlogPost() {
		testObject.addBlogPost(new BlogPostImpl());
		ArrayList<IBlogPost> testArray = testObject.getBlogpost();
		assertEquals(false, testArray.isEmpty());
	}

	public void testRemoveBlogPost() {
		BlogPostImpl dummyPost = new BlogPostImpl();
		testObject.addBlogPost(dummyPost);
		ArrayList<IBlogPost> testArray = testObject.getBlogpost();
		//assertEquals(false, testArray.isEmpty()); this test is already done
		testObject.removeBlogPost(dummyPost);
		assertEquals(true, testArray.isEmpty());
	}

	public void testSearchBlogPosts() {
		BlogPostImpl dummyPost1 = new BlogPostImpl();
		BlogPostImpl dummyPost2 = new BlogPostImpl();
		dummyPost1.setTitle("Monday");
		dummyPost2.setTitle("Tuesday");
		testObject.addBlogPost(dummyPost1);
		testObject.addBlogPost(dummyPost2);
		
		ArrayList<IBlogPost> result = testObject.searchBlogPosts("Monday");
		assertEquals(1, result.size());
		
		result = testObject.searchBlogPosts("day");
		assertEquals(2, result.size());
	}

}
