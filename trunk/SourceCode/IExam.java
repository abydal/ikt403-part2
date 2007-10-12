package socialnetwork;
public interface IExam {

	/** 
	 * @return the grade
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract String getGrade();

	/** 
	 * @param theGrade the grade to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setGrade(String theGrade);

	/** 
	 * @return the course
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract CourseImpl getCourse();

	/** 
	 * @param theCourse the course to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setCourse(CourseImpl theCourse);

}