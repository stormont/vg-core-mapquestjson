package com.voyagegames.core.json.openstreetmap;

import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestProvidedLocationJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("latLng", JsonValueType.OBJECT),
			new RequiredObject("zoom", JsonValueType.STRING)
		};
	
	public final MapQuestLatLongJson latLng;
	public final String zoom;
	
	public MapQuestProvidedLocationJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		latLng = new MapQuestLatLongJson(obj.values.get("latLng").objectValue());
		zoom = obj.values.get("zoom").stringValue();
	}

}
