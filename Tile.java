/**
* public class <b>Tile</b>
*
* The class Tile is a component in the <b>Farmer</b> class.
*
* <p>
* The Tile class represents a unit of land in the <b>Farmer</b>'s farmLot. It can be occupied with a <b>Seed</b>.
* <p>
* This unit of land contains necessary info about the tile, including:<br>
* States: <i>isPlowed</i>, <i>isReady</i>, <i>isWithered</i>, <i>hasRocks</i>, <i>isAvailable</i> <br>
* Seed Information: <i>waterCount</i>, <i>fertilizerCount</i>, <i>growingTime</i>, <i>occupant</i>(<b>Seed</b>), <br>
* and the <i>pos</i>, which represents the position of the tile in the farmLot.
* <p>
* The <i>pos</i> variable is based on an arrayList position, at the same time considering a 10 by 5
* layout in terms of a grid.
*
* @author  Gabriel T. Tan & Adrian Paule D. Ty
* @version 1.0
* @since   2018-08-15
* @see         Seed
* @see         Farmer
*/
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

	/**
 	*  A constructor for objects of Tile class
	* <p>
	* This costructor for this Tile is generally useful when instatiating multiple tiles
	* in a for loop, which prevents repetition of the positions.
	* <p>
	* Additionally, this contructor initially sets the occupant of the Tile to <i>null</i>,
	* and sets it's <i>isAvailable</i> state to true, keeping the rest false.
	*
 	* @param  pos  an integer which represents the position of the tile
 	*/
	public Tile(int pos) {
		occupant = null;
		this.pos = pos;
		isAvailable = true;
	}

	/**
	* Returns a string of text containing the Tile's information
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the Tile's information
	*/
	public String displayStats() {
		String display = "";

		display = display + "\nTile Position: " + pos + "\n\n";
		display = display + "Plowed: " + isPlowed + "\n";
		display = display + "Can be Harvested: " + isReady + "\n";
		display = display + "Withered: " + isWithered + "\n";
		display = display + "Rock: " + hasRocks + "\n";
		display = display + "Available: " + isAvailable + "\n";
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

		display = display + "Occupied by: " + s + "\n";
		display = display + "ALWAYS CLICK TILE TO REFRESH STATUS\n";

		return display;
	}

	/**
	* Automatically adds 1 to the <i>waterCount</i>.
	* <p>
	* This automatically adds 1 to the waterCount of the tile if the <b>Seed</b> occupant's
	* waterMax is not reached yet.
	* This method does nothing otherwise.
	* This method is mainly called from the <b>Farmer</b> class hence
	* the checking if there is an occupant for the tile is done on the <b>Farmer</b>.
	*/
	public void addWaterCount() {
		if (waterCount < occupant.getWM())
			waterCount++;
	}

	/**
	* Automatically adds 1 to the <i>fertilizerCount</i>.
	* <p>
	* This automatically adds 1 to the fertilizerCount of the tile if the <b>Seed</b> occupant's
	* fertilizerMax is not reached yet.
	* This method does nothing otherwise.
	* This method is mainly called from the <b>Farmer</b> class hence
	* the checking if there is an occupant for the tile is done on the <b>Farmer</b>.
	*/
	public void addFertilizerCount() {
		if (fertilizerCount < occupant.getFM())
			fertilizerCount++;
	}

	/**
	* Automatically returns the state of a tile to an unplowed tile.
	* <p>
	* An unplowed tile is not plowed, not ready (for harvest), not withered,
	* no rocks, and available.
	* The waterCount and fertilizerCount is also set back to 0.
	* The same goes for the growingTime.
	* The occupant is also set to <i>null</i>.
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
