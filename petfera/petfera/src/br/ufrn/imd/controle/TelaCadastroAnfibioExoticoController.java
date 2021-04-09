package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaCadastroAnfibioExoticoController {
	
	private Stage anfibioExotico;
	
	  @FXML
	    private Button btnCadastrar;

	    @FXML
	    private Button btnSair;

	    @FXML
	    void cadastrarAnfibioExotico(ActionEvent event) {

	    }

	    @FXML
	    void fecharApp(ActionEvent event) {
	    	anfibioExotico.close();
	    }
	    
	public void setClienteStage(Stage anfibioStage) {
		this.anfibioExotico = anfibioStage;
		
	}

}
