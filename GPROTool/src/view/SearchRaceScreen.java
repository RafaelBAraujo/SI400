/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GproToolController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Race;

/**
 *
 * @author Rafael
 */
public class SearchRaceScreen extends javax.swing.JFrame {

    private GproToolController baseController;
    
    /**
     * Creates new form MainScreen
     */
    public SearchRaceScreen(GproToolController controller) {
        baseController = controller;
        setLookAndFeel();
        centreWindow();
        initComponents();
        addRankDivisions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        lblSeason = new javax.swing.JLabel();
        cmbSeason = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbRank = new javax.swing.JComboBox<>();
        cmbRankDivision = new javax.swing.JComboBox<>();
        lblRankDivision = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblSeason.setText("Season");

        cmbSeason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "58", "59", "60", "61" }));

        jLabel1.setText("Rank");

        cmbRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rookie", "Amateur", "Pro", "Master", "Elite" }));
        cmbRank.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRankItemStateChanged(evt);
            }
        });

        lblRankDivision.setText("Division");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Races"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblResults);
        if (tblResults.getColumnModel().getColumnCount() > 0) {
            tblResults.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeason))
                        .addGap(40, 40, 40)
                        .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cmbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbRankDivision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRankDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(btnSearch))
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSeason)
                    .addComponent(lblRankDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRankDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String season = (String) cmbSeason.getSelectedItem();
        String rank = (String) cmbRank.getSelectedItem();
        String rankDivision = (String) cmbRankDivision.getSelectedItem();
        
        if (this.baseController.searchRace(Integer.parseInt(season), rank, Integer.parseInt(rankDivision))){
            System.out.println("ENCONTREI");
            DefaultTableModel model = (DefaultTableModel) tblResults.getModel();
            model.addRow(new Object[]{"S" + season + " " + rank + rankDivision});
        }
        else{
            System.out.println("NAO ENCONTREI");
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbRankItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRankItemStateChanged
        addRankDivisions();
    }//GEN-LAST:event_cmbRankItemStateChanged

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }

    public void centreWindow() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2 - 150, dim.height / 2 - this.getSize().height / 2 - 150);
    }
    
    public void addRankDivisions(){
        
        String rank = (String) cmbRank.getSelectedItem();
        
        if(rank.compareTo("Rookie") == 0){
            cmbRankDivision.removeAllItems();
            for(int i = 1; i < 201; i++){
                cmbRankDivision.addItem(String.valueOf(i));
            }
        }
        else if(rank.compareTo("Amateur") == 0){
            cmbRankDivision.removeAllItems();
            for(int i = 1; i < 126; i++){
                cmbRankDivision.addItem(String.valueOf(i));
            }
        }
        else if (rank.compareTo("Pro") == 0) {
            cmbRankDivision.removeAllItems();
            for (int i = 1; i < 26; i++) {
                cmbRankDivision.addItem(String.valueOf(i));
            }
        }
        else if (rank.compareTo("Master") == 0) {
            cmbRankDivision.removeAllItems();
            for (int i = 1; i < 6; i++) {
                cmbRankDivision.addItem(String.valueOf(i));
            }
        }
        else if (rank.compareTo("Elite") == 0) {
            cmbRankDivision.removeAllItems();
            for (int i = 1; i < 2; i++) {
                cmbRankDivision.addItem(String.valueOf(i));
            }
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbRank;
    private javax.swing.JComboBox<String> cmbRankDivision;
    private javax.swing.JComboBox<String> cmbSeason;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRankDivision;
    private javax.swing.JLabel lblSeason;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables
}
