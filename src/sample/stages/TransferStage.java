package sample.stages;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Main;

public class TransferStage extends Stage {

    private static final int TRANS_STAGE_WIDTH = 400;
    private static final int TRANS_STAGE_HEIGHT = 200;
    private VBox vBox;
    private HBox titleBox;
    private GridPane gridPane;
    private HBox btnBox;

    private Label lblTitle;
    private Label lblMessage;
    private Label lblSenderId;
    private Label lblRecieveId;
    private Label lblAmount;
    private TextField txtMessage;
    private TextField txtSenderId;
    private TextField txtRecieveId;
    private TextField txtAmount;
    private Button btnLogin;
    private Button btnReset;

    private Scene scene;
    private Stage stage;
    private Main main;


    public TransferStage(Main mainApplication) {
        this.main = mainApplication;
        this.initComponent();
        this.scene = new Scene(this.vBox, TRANS_STAGE_WIDTH, TRANS_STAGE_HEIGHT);
        this.stage = this;
        this.stage.setScene(this.scene);
    }

    public void initComponent() {
        this.titleBox = new HBox();
        this.titleBox.setAlignment(Pos.TOP_LEFT);
        this.titleBox.setSpacing(10);
        this.lblTitle = new Label("Little Port Bank");
        this.lblTitle.setFont(Font.font(17));
        this.lblTitle.setTextFill(Color.web("#800000"));
        this.titleBox.getChildren().add(lblTitle);

        this.gridPane = new GridPane();
        this.gridPane.setPadding(new Insets(10));
        this.gridPane.setVgap(10);
        this.gridPane.setHgap(10);
        this.lblSenderId = new Label("SenderID");
        this.lblRecieveId = new Label("RecieveID");
        this.lblAmount = new Label("Amount");
        this.lblMessage = new Label("Message");
        this.txtSenderId = new TextField();
        this.txtRecieveId = new TextField();
        this.txtAmount = new TextField();
        this.txtMessage = new TextField();
        this.btnLogin = new Button("Submit");
        this.btnReset = new Button("Reset");

        this.btnBox = new HBox();
        this.btnBox.setPadding(new Insets(10));
        this.btnBox.setSpacing(10);
        this.btnBox.setAlignment(Pos.TOP_LEFT);
        this.btnBox.getChildren().addAll(btnLogin, btnReset);
        this.gridPane.add(this.lblSenderId, 0, 0);
        this.gridPane.add(this.lblRecieveId, 0, 1);
        this.gridPane.add(this.lblAmount, 0, 2);
        this.gridPane.add(this.lblMessage, 0, 3);
        this.gridPane.add(this.txtSenderId, 1, 0);
        this.gridPane.add(this.txtRecieveId, 1, 1);
        this.gridPane.add(this.txtAmount, 1, 2);
        this.gridPane.add(this.txtMessage, 1, 3);
        this.gridPane.add(this.btnBox, 1, 4);

        this.vBox = new VBox();
        this.vBox.setPadding(new Insets(10));
        this.vBox.setSpacing(10);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.getChildren().addAll(this.titleBox, this.gridPane);
    }

}