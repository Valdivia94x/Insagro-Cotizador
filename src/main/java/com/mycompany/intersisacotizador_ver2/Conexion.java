/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intersisacotizador_ver2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Conexion {
    Connection conectar = null;
    
    String url = "jdbc:sqlserver://localhost:1433;databaseName=Intersisa;user=sa;password=acceso2012;TrustServerCertificate=True";
    
    public Connection establecerConexion(){
        try{
            conectar = DriverManager.getConnection(url);
            return conectar;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null ,"Error al conectar a la base de datos, error: "+e.toString());
            return null;
        }
    }
}
