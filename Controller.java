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
      view.setImageUnplowedTile(pos);
  }

  public String getPickaxeInfo()
  {
    return model.displayPickaxeInfo();
  }

}
