/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ConntroladorReportes.Controlador;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Main {
    
    
      public static void main(String[] args) {
        // TODO code application logic here
    
            Controlador ctr = new Controlador();

        String path = "/src/reportes/reporteresultados.jasper";
          String pa = System.getProperty("user.dir")+path;
       
      File file = new File(System.getProperty("user.dir")+path);
     
        Map parametros = new HashMap();

        parametros.put("cedula", "1234567899");
       ctr.generarReporte(file, "Reporte Resultado", parametros);
        
       

       
    }
    
}
