package airport.utilities;

/**
 * Represents the interval of departure of a plane in milliseconds
 * @author christianverdion
 *
 */
public enum DepartureInterval {

	// 60.000 Milliseconds are 1 Minute
	// 3.600.000 Milliseconds are 1 Hour

	Every1Min(1 * 60000),
	Every2Min(2 * 60000), 
	Every5Min(5 * 60000), 
	Every10Min(10 * 60000), 
	Every30Min(30 * 60000), 
	Every1h(1 * 3600000);

	long intervallTime;

	private DepartureInterval(long intervallTime) {
		this.intervallTime = intervallTime;
	}
}
