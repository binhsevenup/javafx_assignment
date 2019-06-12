package sample.stages;

import javafx.scene.control.*;
import sample.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import model.AccountModel;

public class RegisterStage extends Stage {

    private static final int REG_STAGE_WIDTH = 400;
    private static final int REG_STAGE_HEIGHT = 500;
    private VBox vBox;
    private HBox titleBox;
    private GridPane gridPane;
    private HBox btnBox;

    private Label lblTitle;
    private Label lblAccount;
    private Label lblPassword;
    private Label lblPhone;
    private Label lblEmail;
    private Label lblFullname;
    private Label lblConPassword;
    private TextField txtAccount;
    private PasswordField pwdPassword;
    private PasswordField pwdConPassword;
    private Button btnLogin;
    private Button btnReset;

    private Scene scene;
    private Stage stage;
    private Main main;
    private TextField txtPhone;
    private TextField txtEmail;
    private TextField txtFullname;


    public RegisterStage(Main mainApplication) {
        this.main = mainApplication;
        this.initComponent();
        this.scene = new Scene(this.vBox, REG_STAGE_WIDTH, REG_STAGE_HEIGHT);
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
        this.lblAccount = new Label("Account");
        this.lblPassword = new Label("Password");
        this.lblConPassword = new Label("Confirm Password");
        this.lblFullname = new Label("Fullname");
        this.lblEmail = new Label("Email");
        this.lblPhone = new Label("Phone Number");


        this.txtAccount = new TextField();
        this.txtFullname = new TextField();
        this.txtEmail = new TextField();
        this.txtPhone = new TextField();
        this.pwdPassword = new PasswordField();
        this.pwdConPassword = new PasswordField();

        this.btnLogin = new Button("Login");
        this.btnReset = new Button("Reset");

        this.btnBox = new HBox();
        this.btnBox.setPadding(new Insets(10));
        this.btnBox.setSpacing(10);
        this.btnBox.setAlignment(Pos.TOP_LEFT);
        this.btnBox.getChildren().addAll(btnLogin, btnReset);
        this.gridPane.add(this.lblAccount, 0, 0);
        this.gridPane.add(this.lblPassword, 0, 1);
        this.gridPane.add(this.lblConPassword, 0, 2);
        this.gridPane.add(this.lblFullname, 0, 3);
        this.gridPane.add(this.lblEmail, 0, 4);
        this.gridPane.add(this.lblPhone, 0, 5);

        this.gridPane.add(this.txtAccount, 1, 0);
        this.gridPane.add(this.pwdPassword, 1, 1);
        this.gridPane.add(this.pwdConPassword, 1, 2);
        this.gridPane.add(this.txtFullname, 1, 3);
        this.gridPane.add(this.txtEmail, 1, 4);
        this.gridPane.add(this.txtPhone, 1, 5);

        this.gridPane.add(this.btnBox, 1, 6);

        this.vBox = new VBox();
        this.vBox.setPadding(new Insets(10));
        this.vBox.setSpacing(10);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.getChildren().addAll(this.titleBox, this.gridPane);
    }
}
