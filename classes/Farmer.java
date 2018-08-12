
/**
* The class <b>Random</b> is imported to be used for generating a number the number of rocks, and tile positions containing the rocks.
*/
import java.util.*;

/**
* public class <b>Farmer</B>
*
*
* The class Farmer is the main model file that interacts with the controller or view.
*
* <p>
* This Farmer class represents the player itself interacting with the application.
* This contains necessary information about the farmer, including: <br>
* Statistics: <i>name</i>, <i>level</i>, <i>currentExp</i>, <i>maxExp</i>, <i>rank</i>, <i>rankName</i> <br>
* Register Information: <i>canRegister</i>, <i>coins</i>, <i>regPrice</i> <br>
* Farm Related Information and Components: <i>fertilizer</i>, <i>seedBag</i>, <i>farmLot</i>, <i>nHarvested</i>.
* <p>
* The farmer basically enacts all funcions that a farmer does with respect to commands initiating action to the tiles.
* A farmer has a <i>seedBag</i> which contains all the seeds possible in-game.
* The farmer also has a <i>farmLot</i> which contains his array of tiles that he can interact with his seeds and tools.
* <p>
* This farmer also has a feature of registering, which allows the farmer to gain bonuses based on their current rank.
* The rank, in order, starts from Unregistered, to Registered, to Distinguished, and lastly to Honourable.
* These ranks can only be accessed at a certain level, from which the farmer has to pay a sum to rank up.
* <p>
* There is also a tally of the number of successful harvests of the Farmer.
* @author  Gabriel T. Tan and Adrian Paule D. Ty
* @version 1.0
* @since   2018-08-15
* @see         Seed
* @see         Vegetable
* @see         Flower
* @see         FruitTree
* @see         Tile
*/
public class Farmer {
	private String name;
	private int level;
	private int currentExp;
	private int maxExp;
	private int rank;
	private String rankName;
	private int nHarvested;

	private boolean canRegister;
	private double regPrice;
	private double coins;

	private int fertilizer;
	private ArrayList<Seed> seedBag;
	private ArrayList<Tile> farmLot;

	/**
	*  A constructor for objects of Farmer class
	* <p>
	* This costructor for this class intializes the starting stats of the farmer;
	* setting the starting level, the base coins, and the number of fertilizer.
	*
	* <p>
	* Additionally, this contructor instantiates the seedBag of the farm which is an <i>ArrayList</i> of <b>Seed</b>.
	* All kinds of existing seeds are also created in this constructor:
	* <i>Turnip</i> (<b>Vegetable</b> class),
	* <i>Carrot</i> (<b>Vegetable</b> class),
	* <i>Tomato</i> (<b>Vegetable</b> class),
	* <i>Potato</i> (<b>Vegetable</b> class),
	* <i>Rose</i> (<b>Flower</b> class),
	* <i>Tulip</i> (<b>Flower</b> class),
	* <i>Stargazer</i> (<b>Flower</b> class),
	* <i>Sunflower</i> (<b>Flower</b> class),
	* <i>Mango</i> (<b>FruitTree</b> class),
	* <i>Apple</i> (<b>FruitTree</b> class),
	* <i>Banana</i> (<b>FruitTree</b> class),
	* <i>Orange</i> (<b>FruitTree</b> class).
	* <p>
	* Also, farmLot of this Farmer is also instantiated. The count is set to 50 tiles.
	* A random number generator generates both the number of tiles with rocks and
	* the position of the tiles which have rocks.
	*/
	public Farmer() {
		currentExp = 0;
		maxExp = 125;
		rank = 0;
		rankName = "Unregistered Farmer";
		level = 0;
		nHarvested = 0;
		regPrice = 200.0;
		coins = 200.0;

		fertilizer = 5;

		seedBag = new ArrayList<Seed>();
		Vegetable turnip = new Vegetable("Turnip", 1, 1, 2, 0, 1, 1, 5, 6, 1, 1);
		seedBag.add(turnip);
		Vegetable carrot = new Vegetable("Carrot", 1.5, 1, 2, 0, 1, 1, 10, 9, 1, 2);
		seedBag.add(carrot);
		Vegetable tomato = new Vegetable("Tomato", 2.5, 3, 4, 1, 2, 1, 20, 15, 1, 3);
		seedBag.add(tomato);
		Vegetable potato = new Vegetable("Potato", 5, 4, 5, 2, 3, 1, 25, 13, 1, 6);
		seedBag.add(potato);
		Flower rose = new Flower("Rose", 1, 1, 2, 0, 1, 2, 5, 5);
		seedBag.add(rose);
		Flower tulip = new Flower("Tulip", 1.5, 2, 3, 0, 1, 2, 7, 7);
		seedBag.add(tulip);
		Flower stargazer = new Flower("Stargazer", 2.5, 2, 3, 0, 1, 2, 10, 9);
		seedBag.add(stargazer);
		Flower sunflower = new Flower("Sunflower", 3.5, 2, 3, 1, 2, 2, 20, 19);
		seedBag.add(sunflower);
		FruitTree mango = new FruitTree("Mango", 7, 7, 7, 4, 4, 3, 50, 4, 5, 10);
		seedBag.add(mango);
		FruitTree apple = new FruitTree("Apple", 7, 7, 7, 5, 5, 3, 55, 3.5, 7, 10);
		seedBag.add(apple);
		FruitTree banana = new FruitTree("Banana", 8, 8, 8, 5, 5, 3, 60, 3.5, 10, 15);
		seedBag.add(banana);
		FruitTree orange = new FruitTree("Orange", 8, 8, 8, 6, 6, 3, 65, 4.5, 13, 15);
		seedBag.add(orange);

		farmLot = new ArrayList<Tile>();

		Random generate = new Random();

		// Generates the random rock tiles.
		int n = generate.nextInt(4) + 4;
		int[] p = new int[n];

		for (int i = 0; i < n; i++)
			p[i] = generate.nextInt(50);

		for (int i = 0; i < 50; i++) {
			boolean found = false;
			Tile t = new Tile(i);

			for (int k = 0; k < n && !found; k++) {
				if (p[k] == i) {
					t.setRocks(true);
					t.setAvailable(false);
					found = true;
				} else {
					t.setAvailable(true);
				}
			}

			farmLot.add(t);
		}
	}

	/**
	* Automatically increments the <i>currentExp</i> of the farmer.
	* <p>
	* This private method automatically adds 5 to the farmer's experience points, the standard gain per action.
	* Other methods/actions which calls for an experience gain calls this method to do it for them.
	* <p>
	* Additionally, this also checks if the <i>currentExp</i> matches the <i>maxExp</i>,
	* which will trigger the player to level up, adding 1 to the current level.
	* <p>
	* One feature to note is that this also checks the eligibility of the farmer to register, specified by <i>canRegister</i>;
	* @see #register()
	*/
	private void addExp() {
		currentExp += 5;

		if (currentExp == maxExp) {
			currentExp = 0;
			level++;

			if (rank == 3) {
				canRegister = false;
				return;
			}

			if (rank == 0) {
				if (level >= 5)
					canRegister = true;
				else
					canRegister = false;
			} else if (rank == 1) {
				if (level >= 10)
					canRegister = true;
				else
					canRegister = false;
			} else if (rank == 2) {
				if (level >= 15)
					canRegister = true;
				else
					canRegister = false;
			}
		}
	}

	/**
	*  Sets the availability of the surrounding tiles of the given position
	* <p>
	* This method is generally used for seeds of <b>FruitTree</b> instance.
	* Whevever the seed is planted, it sets the availability of the tiles around it in the four basic directions
	* to the given boolean value.
	* <p>
	*
	*
	* @param  pos  an integer which represents the position of the tile
	* @param  bool  a boolean value to set the tiles' availability to
	*/
	private void setRoots(int pos, boolean bool) {
		// If position is in a corner
		if (pos == 0 || pos == 9 || pos == 40 || pos == 49) {
			switch (pos) {
			case 0:
				farmLot.get(pos + 1).setAvailable(bool);
				farmLot.get(pos + 10).setAvailable(bool);
				break;

			case 9:
				farmLot.get(pos - 1).setAvailable(bool);
				farmLot.get(pos + 10).setAvailable(bool);
				break;

			case 40:
				farmLot.get(pos + 1).setAvailable(bool);
				farmLot.get(pos - 10).setAvailable(bool);
				break;

			case 49:
				farmLot.get(pos - 1).setAvailable(bool);
				farmLot.get(pos - 10).setAvailable(bool);
				break;

			}
		}
		// If position is on left edge
		else if (pos % 10 == 0) {
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);

		}
		// If position is on right edge
		else if (pos % 10 == 9) {
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);

		}
		// If position is on top edge
		else if (pos < 10) {
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);

		}
		// If position is on bottom edge
		else if (pos > 39) {
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);

		}
		// If position is within borders
		else {
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);
			farmLot.get(pos - 10).setAvailable(bool);
		}
	}

	/**
	* Checks the surrounding tiles if they are available
	* <p>
	* This method is generally used for seeds of <b>FruitTree</b> instance.
	* Whevever the seed is planted, this checks the availability of the tiles around it in the four basic directions.
	* This method returns true if all tiles around it are available ( <i>isAvailable</i> == <b>true</b> ), 
	* else it returns false.
	* @param  pos  an integer which represents the position of the tile
	* @return  a boolean value which represents if the tile is available for a <b>FruitTree</b>
	* @see #setRoots()
	*/
	private boolean isAvailableForTree(int pos) {
		// If position is in a corner
		if (pos == 0 || pos == 9 || pos == 40 || pos == 49) {
			switch (pos) {
			case 0:
				if (!farmLot.get(pos + 1).getAvailable())
					return false;
				if (!farmLot.get(pos + 10).getAvailable())
					return false;
				break;

			case 9:
				if (!farmLot.get(pos - 1).getAvailable())
					return false;
				if (!farmLot.get(pos + 10).getAvailable())
					return false;
				break;

			case 40:
				if (!farmLot.get(pos + 1).getAvailable())
					return false;
				if (!farmLot.get(pos - 10).getAvailable())
					return false;
				break;

			case 49:
				if (!farmLot.get(pos - 1).getAvailable())
					return false;
				if (!farmLot.get(pos - 10).getAvailable())
					return false;
				break;

			}
		}
		// If position is on left edge
		else if (pos % 10 == 0) {
			if (!farmLot.get(pos - 10).getAvailable())
				return false;
			if (!farmLot.get(pos + 1).getAvailable())
				return false;
			if (!farmLot.get(pos + 10).getAvailable())
				return false;

		}
		// If position is on right edge
		else if (pos % 10 == 9) {
			if (!farmLot.get(pos - 10).getAvailable())
				return false;
			if (!farmLot.get(pos - 1).getAvailable())
				return false;
			if (!farmLot.get(pos + 10).getAvailable())
				return false;

		}
		// If position is on top edge
		else if (pos < 10) {
			if (!farmLot.get(pos - 1).getAvailable())
				return false;
			if (!farmLot.get(pos + 10).getAvailable())
				return false;
			if (!farmLot.get(pos + 1).getAvailable())
				return false;

		}
		// If position is on bottom edge
		else if (pos > 39) {
			if (!farmLot.get(pos - 1).getAvailable())
				return false;
			if (!farmLot.get(pos - 10).getAvailable())
				return false;
			if (!farmLot.get(pos + 1).getAvailable())
				return false;

		}
		// If position is within borders
		else {
			if (!farmLot.get(pos - 1).getAvailable())
				return false;
			if (!farmLot.get(pos + 1).getAvailable())
				return false;
			if (!farmLot.get(pos + 10).getAvailable())
				return false;
			if (!farmLot.get(pos - 10).getAvailable())
				return false;
		}

		return true;
	}

	/**
	* Returns a string of text containing the Farmer's information
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the Farmer's information
	*/
	public String displayStats() {
		String display = "";
		String canReg;

		if (canRegister)
			canReg = "\n   (ELIGBLE TO REGISTER)";
		else
			canReg = "\n   (INELIGBLE TO REGISTER YET)";

		/*
		display = display + "\n   Farmer Name: " + name + "\n";
		display = display + "   Farmer Rank : " + rankName + "\n";
		display = display + "   LEVEL " + level + ": " + currentExp + " / 75\n";
		display = display + "   Coins: " + coins + "\n";
		display = display + "   Register Price to next rank: " + regPrice + canReg + " \n";
		*/

		display = String.format(
				"\n   Farmer Name: %s \n   Farmer Rank : %s \n   LEVEL %d: %d / %d\n  Coins: %.2f coins \n   Register Price to next rank: %.2f  %s\n",
				name, rankName, level, currentExp, maxExp, coins, regPrice, canReg);

		return display;
	}

	/**
	* Returns the <i>currentExp</i> of the Farmer
	*
	* @return	integer representing the current experience points
	*/
	public int displayEXP() {
		return currentExp;
	}

	/**
	* Returns a string of text containing the Farmer's Rank information and bonuses
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the Farmer's Rank information and bonuses
	*/
	public String displayBonuses() {
		String display = "";

		if (rank == 1) {
			display = display + "\n\n   " + rankName + "\n";
			display = display + "   Buying Discount: - 2 \n";
			display = display + "   Selling Bonus: + 2 \n";
			display = display + "   Bonus Water and Fertilizer Limits: + 0\n";
			display = display + "   Harvest Time Bonus: - 5% \n";
		} else if (rank == 2) {
			display = display + "\n\n   " + rankName + "\n";
			display = display + "   Buying Discount: - 3 \n";
			display = display + "   Selling Bonus: + 3 \n";
			display = display + "   Bonus Water and Fertilizer Limits: + 1\n";
			display = display + "   Harvest Time Bonus: - 10% \n";
		} else if (rank == 3) {
			display = display + "\n\n   " + rankName + "\n";
			display = display + "   Buying Discount: - 5 \n";
			display = display + "   Selling Bonus: + 5 \n";
			display = display + "   Bonus Water and Fertilizer Limits: + 2\n";
			display = display + "   Harvest Time Bonus: - 15% \n";
		} else {
			display = display + "\n\n   " + rankName + "\n";
			display = display + "   Buying Discount: - 0 \n";
			display = display + "   Selling Bonus: + 0 \n";
			display = display + "   Bonus Water and Fertilizer Limits: + 0\n";
			display = display + "   Harvest Time Bonus: - 0% \n";
		}

		return display;
	}

	/**
	* Returns a string of text containing the information about the Pickaxe Tool
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the information about the Pickaxe Tool
	* @see #removeRock()
	*/
	public String displayPickaxeInfo() {
		return "This is a Pickaxe. This tool is used to remove rocks littered across the farm.\n\nPress 'Remove Rock' then select the tile.";
	}

	/**
	* Returns a string of text containing the information about the Watering Can Tool
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the information about the Watering Can Tool
	* @see #water()
	*/
	public String displayWaterInfo() {
		return "This is a Watering Can. This tool is used to water a tile with a growing plant on it.\n\nYou have unlimited uses for this.\n\nPress 'Water' then select the tile to water it.";
	}

	/**
	* Returns a string of text containing the information about the Fertilizer
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the information about the Fertilizer
	* @see #fertilize()
	* @see #buyFertilizer()
	*/
	public String displayFertilizerInfo() {
		return "This is Fertilizer. This tool is used to fertilize a tile with a growing plant on it. You currently have "
				+ fertilizer
				+ " units of fertilizer.\n\nPress 'Fertilize' then select the tile to fertilize it.\n\nPress 'Buy' to buy one unit for 10 Coins.";
	}

	/**
	* Returns a string of text containing the information about the Scyte Tool
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the information about the Scyte Tool
	* @see #plow()
	*/
	public String displayScyteInfo() {
		return "This is the Plow Tool. This tool is used to plow an unplowed tile or remove a withered plant for a cost.\n\nPress 'Plow' then select the tile to plow the tile or remove a withered plant for 10% of the plant's seed cost.";
	}

	/**
	* Returns a string of text containing the information about the Harvest Tool
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the information about the Harvest Tool
	* @see #harvest()
	*/
	public String displayHarvestInfo() {
		return "This is the Harvest Tool. This tool is used to harvest a grown plant.\n\nPress 'Harvest' then select the tile to harvest the tile.";
	}

	/**
	* Registers the farmer to the next <i>Rank</i>, and returns a boolean if successful
	*
	* <p>
	* This method allows the farmer to rank up, changing his <i>rank</i> and <i>rankName</i>. This method also calls the 
	* updateStats() of the <b>Seed</b> class, making changes according to the rank. If the farmer does not have enough coins,
	* or can not register yet (based on level restrictions), this method will return false, and true otherwise.
	* @return	a boolean value if the Farmer successfully registered to the next rank
	*/
	public boolean register() {
		if (canRegister && coins >= regPrice) {
			coins = coins - regPrice;
			rank++;

			for (int i = 0; i < seedBag.size(); i++)
				seedBag.get(i).updateStats(rank);

			if (rank == 1) {
				regPrice = 250;
				rankName = "Registered Farmer";
			} else if (rank == 2) {
				regPrice = 350;
				rankName = "Distinguished Farmer";
			} else if (rank == 3) {
				regPrice = 0;
				rankName = "Honorable Farmer";
				canRegister = false;
			}

			return true;
		}
		return false;
	}

	
	/**
	* Allows the farmer to the buy a quantity of a <b>Seed</b>
	*
	* <p>
	* This method allows the farmer to buy a seed from the existing seeds in his <i>seedBag</i>. 
	* This method subtracts coins to the farmer's <i>coins</i> and adds one to the <i>qty</i> variable of the <b>Seed</b>.
	* This method returns true on success, if the farmer has enough coins, and false otherwise.
	* @param seedPos the position of the seed in the <i>seedBag</i> which the farmer will buy
	* @return	a boolean value if the Farmer successfully bought a seed.
	*/
	public boolean buy(int seedPos) {
		if (coins >= seedBag.get(seedPos).getSC()) {
			coins = coins - seedBag.get(seedPos).getSC();
			seedBag.get(seedPos).addQuantity();
			return true;
		}
		return false;
	}

	/**
	* Allows the farmer to the buy a unit of fertilizer
	*
	* <p>
	* This method allows the farmer to buy more fertilizer.
	* This method subtracts coins to the farmer's <i>coins</i> and adds one to the <i>fertilizer</i>.
	* This method returns true on success, if the farmer has enough coins, and false otherwise.
	* @return	a boolean value if the Farmer successfully bought a fertilizer
	*/
	public boolean buyFertilizer() {
		if (coins >= 10) {
			coins -= 10;
			fertilizer++;
			return true;
		}
		return false;
	}

	/**
	* Allows the farmer to fertilize a tile
	*
	* <p>
	* This method allows the farmer to buy a tile before planting.
	* This method will return true if the tile to be fertilized is plowed and there is no occupant, not yet ready for harvesting,
	* not withered, if the tile if available for planting, and if the farmer has at least 1 unit of fertilizer. Otherwise, this
	* returns false. This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will fertilize
	* @return	a boolean value if the Farmer successfully fertilized a tile
	*/
	public boolean fertilize(int pos) {
		if (fertilizer > 0 && farmLot.get(pos).getReady() == false && farmLot.get(pos).getWithered() == false
				&& farmLot.get(pos).getPlowed() == true && farmLot.get(pos).getOccupant() == null
				&& farmLot.get(pos).getAvailable() == true)// NOT EMPTY, NOT READY, NOT WITHERED, WITH UNITS
		{
			farmLot.get(pos).addFertilizerCount();
			fertilizer--;
			addExp();
			return true;
		}
		return false;
	}

	/**
	* Allows the farmer to water a tile
	*
	* <p>
	* This method allows the farmer to water a tile with a growing seed on it.
	* This method will return true if the tile to be watered is plowed and has a growing plant, which are neither ready
	* nor withered. This also checks if the farmer has already watered the tile enough times as specified by the needs
	* of the seed. Otherwise, this returns false. This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will water
	* @return	a boolean value if the Farmer successfully watered a tile
	*/
	public boolean water(int pos) {
		if (farmLot.get(pos).getOccupant() != null && farmLot.get(pos).getReady() == false
				&& farmLot.get(pos).getWithered() == false && farmLot.get(pos).getOccupant().getWM() > farmLot.get(pos).getWC()) // NOT EMPTY, NOT READY, and NOT WITHERED
		{
			farmLot.get(pos).addWaterCount();
			addExp();
			return true;
		}

		return false;
	}

	/**
	* Allows the farmer to remove a rock
	*
	* <p>
	* This method allows the farmer to remove a rock from a tile.
	* This method will first check if there is a rock on the tile. If there is, this sets the
	* stats of the tile accordingly and returns true. Otherwise, this returns false. This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will remove the rock from
	* @return	a boolean value if the Farmer successfully removed a rock
	*/
	public boolean removeRock(int pos) {
		if (farmLot.get(pos).getRocks() == true) {
			farmLot.get(pos).setRocks(false);
			farmLot.get(pos).setAvailable(true);
			farmLot.get(pos).setPlow(false);
			addExp();
			return true;
		}

		return false;
	}

	/**
	* Allows the farmer to plow a tile or remove a withered plant
	*
	* <p>
	* This method allows the farmer to plow an unplowed tile or remove a withered plant.
	* This method first checks if the tile is unplowed, and is available (not occupied by a root or a rock).
	* An unplowed tile is a state of which seeds cannot be planted. At this check, this method returns true if the tile was 
	* successfully plowed.
	* <p>
	* Else, if the tile contains a witherd plant instead. This resets the tile to its original unplowed available state
	* while also debiting the farmer some coins equal to the wither cost, or the cost to remove a withered plant.
	* 
	* <p>
	* This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will plow
	* @return	a boolean value if the Farmer successfully plowed a tile, or removed a withered plant
	*/
	public boolean plow(int pos) {
		if (farmLot.get(pos).getAvailable() == false && farmLot.get(pos).getWithered() == false)
			return false;

		if (farmLot.get(pos).getPlowed() == false) {
			farmLot.get(pos).setPlow(true);
			farmLot.get(pos).setAvailable(true);
			addExp();
			return true;
		} else if (farmLot.get(pos).getWithered() == true && coins >= 2.0) {
			if (farmLot.get(pos).isTree()) {
				coins = coins - farmLot.get(pos).getOccupant().getWitherCost();
				addExp();
				farmLot.get(pos).reset();
				setRoots(pos, true);
				return true;
			} else {
				coins = coins - farmLot.get(pos).getOccupant().getWitherCost();
				addExp();
				farmLot.get(pos).reset();
				return true;
			}
		}
		return false;
	}

	/**
	* Allows the farmer plant a specific seed on the specific tile
	*
	* <p>
	* This method allows the farmer to pant a seed on the specific tile.
	* This method checks first the states of the tile specified in <i>pos</i> if it is plowed and is available.
	* After that, it also checks if the seed specified in <i>seedPos</i> has a quantity freater than 0 left.
	* If it fails this first check, the method returns false.
	* <p>
	* If it passes the first check, it will now check on the seed's instance of the <b>Seed</b> class. 
	* If it is an instance of a <b>FruitTree</b>, it will check if the tiles around it are available. If at least 1 tile
	* is unavailable, this method returns false, else it will be planted on the tile and will return true. If it is not a 
	* <b>FruitTree</b>, the seed already gets planted, and will also return true.
	* <p>
	* This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will plant on
	* @param seedPos the position of the seed in the <i>seedBag</i> which the farmer will plant
	* @return	a boolean value if the Farmer successfully planted a seed in the specified tile
	*/
	public boolean plant(int pos, int seedPos) {
		if (farmLot.get(pos).getAvailable() == true && farmLot.get(pos).getPlowed() == true
				&& seedBag.get(seedPos).ownsQuantity() == true) // Checks if tile is available and plowed
		{
			if (seedBag.get(seedPos) instanceof FruitTree) // Checks if the see is a tree
			{
				if (isAvailableForTree(pos) == true) // Checks if the surrounding tiles of the given position is available for planting
				{
					farmLot.get(pos).setOccupant(seedBag.get(seedPos));
					seedBag.get(seedPos).minusQuantity();
					setRoots(pos, false); // Sets the surroundings of the tiles unavailable when tile is available for tree.
					addExp();
					return true;
				} else {
					return false;
				}
			} else {
				farmLot.get(pos).setOccupant(seedBag.get(seedPos));
				seedBag.get(seedPos).minusQuantity();
				addExp();
				return true;
			}
		}

		return false;
	}

	/**
	* Allows the farmer to harvest a tile
	*
	* <p>
	* This method allows the farmer to harvest a tile that has successfuly grown, and will return the
	* value of a single product produced.
	* This method first checks if the tile is ready to be harvested, and returns 0 if it isn't.
	* <p>
	* Else, this method will now begin calculating for the total selling price of the <b>Seed</b> occupant of the tile.
	* During the calculation, even if the tile is available for harvesting, this will return 0 if the farmer's coins
	* are less thant the harvest cost of the seed. Otherwise, this will continue computing for the total selling price
	* and reset the tile.
	* <p>
	* This action adds experience to the farmer upon success.
	* @param pos the position of the tile in the <i>farmLot</i> which the farmer will harvest
	* @return	a double value amounting the cost of unit cost of a product produced
	*/
	public double harvest(int pos) {
		if (farmLot.get(pos).getReady() == true) {
			int wc = farmLot.get(pos).getWC();
			int fc = farmLot.get(pos).getFC();
			double total = 0;

			Seed seed = farmLot.get(pos).getOccupant();

			if (coins < seed.getHC())
				return 0;

			double bp = seed.getBP();

			if (fc > farmLot.get(pos).getOccupant().getFM())
				fc = farmLot.get(pos).getOccupant().getFM();

			total = total + (bp * 0.25 * wc) + (bp * 0.5 * fc) + bp;

			if (seed instanceof Flower)
				total = total * 1.05;

			int flb = 0;
			if (rank == 0)
				flb = 0;
			else if (rank == 1)
				flb = 2;
			else if (rank == 2)
				flb = 3;
			else
				flb = 5;

			total = total + flb;

			if (seed instanceof FruitTree)
				setRoots(pos, true);

			farmLot.get(pos).reset();
			addExp();
			nHarvested++;
			return total;
		}

		return 0;
	}

	/**
	* Automatically credits the given amount of <i>coins</i> to the farmer.
	* @param value a double value which will be credited to the Farmer's coins
	*/
	public void creditCoins(double value)
	{
		coins = coins + value;
	}
	
	/**
	* Sets the <i>name</i> variable of the Farmer to the specified <i>String</i>.
	*
	* @param s a String representing the new <i>name</i> of the Farmer
	*/
	public void setName(String s) {
		name = s;
	}

	/**
	* Returns the <i>seedBag</i> of the Farmer
	*
	* @return	<i>ArrayList</i> of <b>Seeds</b>
	*/
	public ArrayList<Seed> getSeeds() {
		return seedBag;
	}
	
	/**
	* Returns the <i>farmLot</i> of the Farmer
	*
	* @return	<i>ArrayList</i> of <b>Tiles</b>
	*/
	public ArrayList<Tile> getFarm() {
		return farmLot;
	}

	/**
	* Returns a float value calculating the score of the Farmer
	*
	* <p>
	* This method calculates the score of the farmer based on the farmer's <i>level</i>, <i>currentExp</i>, and <i>nHarvested</i>.
	* The score is calculated as follows: <br>
	* <i>  ((level * 125) + currentExp) * 5 </i> <b>+</b> <br>
	* <i>  rank * 300 </i> <b>+</b> <br>
	* <i> nHarvested*  20</i> <br>
	* <p>
	* This score is calculated for the purpose of saving their statistics when they close the game.
	* @return	a float value representing the score of the Farmer
	* @see #displayHighScore()
	*/
	public float calculateScore() {
		return (level * 125 + currentExp) * 5 + rank * 300 + nHarvested * 20;
	}

	/**
	* Returns a string of text containing the Farmer's information and score for the scoreboard
	*
	* <p>
	* The string is formatted in such a way that it makes displaying information easier in the View class.
	* Additionally, this is also the string that gets written to the leaderboard.txt textfile which stores
	* the scores of all players if they choose to save their statistics.
	* @return	a string representation of the Farmer's information and score for the scoreboard
	* @see #calculateScore()
	*/
	public String displayHighScore() {
		String display = "";

		display = display + "Username: " + name + "\n";
		display = display + "Rank: " + rankName + "\n";
		display = display + "Level: " + level + "(" + currentExp + "/ 125)\n";
		display = display + "Money: " + coins + "\n";
		display = display + "Successful Harvests: " + nHarvested + "\n";
		display = display + "Score: " + calculateScore() + "\n\n";

		return display;
	}
}
