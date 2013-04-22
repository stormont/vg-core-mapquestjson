package com.voyagegames.core.json.openstreetmap;

import com.voyagegames.core.BoundingBox;
import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestBoundingBoxJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("lr", JsonValueType.OBJECT),
			new RequiredObject("ul", JsonValueType.OBJECT),
		};
	
	public final BoundingBox boundingBox;
	
	public MapQuestBoundingBoxJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		final MapQuestLatLongJson lr = new MapQuestLatLongJson(obj.values.get("lr").objectValue());
		final MapQuestLatLongJson ul = new MapQuestLatLongJson(obj.values.get("ul").objectValue());
		
		boundingBox = new BoundingBox(lr.value, ul.value);
	}

}
