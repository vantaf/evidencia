/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author milto
 */
public class conexion {

    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo_conex", "root", "Miltondominick2@");
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("No Conectado");
        }
    }
    public Connection getConection(){
    return con;
    }
    

}   
