package socialnetwork;
import java.util.ArrayList;

public interface IAllCourses {

	/* (non-Javadoc)
	 * @see ICourse#getCourse()
	 */
	public abstract ArrayList<CourseImpl> getCourse();

	/* (non-Javadoc)
	 * @see ICourse#setCourse(java.util.ArrayList)
	 */
	public abstract void setCourse(ArrayList<CourseImpl> theCourse);

	/* (non-Javadoc)
	 * @see ICourse#addCourse(Course)
	 */
	public abstract void addCourse(CourseImpl course);

	/* (non-Javadoc)
	 * @see ICourse#removeCourse(Course)
	 */
	public abstract void removeCourse(CourseImpl course);

	/* (non-Javadoc)
	 * @see ICourse#searchCourses(java.lang.String)
	 */
	public abstract void searchCourses(String searchString);

}