package gameApp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Button but1;
    @FXML private Button but2;
    @FXML private Button but3;
    @FXML private Button but4;
    @FXML private Button but5;
    @FXML private Button but6;
    @FXML private Button but7;
    @FXML private Button but8;
    @FXML private Button but9;

    public ArrayList<String> asap = new ArrayList<>();
    public String resultX;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    protected void but1Click(ActionEvent event){
        but1.setText("X");
        but1.setDisable(true);
        if( (but1.getText().equals(but2.getText()) && but1.getText().equals(but3.getText()))
                || (but1.getText().equals(but4.getText()) && but1.getText().equals(but7.getText()))
                || (but1.getText().equals(but5.getText()) && but1.getText().equals(but9.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but2Click(ActionEvent event){
        but2.setText("X");
        but2.setDisable(true);
        if( (but2.getText().equals(but1.getText()) && but2.getText().equals(but3.getText()))
                || (but2.getText().equals(but5.getText()) && but2.getText().equals(but8.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but3Click(ActionEvent event){
        but3.setText("X");
        but3.setDisable(true);
        if( (but3.getText().equals(but2.getText()) && but3.getText().equals(but1.getText()))
                || (but3.getText().equals(but6.getText()) && but3.getText().equals(but9.getText()))
                || (but3.getText().equals(but5.getText()) && but3.getText().equals(but7.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but4Click(ActionEvent event){
        but4.setText("X");
        but4.setDisable(true);
        if( (but4.getText().equals(but1.getText()) && but4.getText().equals(but7.getText()))
                || (but4.getText().equals(but5.getText()) && but4.getText().equals(but6.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but5Click(ActionEvent event){
        but5.setText("X");
        but5.setDisable(true);
        if( (but5.getText().equals(but1.getText()) && but5.getText().equals(but9.getText()))
                || (but5.getText().equals(but3.getText()) && but5.getText().equals(but7.getText()))
                || (but5.getText().equals(but4.getText()) && but5.getText().equals(but6.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but6Click(ActionEvent event){
        but6.setText("X");
        but6.setDisable(true);
        if( (but6.getText().equals(but3.getText()) && but6.getText().equals(but9.getText()))
                || (but6.getText().equals(but4.getText()) && but6.getText().equals(but5.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but7Click(ActionEvent event){
        but7.setText("X");
        but7.setDisable(true);
        if( (but7.getText().equals(but1.getText()) && but7.getText().equals(but4.getText()))
                || (but7.getText().equals(but8.getText()) && but7.getText().equals(but9.getText()))
                || (but7.getText().equals(but5.getText()) && but7.getText().equals(but3.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but8Click(ActionEvent event){
        but8.setText("X");
        but8.setDisable(true);
        if( (but8.getText().equals(but9.getText()) && but8.getText().equals(but7.getText()))
                || (but8.getText().equals(but5.getText()) && but8.getText().equals(but2.getText())))
            System.out.println("YOU WIN!!!");
    }
    @FXML
    protected void but9Click(ActionEvent event){
        but9.setText("X");
        but9.setDisable(true);
        if( (but9.getText().equals(but1.getText()) && but9.getText().equals(but5.getText()))
                || (but9.getText().equals(but8.getText()) && but9.getText().equals(but7.getText()))
                || (but9.getText().equals(but6.getText()) && but9.getText().equals(but3.getText())))
            System.out.println("YOU WIN!!!");
    }
}
