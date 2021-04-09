package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroVeterinarioController {
	
	private Stage veterinario;
	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarTratador(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	veterinario.close();
    }
	public void setClienteStage(Stage veterinarioStage) {
		this.veterinario = veterinarioStage;
		
	}

}
