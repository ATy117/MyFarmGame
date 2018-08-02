import javafx.stage.Stage;


public class Controller
{
  Farmer model;
  View view;

  public Controller (Farmer f, Stage primaryStage)
  {
    model=f;
    view = new View (this, primaryStage);
    setRocks();
  }

  public void setRocks()
  {
    for (int i=0; i<50; i++){
      if (model.getFarm().get(i).getRocks()) {
        view.setImageRock(i);
      }
    }
  }

  public void pickRock(int pos)
  {
    if (model.getFarm().get(pos).getRocks())
    {
      view.setImageUnplowedTile(pos);
      model.removeRock(pos);
    }
  }

  public String getPickaxeInfo()
  {
    String s = model.displayPickaxeInfo();
    return s;
  }

  public String getWaterInfo()
  {
    String s = model.displayWaterInfo();
    return s;
  }

  public String getFertilizerInfo()
  {
    String s = model.displayFertilizerInfo();
    return s;
  }

  public String getScyteInfo()
  {
    String s = model.displayScyteInfo();
    return s;
  }

  public String getHarvestInfo()
  {
    String s = model.displayHarvestInfo();
    return s;
  }

  public String getTileInfo(int pos)
  {
    String s = model.getFarm().get(pos).displayStats();
    return s;
  }

}
