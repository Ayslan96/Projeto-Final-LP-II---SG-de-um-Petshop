package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Petfera;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TelaListarAnimaisController {
	
	private Stage listaAnimais;
	
	private boolean btnCadastrarClicked = false;
	Petfera petfera;
	
	@FXML
    private TextArea tTextArea;
	
	 @FXML
	 private Button btnsair;

    
    @FXML
    void listarFuncionarios(ActionEvent event) {
    	btnCadastrarClicked = true;
    	
    	if (btnCadastrarClicked){
    		// Pegar os dados de Cliente
    		petfera = Petfera.getInstance();
    		
    		String S = petfera.listarAnimais();
    		
    		tTextArea.setText(S);
    	}
    }
    
    @FXML
    void fecharApp(ActionEvent event) {
    	listaAnimais.close();
	    }
		
	public void setClienteStage(Stage listaStage) {
	this.listaAnimais = listaStage;
		
	}

}
