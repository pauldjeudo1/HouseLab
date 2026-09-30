package com.mycompany.lab06task2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


/**
 * JavaFX App
 * GitHub link: https://github.com/pauldjeudo1/HouseLab.git
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        
        Rectangle grass = new Rectangle();
        grass.setFill(Color.DARKGREEN);
        
        Rectangle houseBase = new Rectangle();
        houseBase.setFill(Color.BEIGE);
        
        Rectangle walls = new Rectangle();
        walls.setStroke(Color.BLACK);
        
        Rectangle chimney = new Rectangle();
        
        Rectangle window1 = new Rectangle();
        window1.setFill(Color.LIGHTBLUE);
        
        Rectangle window2 = new Rectangle();
        window2.setFill(Color.LIGHTBLUE);
        
        Line windowLine1 = new Line();
        Line windowLine2 = new Line();
        Line windowLine3 = new Line();
        Line windowLine4 = new Line();
        
        Rectangle door = new Rectangle();
        
        Polygon roof = new Polygon();
        roof.setFill(Color.RED);
        
        Circle sun = new Circle();
        sun.setFill(Color.YELLOW);
        
        Box cube = new Box(150, 150, 150);
        cube.getTransforms().addAll(
            new Rotate(30, Rotate.X_AXIS), new Rotate(45, Rotate.Y_AXIS)
        );
        
        root.getChildren().addAll(cube);
        var scene = new Scene(root, 800, 600);
        stage.setTitle("House with Window Panes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}