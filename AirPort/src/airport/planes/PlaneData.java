package airport.planes;

public class PlaneData {
	
	String id;
	
	public PlaneData(String id) {
		this.id = id;
	}
	
	public String printPlaneData(String informationString) {
		informationString = informationString + "\t" + this.id;
		return informationString;
	}

}
