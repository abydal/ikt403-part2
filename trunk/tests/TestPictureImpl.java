package tests;

import junit.framework.TestCase;
import socialnetwork.*;
public class TestPictureImpl extends TestCase {
	
	PictureImpl p;
	protected void setUp() throws Exception {
		super.setUp();
		p=new PictureImpl();
	}

	public void testAddTag() {
		TagWordImpl t = new TagWordImpl();
		t.setWord("snow");
		
		p.addTag(t);
		
		assertEquals(1, p.getTagword().size());
	}

	public void testRemoveTag() {
		TagWordImpl t = new TagWordImpl();
		t.setWord("winter");
		
		p.addTag(t);
		assertEquals(1, p.getTagword().size());
		
		p.removeTag(t);
		assertEquals(0, p.getTagword().size());
	}

	public void testAddComment() {
		CommentImpl c = new CommentImpl();
		p.addComment(c);
		assertEquals(1, p.getComment().size());
	}

	public void testRemoveComment() {
		CommentImpl c = new CommentImpl();
		p.addComment(c);
		assertEquals(1, p.getComment().size());
		p.removeComment(c);
		assertEquals(0, p.getComment().size());
	}

}
