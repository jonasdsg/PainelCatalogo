package tela.login;

import tela.principal.PainelCatalogo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class FXMLTelaLoginController implements Initializable {

    @FXML
    private TextField nomeUsuario;

    @FXML
    private TextField senhaUsuario;

    @FXML
    private Button botaoLogin;
    private Stage stage;

    public void fazerLogin() throws Exception
    {
        if(nomeUsuario.getText().equals("jonas") && senhaUsuario.getText().equals("1234"))
        {
            PainelCatalogo novaTela = new PainelCatalogo();
            novaTela.start(new Stage());
            fecharTela();
        }
        else
        {
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle("Erro!");
            alerta.setHeaderText("Falha ao executar login, algo está errado");
            alerta.setContentText("O usuário/senha digitados não conferem com o banco de dados,\n revise o nome e senha informados.");
            alerta.show();
        }
        
    }
    
    public void fecharTela()
    {
        TelaLogin.fechaTela();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
