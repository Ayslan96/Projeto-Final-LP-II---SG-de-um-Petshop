package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Petfera;
import br.ufrn.imd.modelo.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroAnfibioExoticoController {
	
	private Stage anfibioExotico;
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
    private TextField tTratador;
    
    @FXML
    private TextField tVeterinario;

    @FXML
    private TextField tNBatismo;

    @FXML
    private TextField tAutIbama;

    @FXML
    private TextField tTotalMudas;

    @FXML
    private TextField tUltimaMuda;

    @FXML
    private TextField tPaisOrigem;

    @FXML
    private TextField tCidadeOrigem;
	
	@FXML
	private Button btnCadastrar;

	@FXML
	private Button btnSair;
	
	public boolean isBtnCadastrarClicked() {
		return btnCadastrarClicked;
	}

	public void setBtnCadastrarClicked(boolean btnCadastrarClicked) {
		this.btnCadastrarClicked = btnCadastrarClicked;
	} 

	@FXML
	void cadastrarAnfibioExotico(ActionEvent event) 
	{
		btnCadastrarClicked = true;
    	
    	if (btnCadastrarClicked){
    		// Pegar os dados de Cliente
    		petfera = Petfera.getInstance();
    		
    		// buscando último cliente
    		int cod = petfera.buscaCodigoAnimal();
    		cod++;
    		
    		// setar atributos Cliente
    		
    		AnfibioExotico a = new AnfibioExotico();
    		
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
    		
    		a.setTotalDeMudas(Integer.parseInt(tTotalMudas.getText()));
    		
    		a.setUltimaMuda(tUltimaMuda.getText());
    		
    		a.setPaisOrigem(tPaisOrigem.getText());
    		
    		a.setCidadeOrigem(tCidadeOrigem.getText());
    		
    		// persistir dados
    		petfera.inserirAnimal(a);
    	}
    	anfibioExotico.close();
    }

	@FXML
	void fecharApp(ActionEvent event) {
	    anfibioExotico.close();
	    }
	    
	public void setClienteStage(Stage anfibioStage) {
		this.anfibioExotico = anfibioStage;
		
	}

}
