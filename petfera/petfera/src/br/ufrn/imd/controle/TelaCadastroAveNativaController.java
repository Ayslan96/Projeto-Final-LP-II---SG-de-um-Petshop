package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroAveNativaController {
	
	Stage aveNativa;
	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarAveNativa(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	aveNativa.close();
    }

	public void setClienteStage(Stage aveStage) {
		this.aveNativa = aveStage;
		
	}

}
