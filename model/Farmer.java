import java.util.*;

public class Farmer
{
	private String name;
	private int level;
	private int currentExp;
	private int maxExp;
	private int rank;
	private String rankName;

	private boolean canRegister;
	private double regPrice;
	private double coins;

	private int fertilizer;
	private ArrayList<Seed> seedBag;
	private ArrayList<Tile> farmLot;

	public Farmer(String s)
	{
		name = s;
		currentExp = 0;
		maxExp = 50;
		rank = 0;
		rankName = "Unregisetered Farmer";
		level = 1;

		regPrice = 200.0;
		coins = 100.0;

		fertilizer = 5;

		seedBag = new ArrayList<Seed>();
		farmLot = new ArrayList<Tile>();

		Random generate = new Random();

		// Generates the random rock tiles.
		int n = generate.nextInt(4) + 4;
		int[] p = new int[n];

		for (int i = 0; i < n; i++)
			p[i] = generate.nextInt(50);


		for (int i = 0; i < 50; i++)
		{
			boolean found = false;
			Tile t = new Tile(i);

			for (int k = 0; k < n && !found; k++)
			{
				if (p[k] == i)
				{
					t.setRocks(true);
					t.setAvailable(false);
					found = true;
				}
			}

			farmLot.add(t);
		}
	}

	// Methods

	// Private Methods, only to be called within this class.

	/*
		This is the addExp method.
		+ This method interacts specifically with methods that calls for increasing the experience of the farmer.
		+ This method also makes the user level up and reset its currentExp back to zero when the currentExp becomes equal to the maxExp after adding experience.
		+ This method also determines whether the farmer can register or not, given the level requirements of registering.
	*/
	private void addExp()
	{
		currentExp++;

		if (currentExp == maxExp)
		{
			currentExp = 0;
			level++;

			if (rank == 0)
			{
				if (level >= 5)
					canRegister = true;
				else
					canRegister = false;
			}
			else if (rank == 1)
			{
				if (level >= 10)
					canRegister = true;
				else
					canRegister = false;
			}
			else if (rank == 2)
			{
				if (level >= 15)
					canRegister = true;
				else
					canRegister = false;
			}
			else
			{
				canRegister = false;
			}


		}
	}

	/*
		This is the setRoots method.
		+ This method sets the surrounding tiles of a given tile in index -pos unavailable for planting.
	*/
	private void setRoots(int pos, boolean bool)
	{
		// If position is in a corner
		if ( pos == 0 || pos == 9 || pos == 40 || pos == 49)
		{
			switch (pos)
			{
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
		else if ( pos%10 == 0 )
		{
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);

		}
		// If position is on right edge
		else if ( pos%10 == 9 )
		{
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);

		}
		// If position is on top edge
		else if ( pos < 10 )
		{
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);

		}
		// If position is on bottom edge
		else if ( pos > 39 )
		{
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos - 10).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);

		}
		// If position is within borders
		else
		{
			farmLot.get(pos - 1).setAvailable(bool);
			farmLot.get(pos + 1).setAvailable(bool);
			farmLot.get(pos + 10).setAvailable(bool);
			farmLot.get(pos - 10).setAvailable(bool);
		}
	}

	/*
		This is the isAvailableForTree method.
		+ This method checks the surround tiles of a given tile in index -pos if they are all available for a tree to be planted.
		+ This method returns true if no unavailable tile is encountered, and false otherwise.
	*/
	private boolean isAvailableForTree(int pos)
	{
		// If position is in a corner
		if ( pos == 0 || pos == 9 || pos == 40 || pos == 49)
		{
			switch (pos)
			{
				case 0:
					if (!farmLot.get(pos + 1).getAvailable()) return false;
					if (!farmLot.get(pos + 10).getAvailable()) return false;
					break;

				case 9:
					if (!farmLot.get(pos - 1).getAvailable()) return false;
					if (!farmLot.get(pos + 10).getAvailable()) return false;
					break;

				case 40:
					if (!farmLot.get(pos + 1).getAvailable()) return false;
					if (!farmLot.get(pos - 10).getAvailable()) return false;
					break;

				case 49:
					if (!farmLot.get(pos - 1).getAvailable()) return false;
					if (!farmLot.get(pos - 10).getAvailable()) return false;
					break;

			}
		}
		// If position is on left edge
		else if ( pos%10 == 0 )
		{
			if (!farmLot.get(pos - 10).getAvailable()) return false;
			if (!farmLot.get(pos + 1).getAvailable()) return false;
			if (!farmLot.get(pos + 10).getAvailable()) return false;

		}
		// If position is on right edge
		else if ( pos%10 == 9 )
		{
			if (!farmLot.get(pos - 10).getAvailable()) return false;
			if (!farmLot.get(pos - 1).getAvailable()) return false;
			if (!farmLot.get(pos + 10).getAvailable()) return false;

		}
		// If position is on top edge
		else if ( pos < 10 )
		{
			if (!farmLot.get(pos - 1).getAvailable()) return false;
			if (!farmLot.get(pos + 10).getAvailable()) return false;
			if (!farmLot.get(pos + 1).getAvailable()) return false;

		}
		// If position is on bottom edge
		else if ( pos > 39 )
		{
			if (!farmLot.get(pos - 1).getAvailable()) return false;
			if (!farmLot.get(pos - 10).getAvailable()) return false;
			if (!farmLot.get(pos + 1).getAvailable()) return false;

		}
		// If position is within borders
		else
		{
			if(!farmLot.get(pos - 1).getAvailable()) return false;
			if(!farmLot.get(pos + 1).getAvailable()) return false;
			if(!farmLot.get(pos + 10).getAvailable()) return false;
			if(!farmLot.get(pos - 10).getAvailable()) return false;
		}

		return true;
	}


	// Public Methods, can be called outside this class.

	/*
		This is the displayStats method.
		+ This method returns a string containing a series of text referring to the farmer's stats;
	*/

	public String displayStats()
	{
		String display = "";
		String canReg;

		if (canRegister)
			canReg = "ELIGBLE TO REGISTER";
		else
			canReg = "INELIGBLE TO REGISTER YET";

		display  = display + "Farmer Name: " + name + "\n";
		display  = display + "Farmer Rank : " + rankName + "\n";
		display  = display + "LEVEL " + level + ": " + currentExp + " / 50\n";
		display  = display + "Coins: " + coins + "\n";
		display  = display + "Register Price to next rank: " + coins + " (" + canReg +  ") \n";

		return display;
	}

	/*
		This is the displayBonuses method.
		+ This method returns a string containing a series of text referring to the farmers bonuses based on rank;
	*/

	public String displayBonuses()
	{
		String display = "";

		if (rank == 1)
		{
			display  = display + rankName + " Bonuses: \n";
			display  = display + "Buying Discount: - 2 \n";
			display  = display + "Selling Bonus: + 2 \n";
			display  = display + "Bonus Water and Fertilizer Limits: + 0\n";
			display  = display + "Harvest Time Bonus: - 5% \n";
		}
		else if (rank == 2)
		{
			display  = display + rankName + " Bonuses: \n";
			display  = display + "Buying Discount: - 3 \n";
			display  = display + "Selling Bonus: + 3 \n";
			display  = display + "Bonus Water and Fertilizer Limits: + 1\n";
			display  = display + "Harvest Time Bonus: - 10% \n";
		}
		else if (rank == 3)
		{
			display  = display + rankName + " Bonuses: \n";
			display  = display + "Buying Discount: - 5 \n";
			display  = display + "Selling Bonus: + 5 \n";
			display  = display + "Bonus Water and Fertilizer Limits: + 2\n";
			display  = display + "Harvest Time Bonus: - 15% \n";
		}
		else
		{
			display  = display + rankName + " Bonuses: \n";
			display  = display + "Buying Discount: - 0 \n";
			display  = display + "Selling Bonus: + 0 \n";
			display  = display + "Bonus Water and Fertilizer Limits: + 0\n";
			display  = display + "Harvest Time Bonus: - 0% \n";
		}

		return display;
	}

	/*
		This is the displayPickaxeInfo.
		+ This method returns a string describing what the Pickaxe tool can do.
	*/
	public String displayPickaxeInfo()
	{
		return "This is a Pickaxe. This tool is used to remove rocks littered across the farm.";
	}

	/*
		This is the displayWaterInfo.
		+ This method returns a string describing what the Watering Can tool can do.
	*/
	public String displayWaterInfo()
	{
		return "This is a Watering Can. This tool is used to water a tile with a growing plant on it. \nYou have unlimited uses for this.";
	}

	/*
		This is the displayFertilizerInfo.
		+ This method returns a string describing what the Fertilizer tool can do.
	*/
	public String displayFertilizerInfo()
	{
		return "This is Fertilizer. This tool is used to fertilize a tile with a growing plant on it. \nYou currently have " + fertilizer + " units of fertilizer.";
	}

	/*
		This is the displayScyteInfo.
		+ This method returns a string describing what the Scyte tool can do.
	*/
	public String displayScyteInfo()
	{
		return "This is a Scyte. This tool is used to harvest either a fully grown plant or a withered one for a cost.";
	}

	/*
		This is the register method.
		+ This method allows the register if the farmer is eligible to do so, through the canRegister variable, and if he has enough coins to do so.
		+ This method also sets the register price for the next rank, if there is more to gain, and the rank name.
		+ This method returns true upon successful registration, and returns false otherwise.
	*/
	public boolean register()
	{
		if (canRegister && coins>= regPrice)
		{
			coins = coins - regPrice;
			rank++;

			for (int i = 0; i < seedBag.size(); i++)
				seedBag.get(i).updateStats(rank);

			for (int i = 0; i < farmLot.size(); i++)
				farmLot.get(i).updateOccupant(rank);

			if (rank == 1)
			{
				regPrice = 250;
				rankName = "Registered Farmer";
			}
			else if (rank == 2)
			{
				regPrice = 350;
				rankName = "Distinguished Farmer";
			}
			else if (rank == 3)
			{
				regPrice = 0;
				rankName = "Honorable Farmer";
			}

			return true;
		}
		return false;
	}

	/*
		This is the buy method.
		+ This method allows to buy a seed, the seed being based on the position in the seedBag due to the seedBag's of already containing all seeds upon construction of this object.
		+ This method subtracts the seed cost and adds 1 to the quantity variable of the seed.
		+ This method returns true upon successful purchase, and returns false otherwise.
	*/

	public boolean buy(int seedPos)
	{
		if (coins >= seedBag.get(seedPos).getSC())
		{
			coins = coins - seedBag.get(seedPos).getSC();
			seedBag.get(seedPos).addQuantity();
			return true;
		}
		return false;
	}

	/*
		This is the buyFertilizer method.
		+ This method allows to buy fertilizer.
		+ This method returns true upon successful purchase, and returns false otherwise.
	*/

	public boolean buyFertilizer()
	{
		if (coins >= 10)
		{
			coins -= 10;
			fertilizer++;
			return true;
		}
		return false;
	}

	/*
		This is the fertilize method.
		+ This method fertilizes the tile based on the index -pos.
		+ This method subtracts 1 unit of fertilizer and adds 1 to the fertilizer count of the tile.
		+ This method fails if the user does not have enough fertilizer or there is nothing planted on the tile or the plant is already grown
		+ This method returns true upon success, and returns false otherwise.
	*/

	public boolean fertilize(int pos)
	{
		if (farmLot.get(pos).getOccupant()!= null && fertilizer > 0 && farmLot.get(pos).getReady() == false && farmLot.get(pos).getWithered() == false) // NOT EMPTY, NOT READY, NOT WITHERED, WITH UNITS
		{
			farmLot.get(pos).addFertilizerCount();
			fertilizer--;
			addExp();
			return true;
		}
		return false;
	}

	/*
		This is the water method.
		+ This method waters the tile based on the index -pos.
		+ This method has unlimited usage.
		+ This method only fails if there is nothing planted on the tile or the plant is already grown.
		+ This method returns true upon success, and returns false otherwise.
	*/

	public boolean water(int pos)
	{
		if (farmLot.get(pos).getOccupant()!= null && farmLot.get(pos).getReady() == false && farmLot.get(pos).getWithered() == false) // NOT EMPTY, NOT READY, and NOT WITHERED
		{
			farmLot.get(pos).addWaterCount();
			addExp();
			return true;
		}

		return false;
	}

	/*
		This is the removeRock method.
		+ This method removes the rock inhabiting the tile based on the index -pos.
		+ This method fails if there is no rock on the tile in the first place.
		+ This method returns true upon success, and returns false otherwise.
	*/

	public boolean removeRock(int pos)
	{
		if (farmLot.get(pos).getRocks() == true)
		{
			farmLot.get(pos).setRocks(false);
			farmLot.get(pos).setAvailable(true);
			farmLot.get(pos).setPlow(false);
			addExp();
			return true;
		}

		return false;
	}

	/*
		This is plow method.
		+ This method plows a tile based on the index -pos.
		+ This method turns a tile available for planting if it was empty and unplowed, or if it was previously inhabited by a withered plant.
		+ This method fails if the tile is unavailable.
		+ This method returns true upon success, and returns false otherwise.
	*/

	public boolean plow (int pos)
	{
		if (farmLot.get(pos).getAvailable() == false && farmLot.get(pos).getWithered() == false)
			return false;

		if (farmLot.get(pos).getPlowed() == false)
		{
			farmLot.get(pos).setPlow(true);
			farmLot.get(pos).setAvailable(true);
			addExp();
			return true;
		}
		else if (farmLot.get(pos).getWithered() == true)
		{
			if (farmLot.get(pos).isTree())
			{
				coins = coins - farmLot.get(pos).getOccupant().getWitherCost();
				addExp();
				farmLot.get(pos).reset();
				setRoots(pos, true);
				return true;
			}
			else
			{
				coins = coins - farmLot.get(pos).getOccupant().getWitherCost();
				addExp();
				farmLot.get(pos).reset();
				return true;
			}
		}
		return false;
	}

	/*
		This is the plant method.
		+This method puts the seed as the occupant of the designated tile position, if it passes all availability checks.
		+This method returns true if the occupant of the tile was successfuly set, and false otherwise.
	*/
	public boolean plant(int pos, int seedPos)
	{
		if (farmLot.get(pos).getAvailable() == true && farmLot.get(pos).getPlowed() == true && seedBag.get(seedPos).ownsQuantity() == true ) // Checks if tile is available and plowed
		{
			if (seedBag.get(seedPos) instanceof FruitTree) // Checks if the see is a tree
			{
				if (isAvailableForTree(pos) == true)      // Checks if the surrounding tiles of the given position is available for planting
				{
					farmLot.get(pos).setOccupant(seedBag.get(seedPos));
					seedBag.get(seedPos).minusQuantity();
					setRoots(pos, false);				// Sets the surroundings of the tiles unavailable when tile is available for tree.
					addExp();
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				farmLot.get(pos).setOccupant(seedBag.get(seedPos));
				seedBag.get(seedPos).minusQuantity();
				addExp();
				return true;
			}
		}

		return false;
	}

	/*
		This is the harvest method.
		+ This method harvest the plant at the tile based on the index -pos.
		+ This method automatically computes for the total amount gained from the harvest and automatically adds it to the coins.
		+ This method fails if the plant is not ready or the farmer cannot afford the harvest cost.
		+ This method returns true upon success, and returns false otherwise.
	*/

	public boolean harvest(int pos)
	{
		if (farmLot.get(pos).getReady() == true)
		{
			int wc = farmLot.get(pos).getWC();
			int fc = farmLot.get(pos).getFC();
			double total = 0;

			Seed seed = farmLot.get(pos).getOccupant();

			if (coins < seed.getHC())
				return false;

			double bp = seed.getBP();

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

			total = total * seed.productsProduced();

			coins = coins - seed.getHC() + total;

			farmLot.get(pos).reset();
			addExp();
			return true;
		}

		return false;
	}




	// Getters

	public ArrayList<Seed> getSeeds()
	{
		return seedBag;
	}

	public ArrayList<Tile> getFarm()
	{
		return farmLot;
	}

}
