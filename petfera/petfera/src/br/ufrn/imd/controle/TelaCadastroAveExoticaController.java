package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroAveExoticaController {
	
	private Stage aveStage;
	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarAveExotica(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	aveStage.close();
    }

	public void setClienteStage(Stage aveStage) {
		this.aveStage = aveStage;
		
	}

}
