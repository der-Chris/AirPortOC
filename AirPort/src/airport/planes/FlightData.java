package airport.planes;

import airport.utilities.Location;

/**
 * Class, which stores the Data of a Flight
 * @author christianverdion
 *
 */
public class FlightData {
	
	
	private TimeData timeData;
	private Location location;
	
	public String printTimeData(String informationString) {
		this.timeData.printArrival(informationString);
		this.timeData.printDeparture(informationString);
		return informationString;
	}
	
}
