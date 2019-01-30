package tela.principal;

import classes.catalogo.Endereco;
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
import classes.catalogo.PessoaFisica;
import classes.catalogo.PessoaJuridica;

public class FXMLMainScreenController implements Initializable {

    @FXML
    private TextField cadastrarCEP;

    @FXML
    private TextField cadastrarComplementoEnd;

    @FXML
    private TextField cadastrarDocumento;

    @FXML
    private TextField cadastrarNome;

    @FXML
    private TextField cadastrarCelular;

    @FXML
    private TextField cadastrarTelefone;

    @FXML
    private TextField cadastrarCidade;

    @FXML
    private Button botaoCriar;

    @FXML
    private TextField cadastrarEndereco;

    @FXML
    private TextField cadastrarBairro;

    @FXML
    private TextField cadastrarNumeroCasa;

    @FXML
    private ChoiceBox<?> selecionarEstado;

    @FXML
    private RadioButton cadastrarPessoaJuridica;

    @FXML
    private TextField cadastrarMunicipio;
    
    @FXML
    private Label statusCriacao;
    
    @FXML
    private void botaoCriar(ActionEvent event)
    {
        Endereco endereco;
        endereco = new Endereco();
        
        endereco.setCep(cadastrarCEP.getText());
        endereco.setRua(cadastrarEndereco.getText());
        endereco.setBairro(cadastrarBairro.getText());
        endereco.setCidade(cadastrarCidade.getText());
        
        if(cadastrarPessoaJuridica.isDisable()==true)
        {
            PessoaFisica cadastro;
            
            cadastro = new PessoaFisica(1,cadastrarNome.getText(),cadastrarDocumento.getText());
            cadastro.setEndereco(endereco);
            cadastro.setTelefone(cadastrarTelefone.getText());
            
        }
        else
        {

            PessoaJuridica cadastro;
            
            cadastro = new PessoaJuridica(1,cadastrarNome.getText(),cadastrarDocumento.getText());
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