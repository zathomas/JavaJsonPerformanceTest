package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.reflectutils.ReflectUtilsIO

/**
* No documentation needed, just look at the methods.
*
* @author Zach A. Thomas (zach.thomas@gmail.com) (c) 2013
*/
class ReflectUtilsIOTest extends AbstractPerformanceTest {
	private ReflectUtilsIO reflectutilsIO = new ReflectUtilsIO()

	protected String serialize(PhotoAlbum album) {
		String json = reflectutilsIO.serializePhotoAlbum(album)
		return json
	}

	protected Object deserialize(String json) {
		Object album = reflectutilsIO.deserializePhotoAlbum(json)
		return album
	}

}
