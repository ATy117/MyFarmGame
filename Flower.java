public class Flower extends Seed
{
	
	public Flower( String n, double tn, int wn, int wm, int fn, int fm, double hc, double sc, double bp)
	{
		super(n, tn, wn, wm, fn, fm, hc, sc, bp);
	}

	/*
		This is the displayStats method.
		This returns a string containing the formatted information regarding the FruitTree for displaying purposes.
	*/

	public String displayStats()
	{
		String display = "";
		
		display = display + "Flower: " + super.getName() + "\n";
		display = display + "Growth: " + (int)(super.getTN()) + " minutes and "+ ( super.getTN() - (int)(super.getTN()) ) * 60 + " seconds \n";
		display = display + "Water Needs (min/max): " + super.getWN() + "/" + super.getWM() +  " \n";
		display = display + "Fertilizer Needs (min/max): " + super.getFN() + "/" + super.getFM()+  ")\n";
		display = display + "Seed Cost: " + super.getSC() + " \n";
		display = display + "Harvest Cost: " + super.getHC() + "\n";
		display = display + "Base Selling Price: " + super.getBP() + "\n";
		display = display + "Produce: 1 (Always) \n";
		
		return display;
		
	}
	
	
	/*
	public String displayStats1()
	{
		String display = "";
		
		display = display + "Flower: " + super.getName() + "\n";
		display = display + "Growth: " + super.getTN() + " minutes \n";
		display = display + "Water Needs (min/max): " + super.getWN() + "/" + super.getWM() +  " \n";
		display = display + "Fertilizer Needs (min/max): " + super.getFN() + "/" + super.getFM()+  ")";
		
		return display;
	}
	
	public String displayStats2()
	{
		String display = "";
		
		display = display + "Seed Cost: " + super.getSC() + " \n";
		display = display + "Harvest Cost: " + super.getHC() + "\n";
		display = display + "Base Selling Price: " + super.getBP() + "\n";
		display = display + "Produce: 1 (Always) \n";
		
		return display;
	}
	*/
	
	/*
		This is the productsProduced method.
		This method returns 1, as it is the standard number of products produced for all Flowers.
	*/
	public int productsProduced()
	{
		return 1;
	}
	
}