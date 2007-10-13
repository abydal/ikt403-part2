package socialnetwork;

import java.util.ArrayList;

public interface ICourse {

	/** 
	 * @return the coursename
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract String getCoursename();

	/** 
	 * @param theCoursename the coursename to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setCoursename(String theCoursename);

	/** 
	 * @return the credit
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Integer getCredit();

	/** 
	 * @param theCredit the credit to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setCredit(Integer theCredit);

	/** 
	 * @return the comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<IComment> getComment();

	/** 
	 * @param theComment the comment to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setComment(ArrayList<IComment> theComment);

	/** 
	 * @param comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addComment(IComment comment);

	/** 
	 * @param comment
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void removeComment(IComment comment);

}