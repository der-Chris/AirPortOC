package airport.planes;

public class PlaneData {
	
	String name;
	
	public String printPlaneData(String informationString) {
		informationString = informationString + "\t" + this.name;
		return informationString;
	}

}
