package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AddressBookImpl implements IAddressBook {
	/** 
	 * @uml.annotations for <code>student</code>
	 *     collection_type="Student"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<StudentImpl> student;

	/* (non-Javadoc)
	 * @see IAddressBook#getStudent()
	 */
	public ArrayList<StudentImpl> getStudent() {
		// begin-user-code
		return student;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAddressBook#setStudent(java.util.ArrayList)
	 */
	public void setStudent(ArrayList<StudentImpl> theStudent) {
		// begin-user-code
		student = theStudent;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAddressBook#addStudent(Student)
	 */
	public void addStudent(IStudent student) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAddressBook#removeStudent(Student)
	 */
	public void removeStudent(IStudent student) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAddressBook#searchAddressBook(java.lang.String)
	 */
	public void searchAddressBook(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}