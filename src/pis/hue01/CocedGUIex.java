package pis.hue01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.geometry.Insets;

public class CocedGUIex extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox, comboBox2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("PISHue01 Kodierer");
        GridPane grid = new GridPane();


        grid.setPadding(new Insets(25,25,25,25));
        grid.setVgap(5);
        grid.setHgap(5);

        Label ueberschrift = new Label("Kodierer (Hausübung 1 PIS)");
        grid.add(ueberschrift,2,0);

        Label WortLabel = new Label("Codewort:");
        grid.add(WortLabel, 1,1);

        TextField Wort = new TextField("");
        grid.add(Wort, 1,2);

        Label SL1Label = new Label("Schlüsselwort 1:");
        grid.add(SL1Label, 2,1);

        TextField SL1 = new TextField("");
        grid.add(SL1, 2,2);

        Label SL2Label = new Label("Schlüsselwort 1:");
        grid.add(SL1Label, 2,1);

        TextField SL2 = new TextField("");
        grid.add(SL2, 2,2);

        comboBox = new ComboBox<>();

        comboBox.getItems().addAll("Würfel", "Caesar");
        comboBox.setPromptText("Methode");
        grid.add(comboBox, 3,1);

        comboBox2 = new ComboBox<>();

        comboBox2.getItems().addAll("Verschlüssen", "Entschlüsseln");
        comboBox2.setPromptText("Vorgehen");
        grid.add(comboBox2, 3,2);

        button = new Button("Start");
        grid.add(button, 0,4);
        scene = new Scene(grid, 600,600);


        button.setOnAction(e-> System.out.println(comboBox.getValue()));

        window.show();
        window.setScene(scene);
    }

}
