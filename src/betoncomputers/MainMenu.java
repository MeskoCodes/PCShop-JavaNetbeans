package betoncomputers;


import betoncomputers.izvestaji.Prihodi;
import betoncomputers.izvestaji.Skladiste;
import betoncomputers.tabele.Konfiguracije;
import betoncomputers.tabele.Korisnici;
import betoncomputers.tabele.Narudzbe;
import betoncomputers.tabele.Periferije;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author M  E  S  K  O
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainmenuPnl = new javax.swing.JPanel();
        main = new javax.swing.JLabel();
        gpu = new javax.swing.JLabel();
        izvestajpnl = new javax.swing.JPanel();
        prihodIBTN = new javax.swing.JButton();
        izvestaji = new javax.swing.JLabel();
        skladiste = new javax.swing.JButton();
        tabelepnl = new javax.swing.JPanel();
        periferijebtn = new javax.swing.JButton();
        korisnicibtn = new javax.swing.JButton();
        konfigbtn = new javax.swing.JButton();
        tabele = new javax.swing.JLabel();
        narudzbinebtn = new javax.swing.JButton();
        cpu = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        odjava = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beton Computers");
        setResizable(false);

        mainmenuPnl.setBackground(new java.awt.Color(0, 105, 105));

        main.setBackground(new java.awt.Color(204, 204, 204));
        main.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setText("GLAVNI MENI");

        gpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gpu.png"))); // NOI18N

        izvestajpnl.setBackground(new java.awt.Color(50, 85, 85));

        prihodIBTN.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        prihodIBTN.setText("PRIHODI");
        prihodIBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prihodIBTN.setBorderPainted(false);
        prihodIBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prihodIBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihodIBTNActionPerformed(evt);
            }
        });

        izvestaji.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        izvestaji.setForeground(new java.awt.Color(255, 255, 255));
        izvestaji.setText("IZVEŠTAJI");

        skladiste.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        skladiste.setText("SKLADIŠTE");
        skladiste.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        skladiste.setBorderPainted(false);
        skladiste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        skladiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skladisteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout izvestajpnlLayout = new javax.swing.GroupLayout(izvestajpnl);
        izvestajpnl.setLayout(izvestajpnlLayout);
        izvestajpnlLayout.setHorizontalGroup(
            izvestajpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izvestajpnlLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(izvestajpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(izvestaji)
                    .addComponent(skladiste, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prihodIBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        izvestajpnlLayout.setVerticalGroup(
            izvestajpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izvestajpnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(izvestaji, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(skladiste, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(prihodIBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        tabelepnl.setBackground(new java.awt.Color(50, 85, 85));

        periferijebtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        periferijebtn.setText("PERIFERIJE");
        periferijebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        periferijebtn.setBorderPainted(false);
        periferijebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        periferijebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periferijebtnActionPerformed(evt);
            }
        });

        korisnicibtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        korisnicibtn.setText("KORISNICI");
        korisnicibtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        korisnicibtn.setBorderPainted(false);
        korisnicibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        korisnicibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korisnicibtnActionPerformed(evt);
            }
        });

        konfigbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        konfigbtn.setText("KONFIGURACIJE");
        konfigbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        konfigbtn.setBorderPainted(false);
        konfigbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        konfigbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfigbtnActionPerformed(evt);
            }
        });

        tabele.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        tabele.setForeground(new java.awt.Color(255, 255, 255));
        tabele.setText("TABELE");

        narudzbinebtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        narudzbinebtn.setText("NARUDŽBE");
        narudzbinebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        narudzbinebtn.setBorderPainted(false);
        narudzbinebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        narudzbinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narudzbinebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabelepnlLayout = new javax.swing.GroupLayout(tabelepnl);
        tabelepnl.setLayout(tabelepnlLayout);
        tabelepnlLayout.setHorizontalGroup(
            tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabelepnlLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(korisnicibtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(periferijebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGroup(tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabelepnlLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(narudzbinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelepnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(konfigbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelepnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabele)
                .addGap(135, 135, 135))
        );
        tabelepnlLayout.setVerticalGroup(
            tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabelepnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tabele, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(korisnicibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(narudzbinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(tabelepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periferijebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(konfigbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        cpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cpu.png"))); // NOI18N

        exitbtn.setBackground(new java.awt.Color(0, 105, 105));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(153, 0, 0));
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn.setBorderPainted(false);
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BETON COMPUTERS CO.");

        odjava.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        odjava.setForeground(new java.awt.Color(255, 255, 255));
        odjava.setText("ODJAVA");

        javax.swing.GroupLayout mainmenuPnlLayout = new javax.swing.GroupLayout(mainmenuPnl);
        mainmenuPnl.setLayout(mainmenuPnlLayout);
        mainmenuPnlLayout.setHorizontalGroup(
            mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainmenuPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(gpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainmenuPnlLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainmenuPnlLayout.createSequentialGroup()
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addComponent(cpu)
                .addGap(48, 48, 48))
            .addGroup(mainmenuPnlLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainmenuPnlLayout.createSequentialGroup()
                        .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(odjava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainmenuPnlLayout.createSequentialGroup()
                        .addComponent(tabelepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(izvestajpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        mainmenuPnlLayout.setVerticalGroup(
            mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainmenuPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainmenuPnlLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(gpu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(mainmenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(izvestajpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odjava)
                .addGap(21, 21, 21))
        );

        getContentPane().add(mainmenuPnl, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void korisnicibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korisnicibtnActionPerformed
                        Korisnici c=new Korisnici();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (loginForm.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_korisnicibtnActionPerformed
private JFrame frame;
    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
               frame = new JFrame("Exit");
    if (JOptionPane.showConfirmDialog(frame, "Želite li se odjaviti?", "ADMIN", 
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {         
                loginForm c=new loginForm();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (MainMenu.EXIT_ON_CLOSE);        
                    
                this.dispose();
                
                JOptionPane.showMessageDialog(null, "Uspešno ste odjavljeni!");
                
    }//GEN-LAST:event_exitbtnActionPerformed
    }
    private void skladisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skladisteActionPerformed
                                Skladiste c=new Skladiste();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (loginForm.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_skladisteActionPerformed

    private void narudzbinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narudzbinebtnActionPerformed
                                Narudzbe c=new Narudzbe();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (MainMenu.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_narudzbinebtnActionPerformed

    private void periferijebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periferijebtnActionPerformed
                                       Periferije c=new Periferije();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (MainMenu.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_periferijebtnActionPerformed

    private void konfigbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfigbtnActionPerformed
                                       Konfiguracije c=new Konfiguracije();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (MainMenu.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_konfigbtnActionPerformed

    private void prihodIBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihodIBTNActionPerformed
                                Prihodi c=new Prihodi();
                c.setVisible(true);
                c.pack();
                c.setDefaultCloseOperation (loginForm.EXIT_ON_CLOSE);        
                    
                this.dispose();
    }//GEN-LAST:event_prihodIBTNActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpu;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel gpu;
    private javax.swing.JLabel izvestaji;
    private javax.swing.JPanel izvestajpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton konfigbtn;
    private javax.swing.JButton korisnicibtn;
    private javax.swing.JLabel main;
    private javax.swing.JPanel mainmenuPnl;
    private javax.swing.JButton narudzbinebtn;
    private javax.swing.JLabel odjava;
    private javax.swing.JButton periferijebtn;
    private javax.swing.JButton prihodIBTN;
    private javax.swing.JButton skladiste;
    private javax.swing.JLabel tabele;
    private javax.swing.JPanel tabelepnl;
    // End of variables declaration//GEN-END:variables
}


