package bernardi.nicola.provafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

public class PrimaryController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FileInputStream in = null;
//        FileChooser fc = new FileChooser();
//        File i = fc.showSaveDialog(window);
        
        BufferedReader br = null;
        String name;
        
        try {
            in = new FileInputStream("data.txt");
            
            br = new BufferedReader(new InputStreamReader(in));
            name = br.readLine();
            hello.setText("Ciao " + name);
            
        }catch(IOException i){
            System.out.println("IOException " + i.getMessage());
        }
        
        
    }
    
    @FXML
    private Label hello;

    @FXML
    void changeName(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }
}
