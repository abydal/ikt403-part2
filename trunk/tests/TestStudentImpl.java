package tests;

import java.util.ArrayList;

import junit.framework.TestCase;
import socialnetwork.*;
public class TestStudentImpl extends TestCase {

	StudentImpl testObject1;
	StudentImpl testObject2;
	
	public TestStudentImpl(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		testObject1 = new StudentImpl();
		testObject2 = new StudentImpl();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddFriend() {
		testObject1.addFriend(testObject2);
		ArrayList<IFriendship> result = testObject1.getFriendship();
		assertEquals(1,result.size());
		result = testObject2.getFriendship();
		assertEquals(1,result.size());
	}

	public void testRemoveFriend() {
	
		testObject1.addFriend(testObject2);
		
		ArrayList<IFriendship> result = testObject1.getFriendship();
		assertEquals(1,result.size());
		result = testObject2.getFriendship();
		assertEquals(1,result.size());
		
		testObject1.removeFriend(testObject2);
		result = testObject1.getFriendship();
		assertEquals(0,result.size());
		result = testObject2.getFriendship();
		assertEquals(0,result.size());
	}

	public void testAddExam() {
		fail("Not yet implemented");
	}

	public void testRemoveExam() {
		fail("Not yet implemented");
	}

	public void testAddAlbum() {
		fail("Not yet implemented");
	}

	public void testRemoveAlbum() {
		fail("Not yet implemented");
	}

	public void testCreateEvent() {
		EventImpl dummyEvent = new EventImpl();
		EventRoleImpl role = new EventRoleImpl();
		
		testObject1.createEvent(role);
				
		assertEquals(1,dummyEvent.eventrole.size());
		assertEquals(1, testObject1.getEventrole().size());
		assertEquals(true, (boolean)testObject1.getEventrole().get(0).getOrganizer());
	}
	
	public void testJoinEvent() {
		EventImpl dummyEvent = new EventImpl();
		testObject1.joinEvent(dummyEvent);
		
		assertEquals(1,dummyEvent.eventrole.size());
		assertEquals(1, testObject1.getEventrole().size());
		assertEquals(true, (boolean)testObject1.getEventrole().get(0).getParticipant());
	}

	public void testRemoveEvent() {
		fail("Not yet implemented");
	}

	public void testSearchExams() {
		fail("Not yet implemented");
	}

	public void testJoinCommunity() {
		fail("Not yet implemented");
	}

	public void testCreateCommunity() {
		fail("Not yet implemented");
	}

	public void testCreateMessage() {
		fail("Not yet implemented");
	}

	public void testRemoveMessage() {
		fail("Not yet implemented");
	}

	public void testSearchMessages() {
		fail("Not yet implemented");
	}
	
}
