package socialnetwork;
/**
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

/** 
 * @author Terje Br�dland
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AlbumImpl implements IAlbum {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;

	/* (non-Javadoc)
	 * @see IAlbum#getName()
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#setName(java.lang.String)
	 */
	public void setName(String theName) {
		// begin-user-code
		name = theName;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/* (non-Javadoc)
	 * @see IAlbum#getDescription()
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#setDescription(java.lang.String)
	 */
	public void setDescription(String theDescription) {
		// begin-user-code
		description = theDescription;
		// end-user-code
	}

	/** 
	 * @uml.annotations for <code>picture</code>
	 *     collection_type="Picture"
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<IPicture> picture = new ArrayList<IPicture>();

	/* (non-Javadoc)
	 * @see IAlbum#getPicture()
	 */
	public ArrayList<IPicture> getPicture() {
		// begin-user-code
		return picture;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#setPicture(java.util.ArrayList)
	 */
	public void setPicture(ArrayList<IPicture> thePicture) {
		// begin-user-code
		picture = thePicture;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Boolean _private;

	/* (non-Javadoc)
	 * @see IAlbum#get_private()
	 */
	public Boolean get_private() {
		// begin-user-code
		return _private;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#set_private(java.lang.Boolean)
	 */
	public void set_private(Boolean the_private) {
		// begin-user-code
		_private = the_private;
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#addPicture(Picture)
	 */
	public void addPicture(IPicture picture) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.picture.add(picture);
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#removePicture(Picture)
	 */
	public void removePicture(IPicture picture) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.picture.remove(picture);
		
		// end-user-code
	}

	/* (non-Javadoc)
	 * @see IAlbum#searchAlbum(java.lang.String)
	 */
	public ArrayList<IPicture> searchAlbum(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub
		ArrayList<IPicture> searchResult = new ArrayList<IPicture>();
		
		for(IPicture p : picture)
		{
			
			if(p.getFilename().equals(searchString))
			{
				searchResult.add(p);
			}
		}
		// end-user-code
		
		return searchResult;
	}

	/* (non-Javadoc)
	 * @see IAlbum#searchTags(java.lang.String)
	 */
	public ArrayList<IPicture> searchTags(String searchString) {
		// begin-user-code
		// TODO Auto-generated method stub
		ArrayList<IPicture> searchResult = new ArrayList<IPicture>();
		
		for(IPicture p : picture)
		{
			for(ITagWord t : p.getTagword())
			{
				if(t.getWord().equals(searchString))
				{
					searchResult.add(p);
				}
			}
		}
		// end-user-code
		
		return searchResult;
	}
}