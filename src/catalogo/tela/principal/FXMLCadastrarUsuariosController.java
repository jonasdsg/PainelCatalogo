package catalogo.tela.principal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class FXMLCadastrarUsuariosController implements Initializable {

    @FXML private Label statusCriacao;
    @FXML
    private void botaoCriar(ActionEvent event)
    {
        statusCriacao.setText("Sucesso!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

}