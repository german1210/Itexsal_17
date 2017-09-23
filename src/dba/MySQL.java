/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ger
 */
public class MySQL {
    
    private static String url="jdbc:mysql://localhost/expo_itexsal";
    private static String usuario="root";
    private static String clave="121020";
    private static Connection cn;
    
    public static Connection Conectar(){
        String driver="com.mysql.jdbc.Driver";
                try
                    {
                        Class.forName(driver);
                        System.out.println("Cargando controlador...");
                        cn = DriverManager.getConnection(url, usuario, clave);
                        System.out.println("Conectividad a Base de Datos exitosa...");
                    }   
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
                
                }
                return cn;
    }
    
}
