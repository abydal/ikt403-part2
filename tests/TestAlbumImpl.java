package tests;

import java.util.ArrayList;

import junit.framework.TestCase;
import socialnetwork.*;

public class TestAlbumImpl extends TestCase {
	AlbumImpl album;
	protected void setUp() throws Exception {
		super.setUp();
		album = new AlbumImpl();
	}

	public void testAddPicture() {
		
		//Creating picture objects
		PictureImpl pictureOne = new PictureImpl();
		PictureImpl pictureTwo = new PictureImpl();
		
		//Add them to the ablum
		album.addPicture(pictureOne);
		album.addPicture(pictureTwo);
		
		assertEquals(false, album.getPicture().isEmpty());

	}

	public void testRemovePicture() {
		PictureImpl picture = new PictureImpl();
		album.addPicture(picture);
		
		album.removePicture(picture);
		
		assertEquals(true, album.getPicture().isEmpty());
	}

	public void testSearchAlbum() {
		PictureImpl pictureOne = new PictureImpl();
		pictureOne.setFilename("Beach");
		
		PictureImpl pictureTwo = new PictureImpl();
		pictureTwo.setFilename("Ski");
		
		album.addPicture(pictureOne);
		album.addPicture(pictureTwo);
		
		ArrayList<IPicture> pictures = album.searchAlbum("Beach");
		
		assertEquals(1, pictures.size());
		
	}

	public void testSearchTags() {
		
		PictureImpl picture = new PictureImpl();
		TagWordImpl tagOne = new TagWordImpl();
		TagWordImpl tagTwo = new TagWordImpl();
		
		tagOne.setWord("ski");
		tagTwo.setWord("snow");
		
		picture.addTag(tagOne);
		picture.addTag(tagTwo);
		
		album.addPicture(picture);
		
		ArrayList<IPicture> pictures = album.searchTags("ski");
		
		assertEquals(1, pictures.size());
		
	}

}
