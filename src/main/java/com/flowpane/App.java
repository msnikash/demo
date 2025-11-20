package com.flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    // To add Spacing after every element
    private Region createSpacer(FlowPane parentPane) {
        Region spacer = new Region();
        spacer.prefWidthProperty().bind(parentPane.widthProperty());
        return spacer;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("FlowPane Demo - Seminar");

        // Buttons
        Button btn1 = new Button("Btn 1");
        Button btn2 = new Button("Btn 2");
        Button btn3 = new Button("Btn 3");
        Button btn4 = new Button("Btn 4");
        Button btn5 = new Button("Submit");

        // Label
        Label label = new Label("JavaFX seminar - FlowPane\n\n");

        // TextField
        TextField textField = new TextField("Type here");

        // CheckBox
        CheckBox check = new CheckBox("Check Me");

        // Rectangle shape (great for visuals)
        Rectangle rect = new Rectangle(90, 40, Color.SKYBLUE);

        // Another Rectangle
        Rectangle rect2 = new Rectangle(40, 40, Color.ORANGE);

        // ----------------------------------------------------------------

        FlowPane flowPane = new FlowPane();

        // Inserting a Spacer Region
        Region spacer = new Region();
        spacer.prefWidthProperty().bind(flowPane.widthProperty());

        // flowPane.setHgap(20); // Horizontal gap
        // flowPane.setVgap(15); // Vertical gap

        // flowPane.setPadding(new Insets(20)); // Outer spacing

        // flowPane.setOrientation(Orientation.VERTICAL); // Switch orientation

        // flowPane.setPrefWrapLength(200); // Wrap after this width

        // flowPane.setAlignment(Pos.CENTER); // Child alignment

        // Label
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(createSpacer(flowPane));

        // Buttons
        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4);
        flowPane.getChildren().add(createSpacer(flowPane));

        // TextField
        /*
         * flowPane.getChildren().add(textField);
         * flowPane.getChildren().add(createSpacer(flowPane));
         * flowPane.getChildren().addAll(btn5);
         * flowPane.getChildren().add(createSpacer(flowPane));
         */

        // CheckBox
        /*
         * flowPane.getChildren().add(check);
         * flowPane.getChildren().add(createSpacer(flowPane));
         */

        // Shapes (eg. UI elements)
        /*
         * flowPane.getChildren().add(rect);
         * flowPane.getChildren().add(createSpacer(flowPane));
         */

        // flowPane.getChildren().add(rect2);

        Scene scene = new Scene(flowPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
