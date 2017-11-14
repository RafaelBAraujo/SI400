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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Rafael
 */
public class ReadRaceScreen extends javax.swing.JFrame {

    private GproToolController baseController;

    /**
     * Creates new form ReadRaceScreen
     */
    public ReadRaceScreen(GproToolController controller) {
        this.baseController = controller;
        initComponents();
        centerFrame();
        initSelfListeners(this, this.prgProgress, this.baseController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainPanel = new javax.swing.JPanel();
        prgProgress = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txpLog = new javax.swing.JTextPane();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        pnlMainPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlMainPanelFocusGained(evt);
            }
        });

        txpLog.setEditable(false);
        jScrollPane1.setViewportView(txpLog);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainPanelLayout = new javax.swing.GroupLayout(pnlMainPanel);
        pnlMainPanel.setLayout(pnlMainPanelLayout);
        pnlMainPanelLayout.setHorizontalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(prgProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnCancel)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlMainPanelLayout.setVerticalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(prgProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void pnlMainPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlMainPanelFocusGained

    }//GEN-LAST:event_pnlMainPanelFocusGained

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Thread.currentThread().interrupt();
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void centerFrame() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (this.getWidth() / 2),
                middle.y - (this.getHeight() / 2));
        this.setLocation(newLocation);
    }

    private void initSelfListeners(javax.swing.JFrame window, javax.swing.JProgressBar bar, GproToolController controller) {

        WindowListener taskStarterWindowListener = new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                readRace r = new readRace(window, bar, txpLog, controller);
                r.execute();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                Thread.currentThread().interrupt();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                dispose();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }

        };

        //Here is where the magic happens! We make (a listener within) the frame start listening to the frame's own events!
        this.addWindowListener(taskStarterWindowListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMainPanel;
    private javax.swing.JProgressBar prgProgress;
    private javax.swing.JTextPane txpLog;
    // End of variables declaration//GEN-END:variables
}

class readRace extends SwingWorker<Void, Void> {

    private javax.swing.JProgressBar bar;
    private javax.swing.JTextPane txp;
    private GproToolController baseController;
    private javax.swing.JFrame window;

    public readRace(javax.swing.JFrame window, javax.swing.JProgressBar b, javax.swing.JTextPane txp, GproToolController controller) {
        this.bar = b;
        this.txp = txp;
        baseController = controller;
        this.window = window;
    }

    @Override
    protected Void doInBackground() throws Exception {

        this.baseController.readRaceAnalysis(this.bar, this.txp, this.window);

        return null;
    }

}
