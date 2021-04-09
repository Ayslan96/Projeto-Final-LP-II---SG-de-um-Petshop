package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroReptilExoticoController {
	
	private Stage reptilExotico;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarReptilExotico(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	reptilExotico.close();
    }

	public void setClienteStage(Stage reptilStage) {
		this.reptilExotico = reptilStage;
		
	}

}
