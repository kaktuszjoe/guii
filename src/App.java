//Jakabos Ábel

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        VBox vb1 = new VBox();
        HBox hb2 = new HBox();
        
        HBox hb1 = new HBox();
       
        
        
        TextField asiField = new TextField();
        hb2.getChildren().addAll(asiField);
        
        
        Label label1 = new Label("add meg a kocka lapátlojat");
        Label info = new Label("Jakabos Ábel, SZ/i/n, 2023.04.04");
        Button button = new Button("számít");
        vb1.getChildren().add(info);
        vb1.getChildren().add(label1);
        vb1.getChildren().add(asiField);
        
        hb1.getChildren().add(button);
        
        vb1.getChildren().add(hb1);

        button.setOnAction(e ->{
            Double d = Double.valueOf(asiField.getText());
            Double res = (d*d*d) / 2.82842712475;
            String str = Double.toString(res);
            Label kiir = new Label(str);
            hb1.getChildren().add(kiir);
            
        });

        
        
        
        Scene scene = new Scene(vb1,400,300);
        stage.setScene(scene);
        stage.show();
        
        
    }
}
