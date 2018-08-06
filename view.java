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
  Image image = new Image("images/background.png", 800, 860, false, false);
  Image image2 = new Image("images/background.png", 1000, 800, false, false);
  Image logo = new Image("images/logo.jpg");
  Image inventory = new Image("images/inventory.jpg");
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
  Image toolimg = new Image("images/tools.jpg");
  Image wateringcanimg = new Image("images/wateringcan.png");
  Image plowtoolimg = new Image("images/plowtool.png");
  Image pickaxeimg = new Image("images/pickaxe.png");
  Image fertilizerbagimg = new Image("images/fertilizerbag.png");
  Image infobox = new Image("images/infobox.png");
  Image unplowedtile = new Image("images/unplowed_empty_tile.png");
  Image plowedtile = new Image("images/plowed_empty_tile.png");
  Image rocktile = new Image("images/rock_tile.png");
  Image witheredfruittile = new Image("images/withered_tree_tile.png");
  Image witheredveggietile = new Image("images/withered_veggie_tile.png");
  Image witheredflowertile = new Image("images/withered_flower_tile.png");
  Image harvestimg = new Image("images/harvest.png");
  Image level0 = new Image("images/level0.png");
  Image background = new Image("images/greenbackground.png");
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
    ImageView mv = new ImageView(image);
    grid.getChildren().add(mv);

    //Logo
    ImageView logodisplay = new ImageView(logo);
    logodisplay.setFitHeight(526);
    logodisplay.setFitWidth(739);
    logodisplay.setPreserveRatio(true);
    logodisplay.setSmooth(true);
    grid.getChildren().add(logodisplay);
    StackPane.setMargin(logodisplay, new Insets(0, 0, 230, 0));

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

    menu = new Scene(grid, 800, 600);

    //--------------------------- IN GAME ------------------------------//

    //StackPane is used for images behind the main layout, BorderPane is on top of the StackPane and is the main layout
    StackPane overlap = new StackPane();
    BorderPane maingame = new BorderPane();
    ImageView backgroundiv = new ImageView(background);
    overlap.getChildren().add(backgroundiv);
    overlap.getChildren().add(maingame);

    //////////////////// TOP LAYOUT (FARMER INFO) //////////////////////

    HBox farmerinfo = new HBox();

    farmerinfo.setSpacing(5);
    farmerinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    ImageView farmericon = new ImageView(level0);
    farmericon.setFitHeight(136);
    farmericon.setFitWidth(78);
    farmerinfo.getChildren().add(farmericon);

    TextFlow farmerstatsbox = new TextFlow(farmerstats);
    farmerstatsbox.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    farmerstatsbox.setPrefWidth(600);
    farmerstatsbox.setPrefHeight(158);
    farmerinfo.getChildren().add(farmerstatsbox);

    farmerbonuses = new Text(controller.getFarmerBonuses());
    TextFlow farmerbonusesbox = new TextFlow(farmerbonuses);
    farmerbonusesbox.setStyle("-fx-padding: 0;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    farmerbonusesbox.setPrefWidth((280));
    farmerbonusesbox.setPrefHeight(158);
    farmerinfo.getChildren().add(farmerbonusesbox);

    Button register = new Button("Register");
    register.setOnAction(e -> controller.register());
    overlap.getChildren().add(register);
    StackPane.setMargin(register, new Insets(0, 870, 470, 0));

    EXPbar = new ProgressBar();
    EXPbar.setProgress(0);
    EXPbar.setMaxWidth(200);

    overlap.getChildren().add(EXPbar);
    StackPane.setMargin(EXPbar, new Insets(0, 600, 470, 0));

    maingame.setTop(farmerinfo);

    /////////////////  MIDDLE LAYOUT (FARMLAND) ////////////////////

    // LAYOUT
    TilePane farmlayout = new TilePane();
    farmlayout.setPrefColumns(5);
    farmlayout.setPadding(new Insets(0, 0, 0, 5));
    maingame.setCenter(farmlayout);
    farmlayout.setHgap(-10);
    farmlayout.setVgap(-10);

    tile = new ImageView[50];
    for (int i = 0; i < 50; i++) {
      tile[i] = new ImageView(unplowedtile);
      tile[i].setFitWidth(85);
      tile[i].setFitHeight(85);
      farmlayout.getChildren().add(tile[i]);
    }
    resetTileAction();

    ///////////////// BOTTOM PART LAYOUT (INVENTORY, TOOLS, INFOBOX)////////////////

    HBox infoui = new HBox(); // BOTTOM  LAYOUT
    infoui.setPadding(new Insets(15, 0, 15, 0));
    infoui.setSpacing(10);
    maingame.setBottom(infoui);

    //Inventory
    GridPane invlayout = new GridPane();
    invlayout.setHgap(15);
    invlayout.setVgap(15);
    invlayout.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    // Vegetables
    Button turnip = new Button();
    turnip.setGraphic(new ImageView(turnipimg));
    invlayout.add(turnip, 0, 0);

    Button carrot = new Button();
    carrot.setGraphic(new ImageView(carrotimg));
    invlayout.add(carrot, 1, 0);

    Button tomato = new Button();
    tomato.setGraphic(new ImageView(tomatoimg));
    invlayout.add(tomato, 2, 0);

    Button potato = new Button();
    potato.setGraphic(new ImageView(potatoimg));
    invlayout.add(potato, 3, 0);

    // Flowers
    Button rose = new Button();
    rose.setGraphic(new ImageView(roseimg));
    invlayout.add(rose, 0, 1);

    Button tulip = new Button();
    tulip.setGraphic(new ImageView(tulipimg));
    invlayout.add(tulip, 1, 1);

    Button stargazer = new Button();
    stargazer.setGraphic(new ImageView(stargazerimg));
    invlayout.add(stargazer, 2, 1);

    Button sunflower = new Button();
    sunflower.setGraphic(new ImageView(sunflowerimg));
    invlayout.add(sunflower, 3, 1);

    // Fruits
    Button mango = new Button();
    mango.setGraphic(new ImageView(mangoimg));
    invlayout.add(mango, 0, 2);

    Button apple = new Button();
    apple.setGraphic(new ImageView(appleimg));
    invlayout.add(apple, 1, 2);

    Button banana = new Button();
    banana.setGraphic(new ImageView(bananaimg));
    invlayout.add(banana, 2, 2);

    Button orange = new Button();
    orange.setGraphic(new ImageView(orangeimg));
    invlayout.add(orange, 3, 2);

    infoui.getChildren().add(invlayout);

    //Tools
    GridPane toollayout = new GridPane();
    toollayout.setHgap(15);
    toollayout.setVgap(15);
    toollayout.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");

    Button wateringcan = new Button();
    wateringcan.setGraphic(new ImageView(wateringcanimg));
    toollayout.add(wateringcan, 0, 0);

    Button plowtool = new Button();
    plowtool.setGraphic(new ImageView(plowtoolimg));
    toollayout.add(plowtool, 0, 1);

    Button pickaxe = new Button();
    pickaxe.setGraphic(new ImageView(pickaxeimg));
    toollayout.add(pickaxe, 0, 2);

    Button fertilizerbag = new Button();
    fertilizerbag.setGraphic(new ImageView(fertilizerbagimg));
    toollayout.add(fertilizerbag, 1, 0);

    Button harvesttool = new Button();
    harvesttool.setGraphic(new ImageView(harvestimg));
    toollayout.add(harvesttool, 1, 1);

    infoui.getChildren().add(toollayout);

    // Stats / Information
    for (int j = 0; j < invlayout.getChildren().size(); j++) {
      int seedPos = j;
      Button butt = (Button) invlayout.getChildren().get(j);
      butt.setOnMouseClicked(e -> {
        resetTileAction();
        HBox seedInfoBox = new HBox();
        seedInfoBox.setPrefWidth(530);
        seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
            + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
        seedInfoBox.setSpacing(10);

        Button plantButton = new Button("Plant");
        plantButton.setMinWidth(80);
        plantButton.setMinHeight(50);
        plantButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            for (int i = 0; i < 50; i++) {
              ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
              tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent e) {
                  infoui.getChildren().remove(seedInfoBox);
                  resetTileAction();
                }
              });
            }
          }
        });

        Button buyButton = new Button("Buy");
        buyButton.setMinWidth(80);
        buyButton.setMinHeight(50);
        buyButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            infoui.getChildren().remove(seedInfoBox);
            controller.buySeed(seedPos);
            updateFarmerStats();
            resetTileAction();
          }
        });

        Button cancelButton = new Button("Cancel");
        cancelButton.setMinWidth(80);
        cancelButton.setMinHeight(50);

        cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
          public void handle(MouseEvent e) {
            infoui.getChildren().remove(seedInfoBox);
            resetTileAction();
          }
        });
        // Buttons
        VBox buttonBox = new VBox();
        buttonBox.getChildren().add(plantButton);
        buttonBox.getChildren().add(buyButton);
        buttonBox.getChildren().add(cancelButton);
        seedInfoBox.getChildren().add(buttonBox);

        Text info = new Text(controller.getSeedInfo(seedPos));
        TextFlow seedInfo = new TextFlow(info);
        seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
            + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
        seedInfo.setPrefWidth(410);

        seedInfoBox.getChildren().add(seedInfo);
        if (infoui.getChildren().size() > 2) {
          Node n = infoui.getChildren().get(2);
          infoui.getChildren().remove(n);
          infoui.getChildren().add(seedInfoBox);
        } else
          infoui.getChildren().add(seedInfoBox);

      });

    }

    // FertilizeBag Mouse Click Options
    fertilizerbag.setOnMouseClicked(e -> {
      resetTileAction();

      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(10);

      Button fertilizeButton = new Button("Fertilize");
      fertilizeButton.setMinWidth(80);
      fertilizeButton.setMinHeight(50);
      fertilizeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          for (int i = 0; i < 50; i++) {
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                infoui.getChildren().remove(seedInfoBox);
                resetTileAction();
              }
            });
          }
        }
      });

      Button buyButton = new Button("Buy");
      buyButton.setMinWidth(80);
      buyButton.setMinHeight(50);
      buyButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          controller.buyFertilizer();
          updateFarmerStats();
          resetTileAction();
        }
      });

      Button cancelButton = new Button("Cancel");
      cancelButton.setMinWidth(80);
      cancelButton.setMinHeight(50);

      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(fertilizeButton);
      buttonBox.getChildren().add(buyButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getFertilizerInfo());
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(410);

      seedInfoBox.getChildren().add(seedInfo);
      if (infoui.getChildren().size() > 2) {
        Node n = infoui.getChildren().get(2);
        infoui.getChildren().remove(n);
        infoui.getChildren().add(seedInfoBox);
      } else
        infoui.getChildren().add(seedInfoBox);

    });

    // Plowtool Mouse Click Options
    plowtool.setOnMouseClicked(e -> {

      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(10);

      Button unplowedButton = new Button("Plow");
      unplowedButton.setMinWidth(80);
      unplowedButton.setMinHeight(75);
      unplowedButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                infoui.getChildren().remove(seedInfoBox);
                controller.plowTile(tilePos);
                updateFarmerStats();
                resetTileAction();
              }
            });
          }
        }
      });

      Button cancelButton = new Button("Cancel");
      cancelButton.setMinWidth(80);
      cancelButton.setMinHeight(75);

      cancelButton.setOnMouseClicked(new EventHandler<>() {
        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(unplowedButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getScyteInfo());
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(410);

      seedInfoBox.getChildren().add(seedInfo);
      if (infoui.getChildren().size() > 2) {
        Node n = infoui.getChildren().get(2);
        infoui.getChildren().remove(n);
        infoui.getChildren().add(seedInfoBox);
      } else
        infoui.getChildren().add(seedInfoBox);

    });

    // Watering Can Mouse Click Options
    wateringcan.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(10);

      Button waterButton = new Button("Water");
      waterButton.setMinWidth(80);
      waterButton.setMinHeight(75);
      waterButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          for (int i = 0; i < 50; i++) {
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                infoui.getChildren().remove(seedInfoBox);
                resetTileAction();
              }
            });
          }
        }
      });

      Button cancelButton = new Button("Cancel");
      cancelButton.setMinWidth(80);
      cancelButton.setMinHeight(75);

      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(waterButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getWaterInfo());
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(410);

      seedInfoBox.getChildren().add(seedInfo);
      if (infoui.getChildren().size() > 2) {
        Node n = infoui.getChildren().get(2);
        infoui.getChildren().remove(n);
        infoui.getChildren().add(seedInfoBox);
      } else
        infoui.getChildren().add(seedInfoBox);

    });

    // Harvest tool mouse click Options
    harvesttool.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(10);

      Button harvestButton = new Button("Harvest");
      harvestButton.setMinWidth(80);
      harvestButton.setMinHeight(75);
      harvestButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          for (int i = 0; i < 50; i++) {
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                infoui.getChildren().remove(seedInfoBox);
                resetTileAction();
              }
            });
          }
        }
      });

      Button cancelButton = new Button("Cancel");
      cancelButton.setMinWidth(80);
      cancelButton.setMinHeight(75);

      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(harvestButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getHarvestInfo());
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(410);

      seedInfoBox.getChildren().add(seedInfo);
      if (infoui.getChildren().size() > 2) {
        Node n = infoui.getChildren().get(2);
        infoui.getChildren().remove(n);
        infoui.getChildren().add(seedInfoBox);
      } else
        infoui.getChildren().add(seedInfoBox);

    });

    // Pickaxe Mouse Click Options
    pickaxe.setOnMouseClicked(e -> {

      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefWidth(530);
      seedInfoBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfoBox.setSpacing(10);

      Button pickaxeButton = new Button("Remove\n  Rock");
      pickaxeButton.setMinWidth(80);
      pickaxeButton.setMinHeight(75);
      pickaxeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          for (int i = 0; i < 50; i++) {
            int num = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.pickRock(num);
                infoui.getChildren().remove(seedInfoBox);
                updateFarmerStats();
                resetTileAction();
              }
            });
          }
        }
      });

      Button cancelButton = new Button("Cancel");
      cancelButton.setMinWidth(80);
      cancelButton.setMinHeight(75);

      cancelButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          infoui.getChildren().remove(seedInfoBox);
          resetTileAction();
        }
      });
      // Buttons
      VBox buttonBox = new VBox();
      buttonBox.getChildren().add(pickaxeButton);
      buttonBox.getChildren().add(cancelButton);
      seedInfoBox.getChildren().add(buttonBox);

      Text info = new Text(controller.getPickaxeInfo());
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
          + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
      seedInfo.setPrefWidth(410);

      seedInfoBox.getChildren().add(seedInfo);

      if (infoui.getChildren().size() > 2) {
        Node n = infoui.getChildren().get(2);
        infoui.getChildren().remove(n);
        infoui.getChildren().add(seedInfoBox);
      } else
        infoui.getChildren().add(seedInfoBox);

    });

    tileinformation = new Text("");
    TextFlow tileinfo = new TextFlow(tileinformation);
    tileinfo.setPrefWidth(210);
    tileinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
        + "-fx-border-insets: 10;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    tileinfo.setPadding(new Insets(10));
    maingame.setRight(tileinfo);

    // Sets scene
    ingame = new Scene(overlap, 1000, 800);
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

  public void resetFarmerEXPbar() {
    EXPbar.setProgress(0);
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
