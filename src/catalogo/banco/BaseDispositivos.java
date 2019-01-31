package catalogo.banco;

    import java.sql.Connection;
    import catalogo.classes.Dispositivo;
    import java.sql.PreparedStatement;
import java.sql.ResultSet;
    import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class BaseDispositivos {
        private Connection conexao = null;

        public BaseDispositivos() 
        {
            conexao = GerenciarConexao.getConnection();
        }

        public boolean salve(Dispositivo dispositivo)
        {
            String sql = "insert into Dispositivos values (?)";
            PreparedStatement stmt = null;
            try {
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1,Integer.toString(dispositivo.getChaveDispositivo()));
                stmt.setString(2,dispositivo.getDispositivo());
                stmt.setString(3,dispositivo.getNumerodeSerie());
                stmt.setString(4,dispositivo.getModelodoDispositivo());
                stmt.setString(5,dispositivo.getDescricao());
                stmt.setString(6,dispositivo.getEstadodoDispositivo());
                stmt.setString(7,dispositivo.getLocal());
                stmt.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.err.println("Erro ao iniciar conexão.");
                return false;
            }finally{
                GerenciarConexao.CloseConnection(conexao, stmt);
            }
        }
        public List<Dispositivo> listarTudo()
        {
            String sql = "select * from dispositivos";
            PreparedStatement stmt = null;
            ResultSet resultado = null;
            List<Dispositivo> dispositivo = new ArrayList<>();
            try {
                stmt = conexao.prepareStatement(sql);
                resultado = stmt.executeQuery(sql);
                while(resultado.next())
                {
                    Dispositivo disp = new Dispositivo();
                    disp.setDispositivo(resultado.getString("tipodeDispositivo"));
                    disp.setNumerodeSerie(resultado.getString("numerodeSerie"));
                    disp.setModelodoDispositivo(resultado.getString("modelodoDispositivo"));
                    disp.setDescricaodoDispositivo(resultado.getString("descricaodoDispositivo"));
                    disp.setEstadodoDispositivo(resultado.getString("estadodoDispositivo"));
                    disp.setLocal(resultado.getString("localArmazenado"));
                    dispositivo.add(disp);
                }
                
            } catch (SQLException ex) {
                System.err.println("Erro ao realizar consulta.");
            }finally{
                GerenciarConexao.CloseConnection(conexao, stmt);
            }
            
            return dispositivo;
        }
    }

