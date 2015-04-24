package airport.utilities;

/**
 * Represents a Pin in the WorldMap
 * it consists of the Location of a Plane and the Plane
 * @author christianverdion
 *
 */
public class Pin {
	
	private Location location;
	private String plane;
	
	/**
	 * Creates a new Instance of a Pin
	 * @param location the Location, the Plane is at
	 * @param plane the Name of the Plane
	 */
	public Pin(Location location, String plane) {
		this.location = location;
		this.plane = plane;
	}

}
