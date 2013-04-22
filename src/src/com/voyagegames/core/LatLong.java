package com.voyagegames.core;

public class LatLong {
	
	public final double latitude;
	public final double longitude;
	
	public LatLong(final double latitude, final double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public static double distance(final LatLong p1, final LatLong p2) {
		final double R = 6371;  // radius of Earth in km
		final double dLat = Math.toRadians(p2.latitude - p1.latitude);
		final double dLon = Math.toRadians(p2.longitude - p1.longitude);
		final double lat1 = Math.toRadians(p1.latitude);
		final double lat2 = Math.toRadians(p2.latitude);
		final double dLatSin = Math.sin(dLat / 2.0);
		final double dLonSin = Math.sin(dLon / 2.0);

		final double a = (dLatSin * dLatSin) + (dLonSin * dLonSin * Math.cos(lat1) * Math.cos(lat2)); 
		final double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)); 
		
		return R * c;
	}

}
