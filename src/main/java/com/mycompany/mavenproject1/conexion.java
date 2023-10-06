/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class conexion {
    
    
    Connection conectar;
    String usuario ="root";
    String contraseña ="Progra1.2023$_";
    String bd ="formulario";
    String ip ="localhost";
    String puerto ="3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public  conexion (){
    try {
         Class.forName("com.mysql.jdbc.Driver");
         conectar=DriverManager.getConnection(cadena, usuario, contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se conecto a la base de datos, error: "+e.toString());
        }
    }
    public Connection getConnection(){
    return conectar;
    }
}

