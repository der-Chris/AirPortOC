package airport.airlines;

/**
 * This Class represents the blueprint for an airline
 * @date 24.04.15
 * @author christianverdion
 */
public abstract class Airline {
	
	public abstract void departure();

	public abstract void arrival();
	
	public abstract String printInformation(String informationString);
}
