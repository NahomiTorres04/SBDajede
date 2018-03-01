/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mynor
 */
public class NivelEstudio {

    private Connection con = null;
    private Conexion conexion;

    public NivelEstudio() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
/**
 * metodo para insertar los tipos de estudio que va a tener cada asociado.
 * @param TipoEstudio
 * @return 
 */
    public boolean insertar(String TipoEstudio) {
        try {
            String sql = "insert into nivelestudio(NivelEstudio) values (?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, TipoEstudio);
            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /**
     * Regresa un default combo box model con todos los niveles de estudio que va a existir en la BD
     * @return 
     */
    public DefaultComboBoxModel<String> nivelEstudio() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

        try {
            String sql = "SELECT * FROM niivelestudio";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                modeloCombo.addElement(Rs.getString("NivelEstudio"));
            }
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloCombo;
    }

}
