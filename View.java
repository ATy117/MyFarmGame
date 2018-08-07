import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
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

public class View {

  //ALL IMAGES INITIALIZATIONS
  Image menubackground = new Image("images/menubackground.png", 1400, 800, false, false);
  Image logo = new Image("images/logo.jpg");
  Image inventory = new Image("images/inventory.jpg");
  Image unselectedturnipimg = new Image("images/unselectedturnip.png");
  Image selectedturnipimg = new Image ("images/selectedturnip.png");
  Image unselectedcarrotimg = new Image ("images/unselectedcarrot.png");
  Image selectedcarrotimg = new Image ("images/selectedcarrot.png");
  Image unselectedtomatoimg = new Image("images/unselectedtomato.png");
  Image selectedtomatoimg = new Image("images/selectedtomato.png");
  Image unselectedpotatoimg = new Image("images/unselectedpotato.png");
  Image selectedpotatoimg = new Image ("images/selectedpotato.png");
  Image unselectedtulipimg = new Image("images/unselectedtulip.png");
  Image selectedtulipimg = new Image("images/selectedtulip.png");
  Image unselectedstargazerimg = new Image("images/unselectedstargazer.png");
  Image selectedstargazerimg = new Image("images/selectedstargazer.png");
  Image unselectedsunflowerimg = new Image("images/unselectedsunflower.png");
  Image selectedsunflowerimg = new Image("images/selectedsunflower.png");
  Image unselectedroseimg = new Image("images/unselectedrose.png");
  Image selectedroseimg = new Image("images/selectedrose.png");
  Image unselectedmangoimg = new Image("images/unselectedmango.png");
  Image selectedmangoimg = new Image("images/selectedmango.png");
  Image unselectedappleimg = new Image("images/unselectedapple.png");
  Image selectedappleimg = new Image("images/selectedapple.png");
  Image unselectedbananaimg = new Image("images/unselectedbanana.png");
  Image selectedbananaimg = new Image("images/selectedbanana.png");
  Image unselectedorangeimg = new Image("images/unselectedorange.png");
  Image selectedorangeimg = new Image("images/selectedorange.png");
  Image unselectedfertilizerimg = new Image("images/unselectedfertilizer.png");
  Image selectedfertilizerimg = new Image("images/selectedfertilizer.png");
  Image unselectedwateringcanimg = new Image("images/unselectedwateringcan.png");
  Image selectedwateringcanimg = new Image("images/selectedwateringcan.png");
  Image unselectedplowtoolimg = new Image("images/unselectedplowtool.png");
  Image selectedplowtoolimg = new Image("images/selectedplowtool.png");
  Image unselectedpickaxeimg = new Image("images/unselectedpickaxe.png");
  Image selectedpickaxeimg = new Image("images/selectedpickaxe.png");
  Image unselectedharvesttoolimg = new Image("images/unselectedharvesttool.png");
  Image selectedharvesttoolimg = new Image("images/selectedharvesttool.png");

  Image unselectedcancelimg = new Image ("images/unselectedcancel.png");
  Image selectedcancelimg = new Image ("images/selectedcancel.png");
  Image unselectedbuyimg = new Image ("images/unselectedbuy.png");
  Image selectedbuyimg = new Image ("images/selectedbuy.png");
  Image unselectedplantimg = new Image ("images/unselectedplant.png");
  Image selectedplantimg = new Image ("images/selectedplant.png");
  Image unselectedfertilizeimg = new Image ("images/unselectedfertilize.png");
  Image selectedfertilizeimg = new Image ("images/selectedfertilize.png");
  Image unselectedwaterimg = new Image ("images/unselectedwater.png");
  Image selectedwaterimg = new Image ("images/selectedwater.png");
  Image unselectedmineimg = new Image ("images/unselectedmine.png");
  Image selectedmineimg = new Image ("images/selectedmine.png");
  Image unselectedplowimg = new Image ("images/unselectedplow.png");
  Image selectedplowimg = new Image ("images/selectedplow.png");
  Image unselectedharvestimg = new Image ("images/unselectedharvest.png");
  Image selectedharvestimg = new Image ("images/selectedharvest.png");

  Image infobox = new Image("images/infobox.png");
  Image unplowedtile = new Image("images/unplowed_empty_tile.png");
  Image plowedtile = new Image("images/plowed_empty_tile.png");
  Image rocktile = new Image("images/rock_tile.png");
  Image witheredfruittile = new Image("images/withered_tree_tile.png");
  Image witheredveggietile = new Image("images/withered_veggie_tile.png");
  Image witheredflowertile = new Image("images/withered_flower_tile.png");

  Image dancinggroot = new Image("images/dancinggroot.gif");
  Image dirtbackground = new Image("images/dirtbackground.png");
  Image grown_tulip_tileimg = new Image("images/grown_tulip_tile.png");
  Image grown_carrot_tileimg = new Image("images/grown_carrot_tile.png");
  Image grown_tomato_tileimg = new Image("images/grown_tomato_tile.png");
  Image grown_potato_tileimg = new Image("images/grown_potato_tile.png");
  Image grown_rose_tileimg = new Image("images/grown_rose_tile.png");
  Image grown_turnip_tileimg = new Image("images/grown_turnip_tile.png");
  Image grown_stargazer_tileimg = new Image("images/grown_stargazer_tile.png");
  Image grown_sunflower_tileimg = new Image("images/grown_sunflower_tile.png");
  Image grown_mango_tileimg = new Image("images/grownmangotile.png");
  Image grown_apple_tileimg = new Image("images/grownappletile.png");
  Image grown_banana_tileimg = new Image("images/grownbananatile.png");
  Image grown_orange_tileimg = new Image("images/grownorangetile.png");
  Image growing_fruit_tile = new Image("images/growing_tree_tile.png");
  Image growing_veggie_tile = new Image("images/growing_veggie_tile.png");
  Image growing_flower_tile = new Image("images/growing_flower_tile.png");
  Image tileinfobackground = new Image ("images/tileinfo.png");


  // Declaration of public variables
  Stage window;
  Scene menu, ingame;
  ImageView[] tile;
  Text tileinformation;
  Text farmerstats, farmerbonuses;
  Controller controller;
  ProgressBar EXPbar;

  public View(Controller c, Stage primaryStage) {
    //--------------------------- MAIN MENU ------------------------------//
    controller = c;
    farmerstats = new Text("");

    //Window
    window = primaryStage;
    window.setTitle("MyFarm by Adrian Ty and Gabriel Tan");
    StackPane grid = new StackPane();

    // Background Image (which is white)
    ImageView menubackgroundiv = new ImageView(menubackground);
    grid.getChildren().add(menubackgroundiv);

    //Logo
    /*ImageView logodisplay = new ImageView(logo);
    logodisplay.setFitHeight(526);
    logodisplay.setFitWidth(739);
    logodisplay.setPreserveRatio(true);
    logodisplay.setSmooth(true);
    grid.getChildren().add(logodisplay);
    StackPane.setMargin(logodisplay, new Insets(0, 0, 230, 0));
    */

    //Name input
    TextField name = new TextField();
    name.setPromptText("Enter Farmer Name");
    name.setMaxWidth(200);
    grid.getChildren().add(name);
    StackPane.setMargin(name, new Insets(100, 0, 0, 0));

    //Gene1rate Button
    Button generate = new Button("GENERATE FARM");
    generate.setOnAction(e -> {
      window.setScene(ingame);
      String enteredName = name.getText();
      controller.setFarmerName(enteredName);
      farmerstats.setText(controller.getFarmerStats());
    });
    grid.getChildren().add(generate);
    StackPane.setMargin(generate, new Insets(200, 0, 0, 0));

    menu = new Scene(grid, 1400, 800);




    //--------------------------- IN GAME ------------------------------//

    //StackPane is used for images behind the main layout, BorderPane is on top of the StackPane and is the main layout
    StackPane overlap = new StackPane();
    AnchorPane maingame = new AnchorPane();
    ImageView backgroundiv = new ImageView(dirtbackground);

    maingame.setPadding(new Insets(10));

    overlap.getChildren().add(backgroundiv);
    overlap.getChildren().add(maingame);



    //////////////////// TOP LAYOUT (FARMER INFO) //////////////////////

    HBox farmerinfo = new HBox();
    farmerinfo.setSpacing(20);
    farmerinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    Pane picture = new Pane ();
    //picture.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
    //    + "-fx-border-insets: 0;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    ImageView farmericon = new ImageView(dancinggroot);
    farmericon.setPreserveRatio(true);
    farmericon.setFitWidth(110);
    picture.getChildren().add(farmericon);
    farmerinfo.getChildren().add(picture);

    TextFlow farmerstatsbox = new TextFlow(farmerstats);
    farmerstats.setFont(Font.font ("Springfield Cartoon", 15));
    farmerstats.setFill(Color.WHITE);
    farmerstatsbox.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 0;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    farmerstatsbox.setPrefWidth(440);
    farmerstatsbox.setPrefHeight(148);
    farmerinfo.getChildren().add(farmerstatsbox);

    farmerbonuses = new Text(controller.getFarmerBonuses());
    farmerbonuses.setFont(Font.font ("Springfield Cartoon", 15));
    farmerbonuses.setFill(Color.WHITE);
    TextFlow farmerbonusesbox = new TextFlow(farmerbonuses);
    farmerbonusesbox.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 0;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    farmerbonusesbox.setPrefWidth(320);
    farmerbonusesbox.setPrefHeight(148);
    farmerinfo.getChildren().add(farmerbonusesbox);

    Button register = new Button("Register");
    register.setOnAction(e -> controller.register());

    EXPbar = new ProgressBar();
    EXPbar.setProgress(0);
    EXPbar.setPrefWidth(200);

    /////////////////  MIDDLE LAYOUT (FARMLAND) ////////////////////

    // LAYOUT
    Pane farmland = new Pane();
    farmland.setPrefWidth(575);
    farmland.setPrefHeight(300);


    TilePane farmlayout = new TilePane();
    farmlayout.setPrefColumns(10);
    farmlayout.setHgap(-25);
    farmlayout.setVgap(-25);

    tile = new ImageView[50];
    for (int i = 0; i < 50; i++) {
      tile[i] = new ImageView(unplowedtile);
      tile[i].setFitWidth(85);
      tile[i].setFitHeight(85);
      farmlayout.getChildren().add(tile[i]);
    }
    resetTileAction();

    farmland.getChildren().add(farmlayout);



    ///////////////// BOTTOM PART LAYOUT (INVENTORY, TOOLS, INFOBOX)////////////////

    //Inventory
    GridPane invlayout = new GridPane();
    invlayout.setHgap(5);
    invlayout.setVgap(5);
    invlayout.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 0;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    // Vegetables

    ImageView turnip = new ImageView (unselectedturnipimg);
    turnip.setOnMouseEntered(e -> turnip.setImage(selectedturnipimg));
    turnip.setOnMouseExited( e -> turnip.setImage(unselectedturnipimg));
    invlayout.add(turnip, 0, 0);

    ImageView carrot = new ImageView (unselectedcarrotimg);
    carrot.setOnMouseEntered(e -> carrot.setImage(selectedcarrotimg));
    carrot.setOnMouseExited( e -> carrot.setImage(unselectedcarrotimg));
    invlayout.add(carrot, 1, 0);

    ImageView tomato = new ImageView (unselectedtomatoimg);
    tomato.setOnMouseEntered(e -> tomato.setImage(selectedtomatoimg));
    tomato.setOnMouseExited( e -> tomato.setImage(unselectedtomatoimg));
    invlayout.add(tomato, 2, 0);

    ImageView potato = new ImageView (unselectedpotatoimg);
    potato.setOnMouseEntered(e -> potato.setImage(selectedpotatoimg));
    potato.setOnMouseExited( e -> potato.setImage(unselectedpotatoimg));
    invlayout.add(potato, 3, 0);

    // Flowers
    ImageView rose = new ImageView (unselectedroseimg);
    rose.setOnMouseEntered(e -> rose.setImage(selectedroseimg));
    rose.setOnMouseExited( e -> rose.setImage(unselectedroseimg));
    invlayout.add(rose, 0, 1);

    ImageView tulip = new ImageView (unselectedtulipimg);
    tulip.setOnMouseEntered(e -> tulip.setImage(selectedtulipimg));
    tulip.setOnMouseExited( e -> tulip.setImage(unselectedtulipimg));
    invlayout.add(tulip, 1, 1);

    ImageView stargazer = new ImageView (unselectedstargazerimg);
    stargazer.setOnMouseEntered(e -> stargazer.setImage(selectedstargazerimg));
    stargazer.setOnMouseExited( e -> stargazer.setImage(unselectedstargazerimg));
    invlayout.add(stargazer, 2, 1);

    ImageView sunflower = new ImageView (unselectedsunflowerimg);
    sunflower.setOnMouseEntered(e -> sunflower.setImage(selectedsunflowerimg));
    sunflower.setOnMouseExited( e -> sunflower.setImage(unselectedsunflowerimg));
    invlayout.add(sunflower, 3, 1);

    // Fruits
    ImageView mango = new ImageView (unselectedmangoimg);
    mango.setOnMouseEntered(e -> mango.setImage(selectedmangoimg));
    mango.setOnMouseExited( e -> mango.setImage(unselectedmangoimg));
    invlayout.add(mango, 0, 2);

    ImageView apple = new ImageView (unselectedappleimg);
    apple.setOnMouseEntered(e -> apple.setImage(selectedappleimg));
    apple.setOnMouseExited( e -> apple.setImage(unselectedappleimg));
    invlayout.add(apple, 1, 2);

    ImageView banana = new ImageView (unselectedbananaimg);
    banana.setOnMouseEntered(e -> banana.setImage(selectedbananaimg));
    banana.setOnMouseExited( e -> banana.setImage(unselectedbananaimg));
    invlayout.add(banana, 2, 2);

    ImageView orange = new ImageView (unselectedorangeimg);
    orange.setOnMouseEntered(e -> orange.setImage(selectedorangeimg));
    orange.setOnMouseExited( e -> orange.setImage(unselectedorangeimg));
    invlayout.add(orange, 3, 2);


    //Tools
    GridPane toollayout = new GridPane();
    toollayout.setHgap(5);
    toollayout.setVgap(5);
    toollayout.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 0;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    ImageView wateringcan = new ImageView (unselectedwateringcanimg);
    wateringcan.setOnMouseEntered(e -> wateringcan.setImage(selectedwateringcanimg));
    wateringcan.setOnMouseExited( e -> wateringcan.setImage(unselectedwateringcanimg));
    wateringcan.setPreserveRatio(true);
    wateringcan.setFitWidth(50);
    toollayout.add(wateringcan, 0, 0);

    ImageView plowtool = new ImageView (unselectedplowtoolimg);
    plowtool.setOnMouseEntered(e -> plowtool.setImage(selectedplowtoolimg));
    plowtool.setOnMouseExited( e -> plowtool.setImage(unselectedplowtoolimg));
    plowtool.setPreserveRatio(true);
    plowtool.setFitWidth(50);
    toollayout.add(plowtool, 0, 1);

    ImageView pickaxe = new ImageView (unselectedpickaxeimg);
    pickaxe.setOnMouseEntered(e -> pickaxe.setImage(selectedpickaxeimg));
    pickaxe.setOnMouseExited( e -> pickaxe.setImage(unselectedpickaxeimg));
    pickaxe.setPreserveRatio(true);
    pickaxe.setFitWidth(50);
    toollayout.add(pickaxe, 0, 2);

    ImageView fertilizer = new ImageView (unselectedfertilizerimg);
    fertilizer.setOnMouseEntered(e -> fertilizer.setImage(selectedfertilizerimg));
    fertilizer.setOnMouseExited( e -> fertilizer.setImage(unselectedfertilizerimg));
    fertilizer.setPreserveRatio(true);
    fertilizer.setFitWidth(50);
    toollayout.add(fertilizer, 1, 0);

    ImageView harvesttool = new ImageView (unselectedharvesttoolimg);
    harvesttool.setOnMouseEntered(e -> harvesttool.setImage(selectedharvesttoolimg));
    harvesttool.setOnMouseExited( e -> harvesttool.setImage(unselectedharvesttoolimg));
    harvesttool.setPreserveRatio(true);
    harvesttool.setFitWidth(50);
    toollayout.add(harvesttool, 1, 1);


    // Stats / Information
    for (int j = 0; j < invlayout.getChildren().size(); j++) {
      int seedPos = j;
      ImageView butt = (ImageView) (invlayout.getChildren().get(j));
      butt.setPreserveRatio(true);
      butt.setFitWidth(50);
      butt.setOnMouseClicked(e -> {
        resetTileAction();
        Text info = new Text(controller.getSeedInfo(seedPos));
        info.setFont(Font.font ("Springfield Cartoon", 15));
        info.setFill(Color.WHITE);
        HBox seedInfoBox = new HBox();
        seedInfoBox.setPrefWidth(530);
        seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
            + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
        seedInfoBox.setSpacing(10);

        ImageView buyButton = new ImageView(unselectedbuyimg);
        ImageView plantButton = new ImageView(unselectedplantimg);
        plantButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            buyButton.setImage(unselectedbuyimg);
            plantButton.setImage(selectedplantimg);
            for (int i = 0; i < 50; i++) {
              int tilePos = i;
              ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
              tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                  controller.plant(tilePos, seedPos);
                  info.setText(controller.getSeedInfo(seedPos));
                  updateFarmerStats();
                }
              });
            }
          }
        });

        buyButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            buyButton.setImage(selectedbuyimg);
          }
        });

        buyButton.setOnMouseExited(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            buyButton.setImage(unselectedbuyimg);
          }
        });

        buyButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            plantButton.setImage(unselectedplantimg);
            controller.buySeed(seedPos);
            info.setText(controller.getSeedInfo(seedPos));
            updateFarmerStats();
          }
        });

        ImageView cancelButton = new ImageView(unselectedcancelimg);
        cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            cancelButton.setImage(selectedcancelimg);
          }
        });

        cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            cancelButton.setImage(unselectedcancelimg);
          }
        });
        cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            maingame.getChildren().remove(seedInfoBox);
            resetTileAction();
          }
        });
        // Buttons
        VBox buttonBox = new VBox();
        buttonBox.getChildren().add(plantButton);
        buttonBox.getChildren().add(buyButton);
        buttonBox.getChildren().add(cancelButton);
        seedInfoBox.getChildren().add(buttonBox);


        TextFlow seedInfo = new TextFlow(info);
        seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
            + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
        seedInfo.setPrefWidth(410);

        seedInfoBox.getChildren().add(seedInfo);
        if (maingame.getChildren().size() > 9) {
          Node n = maingame.getChildren().get(9);
          maingame.getChildren().remove(n);
          maingame.getChildren().add(seedInfoBox);
          AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
          AnchorPane.setRightAnchor(seedInfoBox, 200.0);
        } else {
          maingame.getChildren().add(seedInfoBox);
          AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
          AnchorPane.setRightAnchor(seedInfoBox, 200.0);
        }

      });

    }

    // FertilizeBag Mouse Click Options
    fertilizer.setOnMouseClicked(e -> {
      resetTileAction();
      Text info = new Text(controller.getFertilizerInfo());
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(20);

      ImageView fertilizeButton = new ImageView(unselectedfertilizeimg);
      fertilizeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          fertilizeButton.setImage(selectedfertilizeimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.fertilize(tilePos);
                updateFarmerStats();
                }
              });
            }
          }
        });

        ImageView buyButton = new ImageView(unselectedbuyimg);

        buyButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            buyButton.setImage(selectedbuyimg);
          }
        });

        buyButton.setOnMouseExited(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            buyButton.setImage(unselectedbuyimg);
          }
        });

      buyButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent e) {
          controller.buyFertilizer();
          info.setText(controller.getFertilizerInfo());
          fertilizeButton.setImage(selectedfertilizeimg);
          updateFarmerStats();
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(selectedcancelimg);
        }
      });

      cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(unselectedcancelimg);
        }
      });
      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          maingame.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(fertilizeButton);
      buttonBox.getChildren().add(buyButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);


      info.setFont(Font.font ("Springfield Cartoon", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 9) {
        Node n = maingame.getChildren().get(9);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      }

    });

    // Plowtool Mouse Click Options
    plowtool.setOnMouseClicked(e->{
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(20);

      ImageView unplowedButton = new ImageView(unselectedplowimg);
      unplowedButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          unplowedButton.setImage(selectedplowimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.plowTile(tilePos);
                updateFarmerStats();
              }
            });
          }
        }
      });


      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(selectedcancelimg);
        }
      });

      cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(unselectedcancelimg);
        }
      });
      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          maingame.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(unplowedButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getScyteInfo());
      info.setFont(Font.font ("Springfield Cartoon", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 9) {
        Node n = maingame.getChildren().get(9);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      }

    });

    // Watering Can Mouse Click Options
    wateringcan.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(20);


      ImageView waterButton = new ImageView(unselectedwaterimg);
      waterButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

      public void handle(MouseEvent e) {
        waterButton.setImage(selectedwaterimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.water(tilePos);
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(selectedcancelimg);
        }
      });

      cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(unselectedcancelimg);
        }
      });
      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          maingame.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });

      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(waterButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getWaterInfo());
      info.setFont(Font.font ("Springfield Cartoon", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 9) {
        Node n = maingame.getChildren().get(9);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      }

    });

    // Harvest tool mouse click Options
    harvesttool.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(20);

      ImageView harvestButton = new ImageView(unselectedharvestimg);
      harvestButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          harvestButton.setImage(selectedharvestimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.harvest(tilePos);
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(selectedcancelimg);
        }
      });

      cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(unselectedcancelimg);
        }
      });
      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          maingame.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(harvestButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getHarvestInfo());
      info.setFont(Font.font ("Springfield Cartoon", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 9) {
        Node n = maingame.getChildren().get(9);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      }

    });

    // Pickaxe Mouse Click Options
    pickaxe.setOnMouseClicked(e->{

      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(20);

      ImageView pickaxeButton = new ImageView(unselectedmineimg);
      pickaxeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          pickaxeButton.setImage(selectedmineimg);
          for (int i = 0; i < 50; i++) {
            int num = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.pickRock(num);
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(selectedcancelimg);
        }
      });

      cancelButton.setOnMouseExited(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          cancelButton.setImage(unselectedcancelimg);
        }
      });
      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          maingame.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(pickaxeButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getPickaxeInfo());
      info.setFont(Font.font ("Springfield Cartoon", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);

      if (maingame.getChildren().size() > 9) {
        Node n = maingame.getChildren().get(9);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
        AnchorPane.setRightAnchor(seedInfoBox, 200.0);
      }

    });


    tileinformation = new Text("");
    tileinformation.setFont(Font.font ("Springfield Cartoon", 15));
    tileinformation.setFill(Color.WHITE);
    TextFlow tileinfo = new TextFlow(tileinformation);
    tileinfo.setPrefWidth(275);
    tileinfo.setPrefHeight(220);
    //tileinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
    //    + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    tileinfo.setPadding(new Insets(10));


    //---------------------- DIMENSIONS IN GAME------------------------------//

    maingame.getChildren().addAll(farmland, invlayout, toollayout, farmerstatsbox, farmerbonusesbox, tileinfo, picture, EXPbar, register);

    AnchorPane.setBottomAnchor(invlayout, 13.0);
    AnchorPane.setLeftAnchor(invlayout, 250.0);

    AnchorPane.setBottomAnchor(toollayout, 13.0);
    AnchorPane.setLeftAnchor(toollayout, 510.0);

    AnchorPane.setTopAnchor(farmland, 210.0);
    AnchorPane.setLeftAnchor(farmland, 550.0);

    AnchorPane.setTopAnchor(farmerstatsbox, 30.0);
    AnchorPane.setLeftAnchor(farmerstatsbox, 410.0);

    AnchorPane.setTopAnchor(farmerbonusesbox, 30.0);
    AnchorPane.setRightAnchor(farmerbonusesbox, 200.0);

    AnchorPane.setTopAnchor(tileinfo, 200.0);
    AnchorPane.setLeftAnchor(tileinfo, 200.0);

    AnchorPane.setTopAnchor(EXPbar, 80.0);
    AnchorPane.setLeftAnchor(EXPbar, 530.0);

    AnchorPane.setTopAnchor(register, 50.0);
    AnchorPane.setRightAnchor(register, 220.0);

    AnchorPane.setTopAnchor(picture, 40.0);
    AnchorPane.setLeftAnchor(picture, 255.0);























    // Sets scene
    ingame = new Scene(overlap, 1400, 800);
    window.setScene(menu);
    window.setResizable(false);
    window.show();
  }

  public void resetTileAction() {
    for (int i = 0; i < 50; i++) {
      int num = i;
      tile[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          tileinformation.setText(controller.getTileInfo(num));
        }
      });
    }
  }

  public void updateFarmerEXPbar() {
    EXPbar.setProgress((float) controller.getFarmerEXP() / 50);
  }

  public void updateFarmerStats() {
    farmerstats.setText(controller.getFarmerStats());
    updateFarmerEXPbar();
  }

  public void updateFarmerBonuses() {
    farmerbonuses.setText(controller.getFarmerBonuses());
  }

  // Tiles
  public void setImageUnplowedTile(int pos) {
    tile[pos].setImage(unplowedtile);
  }

  public void setImagePlowedTile(int pos) {
    tile[pos].setImage(plowedtile);
  }

  // Rock
  public void setImageRock(int pos) {
    tile[pos].setImage(rocktile);
  }

  public void setImageToGrown(int seedpos, int tilepos) {
    switch (seedpos) {
    case 0:
      tile[tilepos].setImage(grown_turnip_tileimg);
      break;
    case 1:
      tile[tilepos].setImage(grown_carrot_tileimg);
      break;
    case 2:
      tile[tilepos].setImage(grown_tomato_tileimg);
      break;
    case 3:
      tile[tilepos].setImage(grown_potato_tileimg);
      break;
    case 4:
      tile[tilepos].setImage(grown_rose_tileimg);
      break;
    case 5:
      tile[tilepos].setImage(grown_tulip_tileimg);
      break;
    case 6:
      tile[tilepos].setImage(grown_stargazer_tileimg);
      break;
    case 7:
      tile[tilepos].setImage(grown_sunflower_tileimg);
      break;
    case 8:
      tile[tilepos].setImage(grown_mango_tileimg);
      break;
    case 9:
      tile[tilepos].setImage(grown_apple_tileimg);
      break;
    case 10:
      tile[tilepos].setImage(grown_banana_tileimg);
      break;
    case 11:
      tile[tilepos].setImage(grown_orange_tileimg);
      break;
    }
  }

  public void setImageToGrowing(int seedpos, int tilepos) {
    if (seedpos >= 0 && seedpos <= 3)
      tile[tilepos].setImage(growing_veggie_tile);
    else if (seedpos >= 4 && seedpos <= 7)
      tile[tilepos].setImage(growing_flower_tile);
    else
      tile[tilepos].setImage(growing_fruit_tile);
  }

  public void setImageToWithered(int seedpos, int tilepos) {
    if (seedpos >= 0 && seedpos <= 3)
      tile[tilepos].setImage(witheredveggietile);
    else if (seedpos >= 4 && seedpos <= 7)
      tile[tilepos].setImage(witheredflowertile);
    else
      tile[tilepos].setImage(witheredfruittile);
  }

}
