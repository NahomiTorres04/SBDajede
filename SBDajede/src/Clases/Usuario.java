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
public class Usuario {

    private Connection con = null;
    private Conexion conexion;

    public Usuario() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }

    public boolean insertar(String nombre, String apellido, String contrasenia, String Puesto, String email) {
        try {
            String ingresar = "Insert into usuario(nombreusuario, password, puesto, nombre, apellido)"
                    + "Values(?,?,?,?,?)";
            PreparedStatement Pst = con.prepareStatement(ingresar);
            Pst.setString(1, email);
            Pst.setString(2, contrasenia);
            Pst.setString(3, Puesto);
            Pst.setString(4, nombre);
            Pst.setString(5, apellido);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int verificarUsuario() {
        int total = 0;
        try {
            String sql = "SELECT count(*) AS total FROM usuario";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);

            while (Rs.next()) {
                total = Rs.getInt("total");
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return total;
        }

    }

    public DefaultComboBoxModel usuarios() {
        try {
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            String sql = "SELECT * FROM usuario";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                modeloCombo.addElement(Rs.getString("nombreusuario"));
            }
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean verificar(String contrasenia, String usuario) {
        try {
            String sql = "SELECT password FROM usuario where nombreusuario='" + usuario + "'";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            String pass = "";
            while (Rs.next()) {
                pass = Rs.getString("password");
            }

            return pass.equals(contrasenia);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
