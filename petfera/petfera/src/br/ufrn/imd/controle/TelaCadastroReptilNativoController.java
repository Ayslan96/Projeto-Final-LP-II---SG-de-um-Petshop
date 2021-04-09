package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroReptilNativoController {
	
	private Stage reptilNativo;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarReptilNativo(ActionEvent event) {

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	reptilNativo.close();
    }

	public void setClienteStage(Stage reptilStage) {
		this.reptilNativo = reptilStage;		
	}

}
