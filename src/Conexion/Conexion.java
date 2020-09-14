/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexion {

    Connection conexion;

    public Conexion() {
    }

    public Connection conexion() {
        String usuario = "postgres";
        String password = "fma*2020*";
        String url = "jdbc:postgresql://35.206.88.13:5432/marylove";

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            if (conexion != null) {
                System.out.println("CONECTADO A LA BASE DE DATOS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS DE CONEXION " + e);
        }

        return conexion;

    }

}
