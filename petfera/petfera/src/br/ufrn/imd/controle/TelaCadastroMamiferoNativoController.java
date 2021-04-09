package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroMamiferoNativoController {
	
	private Stage mamiferoNativo;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    
    void cadastrarMamNativo(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	this.mamiferoNativo.close();
    }

	public void setClienteStage(Stage mamiferoStage) {
		this.mamiferoNativo = mamiferoStage;
		
	}
}
