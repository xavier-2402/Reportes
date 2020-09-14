/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConntroladorReportes;

import Conexion.Conexion;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author usuario
 */
public class Controlador {
    
     Conexion conexion = new Conexion();
     Connection con;
    
    
     public  void generarReporte(File file, String title, Map params)   {
        try {
            JasperReport jasper = (JasperReport) JRLoader.loadObject(file);
            JasperPrint print = JasperFillManager.fillReport(jasper, params, conexion.conexion());

            JasperViewer view = new JasperViewer(print, false);

            view.setTitle(title);
            view.setVisible(true);

        } catch (JRException ex) {
            System.out.println(ex.getMessage());
        }    
     }
}
