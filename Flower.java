/**
* public class <b>Flower</b>
* implements <b>Seed</b>
*
* The class Flower as inherited from the Seed class
*
* <p>
* This class is used to specifically differentiate a specific type of seed, a Flower in this case
*
* @author  Gabriel T. Tan & Adrian Paule D. Ty
* @version 1.0
* @since   2018-08-15 
* @see         Seed
* @see         Vegetable
* @see         FruitTree
*/
public class Flower extends Seed
{
	/**
 	*  A constructor for objects of Flower class; calls the Constructor of the the Seed class
	*
 	* @param  n  a String referring to the name of the seed
 	* @param  tn a double value referring to the time needed of the seed to grow, in mintues
	* @param  wn  an integer value referring to the amount of water needed for a plant to grow
 	* @param  wm an integer value referring to the maximum amount of water a plant can receive for bonus computation
	* @param  fn  an integer value referring to the amount of fertilzier needed for a plant to grow
 	* @param  fm an integer value referring to the maximum amount of fertilizer a plant can receive for bonus computation
	* @param  hc  a double value referring to the harvest cost of the seed
 	* @param  sc a double value referring to the cost of buying a seed
	* @param  bp  a double value referring to the base selling price of a 
	* @see         Seed
 	* @see         Vegetable
	* @see         FruitTree
 	*/
	public Flower( String n, double tn, int wn, int wm, int fn, int fm, double hc, double sc, double bp)
	{
		super(n, tn, wn, wm, fn, fm, hc, sc, bp);
	}

	/**
	* Returns a string of text containing the Flower's information
	*
	* <p>
	* This method calls several getter methods from the Seed class. 
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the flower's information
	*/
	public String displayStats()
	{
		String display = "";

		display = display + " Flower: " + super.getName() + "   Owned: " + getQuantity() + "\n";
		display = display + " Growth: " + (int)(super.getTN()) + " minutes and "+ ( super.getTN() - (int)(super.getTN()) ) * 60 + " seconds \n";
		display = display + " Water Needs (min/max): " + super.getWN() + "/" + super.getWM() +  " \n";
		display = display + " Fertilizer Needs (min/max): " + super.getFN() + "/" + super.getFM()+  ")\n";
		display = display + " Seed Cost: " + super.getSC() + " \n";
		display = display + " Harvest Cost: " + super.getHC() + "\n";
		display = display + " Base Selling Price: " + super.getBP() + "\n";
		display = display + " Produce: 1 (Always)";

		return display;

	}

	/**
 	* A method inherited from the Seed class
	* <p>
	* Unlike other subclasses from the Seed class, this Subclass automatically returns 1, as it is the
	* standard amount of products produced from this type of seed.
	* @return	an integer value equal to 1
 	*/
	public int productsProduced()
	{
		return 1;
	}

}
