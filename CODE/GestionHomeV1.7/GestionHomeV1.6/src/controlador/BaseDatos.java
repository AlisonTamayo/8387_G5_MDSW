
package controlador;

//import modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Sangoquiza
 */
public class BaseDatos {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public BaseDatos() {
        
    }
    
    public void abrirConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudusuario?autoReconnect=true&useSSL=false", "root", "");                       
        } catch (Exception e) {            
            System.out.println(e);
        }
    }
    
    public void cerrarConexion(){
        try {
            if (con != null){
                con.close();
            }
        } catch (Exception e) {            
            System.out.println(e);
        }
    }
    
    
    public void ejecutarSql(String sql) throws Exception{
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(sql);            
        }catch(Exception e){
            System.out.println(e);
            throw e;
        }
    }
    
    public ResultSet ejecutarSql(String sql, String tabla) throws Exception{
        try{
            stmt = con.createStatement();            
            if (tabla != null){
                sql = "SELECT * FROM " + tabla;
            }
            rs = stmt.executeQuery(sql);            
        }catch(Exception e){
            System.out.println(e);
            throw e;
        }
        return rs;
    }
    
    
    
    
}
