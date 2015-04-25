package airport.planes;

import airport.utilities.FlightData;
import airport.utilities.WorldMap;

public abstract class Plane {
	
	private PlaneData planeData;
	private FlightData flightData;
	
	public abstract void departure();

	public abstract void arrival();
	
	public abstract WorldMap printPosition(WorldMap worldMap);
	
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
