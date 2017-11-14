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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author r176066
 */
public class RaceAnalysisScreen extends javax.swing.JFrame {

    private GproToolController baseController;
    private Integer raceKey;
    
    /**
     * Creates new form RaceAnalysisScreen
     */
    public RaceAnalysisScreen(GproToolController controller, Integer key) {
        this.baseController = controller;
        this.raceKey = key;
        initComponents();
        tblPitstop.setRowHeight(25);
        tblForecast.setRowHeight(32);
        jScrollPane6.getColumnHeader().setVisible(false);
        loadDataIntoTables();
        centerFrame();
    }

    private void centerFrame() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (this.getWidth() / 2),
                middle.y - (this.getHeight() / 2));
        this.setLocation(newLocation);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLaps = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPitstop = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPractice = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCar = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblInitialWear = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblFinalWear = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRisks = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCarCarac = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblQualifyings = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblQSetups = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblForecast = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCarCharac = new javax.swing.JLabel();
        lblCarCharac1 = new javax.swing.JLabel();
        lblCarCharac2 = new javax.swing.JLabel();
        lblCarCharac3 = new javax.swing.JLabel();
        lblCarCharac4 = new javax.swing.JLabel();
        lblCarCharac5 = new javax.swing.JLabel();
        lblCarCharac6 = new javax.swing.JLabel();
        lblCarCharac7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLaps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lap", "Lap time", "Pos", "Tyres", "Weather", "Temp", "Hum", "Events"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLaps);
        if (tblLaps.getColumnModel().getColumnCount() > 0) {
            tblLaps.getColumnModel().getColumn(0).setResizable(false);
            tblLaps.getColumnModel().getColumn(0).setPreferredWidth(8);
            tblLaps.getColumnModel().getColumn(1).setResizable(false);
            tblLaps.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblLaps.getColumnModel().getColumn(2).setResizable(false);
            tblLaps.getColumnModel().getColumn(2).setPreferredWidth(12);
            tblLaps.getColumnModel().getColumn(3).setResizable(false);
            tblLaps.getColumnModel().getColumn(3).setPreferredWidth(15);
            tblLaps.getColumnModel().getColumn(4).setResizable(false);
            tblLaps.getColumnModel().getColumn(4).setPreferredWidth(18);
            tblLaps.getColumnModel().getColumn(5).setResizable(false);
            tblLaps.getColumnModel().getColumn(5).setPreferredWidth(12);
            tblLaps.getColumnModel().getColumn(6).setResizable(false);
            tblLaps.getColumnModel().getColumn(6).setPreferredWidth(10);
            tblLaps.getColumnModel().getColumn(7).setResizable(false);
            tblLaps.getColumnModel().getColumn(7).setPreferredWidth(80);
        }

        tblPitstop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pit", "Pitstop reason", "Tyres condition", "Fuel left", "Refilled to", "Pit time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPitstop.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblPitstop);
        if (tblPitstop.getColumnModel().getColumnCount() > 0) {
            tblPitstop.getColumnModel().getColumn(0).setResizable(false);
            tblPitstop.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblPitstop.getColumnModel().getColumn(1).setResizable(false);
            tblPitstop.getColumnModel().getColumn(1).setPreferredWidth(40);
            tblPitstop.getColumnModel().getColumn(2).setResizable(false);
            tblPitstop.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblPitstop.getColumnModel().getColumn(3).setResizable(false);
            tblPitstop.getColumnModel().getColumn(3).setPreferredWidth(15);
            tblPitstop.getColumnModel().getColumn(4).setResizable(false);
            tblPitstop.getColumnModel().getColumn(4).setPreferredWidth(35);
            tblPitstop.getColumnModel().getColumn(5).setResizable(false);
            tblPitstop.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        tblPractice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lap", "Lap time", "Driver mistake", "Net time", "FWing", "RWing", "Engine", "Brakes", "Gear", "Susp", "Tyres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblPractice);
        if (tblPractice.getColumnModel().getColumnCount() > 0) {
            tblPractice.getColumnModel().getColumn(0).setResizable(false);
            tblPractice.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblPractice.getColumnModel().getColumn(1).setResizable(false);
            tblPractice.getColumnModel().getColumn(1).setPreferredWidth(28);
            tblPractice.getColumnModel().getColumn(2).setResizable(false);
            tblPractice.getColumnModel().getColumn(2).setPreferredWidth(64);
            tblPractice.getColumnModel().getColumn(3).setResizable(false);
            tblPractice.getColumnModel().getColumn(3).setPreferredWidth(28);
            tblPractice.getColumnModel().getColumn(4).setResizable(false);
            tblPractice.getColumnModel().getColumn(4).setPreferredWidth(14);
            tblPractice.getColumnModel().getColumn(5).setResizable(false);
            tblPractice.getColumnModel().getColumn(5).setPreferredWidth(14);
            tblPractice.getColumnModel().getColumn(6).setResizable(false);
            tblPractice.getColumnModel().getColumn(6).setPreferredWidth(14);
            tblPractice.getColumnModel().getColumn(7).setResizable(false);
            tblPractice.getColumnModel().getColumn(7).setPreferredWidth(13);
            tblPractice.getColumnModel().getColumn(8).setResizable(false);
            tblPractice.getColumnModel().getColumn(8).setPreferredWidth(13);
            tblPractice.getColumnModel().getColumn(9).setResizable(false);
            tblPractice.getColumnModel().getColumn(9).setPreferredWidth(13);
            tblPractice.getColumnModel().getColumn(10).setResizable(false);
            tblPractice.getColumnModel().getColumn(10).setPreferredWidth(13);
        }

        tblCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cha", "Eng", "FWing", "RWing", "Underb", "Cool", "Gear", "Bra", "Susp", "Elec"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCar);
        if (tblCar.getColumnModel().getColumnCount() > 0) {
            tblCar.getColumnModel().getColumn(0).setResizable(false);
            tblCar.getColumnModel().getColumn(0).setPreferredWidth(13);
            tblCar.getColumnModel().getColumn(1).setResizable(false);
            tblCar.getColumnModel().getColumn(1).setPreferredWidth(13);
            tblCar.getColumnModel().getColumn(2).setResizable(false);
            tblCar.getColumnModel().getColumn(2).setPreferredWidth(16);
            tblCar.getColumnModel().getColumn(3).setResizable(false);
            tblCar.getColumnModel().getColumn(3).setPreferredWidth(16);
            tblCar.getColumnModel().getColumn(4).setResizable(false);
            tblCar.getColumnModel().getColumn(4).setPreferredWidth(18);
            tblCar.getColumnModel().getColumn(5).setResizable(false);
            tblCar.getColumnModel().getColumn(5).setPreferredWidth(14);
            tblCar.getColumnModel().getColumn(6).setResizable(false);
            tblCar.getColumnModel().getColumn(6).setPreferredWidth(14);
            tblCar.getColumnModel().getColumn(7).setResizable(false);
            tblCar.getColumnModel().getColumn(7).setPreferredWidth(13);
            tblCar.getColumnModel().getColumn(8).setResizable(false);
            tblCar.getColumnModel().getColumn(8).setPreferredWidth(14);
            tblCar.getColumnModel().getColumn(9).setResizable(false);
            tblCar.getColumnModel().getColumn(9).setPreferredWidth(14);
        }

        tblInitialWear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cha", "Eng", "FWing", "RWing", "Underb", "Cool", "Gear", "Bra", "Susp", "Elec"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInitialWear.setRowHeight(17);
        jScrollPane5.setViewportView(tblInitialWear);
        if (tblInitialWear.getColumnModel().getColumnCount() > 0) {
            tblInitialWear.getColumnModel().getColumn(0).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(0).setPreferredWidth(13);
            tblInitialWear.getColumnModel().getColumn(1).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(1).setPreferredWidth(13);
            tblInitialWear.getColumnModel().getColumn(2).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(2).setPreferredWidth(16);
            tblInitialWear.getColumnModel().getColumn(3).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(3).setPreferredWidth(16);
            tblInitialWear.getColumnModel().getColumn(4).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(4).setPreferredWidth(18);
            tblInitialWear.getColumnModel().getColumn(5).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(5).setPreferredWidth(14);
            tblInitialWear.getColumnModel().getColumn(6).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(6).setPreferredWidth(14);
            tblInitialWear.getColumnModel().getColumn(7).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(7).setPreferredWidth(13);
            tblInitialWear.getColumnModel().getColumn(8).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(8).setPreferredWidth(14);
            tblInitialWear.getColumnModel().getColumn(9).setResizable(false);
            tblInitialWear.getColumnModel().getColumn(9).setPreferredWidth(14);
        }

        tblFinalWear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cha", "Eng", "FWing", "RWing", "Underb", "Cool", "Gear", "Bra", "Susp", "Elec"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFinalWear.setRowHeight(23);
        jScrollPane6.setViewportView(tblFinalWear);
        if (tblFinalWear.getColumnModel().getColumnCount() > 0) {
            tblFinalWear.getColumnModel().getColumn(0).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(0).setPreferredWidth(13);
            tblFinalWear.getColumnModel().getColumn(1).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(1).setPreferredWidth(13);
            tblFinalWear.getColumnModel().getColumn(2).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(2).setPreferredWidth(16);
            tblFinalWear.getColumnModel().getColumn(3).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(3).setPreferredWidth(16);
            tblFinalWear.getColumnModel().getColumn(4).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(4).setPreferredWidth(18);
            tblFinalWear.getColumnModel().getColumn(5).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(5).setPreferredWidth(14);
            tblFinalWear.getColumnModel().getColumn(6).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(6).setPreferredWidth(14);
            tblFinalWear.getColumnModel().getColumn(7).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(7).setPreferredWidth(13);
            tblFinalWear.getColumnModel().getColumn(8).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(8).setPreferredWidth(14);
            tblFinalWear.getColumnModel().getColumn(9).setResizable(false);
            tblFinalWear.getColumnModel().getColumn(9).setPreferredWidth(14);
        }

        tblRisks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Overtake", "Defend", "Clear & dry", "Clear & wet", "Malfunc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblRisks);
        if (tblRisks.getColumnModel().getColumnCount() > 0) {
            tblRisks.getColumnModel().getColumn(0).setResizable(false);
            tblRisks.getColumnModel().getColumn(1).setResizable(false);
            tblRisks.getColumnModel().getColumn(2).setResizable(false);
            tblRisks.getColumnModel().getColumn(3).setResizable(false);
            tblRisks.getColumnModel().getColumn(4).setResizable(false);
        }

        tblCarCarac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Power", "Handling", "Acceleration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblCarCarac);
        if (tblCarCarac.getColumnModel().getColumnCount() > 0) {
            tblCarCarac.getColumnModel().getColumn(0).setResizable(false);
            tblCarCarac.getColumnModel().getColumn(1).setResizable(false);
            tblCarCarac.getColumnModel().getColumn(2).setResizable(false);
        }

        tblQualifyings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qualification 1", "Qualification 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblQualifyings);
        if (tblQualifyings.getColumnModel().getColumnCount() > 0) {
            tblQualifyings.getColumnModel().getColumn(0).setResizable(false);
            tblQualifyings.getColumnModel().getColumn(1).setResizable(false);
        }

        tblQSetups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session", "FWing", "RWing", "Eng", "Bra", "Gear", "Susp", "Tyres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQSetups.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tblQSetups);
        if (tblQSetups.getColumnModel().getColumnCount() > 0) {
            tblQSetups.getColumnModel().getColumn(0).setResizable(false);
            tblQSetups.getColumnModel().getColumn(1).setResizable(false);
            tblQSetups.getColumnModel().getColumn(2).setResizable(false);
            tblQSetups.getColumnModel().getColumn(3).setResizable(false);
            tblQSetups.getColumnModel().getColumn(4).setResizable(false);
            tblQSetups.getColumnModel().getColumn(5).setResizable(false);
            tblQSetups.getColumnModel().getColumn(6).setResizable(false);
            tblQSetups.getColumnModel().getColumn(7).setResizable(false);
        }

        tblForecast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quarter", "Forecast"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblForecast.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tblForecast);
        if (tblForecast.getColumnModel().getColumnCount() > 0) {
            tblForecast.getColumnModel().getColumn(0).setResizable(false);
            tblForecast.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblForecast.getColumnModel().getColumn(1).setResizable(false);
            tblForecast.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Starting risk"
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
        jScrollPane12.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        lblCarCharac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac.setText("Car character");

        lblCarCharac1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac1.setText("Qualifyings");

        lblCarCharac2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac2.setText("Laps");

        lblCarCharac3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac3.setText("Practice stints");

        lblCarCharac4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac4.setText("Pitstops");

        lblCarCharac5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac5.setText("Car parts & wear");

        lblCarCharac6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac6.setText("Risks");

        lblCarCharac7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCarCharac7.setText("Race forecast");

        javax.swing.GroupLayout pnlMainPanelLayout = new javax.swing.GroupLayout(pnlMainPanel);
        pnlMainPanel.setLayout(pnlMainPanelLayout);
        pnlMainPanelLayout.setHorizontalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblCarCharac3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarCharac2)
                .addGap(232, 232, 232))
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(lblCarCharac6))
                            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(lblCarCharac7))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlMainPanelLayout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(lblCarCharac4))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                            .addGap(188, 188, 188)
                                            .addComponent(lblCarCharac1))
                                        .addComponent(jScrollPane9)
                                        .addComponent(jScrollPane10))
                                    .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6)
                                        .addComponent(jScrollPane5)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                                .addComponent(lblCarCharac5)
                                .addGap(191, 191, 191))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                                .addComponent(lblCarCharac)
                                .addGap(205, 205, 205))))))
        );
        pnlMainPanelLayout.setVerticalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarCharac2)
                    .addComponent(lblCarCharac3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblCarCharac4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCarCharac6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCarCharac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCarCharac5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addComponent(lblCarCharac1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addComponent(lblCarCharac7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void loadDataIntoTables(){
        
        DefaultTableModel modelPractice = (DefaultTableModel) tblPractice.getModel();
        DefaultTableModel modelLaps = (DefaultTableModel) tblLaps.getModel();
        DefaultTableModel modelPistops = (DefaultTableModel) tblPitstop.getModel();
        DefaultTableModel modelCar = (DefaultTableModel) tblCar.getModel();
        DefaultTableModel modelInitialWear = (DefaultTableModel) tblInitialWear.getModel();
        DefaultTableModel modelFinalWear = (DefaultTableModel) tblFinalWear.getModel();
        DefaultTableModel modelCarCarac = (DefaultTableModel) tblCarCarac.getModel();
        DefaultTableModel modelQualifyings = (DefaultTableModel) tblQualifyings.getModel();
        DefaultTableModel modelQSetups = (DefaultTableModel) tblQSetups.getModel();
        DefaultTableModel modelForecast = (DefaultTableModel) tblForecast.getModel();
        DefaultTableModel modelRisks = (DefaultTableModel) tblRisks.getModel();
        
        tblForecast.getColumnModel().getColumn(0).setCellEditor(new javax.swing.DefaultCellEditor(new JTextField()));
        
        tblInitialWear.setTableHeader(null);
        tblFinalWear.setTableHeader(null);
        
        baseController.displayRace(raceKey, modelPractice, modelLaps, modelPistops, modelCar, modelCarCarac, modelInitialWear, modelFinalWear, modelQualifyings,
                                   modelQSetups, modelForecast, modelRisks);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCarCharac;
    private javax.swing.JLabel lblCarCharac1;
    private javax.swing.JLabel lblCarCharac2;
    private javax.swing.JLabel lblCarCharac3;
    private javax.swing.JLabel lblCarCharac4;
    private javax.swing.JLabel lblCarCharac5;
    private javax.swing.JLabel lblCarCharac6;
    private javax.swing.JLabel lblCarCharac7;
    private javax.swing.JPanel pnlMainPanel;
    private javax.swing.JTable tblCar;
    private javax.swing.JTable tblCarCarac;
    private javax.swing.JTable tblFinalWear;
    private javax.swing.JTable tblForecast;
    private javax.swing.JTable tblInitialWear;
    private javax.swing.JTable tblLaps;
    private javax.swing.JTable tblPitstop;
    private javax.swing.JTable tblPractice;
    private javax.swing.JTable tblQSetups;
    private javax.swing.JTable tblQualifyings;
    private javax.swing.JTable tblRisks;
    // End of variables declaration//GEN-END:variables
}
