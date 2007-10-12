package socialnetwork;
import java.util.ArrayList;

public interface ICourse {

	/** 
	 * @return the course
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<CourseImpl> getCourse();

	/** 
	 * @param theCourse the course to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setCourse(ArrayList<CourseImpl> theCourse);

	/** 
	 * @param course
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addCourse(CourseImpl course);

	/** 
	 * @param course
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeCourse(CourseImpl course);

	/** 
	 * @param searchString
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void searchCourses(String searchString);

}