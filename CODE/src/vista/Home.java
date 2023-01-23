package vista;

import java.awt.Color;
import java.awt.event.MouseEvent;


public class Home extends javax.swing.JFrame {

   
   int MouseX,MouseY;
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        Panel_Exit = new javax.swing.JPanel();
        Button_Exit = new javax.swing.JLabel();
        Button_Mi_Info1 = new javax.swing.JLabel();
        btnRegistrarCasas = new javax.swing.JLabel();
        Button_Mi_Info3 = new javax.swing.JLabel();
        Button_Mi_Info4 = new javax.swing.JLabel();
        Panel_Min = new javax.swing.JPanel();
        Button_Min = new javax.swing.JLabel();
        Panel_Close = new javax.swing.JPanel();
        Button_Close = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(0, 153, 255));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Exit.setBackground(new java.awt.Color(102, 0, 0));
        Panel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Exit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Button_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Button_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Exit.setText("Salir");
        Button_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ExitMouseExited(evt);
            }
        });
        Panel_Exit.add(Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        BarraLateral.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 190, 40));

        Button_Mi_Info1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/documento-35.png"))); // NOI18N
        Button_Mi_Info1.setText("COMUNICADOS");
        Button_Mi_Info1.setToolTipText("");
        Button_Mi_Info1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Mi_Info1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, -1));

        btnRegistrarCasas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btnRegistrarCasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarCasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario48.png"))); // NOI18N
        btnRegistrarCasas.setText("REGISTRAR CASAS ");
        btnRegistrarCasas.setToolTipText("");
        btnRegistrarCasas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCasas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarCasas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarCasas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarCasasMouseClicked(evt);
            }
        });
        BarraLateral.add(btnRegistrarCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, -1));

        Button_Mi_Info3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/detalles 24.png"))); // NOI18N
        Button_Mi_Info3.setText("REGISTRO ALICUOTAS");
        Button_Mi_Info3.setToolTipText("");
        Button_Mi_Info3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Mi_Info3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, -1));

        Button_Mi_Info4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tabla_32.png"))); // NOI18N
        Button_Mi_Info4.setText("REPORTES");
        Button_Mi_Info4.setToolTipText("");
        Button_Mi_Info4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Mi_Info4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, -1));

        PanelPrincipal.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 600));

        Panel_Min.setBackground(new java.awt.Color(255, 255, 255));

        Button_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Min.setText("—");
        Button_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_MinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_MinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_MinLayout = new javax.swing.GroupLayout(Panel_Min);
        Panel_Min.setLayout(Panel_MinLayout);
        Panel_MinLayout.setHorizontalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_MinLayout.setVerticalGroup(
            Panel_MinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 30));

        Panel_Close.setBackground(new java.awt.Color(255, 255, 255));

        Button_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Close.setText("x");
        Button_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_CloseLayout = new javax.swing.GroupLayout(Panel_Close);
        Panel_Close.setLayout(Panel_CloseLayout);
        Panel_CloseLayout.setHorizontalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        Panel_CloseLayout.setVerticalGroup(
            Panel_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Panel_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GSH.png"))); // NOI18N
        PanelPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 400, 230));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_ExitMouseClicked

    private void Button_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseEntered
        Panel_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Button_ExitMouseEntered

    private void Button_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseExited
        Panel_Exit.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_Button_ExitMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-MouseX, Y-MouseY);
    }//GEN-LAST:event_formMouseDragged

    private void Button_MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            this.setState(Home.ICONIFIED);
        }
    }//GEN-LAST:event_Button_MinMouseClicked

    private void Button_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_CloseMouseClicked

    private void Button_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseEntered
        Panel_Close.setBackground(Color.red);
        Button_Close.setForeground(Color.white);
    }//GEN-LAST:event_Button_CloseMouseEntered

    private void Button_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseEntered
        Panel_Min.setBackground(Color.lightGray);
        Button_Min.setForeground(Color.white);
    }//GEN-LAST:event_Button_MinMouseEntered

    private void Button_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseExited
        Panel_Close.setBackground(Color.white);
        Button_Close.setForeground(Color.black);
    }//GEN-LAST:event_Button_CloseMouseExited

    private void Button_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinMouseExited
        Panel_Min.setBackground(Color.white);
        Button_Min.setForeground(Color.black);
    }//GEN-LAST:event_Button_MinMouseExited

    private void btnRegistrarCasasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCasasMouseClicked
         new frmRegistroUsuarios().setVisible(true);
    }//GEN-LAST:event_btnRegistrarCasasMouseClicked

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JLabel Button_Close;
    private javax.swing.JLabel Button_Exit;
    private javax.swing.JLabel Button_Mi_Info1;
    private javax.swing.JLabel Button_Mi_Info3;
    private javax.swing.JLabel Button_Mi_Info4;
    private javax.swing.JLabel Button_Min;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Panel_Close;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JPanel Panel_Min;
    private javax.swing.JLabel btnRegistrarCasas;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
