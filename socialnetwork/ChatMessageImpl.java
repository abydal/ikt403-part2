package socialnetwork;
/**
 * 
 */

/** 
 * @author Terje Brådland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ChatMessageImpl implements IChatMessage {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent sender;

	/* (non-Javadoc)
	 * @see IChatMessage#getSender()
	 */
	public IStudent getSender() {
		// begin-user-code
		return sender;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IChatMessage#setSender(Student)
	 */
	public void setSender(IStudent theSender) {
		// begin-user-code
		sender = theSender;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStudent receiver;

	/* (non-Javadoc)
	 * @see IChatMessage#getReceiver()
	 */
	public IStudent getReceiver() {
		// begin-user-code
		return receiver;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IChatMessage#setReceiver(Student)
	 */
	public void setReceiver(IStudent theReceiver) {
		// begin-user-code
		receiver = theReceiver;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer date;

	/* (non-Javadoc)
	 * @see IChatMessage#getDate()
	 */
	public Integer getDate() {
		// begin-user-code
		return date;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IChatMessage#setDate(java.lang.Integer)
	 */
	public void setDate(Integer theDate) {
		// begin-user-code
		date = theDate;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String content;

	/* (non-Javadoc)
	 * @see IChatMessage#getContent()
	 */
	public String getContent() {
		// begin-user-code
		return content;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IChatMessage#setContent(java.lang.String)
	 */
	public void setContent(String theContent) {
		// begin-user-code
		content = theContent;
		// end-user-code
	}
}