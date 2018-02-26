/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void insertar() {

    }
    public int verificarUsuario()
    {
        int total=0;
        try {
            String sql="SELECT count(id) AS total FROM usuario";
            Statement St=con.createStatement();
            ResultSet Rs =St.executeQuery(sql);
            
            while (Rs.next()) {                
                total=Rs.getInt("total");
            }
            return total;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return total;
        }
        
    }
}
