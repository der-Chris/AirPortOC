package airport.planes;

import airport.utilities.WorldMap;

public abstract class Plane {
	
	public abstract void departure();

	public abstract void arrival();
	
	public abstract WorldMap printPosition(WorldMap worldMap);

}
