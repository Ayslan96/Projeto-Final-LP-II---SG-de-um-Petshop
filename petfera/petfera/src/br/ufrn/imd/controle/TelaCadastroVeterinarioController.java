package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Petfera;
import br.ufrn.imd.modelo.Veterinario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroVeterinarioController {
	
	private Stage veterinario;
	private boolean btnCadastrarClicked = false;
	
	Petfera petfera;
	
	@FXML
    private TextField tId;

    @FXML
    private TextField tNome;

    @FXML
    private TextField tCpf;

    @FXML
    private TextField tIdade;

    @FXML
    private TextField tSangue;

    @FXML
    private TextField tRh;

    @FXML
    private TextField tEspecialidade;

    @FXML
    private TextField tCnmv;

	
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
    void cadastrarTratador(ActionEvent event) {
    	
btnCadastrarClicked = true;
    	
    	if (btnCadastrarClicked){
    		// Pegar os dados de Cliente
    		petfera = Petfera.getInstance();
    		
    		// buscando último cliente
    		int cod = petfera.buscaCodigoFuncionario();
    		cod++;
    		
    		// setar atributos Cliente
    		
    		Veterinario f = new Veterinario();
    		
    		f.setId(cod);
    		
    		f.setNome(tNome.getText());
    		
    		f.setCpf(tCpf.getText());
    		
    		f.setIdade(Integer.parseInt(tIdade.getText()));
    		
    		f.setTipoSanguineo(tSangue.getText());
    		
    		f.setFatorRH(tRh.getText());
    		
    		f.setEspecialidade(tEspecialidade.getText());
    		
    		f.setCnmv(tCnmv.getText());
    		
    		// persistir dados
    		petfera.inserirFuncionario(f);
    	}
    	veterinario.close();
    }  
    
    @FXML
    void fecharApp(ActionEvent event) {
    	veterinario.close();
    }
	public void setClienteStage(Stage veterinarioStage) {
		this.veterinario = veterinarioStage;
		
	}

}
