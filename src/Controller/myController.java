package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class myController {

	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@FXML
	private Button ButtonTA;

	@FXML
	private Button ButtonFREY;

	@FXML
	private Button ButtonMRD;

	@FXML
	private Button ButtonVinci;


	public void abrirTA(ActionEvent event) throws Exception{

		Parent parent = FXMLLoader.load(getClass().getResource("/application/OtherStage.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Tierra Armada reload");
		stage.show();
	}

	public void abrirFREY(ActionEvent event) throws Exception{

		Parent parent2 = FXMLLoader.load(getClass().getResource("/application/OtherStage2.fxml"));
		Stage stage2 = new Stage();
		Scene scene2 = new Scene(parent2);
		stage2.setScene(scene2);
		stage2.setTitle("Freyssinet reload");
		stage2.show();
	}

	public void abrirMNRD(ActionEvent event) throws Exception{

		Parent parent3 = FXMLLoader.load(getClass().getResource("/application/OtherStage3.fxml"));
		Stage stage3 = new Stage();
		Scene scene3 = new Scene(parent3);
		stage3.setScene(scene3);
		stage3.setTitle("Menard reload");
		stage3.show();
	}

}
