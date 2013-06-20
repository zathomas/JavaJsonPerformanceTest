package org.novoj.json.transformer.xstream

import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class XStreamIO implements JsonIO {
	private XStream xstream;

	XStreamIO() {
		xstream = new XStream(new JettisonMappedXmlDriver())
		xstream.mode = XStream.NO_REFERENCES;
		xstream.alias("photoAlbum", PhotoAlbum.class);
	}



	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return xstream.toXML(photoAlbum)
	}

	Object deserializePhotoAlbum(String json) {
		return (PhotoAlbum)xstream.fromXML(json);
	}

}
