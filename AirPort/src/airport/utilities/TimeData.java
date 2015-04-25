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
	
	public void changeDepartureTime(Date date) {
		this.departure = date;
	}
	
	/**
	 * Adds the time, the flight takes to the departure time and stores it in the arrival time
	 * @param flightTime the time, the flight takes in minutes
	 * 60.000 Milliseconds are 1 Minute
	 */
	public void setArrivalTime(double flightTime) {
		long flightTimeInMilli = (long) (flightTime * 60000L);
		this.arrival = new Date(departure.getTime() + flightTimeInMilli);
	}
}
