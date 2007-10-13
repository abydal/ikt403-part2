package tests;

import junit.framework.TestCase;
import socialnetwork.*;
public class TestStructure extends TestCase {

	public TestStructure(String name) {
		super(name);
	}
	
	BlogImpl blogObject;
	StudentImpl dummyStudent1;
	StudentImpl dummyStudent2;

	protected void setUp() throws Exception {
		super.setUp();
		blogObject = new BlogImpl();
		dummyStudent1 = new StudentImpl();
		dummyStudent2 = new StudentImpl();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testStructure(){
		
		dummyStudent2.setBlog(blogObject);
		
		BlogPostImpl blogPostObject1 = new BlogPostImpl();
		BlogPostImpl blogPostObject2 = new BlogPostImpl();
		BlogPostImpl blogPostObject3 = new BlogPostImpl();
		
		CommentImpl commentObject1 = new CommentImpl();
		CommentImpl commentObject2 = new CommentImpl();
		
		commentObject1.setContent("This blog sux!");
		commentObject1.setOwns(dummyStudent1);
		
		commentObject2.setContent("This blog is very good!");
		commentObject1.setOwns(dummyStudent1);
		
		blogPostObject1.setTitle("This is the first blogpost");
		blogPostObject1.setContent("Once upon a time...");
		blogPostObject1.addComment(commentObject1);
		blogPostObject1.addComment(commentObject2);
		
		blogPostObject2.setTitle("This is the second blogpost");
		blogPostObject2.setContent("Once upon a time...");
		blogPostObject2.addComment(commentObject1);
		blogPostObject2.addComment(commentObject2);
		
		blogPostObject3.setTitle("This is the third blogpost");
		blogPostObject3.setContent("Once upon a time...");
		blogPostObject3.addComment(commentObject1);
		blogPostObject3.addComment(commentObject2);
		
		blogObject.addBlogPost(blogPostObject1);
		blogObject.addBlogPost(blogPostObject2);
		blogObject.addBlogPost(blogPostObject3);
		
		for(int i = 3; i > 0; i--)
		{
			for(int c = 0; i < 2; i++)
			{
				if(c == 0)
					assertEquals("This blog sux!",dummyStudent2.getBlog().getBlogpost().get(i).getComment().get(c).getContent());
				
				if(c == 1)
					assertEquals("This blog is very good!",dummyStudent2.getBlog().getBlogpost().get(i).getComment().get(c).getContent());	
			}
		}
				
	}


}
