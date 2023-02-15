/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import static java.lang.Class.forName;


public class conexionMysql {
    
    Connection cn;
    public Connection  conectar(){
        
       try{
           Class.forName("com.mysql.jdbc.Driver");
           cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudusuario","root","");
           System.out.println("Conectado");
           
           
           
       } catch (Exception e){
           
           System.out.println(" Error"+e);
       }
        
        return  cn;
    }
   
}
