package catalogo.tela.consulta;

import catalogo.tela.cadastro.usuario.CadastrarUsuarios;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLPainelPrincipal implements Initializable {
    @FXML
    private TextField nomeUsuarioCadastrado = new TextField();
    @FXML private Button acessarPainelUsuarios;
    @FXML
    private void setText(ActionEvent event)
    {
        nomeUsuarioCadastrado.setPromptText("Jonas");
    }
    @FXML
    private void acessarPainelUsuario(ActionEvent event) throws Exception
    {
        CadastrarUsuarios usuario = new CadastrarUsuarios();
        usuario.start(new Stage());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

}