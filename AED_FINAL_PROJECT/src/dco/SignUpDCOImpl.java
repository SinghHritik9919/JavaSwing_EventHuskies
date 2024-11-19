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
 * @author nehamehendale
 */
public class SignUpDCOImpl {

    User user;

    public SignUpDCOImpl(User user) {
        this.user = user;
    }

    public void RegistereUser() {
        try {
            Connection conn = DbUtility.getConnection();
            PreparedStatement prep = conn.prepareStatement(IQueryMapper.INSERT_USERS);
//            PreparedStatement prep1 = conn.prepareStatement(IQueryMapper.INSERT_PROPERTY_REVIEW);

            prep.setString(1, user.getEmail());
            prep.setString(2, user.getEmail());
            prep.setString(3, user.getFirstName());
            prep.setString(4, user.getLastName());
            prep.setString(5, user.getMobile());
            prep.setString(6, user.getPassword());
            prep.setString(7, user.getRole());// password
            //java.util.Date d;
            //String s;
            //d = new java.util.Date(jDob.getDate());
            //SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            //Date dob = jDob.getDate();
            //s = df.format(dob);
            //          prep.setString(8, s);
            System.out.println("\nDatabase agdkj dao...");
                        System.out.println(prep.toString());

            prep.executeUpdate();
            System.out.println("\nDatabase eecuted dao...");

            JOptionPane.showMessageDialog(null, "User Created Successfully");
        } catch (ExceptionHandling | SQLException e) {
            System.out.println("\nDatabase eecutedexception dao...");
            JOptionPane.showMessageDialog(null, e);
        }
    }
;
}
