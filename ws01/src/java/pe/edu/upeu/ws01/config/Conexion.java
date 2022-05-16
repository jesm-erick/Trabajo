/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.ws01.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jhone
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/dbsoap";
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String PASS="root";
    private static final String USER="root";
    private static Connection cx = null;
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }

    public PreparedStatement prepareStatement(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}