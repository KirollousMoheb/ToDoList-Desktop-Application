package sample;
import sample.Data.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ToDo List");
        primaryStage.setScene(new Scene(root, 900, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() {
        try {
            TodoData.getInstance().store();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() {
        try {
            TodoData.getInstance().load();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
