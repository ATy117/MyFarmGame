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

  public void plowTile(int seedPos) {
    if (model.plow(seedPos))
      view.setImagePlowedTile(seedPos);
  }

  public void buyFertilizer() {
    model.buyFertilizer();
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
