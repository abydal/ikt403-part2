package socialnetwork;

import java.util.ArrayList;

import junit.framework.TestCase;

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

	public void testAddEvent() {
		fail("Not yet implemented");
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
