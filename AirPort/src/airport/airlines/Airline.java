package airport.airlines;

import airport.planes.Planes;

/**
 * This Class represents the blueprint for an airline
 * @date 24.04.15
 * @author christianverdion
 */
public abstract class Airline {
	
	private Planes planes = new Planes();
	
	public abstract void departure();

	public abstract void arrival();
	
	public String printPlaneInformation(String informationString) {
		planes.printPlaneInformations(informationString);
		return informationString;
	}
}
