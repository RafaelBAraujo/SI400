/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GproToolController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DAO;
import model.Testing;
import model.TestingSDAO;
import model.TestingStint;

/**
 *
 * @author m173574
 */
public class TestingScreen extends javax.swing.JFrame {

     private GproToolController baseController;
     private Integer TestingKey;
     
    /**
     * Creates new form TestingScreen
     */
    public TestingScreen(GproToolController controller, Integer key){
        baseController = controller;
        this.TestingKey = key;
        initComponents();
        centreWindow();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Laps Done", "Best", "Mean", "FW", "RW", "Eng", "Bra", "Gear", "Susp", "Tyres", "Fuel", "Tyres Cond", "Fuel Left"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResults);
        if (tblResults.getColumnModel().getColumnCount() > 0) {
            tblResults.getColumnModel().getColumn(0).setMinWidth(0);
            tblResults.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblResults.getColumnModel().getColumn(0).setMaxWidth(0);
            tblResults.getColumnModel().getColumn(1).setResizable(false);
            tblResults.getColumnModel().getColumn(2).setResizable(false);
            tblResults.getColumnModel().getColumn(3).setResizable(false);
            tblResults.getColumnModel().getColumn(4).setResizable(false);
            tblResults.getColumnModel().getColumn(5).setResizable(false);
            tblResults.getColumnModel().getColumn(6).setResizable(false);
            tblResults.getColumnModel().getColumn(7).setResizable(false);
            tblResults.getColumnModel().getColumn(8).setResizable(false);
            tblResults.getColumnModel().getColumn(9).setResizable(false);
            tblResults.getColumnModel().getColumn(10).setResizable(false);
            tblResults.getColumnModel().getColumn(11).setResizable(false);
            tblResults.getColumnModel().getColumn(12).setResizable(false);
            tblResults.getColumnModel().getColumn(13).setResizable(false);
        }

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(btnReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        dispose();
        if(this.baseController == null){
            JOptionPane.showMessageDialog(null, "Error at program's controller");
            dispose();
        }
        else{
            MainScreen ms = new MainScreen(this.baseController);
            ms.setVisible(true);
            }
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables

    private void centreWindow() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2 - 150, dim.height / 2 - this.getSize().height / 2 - 150);
    }
    
    private void fillTable(){
    
        DefaultTableModel modelResults = (DefaultTableModel) tblResults.getModel();
        
        baseController.displayTesting(TestingKey, modelResults);
            
    
    }

}