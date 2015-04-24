package airport.planes;

import java.util.ArrayList;

/**
 * An Class, that organizes some the Planes
 * @author christianverdion
 *
 */
public class Planes {
	
	ArrayList<Plane> planes = new ArrayList<Plane>();

	public String printPlaneInformations(String informationString) {
		for (Plane plane : planes) {
			plane.printPlaneInformation(informationString);
		}
		return informationString;
	}
}
