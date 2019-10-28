package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HolaMundoModel {
	
	private StringProperty txt_entrada = new SimpleStringProperty();
	private StringProperty lbl_salida = new SimpleStringProperty();
	
//	//Si fuese necesario constructor con operaciones de properties
//	public HolaMundoModel() {
//	//Aqui operaciones de properties
//	}
	
	//JavaFX Getters & Setters
	
	
	public final StringProperty txt_entradaProperty() {
		return this.txt_entrada;
	}
	
	public final String getTxt_entrada() {
		return this.txt_entradaProperty().get();
	}
	
	public final void setTxt_entrada(final String txt_entrada) {
		this.txt_entradaProperty().set(txt_entrada);
	}
	
	public final StringProperty lbl_salidaProperty() {
		return this.lbl_salida;
	}
	
	public final String getLbl_salida() {
		return this.lbl_salidaProperty().get();
	}
	
	public final void setLbl_salida(final String lbl_salida) {
		this.lbl_salidaProperty().set(lbl_salida);
	}
	
	
	

	

	

	
	
		
	
	

}


