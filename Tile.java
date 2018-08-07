public class Tile {
	private boolean isPlowed;
	private boolean isReady;
	private boolean isWithered;
	private boolean hasRocks;
	private boolean isAvailable;

	private int waterCount;
	private int fertilizerCount;
	private double growingTime;

	private Seed occupant;

	private int pos;

	// Constructor
	public Tile(int pos) {
		occupant = null;
		this.pos = pos;
		isAvailable = true;
	}

	/*
		This is the displayStats method
		This returns a string containing the formatted information regarding the tile for displaying purposes
	*/
	public String displayStats() {
		String display = "";

		display = display + "\n\n\n\nTile Position: " + pos + "\n\n";
		display = display + "Plowed: " + isPlowed + "\n";
		display = display + "Can be Harvested: " + isReady + "\n";
		display = display + "Withered: " + isWithered + "\n";
		display = display + "Rock: " + hasRocks + "\n";
		display = display + "Available: " + isAvailable + "\n\n";
		display = display + "Times Watered: " + waterCount + "\n";
		display = display + "Times Fertilized: " + fertilizerCount + "\n";

		String s = "";

		if (occupant == null) {
			if (hasRocks == true) {
				s = "ROCK";
			} else {
				s = "NONE";
			}
		} else
			s = occupant.getName() + " Crop";

		display = display + "Occupied by: " + s + "\n\n\n";
		display = display + "ALWAYS CLICK TILE TO REFRESH STATUS\n";

		return display;
	}

	/*
		This is the addWaterCount method.
		This method adds 1 to the waterCount of the tile if it is still not over the max water needed of the occupying seed.
	*/

	public void addWaterCount() {
		if (waterCount < occupant.getWM())
			waterCount++;
	}

	/*
		This is the addFertilizerCount method.
		This method adds 1 to the fertilizerCount of the tile if it is still not over the max fertilizer needed of the occupying seed.
	*/
	public void addFertilizerCount() {
		if (fertilizerCount < occupant.getFM())
			fertilizerCount++;
	}

	/*
		This is the reset method.
		This method reverts the state of a tile to an unplowed and available tile.
	*/

	public void reset() {
		isPlowed = false;
		isReady = false;
		isWithered = false;
		hasRocks = false;
		isAvailable = true;

		waterCount = 0;
		fertilizerCount = 0;
		growingTime = 0.0;

		occupant = null;
	}

	/*
		This is the isTree method.
		This method returns true if the occupant is an intance of FruitTree of the class Seed.
	*/
	public boolean isTree() {
		if (occupant == null)
			return false;

		return (occupant instanceof FruitTree);
	}

	/*
		This is the isVegetable method.
		This method returns true if the occupant is an intance of Vegetable of the class Seed.
	*/
	public boolean isVegetable() {
		if (occupant == null)
			return false;

		return (occupant instanceof Vegetable);
	}

	/*
		This is the isFlower method.
		This method returns true if the occupant is an intance of Flower of the class Seed.
	*/
	public boolean isFlower() {
		if (occupant == null)
			return false;

		return (occupant instanceof Flower);
	}

	/*
		This is the grownProperly method.
		This method returns true if the seed has received sufficient watering and fertilizing, else returns false.
	*/
	public boolean grownProperly() {
		if (waterCount >= occupant.getWN() && fertilizerCount >= occupant.getFN())
			return true;
		
		return false;
	}
	/*
		This is the setOccupant method.
		This method sets the occupant of the tile to the specified Seed s.
		This method is only called by the plant method in the Farmer class, under any circumstances.
	*/

	public void setOccupant(Seed s) {
		occupant = s;
		isAvailable = false;
		growingTime = s.getTN();
	}


	// Boolean Setters
	public void setPlow(boolean bool) {
		isPlowed = bool;
	}

	public void setReady(boolean bool) {
		isReady = bool;
	}

	public void setWither(boolean bool) {
		isWithered = bool;
	}

	public void setRocks(boolean bool) {
		hasRocks = bool;
	}

	public void setAvailable(boolean bool) {
		isAvailable = bool;
	}

	/* Auxilliary Setters
	public void setWC(int n)
	{
		waterCount = n;
	}

	public void setFC(int n)
	{
		fertilizerCount = n;
	}

	public void setTime(double d)
	{
		growingTime = d;
	}
	*/

	// Getters

	public boolean getPlowed() {
		return isPlowed;
	}

	public boolean getReady() {
		return isReady;
	}

	public boolean getWithered() {
		return isWithered;
	}

	public boolean getRocks() {
		return hasRocks;
	}

	public boolean getAvailable() {
		return isAvailable;
	}

	public int getWC() {
		return waterCount;
	}

	public int getFC() {
		return fertilizerCount;
	}

	public double getTime() {
		return growingTime;
	}

	public Seed getOccupant() {
		return occupant;
	}

	public int getPos() {
		return pos;
	}

}
