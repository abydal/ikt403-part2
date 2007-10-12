package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ExamImpl extends CourseImpl implements IExam {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String grade;

	/* (non-Javadoc)
	 * @see IExam#getGrade()
	 */
	public String getGrade() {
		// begin-user-code
		return grade;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IExam#setGrade(java.lang.String)
	 */
	public void setGrade(String theGrade) {
		// begin-user-code
		grade = theGrade;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CourseImpl course;

	/* (non-Javadoc)
	 * @see IExam#getCourse()
	 */
	public CourseImpl getCourse() {
		// begin-user-code
		return course;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IExam#setCourse(CourseImpl)
	 */
	public void setCourse(CourseImpl theCourse) {
		// begin-user-code
		course = theCourse;
		// end-user-code
	}
}