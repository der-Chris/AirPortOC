package airport.utilities;

import java.util.Date;


/**
 * Class, which stores the Data of a Flight
 * @author christianverdion
 *
 */
public class FlightData {


	private TimeData timeData;
	private FlightPlan flightPlan;

	public FlightData(TimeData timeData, FlightPlan flightPlan) {
		this.flightPlan = flightPlan;
		this.timeData = timeData;
	}

	public String printTimeData(String informationString) {
		this.timeData.printArrival(informationString);
		this.timeData.printDeparture(informationString);
		return informationString;
	}
	
	public double getFlightDuration() {
		double result = this.flightPlan.getFlightDuration();
		this.flightPlan.updateTimeData(this.timeData, result);
		return result;
	}

//	public String printLocation(String informationString) {
//		return this.location.printLocation(informationString);
//	}
//
//	public void changeDepartureTime(Date date) {
//		this.timeData.changeDepartureTime(date);
//	}
}
