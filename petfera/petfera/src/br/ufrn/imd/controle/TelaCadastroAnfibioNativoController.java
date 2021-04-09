package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroAnfibioNativoController {

	private Stage anfibioNativo;
	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarAnfibioNativo(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	anfibioNativo.close();
    }
	
	public void setClienteStage(Stage anfibioStage) {
		this.anfibioNativo = anfibioStage;
		
	}
	
}
