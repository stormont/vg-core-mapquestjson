package com.voyagegames.core.json.openstreetmap;

import com.voyagegames.core.LatLong;
import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestLatLongJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("lat", JsonValueType.NUMBER),
			new RequiredObject("lng", JsonValueType.NUMBER),
		};
	
	public final LatLong value;
	
	public MapQuestLatLongJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		value = new LatLong(obj.values.get("lat").numberValue(), obj.values.get("lng").numberValue());
	}

}
