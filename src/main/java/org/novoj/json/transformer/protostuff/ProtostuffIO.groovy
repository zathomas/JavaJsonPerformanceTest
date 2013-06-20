package org.novoj.json.transformer.protostuff

import com.dyuproject.protostuff.JsonIOUtil
import com.dyuproject.protostuff.Schema
import com.dyuproject.protostuff.runtime.RuntimeSchema
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class ProtostuffIO implements JsonIO {
	private Schema<PhotoAlbum> schema;

	ProtostuffIO() {
		schema = RuntimeSchema.getSchema(PhotoAlbum.class);
	}

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		StringWriter out = new StringWriter()
		JsonIOUtil.writeTo(out, photoAlbum, schema, true)
		return out.toString()
	}

	Object deserializePhotoAlbum(String json) {
		StringReader source = new StringReader(json)
		PhotoAlbum album = new PhotoAlbum()
		JsonIOUtil.mergeFrom(source, album, schema, true)
		return album;
	}

}
