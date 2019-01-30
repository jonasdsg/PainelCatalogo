package tela.login;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaLogin extends Application {
    private static Scene tela2;
    private static Stage estagio;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("FXMLTelaLogin.fxml"));
        estagio = stage;
        tela2 = new Scene(root);
        
        stage.setScene(tela2);
        stage.show();
    }
    
    public static Scene retornaTela()
    {
        return TelaLogin.tela2;
    }

 
     public static void fechaTela()
    {
        TelaLogin.estagio.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
