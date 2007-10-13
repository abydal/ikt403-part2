package tests;

import junit.framework.TestCase;
import socialnetwork.*;

public class TestEventImpl extends TestCase {

	EventImpl theEvent;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		theEvent = new EventImpl();
	}

	public void testAddComment() {
		CommentImpl theComment = new CommentImpl();
		
		theEvent.addComment(theComment);

		assertTrue(theEvent.getComment().get(0) == theComment);
	}

	public void testRemoveComment() {
		// First add
		CommentImpl theComment = new CommentImpl();
		theEvent.addComment(theComment);
		assertTrue(theEvent.getComment().get(0) == theComment);

	// Then remove
		theEvent.removeComment(theComment);

		assertTrue(theEvent.getComment().size() == 0);
	}

	public void testAddParticipant() {

		EventRoleImpl theEventRole = new EventRoleImpl();
	
		theEvent.addParticipant(theEventRole);

		assertTrue(theEvent.eventrole.get(0) == theEventRole);
	}

	public void testRemoveParticipant() {
		// First add
		EventRoleImpl theEventRole = new EventRoleImpl();
		theEvent.addParticipant(theEventRole);

		assertTrue(theEvent.eventrole.get(0) == theEventRole);

	// Then remove
		theEvent.removeParticipant(theEventRole);

		assertTrue(theEvent.eventrole.size() == 0);
	}

}
