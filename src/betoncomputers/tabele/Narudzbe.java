/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package betoncomputers.tabele;

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

/**
 *
 * @author M E S K O
 */
public class Narudzbe extends javax.swing.JFrame {
private static final String username= "root";
    private static final String password= "";
    private static final String dataConn= "jdbc:mysql://localhost:3306/betoncomputers";
  
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    int q, i, id, deleteItem;
    
    public Narudzbe() {
        initComponents();
    }

    public void updateDB() {
    try {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);

       
        pst = sqlConn.prepareStatement("SELECT * FROM narudzbe");

    
        rs = pst.executeQuery();  

    
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();

     
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);

      
        while (rs.next()) {
    Vector columnData = new Vector();
    
    columnData.add(rs.getInt("narudzba_id"));  
    columnData.add(rs.getInt("korisnik_id"))     ; 
    columnData.add(rs.getInt("periferija_id"));       
    columnData.add(rs.getInt("konfiguracija_id"));    
    columnData.add(rs.getString("Datum_narudzbe"));    
    columnData.add(rs.getString("Status_narudzbe"));
    
    RecordTable.addRow(columnData);
}

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
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
        jLabel1 = new javax.swing.JLabel();
        datumFld = new javax.swing.JTextField();
        userID = new javax.swing.JLabel();
        Konfig = new javax.swing.JLabel();
        korisnikFld = new javax.swing.JTextField();
        cijenaKon = new javax.swing.JLabel();
        konfigfld = new javax.swing.JTextField();
        kolKon = new javax.swing.JLabel();
        specKon = new javax.swing.JLabel();
        perfId = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        nazad = new javax.swing.JLabel();
        odjava = new javax.swing.JLabel();
        clearfld = new javax.swing.JButton();
        updateBtn2 = new javax.swing.JButton();
        narId = new javax.swing.JLabel();
        idfld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        statusbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beton Computers");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NARUDŽBE");

        datumFld.setMinimumSize(new java.awt.Dimension(64, 20));

        userID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        userID.setForeground(new java.awt.Color(255, 255, 255));
        userID.setText("ID Korisnika:");

        Konfig.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Konfig.setForeground(new java.awt.Color(255, 255, 255));
        Konfig.setText("ID Konfiguracije:");

        cijenaKon.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cijenaKon.setForeground(new java.awt.Color(255, 255, 255));
        cijenaKon.setText("Datum:");

        kolKon.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        kolKon.setForeground(new java.awt.Color(255, 255, 255));
        kolKon.setText("Status:");

        specKon.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        specKon.setForeground(new java.awt.Color(255, 255, 255));
        specKon.setText("ID Periferije:");

        backBtn.setBackground(new java.awt.Color(0, 105, 105));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 105, 105));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.setBorderPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Korisnika", "ID Konfiguracije", "ID Periferije", "Datum", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
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

        addBtn.setBackground(new java.awt.Color(0, 105, 105));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.setBorderPainted(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nazad.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nazad.setForeground(new java.awt.Color(255, 255, 255));
        nazad.setText("NAZAD");

        odjava.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        odjava.setForeground(new java.awt.Color(255, 255, 255));
        odjava.setText("ODJAVA");

        clearfld.setBackground(new java.awt.Color(0, 105, 105));
        clearfld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deletefld.png"))); // NOI18N
        clearfld.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearfld.setBorderPainted(false);
        clearfld.setPreferredSize(new java.awt.Dimension(54, 54));
        clearfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearfldActionPerformed(evt);
            }
        });

        updateBtn2.setBackground(new java.awt.Color(0, 105, 105));
        updateBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        updateBtn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBtn2.setBorderPainted(false);
        updateBtn2.setPreferredSize(new java.awt.Dimension(54, 54));
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        narId.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        narId.setForeground(new java.awt.Color(255, 255, 255));
        narId.setText("ID:");

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("(only for UPDATE/DELETE)");

        statusbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Potvrđeno", "odbijeno" }));
        statusbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Konfig)
                                    .addComponent(userID)
                                    .addComponent(narId))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(idfld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addComponent(korisnikFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(konfigfld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cijenaKon)
                                    .addComponent(kolKon)
                                    .addComponent(specKon))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datumFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perfId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(273, 273, 273))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(exitBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(odjava)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nazad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearfld, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addComponent(deleteBtn)
                        .addGap(9, 9, 9)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(specKon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(perfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(narId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(korisnikFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(datumFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cijenaKon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Konfig, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(konfigfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kolKon)
                            .addComponent(statusbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteBtn)
                            .addComponent(clearfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn)
                            .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitBtn)
                            .addComponent(backBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odjava)
                            .addComponent(nazad))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        JFrame frame = new JFrame("BACK");
        if (JOptionPane.showConfirmDialog(frame, "Želite li se vratiti na glavni meni?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        MainMenu c=new MainMenu();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Narudzbe.EXIT_ON_CLOSE);

        this.dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            // Priprema SQL upita za brisanje
            pst = sqlConn.prepareStatement(
                "DELETE FROM narudzbe WHERE narudzba_id = ?");

            // Postavljanje vrednosti za ID
            pst.setString(1, idfld.getText()); // ID polje

            // Izvršavanje upita
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                // Poruka o uspehu
                JOptionPane.showMessageDialog(this, "Obrisano!");
            } else {
                JOptionPane.showMessageDialog(this, "Nema redova za brisanje.");
            }

            // Osvježavanje podataka u aplikaciji
            updateDB();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Greška prilikom brisanja: " + ex.getMessage());
        } finally {
            try {
                // Zatvaranje konekcije
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Greška prilikom zatvaranja konekcije: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Želite li se odjaviti?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        loginForm c=new loginForm();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Narudzbe.EXIT_ON_CLOSE);

        this.dispose();

        JOptionPane.showMessageDialog(null, "Uspešno ste odjavljeni!");
    }//GEN-LAST:event_exitBtnActionPerformed
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);


            pst = sqlConn.prepareStatement("INSERT INTO narudzbe (korisnik_id, periferija_id, konfiguracija_id, Datum_narudzbe, Status_narudzbe) VALUES (?, ?, ?, ?, ?)");

// Postavljanje vrednosti u upit    
pst.setString(1, korisnikFld.getText());
pst.setString(2, konfigfld.getText());
pst.setString(3, perfId.getText());
pst.setString(4, datumFld.getText());
pst.setString(5, statusbox.getSelectedItem().toString());

            

            // Izvršavanje upita
            pst.executeUpdate();

            // Poruka o uspehu
            JOptionPane.showMessageDialog(this, "Dodato!");

            // Osvježavanje podataka u aplikaciji
            updateDB();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Greška prilikom dodavanja: " + ex.getMessage());
        } finally {
            try {
                // Zatvaranje konekcije
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Greška prilikom zatvaranja konekcije: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearfldActionPerformed
        idfld.setText("");
        korisnikFld.setText("");
        konfigfld.setText("");
        datumFld.setText("");
        perfId.setText("");
    }//GEN-LAST:event_clearfldActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            // Priprema SQL upita za ažuriranje sa WHERE klauzulom
            pst = sqlConn.prepareStatement(
                "UPDATE narudzbe SET korisnik_id = ?, periferija_id = ?, konfiguracija_id = ?, Datum_narudzbe = ?, Status_narudzbe = ? WHERE narudzba_id = ?");

            // Postavljanje vrednosti u upit
            pst.setString(1, idfld.getText());
            pst.setString(2, korisnikFld.getText());
            pst.setString(3, konfigfld.getText());
            pst.setString(4, perfId.getText());
            pst.setString(5, datumFld.getText());
            pst.setString(6, statusbox.getSelectedItem().toString());

            // Izvršavanje upita
            pst.executeUpdate();

            // Poruka o uspehu
            JOptionPane.showMessageDialog(this, "Ažurirano!");

            // Osvježavanje podataka u aplikaciji
            updateDB();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Greška prilikom ažuriranja: " + ex.getMessage());
        } finally {
            try {
                // Zatvaranje konekcije
                if (pst != null) pst.close();
                if (sqlConn != null) sqlConn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Greška prilikom zatvaranja konekcije: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void statusboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusboxActionPerformed
private JFrame frame;
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
            java.util.logging.Logger.getLogger(Narudzbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Narudzbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Narudzbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Narudzbe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Narudzbe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Konfig;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cijenaKon;
    private javax.swing.JButton clearfld;
    private javax.swing.JTextField datumFld;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField idfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kolKon;
    private javax.swing.JTextField konfigfld;
    private javax.swing.JTextField korisnikFld;
    private javax.swing.JLabel narId;
    private javax.swing.JLabel nazad;
    private javax.swing.JLabel odjava;
    private javax.swing.JTextField perfId;
    private javax.swing.JLabel specKon;
    private javax.swing.JComboBox<String> statusbox;
    private javax.swing.JButton updateBtn2;
    private javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
