package socialnetwork;
import java.util.ArrayList;

public interface IAddressBook {

	/** 
	 * @return the student
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<StudentImpl> getStudent();

	/** 
	 * @param theStudent the student to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setStudent(ArrayList<StudentImpl> theStudent);

	/** 
	 * @param student
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addStudent(IStudent student);

	/** 
	 * @param student
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeStudent(IStudent student);

	/** 
	 * @param searchString
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void searchAddressBook(String searchString);

}