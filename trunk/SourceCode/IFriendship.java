package socialnetwork;

public interface IFriendship {

	/**
	 * @return the accepted
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Boolean getAccepted();

	/**
	 * @param theAccepted the accepted to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setAccepted(Boolean theAccepted);

	/**
	 * @return  the initates
	 * @generated  "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IStudent getInitates();

	/**
	 * @param theInitates  the initates to set
	 * @generated  "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setInitates(IStudent theInitates);

	/**
	 * @return the friend
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract IStudent getFriend();

	/**
	 * @param theFriend the friend to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setFriend(IStudent theFriend);

}