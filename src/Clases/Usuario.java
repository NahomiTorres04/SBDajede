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

    /**
     * metodo para insertar a los usuarios a la base de datos.
     *
     * @param nombre
     * @param apellido
     * @param contrasenia
     * @param Puesto
     * @param email
     * @return
     */
    public boolean insertar(String nombre, String apellido, String contrasenia, String Puesto, String email) {
        try {
            /**
             * Antes de insertar al usuario se hace una consulta a la tabla
             * puestos, ya que lo que guardaremos en la tabla usuario solo es el
             * id y recibimos el nombre,
             */
            int id = 0;
            String sql = "select id from puestos where puesto= '" + Puesto + "'";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                id = Rs.getInt("id");
            }
            /**
             * Al ya obtener el id del puesto se hace la siguente sentencia sql
             * para insertar al usuario se debe tomar en cuenta que los valores
             * que se le insertan esta con ? porque desconocemos que valores va
             * a tomar
             * 
             */
            sql = "Insert into usuario(nombreusuario, password, nombre, apellido,puestos_id)"
                    + "Values(?,?,?,?,?)";
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setString(1, email);
            Pst.setString(2, contrasenia);
            Pst.setString(3, nombre);
            Pst.setString(4, apellido);
            Pst.setInt(5, id);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Metodo que va a retornar a los puestos que existen en la base de datos se
     * retorna un DefaultComboBox
     *
     * @return
     */
    public DefaultComboBoxModel<String> puestos() {
        /**
         * Se declara un defaultcombobox despues se hace la consulta a la tabla
         * puestos para obtener todos los puestos que puede haber en la
         * asociacion.
         */
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * FROM puestos";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                modeloCombo.addElement(Rs.getString("puesto"));
            }
            //se retorna el modelo,
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloCombo;
    }

    /**
     * Este metodo sirve para contar cuantos usuarios hay en la BD esto lo
     * hacemos cuando la BD se abré por primera vez y así poder tomar la
     * decisión de que ventana abrir is la de registrar o login
     *
     * @return
     */
    public int ContarUsuarios() {
        /**
         * Se hace una consulta a la tabla usuarios y contamos cuantos usuarios
         * hay.
         */
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

    /**
     * metodo que nos sirve para retornar en un combo box
     *a todos los usuarios, que en este caso sera para el login.
     * @return
     */
    public DefaultComboBoxModel usuarios() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {
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
        return modeloCombo;
    }
    /**
     * Este metodo recibe 2 parametros que es la contraseña y el usuario
     * se hace una consulta a la tabla usuarios
     * para obtener la contraseña (encriptada ya)
     * y se compara con la contraseña que se recibe como parametro
     * (igual ya encriptada) si es igual regresa true si no false
     * @param contrasenia
     * @param usuario
     * @return 
     */
    public boolean verificarSesion(String contrasenia, String usuario) {
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
