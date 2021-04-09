package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroMamiferoExoticoController {
	
	private Stage mamiferoExotico;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarMamiferoExotico(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	this.mamiferoExotico.close();
    }

	public void setClienteStage(Stage mamiferoStage) {
		this.mamiferoExotico = mamiferoStage;
		
	}

}
