package airport.utilities;

public class FlightPlan {
	
	private Destination destination;
	private Destination source;
	
	public FlightPlan(Destination destination, Destination source) {
		this.destination = destination;
		this.source = source;
	}
	
	public double getFlightDuration() {
		double result = 0;
		result = this.destination.getDistance(this.source);
		// TODO test how calculate flight time
		return result;
	}
	
	public TimeData updateTimeData(TimeData timeData, double flightDuration) {
		timeData.setArrivalTime(flightDuration);
		return timeData;
	}

}
