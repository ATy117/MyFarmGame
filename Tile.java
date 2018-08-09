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
* @author  Gabriel T. Tan and Adrian Paule D. Ty
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

	/**
	* Checks if the current <b>Seed</b> <i>occupant</i> of the tile is an instance of the class <b>FruitTree</b>
	* <p>
	* This method calls the <i>instanceof</i> operator and compares the occupant of the tile to the FruitTree class.
	* This returns true if the seed is a FruitTree and returns false otherwise.
	* It automatically returns false when there is no occupant in the tile.
	* @return	a boolean if the <i>seed</i> occupant of the tile is an instace of <b>FruitTree</b>.
	* @see		isVegetable()
	* @see		isFlower()
	*/
	public boolean isTree() {
		if (occupant == null)
			return false;

		return (occupant instanceof FruitTree);
	}

	/**
	* Checks if the current <b>Seed</b> <i>occupant</i> of the tile is an instance of the class <b>Vegetable</b>
	* <p>
	* This method calls the <i>instanceof</i> operator and compares the occupant of the tile to the Vegetable class.
	* This returns true if the seed is a Vegetable and returns false otherwise.
	* It automatically returns false when there is no occupant in the tile.
	* @return	a boolean if the <i>seed</i> occupant of the tile is an instace of <b>Vegetable</b>.
	* @see		isTree()
	* @see		isFlower()
	*/
	public boolean isVegetable() {
		if (occupant == null)
			return false;

		return (occupant instanceof Vegetable);
	}

	/**
	* Checks if the current <b>Seed</b> <i>occupant</i> of the tile is an instance of the class <b>Flower</b>
	* <p>
	* This method calls the <i>instanceof</i> operator and compares the occupant of the tile to the Flower class.
	* This returns true if the seed is a Flower and returns false otherwise.
	* It automatically returns false when there is no occupant in the tile.
	* @return	a boolean if the <i>seed</i> occupant of the tile is an instace of <b>Flower</b>.
	* @see		isTree()
	* @see		isVegetable()
	*/
	public boolean isFlower() {
		if (occupant == null)
			return false;

		return (occupant instanceof Flower);
	}

	/**
	* Checks if the occupant of the tile has grown successfully
	* <p>
	* This method checks the current <i>waterCount</i> and <i>fertilizerCount</i> of the tile.
	* It then compares the values to the <i>waterNeed</i> and <i>fertilizerNeed</i> of the occupant.
	* If any one of these values are less than their required amounts,
	* the seed is said to have not grown properly and hence returns false.
	* This returns true if both values matched or are greater than their counterparts.
	* @return	a boolean if the <i>seed</i> occupant of the tile has grown properly
	*/
	public boolean grownProperly() {
		if (waterCount >= occupant.getWN() && fertilizerCount >= occupant.getFN())
			return true;

		return false;
	}
	
	/**
	* Sets the <i>occupant</i> of the tile to the specified <i>seed</i>.
	* <p>
	* This method sets the <i>occupant</i> of the tile to the specified  <b>Seed</b> s.
	* This also sets the <i>isAvailable</i> variable of the tile to false, as it is now occupied.
	* The <i>growingTime</i> of the tile is also set to the <i>timeNeeded</i> of the <b>Seed</b> <i>s</i>.
	* It retrieves the value by calling the getter getTN() of the <b>Seed</b> class.
	*
	* @param  s  a seed which represents the occupant of the tile
	*/
	public void setOccupant(Seed s) {
		occupant = s;
		isAvailable = false;
		growingTime = s.getTN();
	}

	/**
	* Sets the <i>isPlowed</i> variable of the tile to the specified <i>boolean</i>.
	*
	* @param bool a boolean representing the state of <i>isPlowed</i>
	*/
	public void setPlow(boolean bool) {
		isPlowed = bool;
	}

	/**
	* Sets the <i>isReady</i> variable of the tile to the specified <i>boolean</i>.
	*
	* @param bool a boolean representing the state of <i>isReady</i>
	*/
	public void setReady(boolean bool) {
		isReady = bool;
	}

	/**
	* Sets the <i>isWithered</i> variable of the tile to the specified <i>boolean</i>.
	*
	* @param bool a boolean representing the state of <i>isWithered</i>
	*/
	public void setWither(boolean bool) {
		isWithered = bool;
	}

	/**
	* Sets the <i>hasRocks</i> variable of the tile to the specified <i>boolean</i>.
	*
	* @param bool a boolean representing the state of <i>hasRocks</i>
	*/
	public void setRocks(boolean bool) {
		hasRocks = bool;
	}

	/**
	* Sets the <i>isAvailable</i> variable of the tile to the specified <i>boolean</i>.
	*
	* @param bool a boolean representing the state of <i>isAvailable</i>
	*/
	public void setAvailable(boolean bool) {
		isAvailable = bool;
	}

	/**
 	* Returns the <i>isPlowed</i> state of the tile
	*
 	* @return	boolean representing the <i>isPlowed</i> state
 	*/
	public boolean getPlowed() {
		return isPlowed;
	}

	/**
 	* Returns the <i>isReady</i> state of the tile
	*
 	* @return	boolean representing the <i>isReady</i> state
 	*/
	public boolean getReady() {
		return isReady;
	}

	/**
 	* Returns the <i>isWithered</i> state of the tile
	*
 	* @return	boolean representing the <i>isWithered</i> state
 	*/
	public boolean getWithered() {
		return isWithered;
	}

	/**
 	* Returns the <i>hasRocks</i> state of the tile
	*
 	* @return	boolean representing the <i>hasRocks</i> state
 	*/
	public boolean getRocks() {
		return hasRocks;
	}

	/**
 	* Returns the <i>isAvailable</i> state of the tile
	*
 	* @return	boolean representing the <i>isAvailable</i> state
 	*/
	public boolean getAvailable() {
		return isAvailable;
	}

	/**
 	* Returns the <i>waterCount</i> of the tile
	*
 	* @return	integer representing the water count
 	*/
	public int getWC() {
		return waterCount;
	}

	/**
 	* Returns the <i>FertilizerCount</i> of the tile
	*
 	* @return	integer representing the fertilizer count
 	*/
	public int getFC() {
		return fertilizerCount;
	}

	/**
 	* Returns the <i>growingTime</i> of the tile
	*
 	* @return	double representing the time needed to grow
 	*/
	public double getTime() {
		return growingTime;
	}

	/**
 	* Returns the <i>occupant</i> of the tile
	*
 	* @return	seed representing the occupant 
 	*/
	public Seed getOccupant() {
		return occupant;
	}

	/**
 	* Returns the <i>pos</i> of the tile
	*
 	* @return	integer representing the position of the tile
 	*/
	public int getPos() {
		return pos;
	}

}
