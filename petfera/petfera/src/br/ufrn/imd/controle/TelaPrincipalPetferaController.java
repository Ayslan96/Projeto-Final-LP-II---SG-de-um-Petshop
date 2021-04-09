package br.ufrn.imd.controle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPrincipalPetferaController {

    @FXML
    private MenuItem mnitemCadastroAnfibioExotico;

    @FXML
    private MenuItem mnitemCadastroAnfibioNativo;

    @FXML
    private MenuItem mnitemCadastroAveExotica;

    @FXML
    private MenuItem mnitemCadastroAveNativa;

    @FXML
    private MenuItem mnitemCadastroMamiferoExotico;

    @FXML
    private MenuItem mnitemCadastroMamiferoNativo;

    @FXML
    private MenuItem mnitemCadastroReptilExotico;

    @FXML
    private MenuItem mnitemCadastroReptilNativo;

    @FXML
    private MenuItem mnitemCadastroTratador;

    @FXML
    private MenuItem mnitemCadastroVeterinario;

    @FXML
    private MenuItem mnintemRelatorioFuncionarios;

    @FXML
    private MenuItem mnitemRelatorioAnimais;

    @FXML
    private MenuItem mnitemSair;

    @FXML
    void abrirCadastroAnfibioExotico(ActionEvent event) throws IOException {

    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioExoticoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroAnfibioExotico.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage AnfibioStage = new Stage();
    	AnfibioStage.setTitle("Cadastro de Anfibio Exótico");
    	AnfibioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	AnfibioStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroAnfibioExoticoController controller = loader.getController();
    	controller.setClienteStage(AnfibioStage);
    	AnfibioStage.showAndWait();
       	
    }

    @FXML
    void abrirCadastroAnfibioNativo(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioNativoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroAnfibioNativo.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage AnfibioStage = new Stage();
    	AnfibioStage.setTitle("Cadastro de Anfibio Nativo");
    	AnfibioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	AnfibioStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroAnfibioNativoController controller = loader.getController();
    	controller.setClienteStage(AnfibioStage);
    	AnfibioStage.showAndWait();

    }

    @FXML
    void abrirCadastroAveExotica(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioExoticoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroAveExotica.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage AveStage = new Stage();
    	AveStage.setTitle("Cadastro de Ave Exótica");
    	AveStage.setResizable(false);
    	Scene scene = new Scene(page);
    	AveStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroAveExoticaController controller = loader.getController();
    	controller.setClienteStage(AveStage);
    	AveStage.showAndWait();

    }

    @FXML
    void abrirCadastroAveNativa(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioExoticoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroAveNativa.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage aveStage = new Stage();
    	aveStage.setTitle("Cadastro de Ave Nativa");
    	aveStage.setResizable(false);
    	Scene scene = new Scene(page);
    	aveStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroAveNativaController controller = loader.getController();
    	controller.setClienteStage(aveStage);
    	aveStage.showAndWait();
    }

    @FXML
    void abrirCadastroMamiferoExotico(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioExoticoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroMamiferoExotico.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage mamiferoStage = new Stage();
    	mamiferoStage.setTitle("Cadastro de Mamífero Exótico");
    	mamiferoStage.setResizable(false);
    	Scene scene = new Scene(page);
    	mamiferoStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroMamiferoExoticoController controller = loader.getController();
    	controller.setClienteStage(mamiferoStage);
    	mamiferoStage.showAndWait();
    	
    }

    @FXML
    void abrirCadastroMamiferoNativo(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioNativoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroMamiferoNativo.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage mamiferoStage = new Stage();
    	mamiferoStage.setTitle("Cadastro de Mamífero Nativo");
    	mamiferoStage.setResizable(false);
    	Scene scene = new Scene(page);
    	mamiferoStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroMamiferoNativoController controller = loader.getController();
    	controller.setClienteStage(mamiferoStage);
    	mamiferoStage.showAndWait();
    	
    }

    @FXML
    void abrirCadastroReptilExotico(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioExoticoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroReptilExotico.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage ReptilStage = new Stage();
    	ReptilStage.setTitle("Cadastro de Reptil Exótico");
    	ReptilStage.setResizable(false);
    	Scene scene = new Scene(page);
    	ReptilStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroReptilExoticoController controller = loader.getController();
    	controller.setClienteStage(ReptilStage);
    	ReptilStage.showAndWait();
    	
    }

    @FXML
    void abrirCadastroReptilNativo(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioNativoController.class.getResource("/br/ufrn/imd/visao/TelaCadastroReptilNativo.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage ReptilStage = new Stage();
    	ReptilStage.setTitle("Cadastro de Reptil Nativo");
    	ReptilStage.setResizable(false);
    	Scene scene = new Scene(page);
    	ReptilStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroReptilNativoController controller = loader.getController();
    	controller.setClienteStage(ReptilStage);
    	ReptilStage.showAndWait();
    	
    }

    @FXML
    void abrirCadastroTratador(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroTratadorController.class.getResource("/br/ufrn/imd/visao/TelaCadastroTratador.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage tratadorStage = new Stage();
    	tratadorStage.setTitle("Cadastro de Tratador");
    	tratadorStage.setResizable(false);
    	Scene scene = new Scene(page);
    	tratadorStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroTratadorController controller = loader.getController();
    	controller.setClienteStage(tratadorStage);
    	tratadorStage.showAndWait();

    }
    
    @FXML
    void abrirCadastroVeterinario(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroTratadorController.class.getResource("/br/ufrn/imd/visao/TelaCadastroVeterinario.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage veterinarioStage = new Stage();
    	veterinarioStage.setTitle("Cadastro de Veterinario");
    	veterinarioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	veterinarioStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaCadastroVeterinarioController controller = loader.getController();
    	controller.setClienteStage(veterinarioStage);
    	veterinarioStage.showAndWait();

    }

    @FXML
    void abrirRelatorioAnimais(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaListarAnimaisController.class.getResource("/br/ufrn/imd/visao/TelaListarAnimais.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage listaStage = new Stage();
    	listaStage.setTitle(" Lista de Animais ");
    	listaStage.setResizable(false);
    	Scene scene = new Scene(page);
    	listaStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaListarAnimaisController controller = loader.getController();
    	controller.setClienteStage(listaStage);
    	listaStage.showAndWait();
    	
    }

    @FXML
    void abrirRelatrorioFuncionarios(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroAnfibioNativoController.class.getResource("/br/ufrn/imd/visao/TelaListarFuncionarios.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	// Criando um novo Stage
    	Stage listaStage = new Stage();
    	listaStage.setTitle(" Lista de Funcionarios ");
    	listaStage.setResizable(false);
    	Scene scene = new Scene(page);
    	listaStage.setScene(scene);
    	
    	// Setando o Controle 
    	TelaListarFuncionariosController controller = loader.getController();
    	controller.setClienteStage(listaStage);
    	listaStage.showAndWait();
    	
    }

    @FXML
    void sairApp(ActionEvent event) {
    	
    }

}
