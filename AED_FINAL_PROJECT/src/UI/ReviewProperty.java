/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import module.PropertyEnlists;
import java.sql.Connection;
import dco.IQueryMapper;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.DbUtility;

/**
 *
 * @author Priti
 */
public class ReviewProperty extends javax.swing.JPanel {

    /**
     * Creates new form DeleteProperty
     */
    public ReviewProperty() {
        initComponents();
        populateReviewTable();
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(107, 112, 92));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "REVIEW PROPERTY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  REVIEW PROPERTY ");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEtchedBorder()));

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PropertyID", "Property Name", "Capacity", "Street", "City", "Status"
            }
        ));
        jScrollPane1.setViewportView(reviewTable);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/forms/accept.png"))); // NOI18N
        jButton1.setText("APPROVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/forms/reject.png"))); // NOI18N
        jButton2.setText("DECLINE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        setPropertyStatus(evt.getActionCommand());
        JOptionPane.showMessageDialog(this, evt.getActionCommand());
        
//        int selectedRow = reviewTable.getSelectedRow();
//
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(this, "Please select a row to update!");
//            return;
//        }
//
//        DefaultTableModel reviewTableModel = (DefaultTableModel) reviewTable.getModel();
//        PropertyEnlist property = (PropertyEnlist) reviewTableModel.getValueAt(selectedRow, 1);
//
//        try ( Connection conn = DbUtil.getConnection();  PreparedStatement ps = conn.prepareStatement(IQueryMapper.UPDATE_PROPERTY_STATUS)) {
//
//            ps.setString(1, "APPROVED");
//            ps.setString(2, property.getPropertyID());
//
//        } catch (Exception ex) {
//            Logger.getLogger(ReviewProperty.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setPropertyStatus(evt.getActionCommand());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setPropertyStatus(String buttonName) {
        int selectedRow = reviewTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }

        DefaultTableModel reviewTableModel = (DefaultTableModel) reviewTable.getModel();
        PropertyEnlists property = (PropertyEnlists) reviewTableModel.getValueAt(selectedRow, 1);

        try ( Connection conn = DbUtility.getConnection();  
                PreparedStatement ps = conn.prepareStatement(IQueryMapper.UPDATE_PROPERTY_STATUS)) {

            System.out.println(buttonName.equals("APPROVE") + " " + buttonName);
            if(buttonName.equals("APPROVE")) {
                ps.setString(1, "APPROVED");
                ps.setString(2, property.getPropertyID());
            } else if(buttonName.equals("DECLINE")) {
                ps.setString(1, "DECLINED");
                ps.setString(2, property.getPropertyID());
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Request");
            }
            
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ReviewProperty.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reviewTable;
    // End of variables declaration//GEN-END:variables

    private void populateReviewTable() {
        DefaultTableModel populateReviewTable = (DefaultTableModel) reviewTable.getModel();
        populateReviewTable.setRowCount(0);
        List<PropertyEnlists> propertyList;
        
        try(Connection conn = DbUtility.getConnection();  
                PreparedStatement ps = conn.prepareStatement(IQueryMapper.SELECT_CREATED_PROPERTY)){
            
            ps.setString(1, "Created");
            
            ResultSet rs = ps.executeQuery();
            if(rs == null){
                JOptionPane.showMessageDialog(this, "Currently No Records to Display");
            }
            propertyList = new ArrayList<>();
            PropertyEnlists pe = new PropertyEnlists();
            
            while(rs.next()){
                pe.setPropertyID(String.valueOf(rs.getInt(1)));
                pe.setPropertyName(rs.getString(2));
                pe.setStreet(rs.getString(3));
                pe.setCity(rs.getString(4));
                pe.setState(rs.getString(5));
                pe.setZipCode(rs.getString(6));
                pe.setCapacity(rs.getString(7));
                pe.setStatus(rs.getString(10));
                System.out.println(pe.toString());
                propertyList.add(pe);
            }
            
            System.out.println(propertyList);
            
            for (PropertyEnlists prop : propertyList){
                Object[] row = new Object[6];
                
                row[0] = prop.getPropertyID();
                row[1] = prop;
                row[2] = prop.getCapacity();
                row[3] = prop.getStreet();
                row[4] = prop.getCity();
                row[5] = prop.getStatus();
                
                populateReviewTable.addRow(row);
            }            
            
        } catch (Exception ex) {
            Logger.getLogger(ReviewProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}