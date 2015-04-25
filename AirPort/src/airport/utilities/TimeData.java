package airport.utilities;

import java.util.Date;

/**
 * A Class which stores the Departure and Arrival of a Plane
 * @author christianverdion
 *
 */
public class TimeData {

	private Date departure;
	private Date arrival;
	
	public String printDeparture(String informationString) {
		informationString = informationString + "\t" + departure.toString();
		return informationString;
	}
	
	public String printArrival(String informationString) {
		informationString = informationString + "\t" + arrival.toString();
		return informationString;
	}
}
