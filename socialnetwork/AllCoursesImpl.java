package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AllCoursesImpl implements ICourse, IAllCourses {
	/** 
	 * @uml.annotations for <code>course</code>
	 *     collection_type="Course"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<CourseImpl> course;

	/* (non-Javadoc)
	 * @see ICourse#getCourse()
	 */
	/* (non-Javadoc)
	 * @see IAllCourses#getCourse()
	 */
	public ArrayList<CourseImpl> getCourse() {
		// begin-user-code
		return course;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICourse#setCourse(java.util.ArrayList)
	 */
	/* (non-Javadoc)
	 * @see IAllCourses#setCourse(java.util.ArrayList)
	 */
	public void setCourse(ArrayList<CourseImpl> theCourse) {
		// begin-user-code
		course = theCourse;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICourse#addCourse(Course)
	 */
	/* (non-Javadoc)
	 * @see IAllCourses#addCourse(CourseImpl)
	 */
	public void addCourse(CourseImpl course) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICourse#removeCourse(Course)
	 */
	/* (non-Javadoc)
	 * @see IAllCourses#removeCourse(CourseImpl)
	 */
	public void removeCourse(CourseImpl course) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ICourse#searchCourses(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see IAllCourses#searchCourses(java.lang.String)
	 */
	public void searchCourses(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}