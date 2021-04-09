package br.ufrn.imd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// caminho da Tela Principal
		Parent root = FXMLLoader.load(getClass().getResource("visao/TelaPrincipalPetfera.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("PETFERA v1.0");
		stage.setResizable(true);
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
