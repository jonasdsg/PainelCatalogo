package catalogo.tela.cadastro.usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastrarUsuarios extends Application {
    private static Parent root;
    private static Scene tela,tela2;
    private static Stage telaInicial;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        telaInicial = stage;
        root = FXMLLoader.load(getClass().getResource("FXMLTelaUsuarios.fxml"));
        
        tela = new Scene(root);
        
        stage.setScene(tela);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    

   
    public static void MudaTela()
    {
        telaInicial.setScene(tela);
        telaInicial.show();
    }
}