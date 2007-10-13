package tests;

import java.util.ArrayList;

import junit.framework.TestCase;
import socialnetwork.*;
public class TestAddressBookImpl extends TestCase {

	AddressBookImpl addressBook;
	protected void setUp() throws Exception {
		super.setUp();
		addressBook = new AddressBookImpl();
	}

	public void testAddStudent() {
		StudentImpl studentOne = new StudentImpl();
		StudentImpl studentTwo = new StudentImpl();
		StudentImpl studentThree = new StudentImpl();
		
		addressBook.addStudent(studentOne);
		addressBook.addStudent(studentTwo);
		addressBook.addStudent(studentThree);
		
		assertEquals(3, addressBook.getStudent().size());
		
	}

	public void testRemoveStudent() {
		StudentImpl studentOne = new StudentImpl();
		addressBook.addStudent(studentOne);
		assertEquals(1, addressBook.getStudent().size());
		addressBook.removeStudent(studentOne);
		assertEquals(0, addressBook.getStudent().size());
			
	}

	public void testSearchAddressBook() {
		StudentImpl studentOne = new StudentImpl();
		StudentImpl studentTwo = new StudentImpl();
		StudentImpl studentThree = new StudentImpl();
		
		studentOne.setFirstName("Ted");
		studentTwo.setFirstName("Mary");
		studentThree.setFirstName("Seth");
		
		studentOne.setLastName("Olsen");
		studentTwo.setLastName("Kirby");
		studentThree.setLastName("Petersen");
	
		
		addressBook.addStudent(studentOne);
		addressBook.addStudent(studentTwo);
		addressBook.addStudent(studentThree);
		
		ArrayList<IStudent> result = addressBook.searchAddressBook("Ted");
		assertEquals(1, result.size());
	}

}
