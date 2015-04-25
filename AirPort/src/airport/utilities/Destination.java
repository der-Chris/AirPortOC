package airport.utilities;

public enum Destination {
	Berlin(new Location(52.518611f, 13.408333f)), 
	Paris(new Location(48.856667f, 2.351667f)), 
	London(new Location(51.50939f, -0.11832f));

	Location location;

	private Destination(Location location) {
		this.location = location;
	}

	public double getDistance(Destination destination) {
		Location location = this.location;
		return location.getDistance(destination.location);
	}
}
