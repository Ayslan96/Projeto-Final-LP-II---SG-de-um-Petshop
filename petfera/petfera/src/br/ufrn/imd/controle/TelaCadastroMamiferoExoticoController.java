package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Petfera;
import br.ufrn.imd.modelo.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroMamiferoExoticoController {
	
	private Stage mamiferoExotico;
	private boolean btnCadastrarClicked = false;
	
	Petfera petfera;
	
	 @FXML
	    private TextField tId;

	    @FXML
	    private TextField tClasse;

	    @FXML
	    private TextField tNCientifico;

	    @FXML
	    private TextField tSexo;

	    @FXML
	    private TextField tTamanho;

	    @FXML
	    private TextField tDieta;

	    @FXML
	    private TextField tVeterinario;
	    
	    @FXML
	    private TextField tTratador;

	    @FXML
	    private TextField tNBatismo;

	    @FXML
	    private TextField tAutIbama;

	    @FXML
	    private TextField tCorPelo;

	    @FXML
	    private TextField tPaisOrigem;

	    @FXML
	    private TextField tCidadeOrigem;
	

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarMamiferoExotico(ActionEvent event) {
    	
    	btnCadastrarClicked = true;
    	
    	if (btnCadastrarClicked){
    		// Pegar os dados de Cliente
    		petfera = Petfera.getInstance();
    		
    		// buscando último cliente
    		int cod = petfera.buscaCodigoAnimal();
    		cod++;
    		
    		// setar atributos Cliente
    		
    		MamiferoExotico a = new MamiferoExotico();
    		
    		a.setId(cod);
    		
    		a.setClasse(tClasse.getText());
    		
    		a.setNomeCientifico(tNCientifico.getText());
    		
    		a.setSexo(tSexo.getText());
    		
    		a.setTamanho(Double.parseDouble(tTamanho.getText()));
    		
    		a.setDieta(tDieta.getText());
    		
    		a.setVeterinario(tVeterinario.getText());
    		
    		a.setTratador(tTratador.getText());
    		
    		a.setNomeBatismo(tNBatismo.getText());
    		
    		a.setAutorizacaoIbama(tAutIbama.getText());
    		
    		a.setCorDoPelo(tCorPelo.getText());
    		
    		a.setPaisOrigem(tPaisOrigem.getText());
    		
    		a.setCidadeOrigem(tCidadeOrigem.getText());
    		
    		// persistir dados
    		petfera.inserirAnimal(a);
    	}
    	mamiferoExotico.close();

    }

    @FXML
    void fecharApp(ActionEvent event) {
    	this.mamiferoExotico.close();
    }

	public void setClienteStage(Stage mamiferoStage) {
		this.mamiferoExotico = mamiferoStage;
		
	}

}
