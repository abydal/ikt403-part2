package socialnetwork;
import java.util.ArrayList;

public interface IAllCommunites {

	/** 
	 * @return the communites
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ArrayList<ICommunity> getCommunites();

	/** 
	 * @param theCommunites the communites to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void setCommunites(ArrayList<ICommunity> theCommunites);

	/** 
	 * @param community
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void addCommunity(ICommunity community);

	/** 
	 * @param name
	 * @return
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract ICommunity getCommunity(String name);

}