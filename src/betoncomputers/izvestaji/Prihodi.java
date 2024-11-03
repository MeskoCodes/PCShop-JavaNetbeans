/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package betoncomputers.izvestaji;

import betoncomputers.MainMenu;
import betoncomputers.loginForm;
import betoncomputers.tabele.Konfiguracije;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import betoncomputers.MainMenu;
import betoncomputers.loginForm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.text.DecimalFormat;

/**
 *
 * @author M E S K O
 */
public class Prihodi extends javax.swing.JFrame {

   private static final String username= "root";
    private static final String password= "";
    private static final String dataConn= "jdbc:mysql://localhost:3306/betoncomputers";
  
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    int q, i, id, deleteItem;
    public Prihodi() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        nazad = new javax.swing.JLabel();
        odjava = new javax.swing.JLabel();
        printBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beton Computers");
        setResizable(false);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRIHODI");

        backBtn.setBackground(new java.awt.Color(0, 105, 105));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIP", "ID", "Naziv", "Cijena", "Prodate Jedinice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        exitBtn.setBackground(new java.awt.Color(0, 105, 105));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        nazad.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nazad.setForeground(new java.awt.Color(255, 255, 255));
        nazad.setText("NAZAD");

        odjava.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        odjava.setForeground(new java.awt.Color(255, 255, 255));
        odjava.setText("ODJAVA");

        printBtn.setBackground(new java.awt.Color(0, 105, 105));
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/print.png"))); // NOI18N
        printBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printBtn.setBorderPainted(false);
        printBtn.setPreferredSize(new java.awt.Dimension(54, 54));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Ukupni Prihod"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(exitBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(odjava)
                                .addGap(18, 18, 18)
                                .addComponent(nazad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addComponent(exitBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odjava)
                    .addComponent(nazad))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(383, 383, 383)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(483, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        jPanel1.getAccessibleContext().setAccessibleParent(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        Component frame = new JFrame("BACK");
        if (JOptionPane.showConfirmDialog(frame, "Želite li se vratiti na glavni meni?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        MainMenu c=new MainMenu();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Konfiguracije.EXIT_ON_CLOSE);

        this.dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        JFrame frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Želite li se odjaviti?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        loginForm c=new loginForm();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Konfiguracije.EXIT_ON_CLOSE);

        this.dispose();

        JOptionPane.showMessageDialog(null, "Uspešno ste odjavljeni!");
    }//GEN-LAST:event_exitBtnActionPerformed
    }
    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
                                        
    Connection sqlConn = null;
PreparedStatement pst = null;
ResultSet rs = null;

try {
    // Inicijalizacija konekcije
    Class.forName("com.mysql.cj.jdbc.Driver");
    sqlConn = DriverManager.getConnection(dataConn, username, password);

    // Priprema SQL upita za prihode periferija i konfiguracija
    String sqlQueryDetails = "SELECT * FROM pregled_prihodi_i_prodate_jedinice";
    pst = sqlConn.prepareStatement(sqlQueryDetails);
    rs = pst.executeQuery();

    // Kreiranje modela tabele za detalje (jTable1)
    DefaultTableModel modelDetails = (DefaultTableModel) jTable1.getModel();
    modelDetails.setRowCount(0);  // Očisti postojeće redove

    // Dodavanje kolona u model tabele, ako nisu već dodate
    ResultSetMetaData stDataDetails = rs.getMetaData();
    int columnCountDetails = stDataDetails.getColumnCount();
    if (modelDetails.getColumnCount() == 0) {
        for (int i = 1; i <= columnCountDetails; i++) {
            modelDetails.addColumn(stDataDetails.getColumnName(i));
        }
    }

    // Dodavanje redova u model tabele za prihode
    while (rs.next()) {
        Vector<Object> rowData = new Vector<>();
        for (int i = 1; i <= columnCountDetails; i++) {
            rowData.add(rs.getObject(i));
        }
        modelDetails.addRow(rowData);
    }

    // Priprema SQL upita za ukupne prihode
    String sqlQueryTotals = "SELECT * FROM pregled_ukupni_prihod";
    pst = sqlConn.prepareStatement(sqlQueryTotals);
    rs = pst.executeQuery();

    // Kreiranje modela tabele za ukupne prihode (jTable2)
    DefaultTableModel modelTotals = (DefaultTableModel) jTable2.getModel();
    modelTotals.setRowCount(0);  // Očisti postojeće redove

    // Dodavanje kolona u model tabele, ako nisu već dodate
    ResultSetMetaData stDataTotals = rs.getMetaData();
    int columnCountTotals = stDataTotals.getColumnCount();
    if (modelTotals.getColumnCount() == 0) {
        for (int i = 1; i <= columnCountTotals; i++) {
            modelTotals.addColumn(stDataTotals.getColumnName(i));
        }
    }

    // Dodavanje redova u model tabele za ukupne prihode
    while (rs.next()) {
        Vector<Object> rowData = new Vector<>();
        for (int i = 1; i <= columnCountTotals; i++) {
            rowData.add(rs.getObject(i));
        }
        modelTotals.addRow(rowData);
    }

    // Poruka o uspehu
    JOptionPane.showMessageDialog(this, "Izveštaj o prihodima uspešno generisan!");

} catch (ClassNotFoundException | SQLException ex) {
    JOptionPane.showMessageDialog(this, "Greška prilikom prikazivanja prihoda: " + ex.getMessage());
} finally {
    try {
        // Zatvaranje konekcije i resursa
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (sqlConn != null) sqlConn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Greška prilikom zatvaranja konekcije: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_printBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Prihodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prihodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prihodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prihodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prihodi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nazad;
    private javax.swing.JLabel odjava;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
