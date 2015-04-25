package airport.planes;

import airport.utilities.FlightData;
import airport.utilities.Pin;
import airport.utilities.WorldMap;

/**
 * The blueprint for a Plane
 * @author christianverdion
 *
 */
public abstract class Plane {

	private PlaneData planeData;
	private FlightData flightData;

	public Plane(PlaneData planeData, FlightData flightData) {
		this.planeData = planeData;
		this.flightData = flightData;
	}

	public abstract void departure();

	public abstract void arrival();

	public WorldMap printPosition(WorldMap worldMap) {
		// TODO create Pin, give it to planeData and flightData to let it be filled
		Pin pin = new Pin(null, null);
		worldMap.addPin(pin);
		return worldMap;
	}

	public String printPlaneInformation(String informationString) {
		this.planeData.printPlaneData(informationString);
		this.flightData.printTimeData(informationString);
		return informationString;
	}

	public void dontFlyAway() {
		// TODO implement this Method
	}

	public void flyAway() {
		// TODO implement this Method
	}
}
