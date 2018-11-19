package pis.hue01;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;




public class CodecGUI extends Application  {

    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Kodierer (PISHue01)");

        button = new Button();
        button.setText("Klick hier");
        button.setOnAction(e -> CodecGUI.ABC());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

     public static void ABC () {
        System.out.println("A");
    }

}

