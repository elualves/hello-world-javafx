package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ViewController {

	@FXML
	private Label lbMensagem;
	
	@FXML
	private Label lbOlaMundo;

	@FXML
	private Button btClique;
	
	@FXML
	private Button btVoltar;
	
	@FXML
	private Button btApagar;
	
	@FXML
	private Button btSair;

	@FXML
	public void onBtCliqueAction() {
		lbMensagem.setText(null);
		lbOlaMundo.setText("Olá mundo!");
	}
	
	@FXML
	public void onBtVoltarAction( ) {
		lbMensagem.setText("Mensagem");
		lbOlaMundo.setText(null);
	}
	
	@FXML
	public void onBtApagarAction() {
		lbOlaMundo.setText(null);
		lbMensagem.setText(null);
	}
	
	@FXML
	public void onbtSairAction() {
		Stage stage = (Stage) btSair.getScene().getWindow();
		stage.close();
	}
	
	
	
	
	
	
	
	

}
