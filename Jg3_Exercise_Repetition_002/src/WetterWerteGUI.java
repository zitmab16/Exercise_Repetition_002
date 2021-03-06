
import java.io.File;
import java.time.LocalDateTime;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class WetterWerteGUI extends javax.swing.JFrame {
    private WetterModell wm = new WetterModell();
    /**
     * Creates new form WetterWerteGUI
     */
    public WetterWerteGUI() {
        initComponents();
        liOutput.setModel(wm);
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
        liOutput = new javax.swing.JList<>();
        lbAnzeige = new javax.swing.JLabel();
        jsTemperatur = new javax.swing.JSlider();
        jsLuftfeuchtigkeit = new javax.swing.JSlider();
        lbTemp = new javax.swing.JLabel();
        lbLF = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        lbEingabe = new javax.swing.JLabel();
        lbTempChange = new javax.swing.JLabel();
        lbLFChange = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();
        miLoad = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(liOutput);

        lbAnzeige.setText("Anzeige");

        jsTemperatur.setMajorTickSpacing(10);
        jsTemperatur.setMaximum(40);
        jsTemperatur.setMinimum(-20);
        jsTemperatur.setMinorTickSpacing(5);
        jsTemperatur.setPaintLabels(true);
        jsTemperatur.setValue(10);
        jsTemperatur.createStandardLabels(1);
        jsTemperatur.setPaintTicks(true);
        jsTemperatur.setPaintLabels(true);
        jsTemperatur.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsTemperaturStateChanged(evt);
            }
        });

        jsLuftfeuchtigkeit.setMajorTickSpacing(20);

        jsLuftfeuchtigkeit.setMaximum(100);

        jsLuftfeuchtigkeit.setMinimum(0);

        jsLuftfeuchtigkeit.setMinorTickSpacing(10);

        jsLuftfeuchtigkeit.setPaintLabels(true);
        jsLuftfeuchtigkeit.setValue(10);
        jsLuftfeuchtigkeit.createStandardLabels(1);
        jsLuftfeuchtigkeit.setPaintTicks(true);
        jsLuftfeuchtigkeit.setPaintLabels(true);
        jsLuftfeuchtigkeit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsLuftfeuchtigkeitStateChanged(evt);
            }
        });

        lbTemp.setText("Temperatur: ");

        lbLF.setText("Luftfeuchtigkeit:");

        btAdd.setText("Einfügen");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        lbEingabe.setText("Eingabe");

        lbTempChange.setText(jsTemperatur.getValue()+"°");

        lbLFChange.setText(jsLuftfeuchtigkeit.getValue()+"%");

        jMenu1.setText("Datei");

        miSave.setText("Speichern");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        miLoad.setText("Laden");
        miLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadActionPerformed(evt);
            }
        });
        jMenu1.add(miLoad);

        miExit.setText("Beenden");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        mbMenu.add(jMenu1);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsTemperatur, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEingabe)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLFChange, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTempChange, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnzeige)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEingabe)
                    .addComponent(lbAnzeige))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTempChange, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLFChange, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsTemperaturStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsTemperaturStateChanged
        lbTempChange.setText(jsTemperatur.getValue()+"°");
    }//GEN-LAST:event_jsTemperaturStateChanged

    private void jsLuftfeuchtigkeitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsLuftfeuchtigkeitStateChanged
        lbLFChange.setText(jsLuftfeuchtigkeit.getValue()+"%");
    }//GEN-LAST:event_jsLuftfeuchtigkeitStateChanged

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        int temp=jsTemperatur.getValue();
        int luftfeuchtigkeit=jsLuftfeuchtigkeit.getValue();
        LocalDateTime ldt = LocalDateTime.now();
        
        wm.add(new WetterWert(temp,luftfeuchtigkeit,ldt));
    }//GEN-LAST:event_btAddActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void miLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miLoadActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        File f=null;
       
        File workingDirectory = new File(System.getProperty("user.dir"));
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(workingDirectory);
        int res = chooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) 
            f = chooser.getSelectedFile();
        try {
            wm.save(f);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_miSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WetterWerteGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jsLuftfeuchtigkeit;
    private javax.swing.JSlider jsTemperatur;
    private javax.swing.JLabel lbAnzeige;
    private javax.swing.JLabel lbEingabe;
    private javax.swing.JLabel lbLF;
    private javax.swing.JLabel lbLFChange;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JLabel lbTempChange;
    private javax.swing.JList<String> liOutput;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miLoad;
    private javax.swing.JMenuItem miSave;
    // End of variables declaration//GEN-END:variables
}
