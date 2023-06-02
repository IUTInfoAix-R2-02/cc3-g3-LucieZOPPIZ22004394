package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private HBox scene;

    @FXML
    private GridPane gridPane;

    TextField comp1= new TextField();
    TextField comp2= new TextField();
    TextField comp3= new TextField();
    TextField comp4= new TextField();
    TextField comp5= new TextField();
    TextField comp6= new TextField();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void addPoint(){
        comp1.setOnAction(event ->
        {
            int data1 = Integer.parseInt(comp1.getText());
        });

        comp2.setOnAction(event ->
        {
            int data2 = Integer.parseInt(comp2.getText());
        });

        comp3.setOnAction(event ->
        {
            int data3 = Integer.parseInt(comp3.getText());
        });

        comp4.setOnAction(event ->
        {
            int data4 = Integer.parseInt(comp4.getText());
        });

        comp5.setOnAction(event ->
        {
            int data5 = Integer.parseInt(comp5.getText());
        });

        comp6.setOnAction(event ->
        {
            int data6 = Integer.parseInt(comp6.getText());
        });
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }



    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
}
