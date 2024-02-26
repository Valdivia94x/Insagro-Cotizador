/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intersisacotizador_ver2;

import com.mycompany.intersisacotizador_ver2.MenuFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.SwingUtilities;

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        //Conexion objetoConexion = new Conexion();
        //objetoConexion.establecerConexion();
        SwingUtilities.invokeLater(() -> {
            /*AccesoFrame af = new AccesoFrame();
            af.setVisible(true);*/
            MenuFrame mf = new MenuFrame();
            mf.setVisible(true);
            });
    }
}
