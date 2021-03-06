package com.voyagegames.core.json.openstreetmap;

import java.util.ArrayList;
import java.util.List;

import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValue;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestResultJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("locations", JsonValueType.ARRAY),
			new RequiredObject("providedLocation", JsonValueType.OBJECT)
		};
	
	public final List<MapQuestLocationJson> locations;
	public final MapQuestProvidedLocationJson providedLocation;
	
	public MapQuestResultJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		locations = new ArrayList<MapQuestLocationJson>();
		
		for (final JsonValue v : obj.values.get("locations").arrayValue()) {
			locations.add(new MapQuestLocationJson(v.objectValue()));
		}
		
		providedLocation = new MapQuestProvidedLocationJson(obj.values.get("providedLocation").objectValue());
	}

}
