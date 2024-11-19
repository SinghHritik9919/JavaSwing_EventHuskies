/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dco;

import exceptions.ExceptionHandling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import module.User;
import utility.DbUtility;

/**
 *
 * @author hriti
 */
public class LoginDCOImpl implements IQueryMapper {
    
    User user;

    public LoginDCOImpl(User user) {
        this.user = user;
    }
    
    //trying something
    
    public void RegisteredUser(){
    
         try{
             Connection conn = DbUtility.getConnection();
             PreparedStatement prep = conn.prepareStatement(IQueryMapper.INSERT_USERS);
             prep.setString(1, user.getEmail());
             prep.setString(2, user.getPassword());
             
             prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Login Successful");
        }
       catch(ExceptionHandling | SQLException e){
           
           JOptionPane.showMessageDialog(null, e);
       }
    }
}
