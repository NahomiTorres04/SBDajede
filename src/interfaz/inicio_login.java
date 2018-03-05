/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Usuario;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.commons.codec.digest.DigestUtils;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class inicio_login extends javax.swing.JFrame {

    /**
     * Creates new form inicio_login
     */
    private Usuario us;

    public inicio_login() {
        initComponents();
        us = new Usuario();     //instancio la clase usuario.
        CMBUsuarios.setModel(us.usuarios()); //Le doy el modelo al combo box de usuarios.
        padmincomit.setBackground(new Color(0, 0, 0, 0));
        pingresofp.setBackground(new Color(0, 0, 0, 0));
        pgif.setBackground(new Color(0, 0, 0, 0));
        pdatossesion.setBackground(new Color(0, 0, 0, 0));
        CMBUsuarios.setBackground(new Color(0, 0, 0, 0));
        PSTcontrasenia.setBackground(new Color(0, 0, 0, 0));
        ajustar_tamanio();
        transparencia();
    }
    /**
     * Proceso para ajustar el tamaño de la aplicación
     * dependiendo de la resolución de la computadora del usuario
     */
    public void ajustar_tamanio()
    {
        //TAMAÑO PREFERIDO PARA LA APLICACIÓN: 1450, 813
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        if((tamanio.width >= 1920) && (tamanio.height >= 1080)) //1920x1080
        {
            this.setSize(1450, 813);
            this.setLocation(70, 70);
        }
        else if ((tamanio.width >= 1708) && (tamanio.height >= 960)) //1366x768
        {
            this.setSize(1300, 735);
            this.setLocation(50,50);
        }
        else if ((tamanio.width >= 1700) && (tamanio.height >= 960)) //1360x768
        {
            this.setSize(1300, 735);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1680) && (tamanio.height >= 1050)) //1680x1050
        {
            this.setSize(1450, 813);
            this.setLocation(70, 70);
        }
        else if((tamanio.width >= 1600) && (tamanio.height >= 1000)) //1280x800
        {
            this.setSize(1290, 730);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1600) && (tamanio.height >= 960)) //1280x768
        {
            this.setSize(1290, 730);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1600) && (tamanio.height >= 900)) //1280x720
        {
            this.setSize(1290, 730);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1600) && (tamanio.height >= 750)) //1280x600
        {
            this.setSize(1290, 635);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1400) && (tamanio.height >= 1050)) //1400x1050
        {
            this.setSize(1300, 635);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width >= 1280) && (tamanio.height >= 1024)) //1280x1024
        {
            this.setSize(1200, 635);
            this.setLocation(50, 50);
        }
        else if ((tamanio.width == 1280) && (tamanio.height == 960)) //1024.768
        {
            this.setSize(1200, 635);
            this.setLocation(50,50);
        }
        else if ((tamanio.width == 1000) && (tamanio.height == 750)) //800.600
        {
            this.setSize(920, 635);
            this.setLocation(50, 50);
        }
    }

    public void transparencia() {
//        btnminimizar.setOpaque(false);
//        btnminimizar.setContentAreaFilled(false);
//        btnminimizar.setBorderPainted(false);
//        btnsalir.setOpaque(false);
//        btnsalir.setContentAreaFilled(false);
//        btnsalir.setBorderPainted(false);
        btnsiguiente.setOpaque(false);
        btnsiguiente.setContentAreaFilled(false);
        btnsiguiente.setBorderPainted(false);
//        btnatras.setOpaque(false);
//        btnatras.setContentAreaFilled(false);
//        btnatras.setBorderPainted(false);
        btnadmin.setOpaque(false);
        btnadmin.setContentAreaFilled(false);
        btnadmin.setBorderPainted(false);
        btncomite.setOpaque(false);
        btncomite.setContentAreaFilled(false);
        btncomite.setBorderPainted(false);
        btningresar.setOpaque(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setBorderPainted(false);
        btnfpassword.setOpaque(false);
        btnfpassword.setContentAreaFilled(false);
        btnfpassword.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfaz = new jcMousePanel.jcMousePanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        inicio = new jcMousePanel.jcMousePanel();
        btnsiguiente = new javax.swing.JButton();
        login = new jcMousePanel.jcMousePanel();
        pgif = new javax.swing.JPanel();
        pdatossesion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CMBUsuarios = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PSTcontrasenia = new javax.swing.JPasswordField();
        padmincomit = new javax.swing.JPanel();
        btnadmin = new javax.swing.JButton();
        btncomite = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pingresofp = new javax.swing.JPanel();
        btningresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnfpassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(724, 635));

        interfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/iniciointerfaz.jpg"))); // NOI18N
        interfaz.setLayout(new java.awt.CardLayout());

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/iniciointerfaz.jpg"))); // NOI18N
        inicio.setName("inicio"); // NOI18N

        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio/icons8_Right_70px.png"))); // NOI18N
        btnsiguiente.setName("btnsiguiente"); // NOI18N
        btnsiguiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio/icons8_Right_100px.png"))); // NOI18N
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addContainerGap(1239, Short.MAX_VALUE)
                .addComponent(btnsiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addContainerGap(582, Short.MAX_VALUE)
                .addComponent(btnsiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );

        rSPanelsSlider1.add(inicio, "card2");

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/login.jpg"))); // NOI18N
        login.setName("login"); // NOI18N
        login.setLayout(new java.awt.GridLayout(2, 2, 0, -35));

        pgif.setOpaque(false);
        pgif.setLayout(new java.awt.BorderLayout());
        login.add(pgif);

        pdatossesion.setOpaque(false);
        pdatossesion.setLayout(new java.awt.GridLayout(5, 2, -320, 40));
        pdatossesion.add(jLabel9);
        pdatossesion.add(jLabel7);
        pdatossesion.add(jLabel8);
        pdatossesion.add(jLabel10);
        pdatossesion.add(jLabel17);
        pdatossesion.add(jLabel16);
        pdatossesion.add(jLabel11);
        pdatossesion.add(jLabel12);
        pdatossesion.add(jLabel15);
        pdatossesion.add(jLabel13);

        CMBUsuarios.setBackground(new java.awt.Color(0, 102, 153));
        CMBUsuarios.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        CMBUsuarios.setForeground(new java.awt.Color(0, 255, 255));
        CMBUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ejemplo@gmail.com", "ejemplo2@hotmail.com", "ejemplo3@outlook.com", "ejemplo4@yahoo.com" }));
        CMBUsuarios.setBorder(null);
        CMBUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBUsuariosActionPerformed(evt);
            }
        });
        pdatossesion.add(CMBUsuarios);

        jLabel14.setText("  ");
        pdatossesion.add(jLabel14);
        pdatossesion.add(jLabel18);

        PSTcontrasenia.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        PSTcontrasenia.setForeground(new java.awt.Color(0, 255, 255));
        PSTcontrasenia.setText("jPasswordField1");
        PSTcontrasenia.setBorder(null);
        pdatossesion.add(PSTcontrasenia);

        login.add(pdatossesion);

        padmincomit.setAlignmentY(10.0F);
        padmincomit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        padmincomit.setOpaque(false);
        padmincomit.setLayout(new java.awt.GridLayout(3, 1, -20, -60));

        btnadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Admin_Settings_Male_70px.png"))); // NOI18N
        btnadmin.setMargin(new java.awt.Insets(30, 79, 2, 14));
        btnadmin.setName("btnadmin"); // NOI18N
        btnadmin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Admin_Settings_Male_100px.png"))); // NOI18N
        padmincomit.add(btnadmin);

        btncomite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_User_Groups_70px.png"))); // NOI18N
        btncomite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncomite.setMargin(new java.awt.Insets(30, 27, 2, 14));
        btncomite.setMaximumSize(new java.awt.Dimension(130, 130));
        btncomite.setMinimumSize(new java.awt.Dimension(130, 130));
        btncomite.setName("btncomite"); // NOI18N
        btncomite.setPreferredSize(new java.awt.Dimension(130, 130));
        btncomite.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_User_Groups_100px.png"))); // NOI18N
        padmincomit.add(btncomite);
        padmincomit.add(jLabel5);
        padmincomit.add(jLabel3);
        padmincomit.add(jLabel4);
        padmincomit.add(jLabel6);

        login.add(padmincomit);

        pingresofp.setOpaque(false);
        pingresofp.setLayout(new java.awt.GridLayout(3, 2, 0, -70));

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_In_Progress_70px.png"))); // NOI18N
        btningresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btningresar.setMargin(new java.awt.Insets(30, 19, 2, 14));
        btningresar.setName("btningresar"); // NOI18N
        btningresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_In_Progress_100px.png"))); // NOI18N
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        pingresofp.add(btningresar);
        pingresofp.add(jLabel1);
        pingresofp.add(jLabel2);

        btnfpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Forgot_Password_70px_1.png"))); // NOI18N
        btnfpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnfpassword.setMargin(new java.awt.Insets(10, 20, 2, 55));
        btnfpassword.setName("btnfpassword"); // NOI18N
        btnfpassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Forgot_Password_100px.png"))); // NOI18N
        btnfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfpasswordActionPerformed(evt);
            }
        });
        pingresofp.add(btnfpassword);

        login.add(pingresofp);

        rSPanelsSlider1.add(login, "card3");

        interfaz.add(rSPanelsSlider1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        /**
         *Una primera condicion que se llama al metodo de la clase usuario y contar los 
         * usuarios en la BD esto se hace siempre para verificar si es la primera vez que
         * se inicia el programa y así poder saber si se abré el login o el registro.
         */
        if (us.ContarUsuarios() == 0) {
            Registrarjf registrar = new Registrarjf();
            registrar.setVisible(true);
            this.dispose();
        } else {
            rSPanelsSlider1.setPanelSlider(login, RSPanelsSlider.DIRECT.LEFT);
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        /**
         * Obtengo el usuario que se selecciono en el combo box
         * se hace una condicion para verificar sesion enviandole como parametrso
         * el usuario y la contraseña, si regresa true se abré el splah  y posterior el menu
         * de lo contrario se notificara que revise el usuario o ingrese la contraseña correcta.
         */
        String usuario = (String) CMBUsuarios.getSelectedItem();
        if (us.verificarSesion(DigestUtils.md5Hex(PSTcontrasenia.getText()), usuario)) {
            this.dispose();
            splashjf s = new splashjf();
            menu_usuario menu = new menu_usuario();
            this.dispose();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(10);
                    s.porcentajec.setText(Integer.toString(i) + "%");
                    s.barracargando.setValue(i);
                    if (i == 100) {
                        s.dispose();
                        menu.setVisible(true);
                    }
                }

            } catch (InterruptedException e) {

            }
        } else {
            System.out.println("Error al ingresar la contraseña");
        }

    }//GEN-LAST:event_btningresarActionPerformed

    private void CMBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBUsuariosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CMBUsuariosActionPerformed

    private void btnfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfpasswordActionPerformed
        /* Necesario poner un proceso por si olvidó la contraseña
        Sugerencia: reenviar contraseña: usuario123
         */
    }//GEN-LAST:event_btnfpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new inicio_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMBUsuarios;
    private javax.swing.JPasswordField PSTcontrasenia;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btncomite;
    private javax.swing.JButton btnfpassword;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsiguiente;
    private jcMousePanel.jcMousePanel inicio;
    private jcMousePanel.jcMousePanel interfaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private jcMousePanel.jcMousePanel login;
    private javax.swing.JPanel padmincomit;
    private javax.swing.JPanel pdatossesion;
    private javax.swing.JPanel pgif;
    private javax.swing.JPanel pingresofp;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
}
