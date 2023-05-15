package bernardi.nicola.provafile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class SecondaryController implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private TextField name;


    @FXML
    void switchToPrimary(ActionEvent event) throws IOException {
        FileOutputStream out = null;
        String user = name.getText();
        System.out.println("\t\tuser: " + user);
        try {
            out = new FileOutputStream("data.txt");
            out.write(user.getBytes());
        }catch(IOException i){
            
        }finally{
            try{
                out.close();
            }catch(IOException e){
                
            }
            App.setRoot("primary");
        }
    }
    
    

    
}