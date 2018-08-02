import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application
{
  @Override
  public void start (Stage primaryStage) {
    Farmer mainModel = new Farmer ();
    Controller mainController = new Controller (mainModel, primaryStage);
  }

  public static void main (String[] args)
  {
    launch(args);
  }
}
