package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AllCommunitesImpl implements IAllCommunites {
	/** 
	 * @uml.annotations for <code>communites</code>
	 *     collection_type="Community"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ICommunity> communites;

	/* (non-Javadoc)
	 * @see IAllCommunites#getCommunites()
	 */
	public ArrayList<ICommunity> getCommunites() {
		// begin-user-code
		return communites;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAllCommunites#setCommunites(java.util.ArrayList)
	 */
	public void setCommunites(ArrayList<ICommunity> theCommunites) {
		// begin-user-code
		communites = theCommunites;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAllCommunites#addCommunity(Community)
	 */
	public void addCommunity(ICommunity community) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAllCommunites#getCommunity(java.lang.String)
	 */
	public ICommunity getCommunity(String name) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}