package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Petfera;
import br.ufrn.imd.modelo.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroAveNativaController {
	
	Stage aveNativa;
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
    private TextField tTamanhoBico;

    @FXML
    private TextField tEnvegadura;

    @FXML
    private TextField tUfOrigem;

	
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnSair;

    @FXML
    void cadastrarAveNativa(ActionEvent event) {
    	btnCadastrarClicked = true;
    	
    	if (btnCadastrarClicked){
    		// Pegar os dados de Cliente
    		petfera = Petfera.getInstance();
    		
    		// buscando último cliente
    		int cod = petfera.buscaCodigoAnimal();
    		cod++;
    		
    		// setar atributos Cliente
    		
    		AveNativo a = new AveNativo();
    		
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
    		
    		a.setUfOrigem(tUfOrigem.getText());
    		
    		// persistir dados
    		petfera.inserirAnimal(a);
    	}
    	aveNativa.close();
    }

    @FXML
    void fecharApp(ActionEvent event) {
    	aveNativa.close();
    }

	public void setClienteStage(Stage aveStage) {
		this.aveNativa = aveStage;
	}
}
