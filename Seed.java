public abstract class Seed
{
	private String name;
	private double timeNeed;
	private int waterNeed;
	private int waterMax;
	private int fertilizerNeed;
	private int fertilizerMax;
	private double harvestCost;
	private double seedCost;
	private double baseSelling;
	private double witheredCost;
	private int qty;

	public Seed (String n, double tn, int wn, int wm, int fn, int fm, double hc, double sc, double bp){
		name = n;
		timeNeed = tn;
		waterNeed = wn;
		waterMax = wm;
		fertilizerNeed = fn;
		fertilizerMax = fm;
		harvestCost = hc;
		seedCost = sc;
		baseSelling = bp;

		witheredCost = sc * 0.10;

		qty = 0;

	}

	// public abstract String displayStats1();
	// public abstract String displayStats2();

	public abstract String displayStats();
	public abstract int productsProduced();

	/*
		This is the updateStats method.
		This updates the seed variables, applying bonuses according to the rank specified in -rank. This method is mainly called from the register method in the Farmer class.
	*/

	public void updateStats(int rank){

		if(rank == 1){
			timeNeed = timeNeed * 0.95;
			seedCost = seedCost - 2;
			baseSelling = baseSelling + 2;
		}

		if (rank == 2) {
			timeNeed = (timeNeed / 0.95) * 0.90;
			seedCost = seedCost - 1;
			baseSelling = baseSelling + 1;
			waterMax = waterMax + 1;
			fertilizerMax = fertilizerMax + 1;
		}

		if (rank == 3) {
			timeNeed = (timeNeed / 0.90) * 0.85;
			seedCost = seedCost - 2;
			baseSelling = baseSelling + 2;
			waterMax = waterMax + 1;
			fertilizerMax = fertilizerMax + 1;
		}

	}


	/*
		This is the ownsQuantity method.
		This method returns true if there is at least one quantity of the seed remaining when being planted from the Farmer class.
	*/

	public boolean ownsQuantity()
	{
		if (qty == 0)
			return false;

		return true;
	}

	/*
		This is the addQuantity method.
		This method adds 1 to the quantity count of the seed when being bought from the Farmer class.
	*/
	public void addQuantity()
	{
		qty++;
	}

	/*
		This is the minusQuantity method.
		This method subtracts 1 from the quantity count of the seed when being planted from the Farmer class.
	*/

	public void minusQuantity()
	{
		if (qty > 0)
			qty--;
	}


	// Getters
	public double getWitherCost()
	{
		return seedCost * 0.10;
	}

	public String getName(){
		return name;
	}

	public double getTN(){
		return timeNeed;
	}

	public int getWN(){
		return waterNeed;
	}

	public int getWM(){
		return waterMax;
	}

	public int getFN(){
		return fertilizerNeed;
	}

	public int getFM(){
		return fertilizerMax;
	}

	public double getHC(){
		return harvestCost;
	}

	public double getSC(){
		return seedCost;
	}

	public double getBP(){
		return baseSelling;
	}

	public double getWC(){
		return witheredCost;
	}

	public int getQuantity()
	{
		return qty;
	}


}
