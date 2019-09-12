package com.github.jcarrillo033.main;

/**
 * @author Joseph Carrillo
 * @since 9/12/2019
 **/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class CarSearch extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Car Search");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(10);
        gp.setVgap(10);

        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(20);
        gp.add(hb, 19, 17);

        HBox hb1 = new HBox();
        hb1.setSpacing(10);
        gp.add(hb1, 19, 13);

        Button addBtn = new Button("Add");
        addBtn.setMinSize(60, 30);
        hb.getChildren().add(addBtn);

        Button removeBtn = new Button("Remove");
        removeBtn.setMinSize(60, 30);
        hb.getChildren().add(removeBtn);

        Button clearBtn = new Button("Clear");
        clearBtn.setMinSize(60, 30);
        hb.getChildren().add(clearBtn);

        Button searchBtn = new Button("Search");
        searchBtn.setMinSize(60, 30);
        hb.getChildren().add(searchBtn);

        TextArea listView = new TextArea();
        listView.setMaxSize(400, 200);
        listView.setMinSize(400, 200);
        listView.setEditable(false);
        gp.add(listView, 19, 10);

        TextField emailBar = new TextField("Email: ");
        emailBar.setMinSize(300, 25);
        hb1.getChildren().add(emailBar);

        CheckBox emailCheck = new CheckBox("Send Email");
        hb1.getChildren().add(emailCheck);

        TextField searchBar = new TextField();
        searchBar.setMinSize(400, 25);
        gp.add(searchBar, 19, 15);

        primaryStage.setScene(new Scene(gp, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
