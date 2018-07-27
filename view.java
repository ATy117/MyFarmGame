import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.beans.property.StringProperty;


public class view extends Application
{

  Stage window;
  Scene menu, ingame;
  StringProperty var;

  //image is main menu, image2 is ingame
  Image image = new Image ("images/background.png", 800, 860, false, false);
  Image image2 = new Image ("images/background.png", 1000, 800, false, false);
  Image logo = new Image("images/logo.jpg");
  Image inventory = new Image ("images/inventory.jpg");
  Image turnipimg = new Image("images/turnip.png");
  Image carrotimg = new Image("images/carrot.png");
  Image tomatoimg = new Image("images/tomato.png");
  Image potatoimg = new Image("images/potato.png");
  Image tulipimg = new Image("images/tulip.png");
  Image stargazerimg = new Image("images/stargazer.png");
  Image sunflowerimg = new Image("images/sunflower.png");
  Image roseimg = new Image("images/rose.png");
  Image mangoimg = new Image("images/mango.png");
  Image appleimg = new Image("images/apple.png");
  Image bananaimg = new Image("images/banana.png");
  Image orangeimg = new Image("images/orange.png");
  Image fertilizerimg = new Image("images/fertilizer.png");
  Image tool = new Image ("images/tools.jpg");
  Image wateringcanimg = new Image("images/wateringcan.png");
  Image plowtoolimg = new Image("images/plowtool.png");
  Image pickaxeimg = new Image("images/pickaxe.png");
  Image fertilizerbagimg = new Image("images/fertilizerbag.png");
  Image infobox = new Image ("images/infobox.png");
  Image unplowedtile = new Image ("images/unplowedtile.png");
  Image level0 = new Image ("images/level0.png");
  Image background = new Image ("images/greenbackground.png");
  Image dancing = new Image ("images/dancing.gif");

  //TEMPORARY
  Image stitch = new Image("images/stitch.gif");
  Image jake = new Image("images/jake.gif");
  Image spongebob = new Image("images/spongebob.gif");



  public static void main (String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    //Window
    window = primaryStage;
    window.setTitle("MyFarm by Adrian Ty and Gabriel Tan");
    StackPane grid = new StackPane();

    // Background Image(which is white)
    ImageView mv = new ImageView(image);
    grid.getChildren().add(mv);

    //Logo
    ImageView logodisplay = new ImageView(logo);
    logodisplay.setFitHeight(526);
    logodisplay.setFitWidth(739);
    logodisplay.setPreserveRatio(true);
    logodisplay.setSmooth(true);
    grid.getChildren().add(logodisplay);
    StackPane.setMargin(logodisplay, new Insets (0, 0, 230, 0));

    // Random Gifs
    ImageView stitchiv = new ImageView(stitch);
    ImageView jakeiv = new ImageView (jake);
    ImageView spongebobiv = new ImageView (spongebob);

    jakeiv.setFitWidth(400);
    jakeiv.setFitHeight(300);
    grid.getChildren().add(jakeiv);
    StackPane.setMargin(jakeiv, new Insets(350, 500, 0, 0));

    spongebobiv.setFitWidth(400);
    spongebobiv.setFitHeight(236);
    grid.getChildren().add(spongebobiv);
    StackPane.setMargin(spongebobiv, new Insets(350, 0, 0, 450));

    stitchiv.setFitWidth(200);
    stitchiv.setFitHeight(200);
    grid.getChildren().add(stitchiv);
    StackPane.setMargin(stitchiv, new Insets(410, 0, 0, 0));


    //Name input
    TextField name = new TextField();
    name.setPromptText("Enter Farmer Name");
    name.setMaxWidth(200);
    grid.getChildren().add(name);
    StackPane.setMargin(name, new Insets (100, 0, 0, 0));

    //Generate Button
    Button generate = new Button("GENERATE FARM");
    generate.setOnAction(e -> {
      window.setScene(ingame);
      String farmername = name.getText();
      System.out.println(farmername);
    });
    grid.getChildren().add(generate);
    StackPane.setMargin(generate, new Insets (200, 0, 0, 0));


    menu = new Scene(grid, 800, 600);

    /////////////////////////////////////////////////////////////////

    StackPane overlap = new StackPane();
    BorderPane maingame = new BorderPane(); //MAIN LAYOUT
    ImageView backgroundiv = new ImageView (background);
    overlap.getChildren().add(backgroundiv);
    overlap.getChildren().add(maingame);


    ///////////// BOTTOM PART LAYOUT (INVENTORY, TOOLS, INFOBOX)//////////////
    HBox infoui = new HBox(); // BOTTOM  LAYOUT
    infoui.setPadding(new Insets(15, 0, 15, 0));
    infoui.setSpacing(10);
    maingame.setBottom(infoui);


    //Inventory
    GridPane invlayout = new GridPane();
    invlayout.setHgap(15);
    invlayout.setVgap(15);
    invlayout.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    ///Buttons with pictures
    Button turnip = new Button ();
    turnip.setGraphic(new ImageView(turnipimg));
    invlayout.add(turnip, 0, 0);

    Button rose = new Button ();
    rose.setGraphic(new ImageView(roseimg));
    invlayout.add(rose, 0, 1);

    Button mango = new Button ();
    mango.setGraphic(new ImageView(mangoimg));
    invlayout.add(mango, 0, 2);

    Button carrot = new Button ();
    carrot.setGraphic(new ImageView(carrotimg));
    invlayout.add(carrot, 1, 0);

    Button tulip = new Button ();
    tulip.setGraphic(new ImageView(tulipimg));
    invlayout.add(tulip, 1, 1);

    Button apple = new Button ();
    apple.setGraphic(new ImageView(appleimg));
    invlayout.add(apple, 1, 2);

    Button tomato = new Button ();
    tomato.setGraphic(new ImageView(tomatoimg));
    invlayout.add(tomato, 2, 0);

    Button stargazer = new Button ();
    stargazer.setGraphic(new ImageView(stargazerimg));
    invlayout.add(stargazer, 2, 1);

    Button banana = new Button ();
    banana.setGraphic(new ImageView(bananaimg));
    invlayout.add(banana, 2, 2);

    Button potato = new Button ();
    potato.setGraphic(new ImageView(potatoimg));
    invlayout.add(potato, 3, 0);

    Button sunflower = new Button ();
    sunflower.setGraphic(new ImageView(sunflowerimg));
    invlayout.add(sunflower, 3, 1);

    Button orange = new Button ();
    orange.setGraphic(new ImageView(orangeimg));
    invlayout.add(orange, 3, 2);

    Button fertilizer = new Button ();
    fertilizer.setGraphic(new ImageView(fertilizerimg));
    invlayout.add(fertilizer, 4, 0);

    infoui.getChildren().add(invlayout);


    //Tools
    GridPane toollayout = new GridPane();
    toollayout.setHgap(15);
    toollayout.setVgap(15);
    toollayout.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    Button wateringcan = new Button ();
    wateringcan.setGraphic(new ImageView(wateringcanimg));
    toollayout.add(wateringcan, 0, 0);

    Button plowtool = new Button ();
    plowtool.setGraphic(new ImageView(plowtoolimg));
    toollayout.add(plowtool, 0, 1);

    Button pickaxe = new Button ();
    pickaxe.setGraphic(new ImageView(pickaxeimg));
    toollayout.add(pickaxe, 0, 2);

    Button fertilizerbag = new Button ();
    fertilizerbag.setGraphic(new ImageView(fertilizerbagimg));
    toollayout.add(fertilizerbag, 1, 0);

    infoui.getChildren().add(toollayout);


    // Seed Info Box

    TextFlow seedinfo = new TextFlow();
    seedinfo.setPrefWidth(470);
    seedinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    // Stats / Information

    Text sn = new Text("Seed InfojawdkajwdkawjdkawdjaiwdjaiwdjkawdjawdoAJDIOAJWODIAWJDOWJDAOIWDJOAWIDJAOWIDJAOWD");
    seedinfo.getChildren().add(sn);


    infoui.getChildren().add(seedinfo);




    /////////////////  MIDDLE LAYOUT (FARMLAND) ////////////////////

    // LAYOUT
    TilePane farmlayout = new TilePane();
    farmlayout.setPrefColumns(5);
    farmlayout.setPadding(new Insets(0, 0, 0 ,5));
    maingame.setCenter(farmlayout);
    farmlayout.setHgap(-10);
    farmlayout.setVgap(-10);

    ImageView[] tile = new ImageView[50];
    for (int i=0; i<50; i++) {
      tile[i]= new ImageView(unplowedtile);
      tile[i].setFitWidth(85);
      tile[i].setFitHeight(85);
      int index = i;
      tile[i].setOnMouseClicked(e -> System.out.println(index));
      farmlayout.getChildren().add(tile[i]);
    }





    // Tile Info
    String var = "hello";
    Text tileinformation = new Text (var);
    TextFlow tileinfo = new TextFlow(tileinformation);
    tileinfo.setPrefWidth(210);
    tileinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    tileinfo.setPadding(new Insets(10));
    maingame.setRight(tileinfo);



    //////////// TOP LAYOUT (FARMER INFO) //////////////

    HBox farmerinfo = new HBox();

    farmerinfo.setSpacing(15);
    farmerinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    ImageView farmericon = new ImageView(level0);
    farmericon.setFitHeight(136);
    farmericon.setFitWidth(78);
    farmerinfo.getChildren().add(farmericon);

    Text farmerstats = new Text ();
    TextFlow farmerstatsbox = new TextFlow(farmerstats);
    farmerstatsbox.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;"
        + "-fx-border-width: 2;" + "-fx-border-insets: 10;"
        + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    farmerstatsbox.setPrefWidth(900);
    farmerstatsbox.setPrefHeight(158);
    farmerinfo.getChildren().add(farmerstatsbox);

    Button register = new Button("Register");
    overlap.getChildren().add(register);
    StackPane.setMargin(register, new Insets(0, 870, 470, 0));

    maingame.setTop(farmerinfo);








    ingame = new Scene(overlap, 1000, 800);
    window.setScene(menu);
    window.setResizable(false);
    window.show();


    /*
    ///Backdrop
    ImageView inventoryiv = new ImageView(inventory);
    inventoryiv.setFitHeight(158);
    inventoryiv.setFitWidth(264);
    inventoryiv.setPreserveRatio(false);
    inventoryiv.setSmooth(true);
    */

    /*
    ImageView tooliv = new ImageView(tool);
    tooliv.setFitHeight(200);
    tooliv.setFitWidth(130);
    tooliv.setPreserveRatio(false);
    tooliv.setSmooth(true);
    */

    /*
    infoboxiv.setFitHeight(205);
    infoboxiv.setFitWidth(486);
    infoboxiv.setPreserveRatio(false);
    infoboxiv.setSmooth(true);
    grid2.getChildren().add(infoboxiv);
    StackPane.setMargin(infoboxiv, new Insets(602, 0, 0, 505));
    */

  }
}
