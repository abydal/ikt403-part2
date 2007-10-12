package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TagWordImpl implements ITagWord {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String word;

	/* (non-Javadoc)
	 * @see ITagWord#getWord()
	 */
	public String getWord() {
		// begin-user-code
		return word;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see ITagWord#setWord(java.lang.String)
	 */
	public void setWord(String theWord) {
		// begin-user-code
		word = theWord;
		// end-user-code
	}
}