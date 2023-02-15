/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
/*import modelo.DetalleFactura;
import modelo.Factura;
import modelo.Pago;
import modelo.Producto;*/
import modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bbonilla
 */
public class LogicaNegocio {
    
    BaseDatos obj;
    
    public LogicaNegocio(){
        obj = new BaseDatos();
    }    
    
  /*  public void eliminarProducto(Producto producto) throws Exception{
        String sql = "DELETE FROM producto WHERE PRO_ID = " + producto.getProId();
        obj.abrirConexion();
        obj.ejecutarSql(sql);
        obj.cerrarConexion();
    }
    
    public void eliminarCliente(Cliente cliente) throws Exception{
        String sql = "DELETE FROM cliente WHERE CLI_CEDULA = " + cliente.getCedula();
        obj.abrirConexion();
        obj.ejecutarSql(sql);
        obj.cerrarConexion();
    }
    
    public boolean consultarUsuario(Cliente usuario) throws SQLException, Exception {        
        boolean existeUsuario = false;
        obj.abrirConexion();        
        ResultSet resultado = obj.ejecutarSql("", "Usuario");
        if (resultado.next()){
            existeUsuario = true;            
        }        
        obj.cerrarConexion();
        return existeUsuario;
    }
    
    public boolean insertarCliente(Cliente cliente) throws SQLException, Exception{        
        obj.abrirConexion();        
        String sql = "INSERT INTO cliente(CLI_CEDULA,CLI_NOMBRE,CLI_APELLIDO,CLI_DIRECCION,CLI_CONTACTO,CLI_CORREO) "
                    + "VALUES ('" + cliente.getCedula() + "','" + cliente.getNombre() + "','" + cliente.getApellido() + "','" + cliente.getDireccion() + "','" + cliente.getContacto() + "','" + cliente.getCorreo() + "')";                
        obj.ejecutarSql(sql);
        obj.cerrarConexion();
        return true;
    }
    
    public List<Cliente> consultarClientes() throws Exception{        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        obj.abrirConexion();        
        
        ResultSet resultado = obj.ejecutarSql("", "cliente");
        while (resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setCedula(resultado.getString("CLI_CEDULA"));
            cliente.setNombre(resultado.getString("CLI_NOMBRE"));
            cliente.setApellido(resultado.getString("CLI_APELLIDO"));
            cliente.setDireccion(resultado.getString("CLI_DIRECCION"));
            cliente.setContacto(resultado.getString("CLI_CONTACTO"));
            cliente.setCorreo(resultado.getString("CLI_CORREO"));
            listaClientes.add(cliente);
        } 
        obj.cerrarConexion();
        
        return listaClientes;        
    }
    */
    public Cliente buscarCliente(String cedula) throws Exception{
        Cliente cliente = null;
        obj.abrirConexion();       
        
        String sql = "SELECT * FROM usuarios WHERE cedula = '" + cedula + "'";        
        ResultSet resultado = obj.ejecutarSql(sql, null);
        if (resultado.next()){
            cliente = new Cliente();
            cliente.setUserID(Integer.parseInt(resultado.getString("id")));
            cliente.setCedula(resultado.getString("cedula"));
            cliente.setNombre_apellido(resultado.getString("nombre_apellido"));
            cliente.setTelefono(resultado.getString("telefono"));
            cliente.setCorreo(resultado.getString("correo"));
            cliente.setNumeroCasa(resultado.getString("numero_casa"));
            cliente.setNombreDueño(resultado.getString("nombre_dueño"));
            cliente.setEstadoUsuario(resultado.getString("estado_usuario"));
            
        }
        obj.cerrarConexion();
        
        return cliente;
    }
    
    /*
    public boolean insertarProducto(Producto producto) throws SQLException, Exception{  
        obj.abrirConexion();  
        String sql = "INSERT INTO producto(PRO_NOMBRE,PRO_DESCRIPCION,PRO_COSTO,PRO_CANTIDAD) "
                + "VALUES ('" + producto.getNombre() + "','" + producto.getDescripcion() + "'," + producto.getCosto() + "," + producto.getCantidad() + ")";
        obj.ejecutarSql(sql);
        obj.cerrarConexion();
        return true;
    }
           
    public List<Producto> consultarProductos() throws Exception{        
        List<Producto> listaPantalones = new ArrayList<Producto>();
        obj.abrirConexion();        
        
        ResultSet resultado = obj.ejecutarSql("", "producto");
        while (resultado.next()){
            Producto pantalon = new Producto();
            pantalon.setProId(resultado.getInt("PRO_ID"));
            pantalon.setNombre(resultado.getString("PRO_NOMBRE"));
            pantalon.setDescripcion(resultado.getString("PRO_DESCRIPCION"));
            pantalon.setCosto(Double.parseDouble(resultado.getString("PRO_COSTO")));
            pantalon.setCantidad(Integer.parseInt(resultado.getString("PRO_CANTIDAD")));
            
            listaPantalones.add(pantalon);
        } 
        obj.cerrarConexion();
        
        return listaPantalones;        
    }
    
    public List<Producto> consultarProductosDisponibles() throws Exception{        
        List<Producto> listaProductos = new ArrayList<Producto>();
        obj.abrirConexion();        
        
        String sql = "SELECT * FROM producto WHERE PRO_CANTIDAD > 0";
        
        ResultSet resultado = obj.ejecutarSql(sql, null);
        while (resultado.next()){
            Producto pantalon = new Producto();
            pantalon.setProId(Integer.parseInt(resultado.getString("PRO_ID")));
            pantalon.setNombre(resultado.getString("PRO_NOMBRE"));
            pantalon.setDescripcion(resultado.getString("PRO_DESCRIPCION"));
            pantalon.setCosto(Double.parseDouble(resultado.getString("PRO_COSTO")));
            pantalon.setCantidad(Integer.parseInt(resultado.getString("PRO_CANTIDAD")));
            
            listaProductos.add(pantalon);
        } 
        obj.cerrarConexion();
        
        return listaProductos;        
    }
    
    public String registraFactura(Factura factura) throws Exception{
        
        obj.abrirConexion();
        String sql = "INSERT INTO factura(CLI_ID,FAC_FECHA,FAC_SUBTOTAL,FAC_IVA,FAC_TOTAL) "
                   + "VALUES(" + factura.getCliente().getCliId() + ",'" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(factura.getFecha()) + "'," + factura.getSubtotal() + "," + factura.getIva() + "," + factura.getTotal() + ")";
        obj.ejecutarSql(sql);
        
        int numFactura = 0;
        sql = "SELECT MAX(FAC_ID) AS TOTAL FROM factura";
        ResultSet resultado = obj.ejecutarSql(sql, null);
        while (resultado.next()){            
            numFactura = resultado.getInt("TOTAL");
        }
                
        for (DetalleFactura detalle : factura.getDetalles()){
            sql = "INSERT INTO detalle_factura(PRO_ID,FAC_ID,DEF_CANTIDAD,DEF_TOTAL) "
                + "VALUES(" + detalle.getProducto().getProId() + "," + numFactura + "," + detalle.getCantidad() + "," + detalle.getSubtotal() + ")";
            obj.ejecutarSql(sql);
            
            sql = "UPDATE producto SET PRO_CANTIDAD = PRO_CANTIDAD - " + detalle.getCantidad() + " WHERE PRO_ID = " + detalle.getProducto().getProId();
            obj.ejecutarSql(sql);
        }        
        
        for (Pago pago : factura.getPagos()){
            sql = "INSERT INTO pago(FAC_ID,PAG_MONTO,PAG_FECHA,PAG_ESTADO) "
                + "VALUES (" + numFactura + "," + pago.getMonto() + ",'" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(pago.getFecha()) + "','" + pago.getEstado() + "')";
            obj.ejecutarSql(sql);
        }
        
        obj.cerrarConexion();        
        
        return "Se ha registrado la factura numero: " + numFactura + "\nProxima fecha de pago: " + new SimpleDateFormat("yyyy-MM-dd").format(factura.getPagos().get(0).getFecha());
    }
    
    public List<Factura> buscarFacturas(Cliente cliente) throws Exception{
        
        List<Factura> listaFacturas = new ArrayList<Factura>();
        obj.abrirConexion();        
        
        String sql = "SELECT * FROM factura WHERE CLI_ID = " + cliente.getCliId();
        
        ResultSet resultado = obj.ejecutarSql(sql, null);
        while (resultado.next()){
            Factura factura = new Factura();
            factura.setFacId(Integer.parseInt(resultado.getString("FAC_ID")));
            factura.setFecha(resultado.getDate("FAC_FECHA"));
            factura.setCliente(cliente);
            
            List<Pago> listaPagos = new ArrayList<Pago>();
            sql = "SELECT * FROM pago WHERE FAC_ID = " + factura.getFacId();
            ResultSet resultado_ = obj.ejecutarSql(sql, null);
            while (resultado_.next()){
                Pago pago = new Pago();
                pago.setPagId(Integer.parseInt(resultado_.getString("PAG_ID")));
                pago.setFacId(Integer.parseInt(resultado_.getString("FAC_ID")));
                pago.setMonto(Double.parseDouble(resultado_.getString("PAG_MONTO")));
                pago.setFecha(resultado_.getDate("PAG_FECHA"));
                pago.setEstado(resultado_.getString("PAG_ESTADO"));
                listaPagos.add(pago);
            }
            
            factura.setPagos(listaPagos);
            factura.setSubtotal(Double.parseDouble(resultado.getString("FAC_SUBTOTAL")));
            factura.setIva(Double.parseDouble(resultado.getString("FAC_SUBTOTAL")));
            factura.setTotal(Double.parseDouble(resultado.getString("FAC_SUBTOTAL")));

            listaFacturas.add(factura);
        } 
        obj.cerrarConexion();
        
        return listaFacturas;
    }
    
    public boolean actualizarPago(Pago pago) throws SQLException, Exception{        
        obj.abrirConexion();        
        String sql = "UPDATE pago SET PAG_ESTADO = 'CANCELADO' WHERE PAG_ID = " + pago.getPagId();                    
        obj.ejecutarSql(sql);
        obj.cerrarConexion();
        return true;
    }
    */
}
