/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mynor
 */
public class Conexion 
{
    private String nombreBD="proyecto";
    private String usuario="pruebas";
    private String password="123456789";
    private String url="jdbc:mysql://25.13.156.71:3306/"+nombreBD+"?autoReconnect=true&useSSL=false";
    private Connection con=null;
    public  Conexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Connection getConnection()
    {
        return con;
    }
}
