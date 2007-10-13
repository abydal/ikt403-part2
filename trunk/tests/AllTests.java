package tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import socialnetwork.*;
import socialnetwork.*;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for socialnetwork");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCommunityImpl.class);
		suite.addTestSuite(TestPictureImpl.class);
		suite.addTestSuite(TestBlogPostImpl.class);
		suite.addTestSuite(TestBlogImpl.class);
		suite.addTestSuite(TestEventImpl.class);
		suite.addTestSuite(TestAlbumImpl.class);
		suite.addTestSuite(TestStructure.class);
		suite.addTestSuite(TestStudentImpl.class);
		suite.addTestSuite(TestAddressBookImpl.class);
		//$JUnit-END$
		return suite;
	}

}
