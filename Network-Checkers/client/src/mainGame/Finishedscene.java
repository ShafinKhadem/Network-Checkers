package mainGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Finishedscene {
	@FXML
	private Text win;
	public Text result;
	
	@FXML
	void cntn(ActionEvent event) {
		gameMain.reset ();
		gameMain.dialog.hide ();
	}
	
	@FXML
	void rstrt(ActionEvent event) {
		//ClientMain.reset ();
	}
}