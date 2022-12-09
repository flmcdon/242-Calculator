package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml")); //uses fxml file for style
        primaryStage.setTitle("Calculator"); // set calculator as title
        primaryStage.setScene(new Scene(root)); // root scene
        primaryStage.show();//show stage
    }


    public static void main(String[] args) {
        launch(args);
    } //launch
}