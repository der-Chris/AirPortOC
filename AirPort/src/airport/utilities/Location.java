package airport.utilities;

/**
 * Represents a Location containing Latitude and Longitude implemented as decimal degree
 * @author christianverdion
 *
 */
public class Location {

	float latitude;
	float longitude;
	
	/**
	 * Creates a New Location as Coordinates 
	 * with latitude and longitude in decimal degrees
	 * @param latitude the Latitude or North Coordinate of this Position
	 * @param longitude the Longitude or South Coordinate of this Position
	 */
	public Location(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String printLocation(String informationString) {
		return informationString + latitude + " " + longitude;
	}
	
	public double getDistance(Location location) {
		double result = 0;
		result = Math.pow(this.latitude - location.latitude, 2.0) + Math.pow(this.longitude - location.longitude, 2.0);
		return Math.sqrt(result);
	}
}
