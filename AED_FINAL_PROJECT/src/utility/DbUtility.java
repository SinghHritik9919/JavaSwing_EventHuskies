/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import dco.IQueryMapper;
import exceptions.ExceptionHandling;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vivekmishra
 */
public class DbUtility {

    private static Connection conn = null;

    public static Connection getConnection() throws ExceptionHandling {
           
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            Class.forName(IQueryMapper.CLASSNAME);
            String userName = IQueryMapper.USERNAME;
            String password = IQueryMapper.PASSWORD;
            String url = IQueryMapper.URL;
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("\nDatabase Connection Established...");
        } catch (SQLException e) {
            throw new ExceptionHandling("Connection Not Established. Check Username or Password");
        } catch (ClassNotFoundException ex) {
            throw new ExceptionHandling("Driver Class Not Found");
        }
        return conn;
    }
    
    public static void main(String [] args){
    
        try {
            getConnection();
        } catch (ExceptionHandling ex) {
            Logger.getLogger(DbUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
