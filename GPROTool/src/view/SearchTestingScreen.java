/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GproToolController;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import static view.Login.setLookAndFeel;

/**
 *
 * @author Dulcina
 */
public class SearchTestingScreen extends javax.swing.JFrame {
    
    private GproToolController baseController;
    
    /**
     * Creates new form SearchTestingScreen
     */
    public SearchTestingScreen(GproToolController controller) {
        baseController = controller;
        setLookAndFeel();
        initComponents();
        addRankDivisions();
        
        centerFrame();
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
        jTable1 = new javax.swing.JTable();
        lblSeason = new javax.swing.JLabel();
        lblRank = new javax.swing.JLabel();
        lblTrack = new javax.swing.JLabel();
        lblTyres = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblWeather = new javax.swing.JLabel();
        cmbSeason = new javax.swing.JComboBox<>();
        cmbRank = new javax.swing.JComboBox<>();
        cmbTrack = new javax.swing.JComboBox<>();
        cmbTyres = new javax.swing.JComboBox<>();
        cmbTemp = new javax.swing.JComboBox<>();
        cmbWeather = new javax.swing.JComboBox<>();
        btnSetCarLvl = new javax.swing.JButton();
        btnSetCarWear = new javax.swing.JButton();
        btnSetPilot = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        lblRank1 = new javax.swing.JLabel();
        cmbRankDivision = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSeason.setText("Season");

        lblRank.setText("Rank");

        lblTrack.setText("Track");

        lblTyres.setText("Tyres");

        lblTemp.setText("Temp");

        lblWeather.setText("Weather");

        cmbSeason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "59", "60", "61" }));

        cmbRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Rookie", "Amateur", "Pro", "Master", "Elite" }));
        cmbRank.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRankItemStateChanged(evt);
            }
        });

        cmbTrack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

        cmbTyres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

        cmbTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

        cmbWeather.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

        btnSetCarLvl.setText("Set car level");

        btnSetCarWear.setText("Set car Wear");

        btnSetPilot.setText("Set pilot");

        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Testing"
            }
        ));
        jScrollPane2.setViewportView(tblResults);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblRank1.setText("Division");

        cmbRankDivision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "87", "59" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeason)
                                    .addComponent(cmbSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRank)
                                    .addComponent(cmbRank, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRank1)
                                    .addComponent(cmbRankDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTrack)
                                    .addComponent(cmbTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTyres)
                                    .addComponent(cmbTyres, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTemp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWeather)
                                    .addComponent(cmbWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSetPilot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSetCarWear))
                            .addComponent(btnSetCarLvl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTrack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTrack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSetCarLvl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTyres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTyres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemp)
                            .addComponent(lblWeather))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSeason)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSetCarWear)
                        .addGap(11, 11, 11)
                        .addComponent(btnSetPilot))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRank)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRank1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRankDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String season = (String) cmbSeason.getSelectedItem();
        String rank = (String) cmbRank.getSelectedItem();
        String rankDivision = (String) cmbRankDivision.getSelectedItem();
        
        if (this.baseController.searchTesting(Integer.parseInt(season), rank, Integer.parseInt(rankDivision))){
            System.out.println("ENCONTREI");
            DefaultTableModel model = (DefaultTableModel) tblResults.getModel();
            model.addRow(new Object[]{"S" + season + " " + rank + rankDivision});
        }
        else{
            System.out.println("NAO ENCONTREI");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbRankItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRankItemStateChanged
        // TODO add your handling code here:
        addRankDivisions();
    }//GEN-LAST:event_cmbRankItemStateChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetCarLvl;
    private javax.swing.JButton btnSetCarWear;
    private javax.swing.JButton btnSetPilot;
    private javax.swing.JComboBox<String> cmbRank;
    private javax.swing.JComboBox<String> cmbRankDivision;
    private javax.swing.JComboBox<String> cmbSeason;
    private javax.swing.JComboBox<String> cmbTemp;
    private javax.swing.JComboBox<String> cmbTrack;
    private javax.swing.JComboBox<String> cmbTyres;
    private javax.swing.JComboBox<String> cmbWeather;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRank;
    private javax.swing.JLabel lblRank1;
    private javax.swing.JLabel lblSeason;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTrack;
    private javax.swing.JLabel lblTyres;
    private javax.swing.JLabel lblWeather;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
    
    private void centerFrame() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (this.getWidth() / 2),
                middle.y - (this.getHeight() / 2));
        this.setLocation(newLocation);
    }

    private void addRankDivisions() {
        String rank = (String) cmbRank.getSelectedItem();
        
        if(rank.compareTo("Rookie") == 0 || rank.compareTo("Any") == 0){
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
}
