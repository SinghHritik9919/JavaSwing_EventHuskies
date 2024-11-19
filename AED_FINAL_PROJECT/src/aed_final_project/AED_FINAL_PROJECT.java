/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aed_final_project;

import exceptions.ExceptionHandling;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utility.DbUtility;

/**
 *
 * @author vivekmishra
 */
public class AED_FINAL_PROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExceptionHandling {
        // TODO code application logic here
        try {
            Connection conn = DbUtility.getConnection();
            Statement st = conn.createStatement();

            
            String qs = "SELECT * FROM property_enlist";
            
             ResultSet rs = st.executeQuery(qs);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }    
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new ExceptionHandling("Unable to retieve records");
        }
    }
    
}
