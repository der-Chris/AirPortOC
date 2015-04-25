package airport.utilities;

import java.util.Date;


/**
 * Class, which stores the Data of a Flight
 * @author christianverdion
 *
 */
public class FlightData {
	
	
	private TimeData timeData;
	private Location location;
	
	public FlightData(TimeData timeData, Location location) {
		// TODO Auto-generated constructor stub
	}
	
	public String printTimeData(String informationString) {
		this.timeData.printArrival(informationString);
		this.timeData.printDeparture(informationString);
		return informationString;
	}
	
	public String printLocation(String informationString) {
		return this.location.printLocation(informationString);
	}
	
	public void changeDepartureTime(Date date) {
		this.timeData.changeDepartureTime(date);
	}
	
}
