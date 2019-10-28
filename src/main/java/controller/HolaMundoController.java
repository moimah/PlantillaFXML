package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.layout.VBox;
import model.HolaMundoModel;

public class HolaMundoController implements Initializable {
	
	HolaMundoModel model = new HolaMundoModel();
	
	@FXML
	private VBox viewHolaMundo;
	@FXML
	private TextField txt_entrada;
	@FXML
	private Button btn_saludar;
	@FXML
	private Label lbl_saludo;
	
	
	public HolaMundoController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HolaMundoView.fxml"));
		loader.setController(this);
		loader.load();
		
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//Aquí haremos los bindeos necesarios		
		model.txt_entradaProperty().bind(txt_entrada.textProperty());
		
		
		//Listeners propios
		btn_saludar.setOnAction(e -> onClickSaludarActionEvent(e));	
	
		
	}
	
	private void onClickSaludarActionEvent(ActionEvent e) {
		
		lbl_saludo.setText("Hola ".concat(model.getTxt_entrada().concat("!")));
		
	}


	//Devuelve la vista
	public VBox getViewHolaMundo() {		
		return viewHolaMundo;		
	}
	
	
	
	
}
