package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroTratadorController {
	
	private Stage tratador;
	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarTratador(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	tratador.close();
    }
	public void setClienteStage(Stage tratadorStage) {
		this.tratador = tratadorStage;
		
	}

}
