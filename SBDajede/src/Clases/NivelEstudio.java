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

    public boolean insertar(String TipoSangres) {
        try {
            String sql = "insert into NivelEstudio(NivelEstudio) values (?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, TipoSangres);
            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultComboBoxModel<String> nivelEstudio() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

        try {
            String sql = "SELECT * FROM NiivelEstudio";
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
