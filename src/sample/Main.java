package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.stages.*;

public class Main extends Application implements EventHandler<ActionEvent> {
    private VBox vBox;
    private HBox titleBox;
    private HBox bodyBox;
    private VBox leftBox;
    private VBox rightBox;

    private LoginStage loginStage;
    private RegisterStage regStage;
    private TransferStage transferStage;
    private WithdrawStage wdStage;
    private DepositeStage depStage;


    private Label lblTitle;
    private Label lblWelcome;
    private Button lblLogin;
    private Button lblResgiter;
    private Button lblWithdraw;
    private Button lblDeposit;
    private Button lblTransection;

    private Scene scene;
    private Stage mainStage;
    private Main mainApp;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.mainApp = this;
        this.mainStage = primaryStage;
        initComponent();
    }

    private void initComponent() {
        this.vBox = new VBox();
        // header
        this.titleBox = new HBox();
        this.lblTitle = new Label("Port & Hero Bank");
        this.lblTitle.setTextFill(Color.web("#800000"));
        this.lblTitle.setFont(Font.font(30));
        this.titleBox.setAlignment(Pos.TOP_LEFT);
        this.titleBox.getChildren().addAll(lblTitle);
        this.titleBox.setSpacing(150);

        this.rightBox = new VBox();
        this.lblWelcome = new Label("Welcome to Port & Hero Bank");
        this.rightBox.getChildren().add(lblWelcome);
        this.rightBox.setAlignment(Pos.CENTER_RIGHT);
        this.rightBox.setSpacing(10);
        this.rightBox.setPadding(new Insets(10));

        this.bodyBox = new HBox();
        this.leftBox = new VBox();
        this.lblLogin = new Button("Login");
        this.lblResgiter = new Button("Register");
        this.lblWithdraw = new Button("Withdraw");
        this.lblDeposit = new Button("Deposit");
        this.lblTransection = new Button("Tranfer");
        this.leftBox.getChildren().addAll(lblLogin, lblResgiter, lblWithdraw, lblDeposit, lblTransection);
        this.leftBox.setAlignment(Pos.CENTER_LEFT);
        this.leftBox.setSpacing(10);
        this.leftBox.setPadding(new Insets(10));

        this.bodyBox.getChildren().addAll(leftBox, rightBox);
        this.bodyBox.setSpacing(10);
        this.bodyBox.setPadding(new Insets(10));

        this.vBox.getChildren().addAll(titleBox, bodyBox);

        this.scene = new Scene(this.vBox, 600, 400);
        this.mainStage.setScene(this.scene);
        this.mainStage.show();

        this.loginStage = new LoginStage(mainApp);
        this.lblLogin.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                loginStage.showAndWait();

            }
        });
        this.regStage = new RegisterStage(mainApp);
        this.lblResgiter.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                regStage.show();

            }
        });

        this.lblWithdraw.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });
        this.lblDeposit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });
        this.transferStage = new TransferStage(mainApp);
        this.lblTransection.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                transferStage.show();

            }
        });
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent event) {

    }


    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public HBox getTitleBox() {
        return titleBox;
    }

    public void setTitleBox(HBox titleBox) {
        this.titleBox = titleBox;
    }

    public HBox getBodyBox() {
        return bodyBox;
    }

    public void setBodyBox(HBox bodyBox) {
        this.bodyBox = bodyBox;
    }

    public VBox getLeftBox() {
        return leftBox;
    }

    public void setLeftBox(VBox leftBox) {
        this.leftBox = leftBox;
    }

    public VBox getRightBox() {
        return rightBox;
    }

    public void setRightBox(VBox rightBox) {
        this.rightBox = rightBox;
    }

    public Label getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(Label lblTitle) {
        this.lblTitle = lblTitle;
    }

    public Label getLblWelcome() {
        return lblWelcome;
    }

    public void setLblWelcome(Label lblWelcome) {
        this.lblWelcome = lblWelcome;
    }


    public Button getLblLogin() {
        return lblLogin;
    }

    public void setLblLogin(Button lblLogin) {
        this.lblLogin = lblLogin;
    }

    public Button getLblResgiter() {
        return lblResgiter;
    }

    public void setLblResgiter(Button lblResgiter) {
        this.lblResgiter = lblResgiter;
    }

    public Button getLblWithdraw() {
        return lblWithdraw;
    }

    public void setLblWithdraw(Button lblWithdraw) {
        this.lblWithdraw = lblWithdraw;
    }

    public Button getLblDeposit() {
        return lblDeposit;
    }

    public void setLblDeposit(Button lblDeposit) {
        this.lblDeposit = lblDeposit;
    }

    public Button getLblTransection() {
        return lblTransection;
    }

    public void setLblTransection(Button lblTransection) {
        this.lblTransection = lblTransection;
    }

    public Main getMainApp() {
        return mainApp;
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

}
