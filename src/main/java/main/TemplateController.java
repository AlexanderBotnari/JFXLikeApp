package main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TemplateController {

	@FXML
	private static long count = 0l;
	
	@FXML
	private Button btn;
	
	public void clickLike() {
		 count++;
		 if(count > 0 && count < 1000) {
			    btn.setText(String.format(count+" Likes"));
			}else if (count >= 1000 && count < 1000000) {
				btn.setText(String.format("%.1fk Likes", (float)count / 1000));
			}else if (count >= 1000000 && count < 1000000000) {
				btn.setText(String.format("%.1fM Likes", (float)count / 1000000));
			}
            };
     
      
}
