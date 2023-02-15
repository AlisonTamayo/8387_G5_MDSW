package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLUsuarios extends Conexion {

    public boolean registrar(Cliente usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios (nombre_apellido,cedula,telefono,correo,numero_casa,estado_usuario,nombre_dueño) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getNombre_apellido());
            ps.setString(2, usr.getCedula());
            ps.setString(3, usr.getTelefono());
            ps.setString(4, usr.getCorreo());
            ps.setString(5, usr.getNumeroCasa());
            ps.setString(6, usr.getEstadoUsuario());
            ps.setString(7, usr.getNombreDueño());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
