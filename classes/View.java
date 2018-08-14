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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.Shadow;
import javafx.scene.effect.Bloom;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import java.awt.Toolkit;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;
import javafx.stage.WindowEvent;
import java.util.Optional;
import javafx.scene.control.ButtonType;
import java.util.Date;
import javafx.scene.layout.Region;
import java.io.File;
import java.net.URI;
import java.net.URL;
import javafx.util.Duration;

public class View {

  //
  Image menubackground = new Image("/images/menubackground.png");
  Image logo = new Image("images/logo.png");
  Image dancinggroot = new Image("images/dancinggroot.gif");
  Image dirtbackground = new Image("images/dirtbackground.png");

  Image unselectedturnipimg = new Image("/images/unselectedturnip.png");
  Image selectedturnipimg = new Image("images/selectedturnip.png");
  Image unselectedcarrotimg = new Image("images/unselectedcarrot.png");
  Image selectedcarrotimg = new Image("images/selectedcarrot.png");
  Image unselectedtomatoimg = new Image("images/unselectedtomato.png");
  Image selectedtomatoimg = new Image("images/selectedtomato.png");
  Image unselectedpotatoimg = new Image("images/unselectedpotato.png");
  Image selectedpotatoimg = new Image("images/selectedpotato.png");
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

  //Button images
  Image unselectedcancelimg = new Image("images/unselectedcancel.png");
  Image selectedcancelimg = new Image("images/selectedcancel.png");
  Image unselectedbuyimg = new Image("images/unselectedbuy.png");
  Image selectedbuyimg = new Image("images/selectedbuy.png");
  Image unselectedplantimg = new Image("images/unselectedplant.png");
  Image selectedplantimg = new Image("images/selectedplant.png");
  Image unselectedfertilizeimg = new Image("images/unselectedfertilize.png");
  Image selectedfertilizeimg = new Image("images/selectedfertilize.png");
  Image unselectedwaterimg = new Image("images/unselectedwater.png");
  Image selectedwaterimg = new Image("images/selectedwater.png");
  Image unselectedmineimg = new Image("images/unselectedmine.png");
  Image selectedmineimg = new Image("images/selectedmine.png");
  Image unselectedplowimg = new Image("images/unselectedplow.png");
  Image selectedplowimg = new Image("images/selectedplow.png");
  Image unselectedharvestimg = new Image("images/unselectedharvest.png");
  Image selectedharvestimg = new Image("images/selectedharvest.png");
  Image unselectedgenerateimg = new Image("images/unselectedgenerate.png");
  Image selectedgenerateimg = new Image("images/selectedgenerate.png");
  Image unselectedregisterimg = new Image("images/unselectedregister.png");
  Image selectedregisterimg = new Image("images/selectedregister.png");
  Image unselectedleaderboardimg = new Image("images/unselectedleaderboard.png");
  Image selectedleaderboardimg = new Image("images/selectedleaderboard.png");

  //Tile images
  Image unplowedtile = new Image("images/unplowed_empty_tile.png");
  Image plowedtile = new Image("images/plowed_empty_tile.png");
  Image rocktile = new Image("images/rock_tile.png");
  Image witheredfruittile = new Image("images/withered_tree_tile.png");
  Image witheredveggietile = new Image("images/withered_veggie_tile.png");
  Image witheredflowertile = new Image("images/withered_flower_tile.png");
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

  int timerCount;
  String timerString;
  Text time;
  Text coins;

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

    // Background music
    File file = new File("sounds/backgroundmusic.mp3");
    Media audio = new Media(file.toURI().toString());
    MediaPlayer backgroundmusicmp = new MediaPlayer(audio);
    backgroundmusicmp.setVolume(0.5);
    backgroundmusicmp.setOnEndOfMedia(new Runnable() {
      public void run() {
        backgroundmusicmp.seek(Duration.ZERO);
      }
    });
    backgroundmusicmp.play();

    //Timer
    timerCount = 0;
    time = new Text("");
    TextFlow timerBox = new TextFlow(time);
    time.setFill(Color.WHITE);
    time.setFont(Font.font("Arial Black", 30));

    TimerTask displayTime = new TimerTask() {
      public void run() {
        timerString = "TIME " + timerCount;
        time.setText(timerString);
        timerCount++;
      }
    };

    Timer gameTimer = new Timer(true);
    gameTimer.scheduleAtFixedRate(displayTime, 0, 1000);

    //Coins
    coins = new Text(controller.getCoins());
    coins.setFill(Color.WHITE);
    coins.setFont(Font.font("Arial Black", 20));
    TextFlow figureBox = new TextFlow(coins);

    Text coinString = new Text("COINS");
    coinString.setFill(Color.WHITE);
    TextFlow stringBox = new TextFlow(coinString);

    VBox coinsBox = new VBox();
    coinsBox.getChildren().add(figureBox);
    coinsBox.getChildren().add(stringBox);

    //Logo
    ImageView logodisplay = new ImageView(logo);
    logodisplay.setFitWidth(439);
    logodisplay.setPreserveRatio(true);
    grid.getChildren().add(logodisplay);
    StackPane.setMargin(logodisplay, new Insets(0, 0, 230, 0));

    //Name input
    TextField name = new TextField();
    name.setPromptText("Enter Farmer Name");
    name.setMaxWidth(200);
    grid.getChildren().add(name);
    StackPane.setMargin(name, new Insets(50, 0, 0, 0));

    //Gene1rate Button
    ImageView generate = new ImageView(unselectedgenerateimg);
    generate.setOnMouseEntered(e -> generate.setImage(selectedgenerateimg));
    generate.setOnMouseExited(e -> generate.setImage(unselectedgenerateimg));
    generate.setOnMousePressed(e -> {
      window.setScene(ingame);
      String enteredName = name.getText();
      controller.setFarmerName(enteredName);
      farmerstats.setText(controller.getFarmerStats());
    });
    grid.getChildren().add(generate);
    StackPane.setMargin(generate, new Insets(150, 0, 0, 0));

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

    Pane picture = new Pane();
    ImageView farmericon = new ImageView(dancinggroot);
    farmericon.setPreserveRatio(true);
    farmericon.setFitWidth(110);
    picture.getChildren().add(farmericon);

    TextFlow farmerstatsbox = new TextFlow(farmerstats);
    farmerstats.setFont(Font.font("Yoster Island", 15));
    farmerstats.setFill(Color.WHITE);
    farmerstatsbox
        .setStyle("-fx-padding: 0;" + "-fx-border-width: 2;" + "-fx-border-insets: 0;" + "-fx-border-radius: 5;");
    farmerstatsbox.setPrefWidth(440);
    farmerstatsbox.setPrefHeight(148);

    farmerbonuses = new Text(controller.getFarmerBonuses());
    farmerbonuses.setFont(Font.font("Yoster Island", 15));
    farmerbonuses.setFill(Color.WHITE);
    TextFlow farmerbonusesbox = new TextFlow(farmerbonuses);
    farmerbonusesbox
        .setStyle("-fx-padding: 0;" + "-fx-border-width: 2;" + "-fx-border-insets: 0;" + "-fx-border-radius: 5;");
    farmerbonusesbox.setPrefWidth(320);
    farmerbonusesbox.setPrefHeight(148);

    ImageView register = new ImageView(unselectedregisterimg);
    register.setFitWidth(80);
    register.setPreserveRatio(true);
    register.setOnMouseEntered(e -> register.setImage(selectedregisterimg));
    register.setOnMouseExited(e -> register.setImage(unselectedregisterimg));
    register.setOnMousePressed(e -> {
      controller.register();
    });

    ImageView leaderboard = new ImageView(unselectedleaderboardimg);
    leaderboard.setFitWidth(80);
    leaderboard.setPreserveRatio(true);
    leaderboard.setOnMouseEntered(e -> leaderboard.setImage(selectedleaderboardimg));
    leaderboard.setOnMouseExited(e -> leaderboard.setImage(unselectedleaderboardimg));
    leaderboard.setOnMousePressed(e -> {
      Date date = new Date();
      Alert scoreboard = new Alert(AlertType.INFORMATION);
      scoreboard.setTitle("LEADERBOARD");
      scoreboard.setHeaderText("LEADERBOARD as of\n" + date);
      scoreboard.setContentText(controller.readFile());
      scoreboard.setResizable(true);
      scoreboard.showAndWait();
    });

    EXPbar = new ProgressBar();
    EXPbar.setStyle("-fx-accent:rgb(101, 66, 0)");
    EXPbar.setProgress(0);
    EXPbar.setPrefWidth(200);

    /////////////////  MIDDLE LAYOUT (FARMLAND) ////////////////////

    // LAYOUT
    Pane farmland = new Pane();
    farmland.setPrefWidth(575);
    farmland.setPrefHeight(300);

    TilePane farmlayout = new TilePane();
    farmlayout.setPrefColumns(10);
    farmlayout.setHgap(-20);
    farmlayout.setVgap(-20);

    Bloom tilebloom = new Bloom();
    tilebloom.setThreshold(0.4);

    tile = new ImageView[50];
    for (int i = 0; i < 50; i++) {
      int num = i;
      tile[i] = new ImageView(unplowedtile);
      tile[i].setFitWidth(85);
      tile[i].setFitHeight(85);
      tile[num].setOnMouseEntered(e -> tile[num].setEffect(tilebloom));
      tile[num].setOnMouseExited(e -> tile[num].setEffect(null));
      farmlayout.getChildren().add(tile[i]);
    }

    resetTileAction();

    farmland.getChildren().add(farmlayout);

    ///////////////// BOTTOM PART LAYOUT (INVENTORY, TOOLS, INFOBOX)////////////////

    //Inventory
    GridPane invlayout = new GridPane();
    invlayout.setHgap(2);
    invlayout.setVgap(12);
    invlayout.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 0;" + "-fx-border-radius: 5;");

    // Vegetables

    ImageView turnip = new ImageView(unselectedturnipimg);
    turnip.setOnMouseEntered(e -> turnip.setImage(selectedturnipimg));
    turnip.setOnMouseExited(e -> turnip.setImage(unselectedturnipimg));
    invlayout.add(turnip, 0, 0);

    ImageView carrot = new ImageView(unselectedcarrotimg);
    carrot.setOnMouseEntered(e -> carrot.setImage(selectedcarrotimg));
    carrot.setOnMouseExited(e -> carrot.setImage(unselectedcarrotimg));
    invlayout.add(carrot, 1, 0);

    ImageView tomato = new ImageView(unselectedtomatoimg);
    tomato.setOnMouseEntered(e -> tomato.setImage(selectedtomatoimg));
    tomato.setOnMouseExited(e -> tomato.setImage(unselectedtomatoimg));
    invlayout.add(tomato, 2, 0);

    ImageView potato = new ImageView(unselectedpotatoimg);
    potato.setOnMouseEntered(e -> potato.setImage(selectedpotatoimg));
    potato.setOnMouseExited(e -> potato.setImage(unselectedpotatoimg));
    invlayout.add(potato, 3, 0);

    // Flowers
    ImageView rose = new ImageView(unselectedroseimg);
    rose.setOnMouseEntered(e -> rose.setImage(selectedroseimg));
    rose.setOnMouseExited(e -> rose.setImage(unselectedroseimg));
    invlayout.add(rose, 0, 1);

    ImageView tulip = new ImageView(unselectedtulipimg);
    tulip.setOnMouseEntered(e -> tulip.setImage(selectedtulipimg));
    tulip.setOnMouseExited(e -> tulip.setImage(unselectedtulipimg));
    invlayout.add(tulip, 1, 1);

    ImageView stargazer = new ImageView(unselectedstargazerimg);
    stargazer.setOnMouseEntered(e -> stargazer.setImage(selectedstargazerimg));
    stargazer.setOnMouseExited(e -> stargazer.setImage(unselectedstargazerimg));
    invlayout.add(stargazer, 2, 1);

    ImageView sunflower = new ImageView(unselectedsunflowerimg);
    sunflower.setOnMouseEntered(e -> sunflower.setImage(selectedsunflowerimg));
    sunflower.setOnMouseExited(e -> sunflower.setImage(unselectedsunflowerimg));
    invlayout.add(sunflower, 3, 1);

    // Fruits
    ImageView mango = new ImageView(unselectedmangoimg);
    mango.setOnMouseEntered(e -> mango.setImage(selectedmangoimg));
    mango.setOnMouseExited(e -> mango.setImage(unselectedmangoimg));
    invlayout.add(mango, 0, 2);

    ImageView apple = new ImageView(unselectedappleimg);
    apple.setOnMouseEntered(e -> apple.setImage(selectedappleimg));
    apple.setOnMouseExited(e -> apple.setImage(unselectedappleimg));
    invlayout.add(apple, 1, 2);

    ImageView banana = new ImageView(unselectedbananaimg);
    banana.setOnMouseEntered(e -> banana.setImage(selectedbananaimg));
    banana.setOnMouseExited(e -> banana.setImage(unselectedbananaimg));
    invlayout.add(banana, 2, 2);

    ImageView orange = new ImageView(unselectedorangeimg);
    orange.setOnMouseEntered(e -> orange.setImage(selectedorangeimg));
    orange.setOnMouseExited(e -> orange.setImage(unselectedorangeimg));
    invlayout.add(orange, 3, 2);

    //Tools
    GridPane toollayout = new GridPane();
    toollayout.setHgap(2);
    toollayout.setVgap(12);
    toollayout.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 0;" + "-fx-border-radius: 5;");

    ImageView wateringcan = new ImageView(unselectedwateringcanimg);
    wateringcan.setOnMouseEntered(e -> wateringcan.setImage(selectedwateringcanimg));
    wateringcan.setOnMouseExited(e -> wateringcan.setImage(unselectedwateringcanimg));
    wateringcan.setPreserveRatio(true);
    wateringcan.setFitWidth(48);
    toollayout.add(wateringcan, 0, 0);

    ImageView plowtool = new ImageView(unselectedplowtoolimg);
    plowtool.setOnMouseEntered(e -> plowtool.setImage(selectedplowtoolimg));
    plowtool.setOnMouseExited(e -> plowtool.setImage(unselectedplowtoolimg));
    plowtool.setPreserveRatio(true);
    plowtool.setFitWidth(48);
    toollayout.add(plowtool, 0, 1);

    ImageView pickaxe = new ImageView(unselectedpickaxeimg);
    pickaxe.setOnMouseEntered(e -> pickaxe.setImage(selectedpickaxeimg));
    pickaxe.setOnMouseExited(e -> pickaxe.setImage(unselectedpickaxeimg));
    pickaxe.setPreserveRatio(true);
    pickaxe.setFitWidth(48);
    toollayout.add(pickaxe, 0, 2);

    ImageView fertilizer = new ImageView(unselectedfertilizerimg);
    fertilizer.setOnMouseEntered(e -> fertilizer.setImage(selectedfertilizerimg));
    fertilizer.setOnMouseExited(e -> fertilizer.setImage(unselectedfertilizerimg));
    fertilizer.setPreserveRatio(true);
    fertilizer.setFitWidth(48);
    toollayout.add(fertilizer, 1, 0);

    ImageView harvesttool = new ImageView(unselectedharvesttoolimg);
    harvesttool.setOnMouseEntered(e -> harvesttool.setImage(selectedharvesttoolimg));
    harvesttool.setOnMouseExited(e -> harvesttool.setImage(unselectedharvesttoolimg));
    harvesttool.setPreserveRatio(true);
    harvesttool.setFitWidth(48);
    toollayout.add(harvesttool, 1, 1);

    // Stats / Information
    for (int j = 0; j < invlayout.getChildren().size(); j++) {
      int seedPos = j;
      ImageView butt = (ImageView) (invlayout.getChildren().get(j));
      butt.setPreserveRatio(true);
      butt.setFitWidth(48);
      butt.setOnMouseClicked(e -> {
        resetTileAction();
        Text info = new Text(controller.getSeedInfo(seedPos));
        info.setFont(Font.font("Yoster Island", 15));
        info.setFill(Color.WHITE);
        HBox seedInfoBox = new HBox();
        seedInfoBox.setPrefWidth(530);
        seedInfoBox
            .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
        seedInfoBox.setSpacing(10);

        ImageView buyButton = new ImageView(unselectedbuyimg);
        buyButton.setFitWidth(100);
        buyButton.setPreserveRatio(true);
        ImageView plantButton = new ImageView(unselectedplantimg);
        plantButton.setFitWidth(100);
        plantButton.setPreserveRatio(true);
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
                  tileinformation.setText(controller.getTileInfo(tilePos));
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
        cancelButton.setFitWidth(100);
        cancelButton.setPreserveRatio(true);
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
        seedInfo
            .setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
        seedInfo.setPrefWidth(410);

        seedInfoBox.getChildren().add(seedInfo);
        if (maingame.getChildren().size() > 12) {
          Node n = maingame.getChildren().get(12);
          maingame.getChildren().remove(n);
          maingame.getChildren().add(seedInfoBox);
          AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
          AnchorPane.setRightAnchor(seedInfoBox, 140.0);
        } else {
          maingame.getChildren().add(seedInfoBox);
          AnchorPane.setBottomAnchor(seedInfoBox, 13.0);
          AnchorPane.setRightAnchor(seedInfoBox, 140.0);
        }

      });

    }

    // FertilizeBag Mouse Click Options
    fertilizer.setOnMouseClicked(e -> {
      resetTileAction();
      Text info = new Text(controller.getFertilizerInfo());
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefHeight(180);
      seedInfoBox.setPrefWidth(530);
      seedInfoBox
          .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfoBox.setSpacing(12);

      ImageView fertilizeButton = new ImageView(unselectedfertilizeimg);
      fertilizeButton.setFitWidth(100);
      fertilizeButton.setPreserveRatio(true);
      fertilizeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          fertilizeButton.setImage(selectedfertilizeimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));

            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.fertilize(tilePos);
                info.setText(controller.getFertilizerInfo());
                tileinformation.setText(controller.getTileInfo(tilePos));
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView buyButton = new ImageView(unselectedbuyimg);
      buyButton.setFitWidth(100);
      buyButton.setPreserveRatio(true);
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
      cancelButton.setFitWidth(100);
      cancelButton.setPreserveRatio(true);
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

      info.setFont(Font.font("Yoster Island", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfo.setPrefWidth(330);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 12) {
        Node n = maingame.getChildren().get(12);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      }

    });

    // Plowtool Mouse Click Options
    plowtool.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefHeight(180);
      seedInfoBox.setPrefWidth(530);
      seedInfoBox
          .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfoBox.setSpacing(12);

      ImageView unplowedButton = new ImageView(unselectedplowimg);
      unplowedButton.setFitWidth(100);
      unplowedButton.setPreserveRatio(true);
      unplowedButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          unplowedButton.setImage(selectedplowimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.plowTile(tilePos);
                tileinformation.setText(controller.getTileInfo(tilePos));
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setFitWidth(100);
      cancelButton.setPreserveRatio(true);
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
      info.setFont(Font.font("Yoster Island", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfo.setPrefWidth(375);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 12) {
        Node n = maingame.getChildren().get(12);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      }

    });

    // Watering Can Mouse Click Options
    wateringcan.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefHeight(180);
      seedInfoBox.setPrefWidth(530);
      seedInfoBox
          .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfoBox.setSpacing(12);

      ImageView waterButton = new ImageView(unselectedwaterimg);
      waterButton.setFitWidth(100);
      waterButton.setPreserveRatio(true);
      waterButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        public void handle(MouseEvent e) {
          waterButton.setImage(selectedwaterimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.water(tilePos);
                tileinformation.setText(controller.getTileInfo(tilePos));
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setFitWidth(100);
      cancelButton.setPreserveRatio(true);
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
      info.setFont(Font.font("Yoster Island", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 12) {
        Node n = maingame.getChildren().get(12);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      }

    });

    // Harvest tool mouse click Options
    harvesttool.setOnMouseClicked(e -> {
      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefHeight(180);
      seedInfoBox.setPrefWidth(530);
      seedInfoBox
          .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfoBox.setSpacing(12);

      ImageView harvestButton = new ImageView(unselectedharvestimg);
      harvestButton.setFitWidth(100);
      harvestButton.setPreserveRatio(true);
      harvestButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          harvestButton.setImage(selectedharvestimg);
          for (int i = 0; i < 50; i++) {
            int tilePos = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.harvest(tilePos);
                tileinformation.setText(controller.getTileInfo(tilePos));
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setFitWidth(100);
      cancelButton.setPreserveRatio(true);
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
      info.setFont(Font.font("Yoster Island", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);
      if (maingame.getChildren().size() > 12) {
        Node n = maingame.getChildren().get(12);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      }

    });

    // Pickaxe Mouse Click Options
    pickaxe.setOnMouseClicked(e -> {

      resetTileAction();
      HBox seedInfoBox = new HBox();
      seedInfoBox.setPrefHeight(180);
      seedInfoBox.setPrefWidth(530);
      seedInfoBox
          .setStyle("-fx-padding: 10;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfoBox.setSpacing(12);

      ImageView pickaxeButton = new ImageView(unselectedmineimg);
      pickaxeButton.setFitWidth(100);
      pickaxeButton.setPreserveRatio(true);
      pickaxeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent e) {
          pickaxeButton.setImage(selectedmineimg);
          for (int i = 0; i < 50; i++) {
            int num = i;
            ImageView tile = (ImageView) (farmlayout.getChildren().get(i));
            tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
              public void handle(MouseEvent e) {
                controller.pickRock(num);
                tileinformation.setText(controller.getTileInfo(num));
                updateFarmerStats();
              }
            });
          }
        }
      });

      ImageView cancelButton = new ImageView(unselectedcancelimg);
      cancelButton.setFitWidth(100);
      cancelButton.setPreserveRatio(true);
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
      info.setFont(Font.font("Yoster Island", 15));
      info.setFill(Color.WHITE);
      TextFlow seedInfo = new TextFlow(info);
      seedInfo.setStyle("-fx-padding: 5;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;");
      seedInfo.setPrefWidth(380);

      seedInfoBox.getChildren().add(seedInfo);

      if (maingame.getChildren().size() > 12) {
        Node n = maingame.getChildren().get(12);
        maingame.getChildren().remove(n);
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      } else {
        maingame.getChildren().add(seedInfoBox);
        AnchorPane.setBottomAnchor(seedInfoBox, 0.0);
        AnchorPane.setRightAnchor(seedInfoBox, 140.0);
      }

    });

    tileinformation = new Text("");
    tileinformation.setFont(Font.font("Yoster Island", 15));
    tileinformation.setFill(Color.WHITE);
    TextFlow tileinfo = new TextFlow(tileinformation);
    tileinfo.setPrefWidth(275);
    tileinfo.setPrefHeight(220);
    //tileinfo.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
    //    + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: white;");
    tileinfo.setPadding(new Insets(10));

    //---------------------- DIMENSIONS IN GAME------------------------------//

    maingame.getChildren().addAll(farmland, invlayout, toollayout, farmerstatsbox, farmerbonusesbox, tileinfo, picture,
        EXPbar, register, timerBox, leaderboard, coinsBox);

    AnchorPane.setBottomAnchor(invlayout, 17.0);
    AnchorPane.setLeftAnchor(invlayout, 261.0);

    AnchorPane.setBottomAnchor(toollayout, 17.0);
    AnchorPane.setLeftAnchor(toollayout, 581.0);

    AnchorPane.setTopAnchor(farmland, 210.0);
    AnchorPane.setLeftAnchor(farmland, 550.0);

    AnchorPane.setTopAnchor(farmerstatsbox, 40.0);
    AnchorPane.setLeftAnchor(farmerstatsbox, 405.0);

    AnchorPane.setTopAnchor(farmerbonusesbox, 40.0);
    AnchorPane.setRightAnchor(farmerbonusesbox, 235.0);

    AnchorPane.setTopAnchor(tileinfo, 213.0);
    AnchorPane.setLeftAnchor(tileinfo, 200.0);

    AnchorPane.setTopAnchor(EXPbar, 86.0);
    AnchorPane.setLeftAnchor(EXPbar, 587.0);

    AnchorPane.setTopAnchor(register, 35.0);
    AnchorPane.setRightAnchor(register, 185.0);

    AnchorPane.setTopAnchor(picture, 45.0);
    AnchorPane.setLeftAnchor(picture, 255.0);

    AnchorPane.setBottomAnchor(timerBox, 264.0);
    AnchorPane.setLeftAnchor(timerBox, 272.0);

    AnchorPane.setTopAnchor(leaderboard, 65.0);
    AnchorPane.setRightAnchor(leaderboard, 185.0);

    AnchorPane.setTopAnchor(coinsBox, 120.0);
    AnchorPane.setLeftAnchor(coinsBox, 713.0);

    // Sets scene
    ingame = new Scene(overlap, 1400, 800);
    window.setScene(menu);
    window.setResizable(false);

    window.show();
    window.setOnCloseRequest(new EventHandler<WindowEvent>() {

      public void handle(WindowEvent we) {
        if (window.getScene() == ingame) {
          Alert alert = new Alert(AlertType.CONFIRMATION);
          alert.setTitle("Save stats to leaderboard");
          alert.setHeaderText("Do you want to save your stats to leaderboard?");
          Optional<ButtonType> result = alert.showAndWait();
          if (result.get() == ButtonType.OK) {
            controller.saveFile();
          } else {

          }
        }
      }

    });

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
    EXPbar.setProgress((float) controller.getFarmerEXP() / 125);
  }

  public void updateFarmerStats() {
    farmerstats.setText(controller.getFarmerStats());
    coins.setText(controller.getCoins());
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

  public void displayAlertBox(double credits, int productsProduced, double total, double harvestCost) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Successful Harvest");

    String display1 = "";
    display1 = String.format("You have made a profit of %.2f coins!", credits);
    alert.setHeaderText(display1);

    String display2 = "";
    display2 = String.format(
        "The harvest produced %d products. Each product sold for %.2f coins. The harvest costed %.2f coins.",
        productsProduced, total, harvestCost);
    alert.setContentText(display2);
    alert.showAndWait();
  }

  public void displayAlertBox(String error) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("You cannot do that!");

    if (error == "cannotBuy") {
      alert.setHeaderText("Not enough money!");
      alert.setContentText("");
    }

    else if (error == "cannotFertilize") {
      alert.setHeaderText("Cannot fertilize!");
      alert.setContentText("Possible reasons: \n 1. No fertilizer\n 2. Nothing is planted");
    }

    else if (error == "cannotWater") {
      alert.setHeaderText("Cannot water!");
      alert.setContentText(
          "Possible reasons: \n 1. Already reached max water count\n 2. Cannot fertilize if already planted");
    }

    else if (error == "cannotPlow") {
      alert.setHeaderText("Cannot plow!");
      alert.setContentText(
          "Possible reasons: \n 1. Already plowed\n 2. Contains rock\n 3. Already Occupied\n 4. Occupied by tree root\n 5. Not a withered plant");
    }

    else if (error == "cannotHarvest") {
      alert.setHeaderText("Cannot harvest!");
      alert.setContentText(
          "Possible reasons: \n 1. Not yet ready for harvesting\n 2. Nothing is planted\n 3. Cannot afford harvest cost");
    }

    else if (error == "cannotPlant") {
      alert.setHeaderText("Cannot plant!");
      alert.setContentText(
          "Possible reasons: \n 1. Tile has rock\n 2. Tile not plowed\n 3. No seed in bag\n 4. Already occupied\n 5. Surrounding tiles unavailable for tree");
    }

    else if (error == "cannotMine") {
      alert.setHeaderText("Cannot mine!");
      alert.setContentText("Possible reasons: \n 1. Tile has no rock\n 2. Tile is not a rock");
    }

    else if (error == "cannotRegister") {
      alert.setHeaderText("Cannot reigster!");
      alert.setContentText(
          "Possible reasons: \n 1. Not enough money\n 2. Level minimum not reached\n 3. Already max rank");
    }

    alert.showAndWait();

  }

}
