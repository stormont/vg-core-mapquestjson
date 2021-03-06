package com.voyagegames.core.json.openstreetmap;

import com.voyagegames.core.json.JsonObject;
import com.voyagegames.core.json.JsonValueType;
import com.voyagegames.core.json.RequiredObject;
import com.voyagegames.core.json.StructuredJson;

public class MapQuestCopyrightJson extends StructuredJson {
	
	private static final RequiredObject[] REQUIRED_OBJECTS = {
			new RequiredObject("imageAltText", JsonValueType.STRING),
			new RequiredObject("imageUrl", JsonValueType.STRING),
			new RequiredObject("text", JsonValueType.STRING)
		};
	
	public final String imageAltText;
	public final String imageUrl;
	public final String text;
	
	public MapQuestCopyrightJson(final JsonObject obj) {
		super(obj, REQUIRED_OBJECTS);
		
		imageAltText = obj.values.get("imageAltText").stringValue();
		imageUrl = obj.values.get("imageUrl").stringValue();
		text = obj.values.get("text").stringValue();
	}

}
