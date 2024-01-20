/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intersisacotizador_ver2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        Conexion objetoConexion = new Conexion();
        objetoConexion.establecerConexion();
    }
}
