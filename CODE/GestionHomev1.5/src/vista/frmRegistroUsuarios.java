/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.tree.AbstractLayoutCache;
import javax.xml.transform.TransformerFactoryConfigurationError;
import modelo.ValidacionCedula;
import modelo.conexionMysql;

/**
 *
 * @author David Sangoquiza
 */
public class frmRegistroUsuarios extends javax.swing.JFrame {

    PreparedStatement ps;

    conexionMysql con = new conexionMysql();
    ResultSet rs;
    Connection cn = con.conectar();

    /**
     * Creates new form frmRegistroUsuarios
     */
    public frmRegistroUsuarios() {
        initComponents();
        mostrardatos("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNumeroCasa = new javax.swing.JTextField();
        txtNombreDueño = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListadoUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE USUARIOS \"CONJUNTO BELLAVISTA\"", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese la siguiente Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellido"));

        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        txtID.setEnabled(false);

        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder("Cédula"));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Télefono"));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo Electrónico"));

        txtNumeroCasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Casa"));
        txtNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCasaActionPerformed(evt);
            }
        });
        txtNumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCasaKeyTyped(evt);
            }
        });

        txtNombreDueño.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Dueño del Domicilio"));
        txtNombreDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDueñoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Dueño", "Arrendador" }));
        cmbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Dueño o Arrendador"));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addComponent(cmbEstado, 0, 209, Short.MAX_VALUE)
                            .addComponent(txtCedula)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addComponent(txtNumeroCasa)
                            .addComponent(txtNombreDueño))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        tableListadoUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableListadoUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListadoUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListadoUsuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCasaActionPerformed

    private void txtNombreDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDueñoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        try {

            //String consulta = "SELECT*FROM  usuarios WHERE cedula = ?";
            //ps = cn.prepareStatement(consulta);
            //rs = ps.executeQuery();
            //if (rs.next()) {
            //    JOptionPane.showMessageDialog(null, "El Usuario ya se encuentra registrado");
            // }
            // else {
            ps = cn.prepareStatement("INSERT INTO usuarios (nombre_apellido,cedula,telefono,correo,numero_casa,estado_usuario,nombre_dueño) VALUES (?,?,?,?,?,?,?)");

            if (txtNombre.getText().equals("") || txtCedula.getText().equals("")
                    || txtTelefono.getText().equals("") || txtCorreo.getText().equals("")
                    || txtNumeroCasa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos ");

            }

            if (!validaEmail(txtCorreo.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Correo Valido", "Mensaje", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtCedula.getText());
            ps.setString(3, txtTelefono.getText());
            ps.setString(4, txtCorreo.getText());
            ps.setString(5, txtNumeroCasa.getText());
            ps.setString(6, txtNombreDueño.getText());
            ps.setString(7, cmbEstado.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            mostrardatos("");
            limpiarEntradas();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El Usuario que intenta registrar, ya existe");

            System.out.println("Error al registrar cliente" + e);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (txtCedula.getText().length() == 10 || (caracter < '0' || caracter > '9')) {
            evt.consume();
            validarCedula();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
        //txtNombreDueño.setText(cmbEstado.getSelectedItem().toString());
        if (cmbEstado.getSelectedItem().equals("Dueño")) {
            txtNombreDueño.setEnabled(false);
            txtNombreDueño.setText("");

        } else {
            // JOptionPane.showMessageDialog(null, "Porfavor Ingrese el nombre del Dueño de la Casa");
            txtNombreDueño.setEnabled(true);
        }


    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtTelefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNumeroCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCasaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtNumeroCasa.getText().trim().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroCasaKeyTyped

    private void tableListadoUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListadoUsuariosMouseClicked
        // TODO add your handling code here:

        int row = tableListadoUsuarios.getSelectedRow();
        txtID.setText(tableListadoUsuarios.getValueAt(row, 0).toString());
        txtNombre.setText(tableListadoUsuarios.getValueAt(row, 1).toString());
        txtCedula.setText(tableListadoUsuarios.getValueAt(row, 2).toString());
        txtTelefono.setText(tableListadoUsuarios.getValueAt(row, 3).toString());
        txtCorreo.setText(tableListadoUsuarios.getValueAt(row, 4).toString());
        txtNumeroCasa.setText(tableListadoUsuarios.getValueAt(row, 5).toString());
        cmbEstado.setSelectedItem(tableListadoUsuarios.getValueAt(row, 6).toString());
        //cmbEstado.setSelectedItem(tableListadoUsuarios).getValue;ll
        //cmbEstado.addI


    }//GEN-LAST:event_tableListadoUsuariosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE usuarios SET nombre_apellido='" + txtNombre.getText() + "',cedula='" + txtCedula.getText() + "',telefono='" + txtTelefono.getText() + "',correo='" + txtCorreo.getText() + "',numero_casa='"
                    + txtNumeroCasa.getText() + "',estado_usuario='" + cmbEstado.getSelectedItem() + "',nombre_dueño='" + txtNombreDueño.getText() + "' WHERE id='" + txtID.getText() + "'");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Usuario Modificado");

        } catch (Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar Usuario, datos existentes");

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        /* txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtNumeroCasa.setText("");
        txtNombreDueño.setText("");*/
        limpiarEntradas();


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int row = tableListadoUsuarios.getSelectedRow();
        String id = tableListadoUsuarios.getValueAt(row, 0).toString();
        int n = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_NO_OPTION) {
            try {
                PreparedStatement borrar = cn.prepareStatement("Delete from usuarios where id='" + id + "'");
                borrar.executeUpdate();
                mostrardatos("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListadoUsuarios;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos(String string) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Cédula");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo Electronico");
        modelo.addColumn("Numero de casa");
        modelo.addColumn("Nombre del Dueño");
        modelo.addColumn("Estado Usuario");
        tableListadoUsuarios.setModel(modelo);
        String consultasql = "select*from usuarios";
        String data[] = new String[8];

        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                data[6] = rs.getString(7);
                data[7] = rs.getString(8);
                modelo.addRow(data);

            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar Datos " + e);
        }

    }

    private void limpiarEntradas() {
        txtID.setText("");
        txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtNumeroCasa.setText("");
        txtNombreDueño.setText("");
        cmbEstado.setSelectedIndex(0);

    }

    public void validarCedula() {
        if (ValidacionCedula.cedula(txtCedula.getText())) {

        } else {
            //jLabelMensajeCedulaValida.setText("Cédula no Válida");
            JOptionPane.showMessageDialog(null, "Ingrese una cédula valida ");
            //txtCedula.setText("");
        }
    }

    public boolean validaEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        } else {
            return false;
        }
    }

    /*public int updateDatos(String user_id, String nombre_apellido, String nombre_dueño, int cedula, String estado_usuario, int telefono, int numero_casa, String correo) {
        String SQL = "UPDATE usuarios SET nombre_apellido=''" + nombre_apellido + "', cedula= '" + cedula + "', telefono = '" + telefono + "',correo"
                + "='" + correo + "',numero_casa='" + numero_casa + "',estado_usuario='" + estado_usuario + "'"
                + "nombre_dueño='" + nombre_dueño + "'WHERE id="+user_id;
        int res = 0;

        try {
            ps = con.conectar().prepareStatement(SQL);
            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");

            }

        } catch (SQLException e) {

            System.err.println("Error al modificar " + e.getMessage());

        } finally {
            ps = null;

        }

        return 0;

    }*/
    public void actualizarDatos() {
        String SQL = "update usuarios set  nombre_apellido = ?, cedula = ?, telefono=?, correo=?, numero_casa=?,estado_usuario=?,nombre_dueño=? where id=?";
        try {
            ps = cn.prepareStatement(SQL);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtCedula.getText());
            ps.setString(3, txtTelefono.getText());
            ps.setString(4, txtCorreo.getText());
            ps.setString(5, txtNumeroCasa.getText());
            ps.setString(6, txtNombreDueño.getText());
            ps.setString(7, cmbEstado.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Modificado");
            //mostrardatos();
            //limpiarEntradas();

        } catch (Exception e) {
            System.out.println("Error al modificarcliente" + e);
        }

    }
}
