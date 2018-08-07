import javafx.stage.Stage;

public class Controller {
  Farmer model;
  View view;

  public Controller(Farmer f, Stage primaryStage) {
    model = f;
    view = new View(this, primaryStage);
    setRocks();
  }

  public void setRocks() {
    for (int i = 0; i < 50; i++) {
      if (model.getFarm().get(i).getRocks()) {
        view.setImageRock(i);
      }
    }
  }

  public void pickRock(int pos) {
    if (model.getFarm().get(pos).getRocks()) {
      view.setImageUnplowedTile(pos);
      model.removeRock(pos);
    }
  }

  public void setFarmerName(String s) {
    model.setName(s);
  }

  public void buySeed(int seedPos) {
    model.buy(seedPos);
  }

  public void plowTile(int tilePos) {

    if (model.getFarm().get(tilePos).getPlowed() == false){
      if (model.plow(tilePos))
        view.setImagePlowedTile(tilePos);
    } else if (model.getFarm().get(tilePos).getWithered() == true){
      if (model.plow(tilePos))
        view.setImageUnplowedTile(tilePos);
    }
  }


  public void buyFertilizer() {
    model.buyFertilizer();
  }

    public void plant(int tilePos, int seedPos){
    if (model.plant(tilePos, seedPos)){
      view.setImageToGrowing(seedPos, tilePos);
      Thread t = new Thread(){
          public void run(){
            double grow = model.getFarm().get(tilePos).getTime() * 60 * 1000;
            double wither = model.getFarm().get(tilePos).getTime() * 60 * 2;
            double minute = 60;

            try {
              Thread.sleep((long)(grow));
            } catch ( InterruptedException e) {}

            if (model.getFarm().get(tilePos).grownProperly() == true)
            {
              view.setImageToGrown(seedPos, tilePos);
			  model.getFarm().get(tilePos).setReady(true);

              while (minute != 0){
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e){}

                if (model.getFarm().get(tilePos).getReady() == false){
                  view.setImageUnplowedTile(tilePos);
				  model.getFarm().get(tilePos).reset();
                  return;
                }
                minute--;
              }

              view.setImageToWithered(seedPos, tilePos);
				model.getFarm().get(tilePos).setReady(false);
				model.getFarm().get(tilePos).setWither(true);
              while (wither > 0){
                  try{
                    Thread.sleep(1000);
                  } catch (InterruptedException e){}

                  if (model.getFarm().get(tilePos).getWithered() == false)
                  {
                    view.setImageUnplowedTile(tilePos);
					model.getFarm().get(tilePos).reset();
                    return;
                  }
                  wither--;
              }

              view.setImageUnplowedTile(tilePos);
			  model.getFarm().get(tilePos).reset();
            } else {

              view.setImageToWithered(seedPos, tilePos);
			  model.getFarm().get(tilePos).setReady(false);
			  model.getFarm().get(tilePos).setWither(true);
              while (wither > 0){
                  try{
                    Thread.sleep(1000);
                  } catch (InterruptedException e){}

                  if (model.getFarm().get(tilePos).getWithered() == false)
                  {
                    view.setImageUnplowedTile(tilePos);
					model.getFarm().get(tilePos).reset();
                    return;
                  }
                  wither--;
              }

              view.setImageUnplowedTile(tilePos);
			  model.getFarm().get(tilePos).reset();

            }

          }
      };
      t.start();
    }

  }

  public void harvest(int tilePos){
    if (model.harvest(tilePos))
      view.setImageUnplowedTile(tilePos);

  }

  public void fertilize (int tilePos){
    model.fertilize(tilePos);
  }

  public void water (int tilePos){
    model.water(tilePos);
  }


  public String getPickaxeInfo() {
    String s = model.displayPickaxeInfo();
    return s;
  }

  public String getWaterInfo() {
    String s = model.displayWaterInfo();
    return s;
  }

  public String getFertilizerInfo() {
    String s = model.displayFertilizerInfo();
    return s;
  }

  public String getScyteInfo() {
    String s = model.displayScyteInfo();
    return s;
  }

  public String getHarvestInfo() {
    String s = model.displayHarvestInfo();
    return s;
  }

  public String getTileInfo(int pos) {
    String s = model.getFarm().get(pos).displayStats();
    return s;
  }

  public String getSeedInfo(int pos) {
    String s = model.getSeeds().get(pos).displayStats();
    return s;
  }

  public String getFarmerBonuses() {
    String s = model.displayBonuses();
    return s;
  }

  public int getFarmerEXP() {
    return model.displayEXP();
  }

  public String getFarmerStats() {
    String s = model.displayStats();
    return s;
  }

  public void register() {
    if (model.register() == true) {
      view.updateFarmerStats();
      view.updateFarmerBonuses();
    } else
      view.updateFarmerStats();
  }
}
