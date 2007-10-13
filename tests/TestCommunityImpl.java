package tests;

import junit.framework.TestCase;
import socialnetwork.*;

public class TestCommunityImpl extends TestCase {

	CommunityImpl c;
	protected void setUp() throws Exception {
		super.setUp();
		c= new CommunityImpl();
	}

	public void testAddParticipant() {
		StudentImpl studentOne = new StudentImpl();
		StudentImpl studentTwo = new StudentImpl();
		StudentImpl studentThree = new StudentImpl();
		
		c.addParticipant(studentOne);
		c.addParticipant(studentTwo);
		c.addParticipant(studentThree);
		
		assertEquals(3, c.getMemberof().size());
		
	}

	public void testRemoveParticipant() {
		StudentImpl studentOne = new StudentImpl();
		
		c.addParticipant(studentOne);
		
		assertEquals(1, c.getMemberof().size());
		
		c.removeParticipant(studentOne);
		
		assertEquals(0, c.getMemberof().size());
	}

}
