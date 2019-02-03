package catalogo.tela.principal;

import catalogo.classes.Endereco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import catalogo.classes.PessoaFisica;
import catalogo.classes.PessoaJuridica;

public class FXMLCadastrarUsuariosController implements Initializable {

    @FXML private TextField cadastrarCEP;
    @FXML private TextField cadastrarComplementoEnd;
    @FXML private TextField cadastrarDocumento;
    @FXML private TextField cadastrarNome;
    @FXML private TextField cadastrarCelular;
    @FXML private TextField cadastrarTelefone;
    @FXML private TextField cadastrarCidade;
    @FXML private Button botaoCriar;
    @FXML private TextField cadastrarEndereco;
    @FXML private TextField cadastrarBairro;
    @FXML private TextField cadastrarNumeroCasa;
    @FXML private ChoiceBox<?> selecionarEstado;
    @FXML private RadioButton cadastrarPessoaJuridica;
    @FXML private TextField cadastrarMunicipio;
    @FXML private Label statusCriacao;
    @FXML private TextField cadastrarUF;
    @FXML
    private void botaoCriar(ActionEvent event)
    {
        long cep;
        String rua,bairro,municipio,cidade,estado,uf;
        Endereco endereco = new Endereco();
        cep = Long.parseLong(cadastrarCEP.getText());
        rua = cadastrarEndereco.getText();
        bairro = cadastrarBairro.getText();
        municipio = cadastrarMunicipio.getText();
        cidade = cadastrarCidade.getText();
        estado = "Default";
        uf = cadastrarUF.getText();
        
        endereco.CadastraEndereco(cep, rua, bairro, municipio, cidade, estado, uf);
        
        if(cadastrarPessoaJuridica.isDisable()==true)
        {
            PessoaFisica cadastro;
            cadastro = new PessoaFisica(cadastrarNome.getText(),cadastrarDocumento.getText());
            cadastro.setEndereco(endereco);
            cadastro.setTelefone(cadastrarTelefone.getText());   
        }
        
        else
        {
            PessoaJuridica cadastro;
            cadastro = new PessoaJuridica(cadastrarNome.getText(),cadastrarDocumento.getText());
            cadastro.setEndereco(endereco);
            cadastro.setTelefone(cadastrarTelefone.getText());            
        }
        statusCriacao.setText("Sucesso!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

}