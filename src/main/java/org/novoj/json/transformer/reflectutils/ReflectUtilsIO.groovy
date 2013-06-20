package org.novoj.json.transformer.reflectutils

import org.azeckoski.reflectutils.transcoders.JSONTranscoder
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
* @author Zach A. Thomas (zach.thomas@gmail.com) (c) 2013
 */
class ReflectUtilsIO implements JsonIO {
    private JSONTranscoder transcoder = new JSONTranscoder()

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return transcoder.makeJSON(photoAlbum)
	}

	Object deserializePhotoAlbum(String json) {
		return transcoder.decode(json)
	}

}
