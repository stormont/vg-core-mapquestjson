package com.voyagegames.core.json.openstreetmap;

import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestOptionsJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("ignoreLatLngInput", JsonValueType.BOOLEAN),
			new RequiredObject("maxResults", JsonValueType.NUMBER),
			new RequiredObject("thumbMaps", JsonValueType.BOOLEAN)
		};
	
	public final boolean ignoreLatLngInput;
	public final boolean thumbMaps;
	public final int maxResults;
	
	public MapQuestOptionsJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		ignoreLatLngInput = obj.values.get("ignoreLatLngInput").booleanValue();
		maxResults = (int)obj.values.get("maxResults").numberValue();
		thumbMaps = obj.values.get("thumbMaps").booleanValue();
	}

}
