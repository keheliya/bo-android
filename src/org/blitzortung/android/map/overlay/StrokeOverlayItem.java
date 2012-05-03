package org.blitzortung.android.map.overlay;

import java.util.Date;

import org.blitzortung.android.data.Projection;
import org.blitzortung.android.data.beans.AbstractStroke;

import com.google.android.maps.OverlayItem;

public class StrokeOverlayItem extends OverlayItem {

	Date timestamp;
	
	public StrokeOverlayItem(AbstractStroke stroke) {
		super(Projection.toMapCoords(stroke.getLatitude(), stroke.getLongitude()), "", "");

		timestamp = stroke.getTime();		
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

}
