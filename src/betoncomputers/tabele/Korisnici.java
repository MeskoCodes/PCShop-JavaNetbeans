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
public class Korisnici extends javax.swing.JFrame {

   private static final String username= "root";
    private static final String password= "";
    private static final String dataConn= "jdbc:mysql://localhost:3306/betoncomputers";
  
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    int q, i, id, deleteItem;
    public Korisnici() {
        initComponents();
    }
public void updateDB() {
    try {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);

       
        pst = sqlConn.prepareStatement("SELECT * FROM korisnici");

    
        rs = pst.executeQuery();  

    
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();

     
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);

      
        while (rs.next()) {
    Vector columnData = new Vector();
    
    columnData.add(rs.getInt("korisnik_id"));  
    columnData.add(rs.getString("Ime_Prezime"));        
    columnData.add(rs.getString("Email_adresa"));        
    columnData.add(rs.getString("Adresa"));    
    columnData.add(rs.getString("Broj_telefona"));    
  
    RecordTable.addRow(columnData);
}

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adresaFld = new javax.swing.JTextField();
        imePrezime = new javax.swing.JLabel();
        emailAdr = new javax.swing.JLabel();
        imeFld = new javax.swing.JTextField();
        adresa = new javax.swing.JLabel();
        emailFld = new javax.swing.JTextField();
        broj = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        nazad = new javax.swing.JLabel();
        odjava = new javax.swing.JLabel();
        clearfld = new javax.swing.JButton();
        brojFld = new javax.swing.JTextField();
        updateBtn2 = new javax.swing.JButton();
        korisnikID = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beton Computers");
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KORISNICI");

        adresaFld.setMinimumSize(new java.awt.Dimension(64, 20));

        imePrezime.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        imePrezime.setForeground(new java.awt.Color(255, 255, 255));
        imePrezime.setText("Ime i Prezime:");

        emailAdr.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        emailAdr.setForeground(new java.awt.Color(255, 255, 255));
        emailAdr.setText("Email Adresa:");

        imeFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imeFldActionPerformed(evt);
            }
        });

        adresa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        adresa.setForeground(new java.awt.Color(255, 255, 255));
        adresa.setText("Adresa:");

        broj.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        broj.setForeground(new java.awt.Color(255, 255, 255));
        broj.setText("Broj Telefona:");

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
                "ID", "Ime i Prezime", "Email Adresa", "Adresa", "Broj Telefona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        brojFld.setMinimumSize(new java.awt.Dimension(64, 20));

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

        korisnikID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        korisnikID.setForeground(new java.awt.Color(255, 255, 255));
        korisnikID.setText("ID:");

        warning.setBackground(new java.awt.Color(255, 51, 51));
        warning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 51, 51));
        warning.setText("(only for UPDATE/DELETE)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailAdr)
                                    .addComponent(imePrezime)
                                    .addComponent(korisnikID))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(warning))
                                            .addComponent(imeFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(broj)
                                                .addGap(18, 18, 18)
                                                .addComponent(brojFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(adresa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(adresaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(odjava)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nazad)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(adresaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailAdr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brojFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(broj))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(warning))
                            .addComponent(korisnikID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imeFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odjava)
                            .addComponent(nazad))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(clearfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imeFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imeFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imeFldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        JFrame frame = new JFrame("BACK");
        if (JOptionPane.showConfirmDialog(frame, "Želite li se vratiti na glavni meni?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        MainMenu c=new MainMenu();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Korisnici.EXIT_ON_CLOSE);

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
                "DELETE FROM korisnici WHERE korisnik_id = ?");

            // Postavljanje vrednosti za ID
            pst.setString(1, idFld.getText()); // ID polje

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
        c.setDefaultCloseOperation (Korisnici.EXIT_ON_CLOSE);

        this.dispose();

        JOptionPane.showMessageDialog(null, "Uspešno ste odjavljeni!");
    }//GEN-LAST:event_exitBtnActionPerformed
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            // Priprema SQL upita
            pst = sqlConn.prepareStatement("INSERT INTO korisnici (Ime_prezime, Email_adresa, Adresa, Broj_telefona) VALUES (?, ?, ?, ?)");

            // Postavljanje vrednosti u upit
            pst.setString(1, imeFld.getText());
            pst.setString(2, emailFld.getText());
            pst.setString(3, adresaFld.getText());
            pst.setString(4, brojFld.getText());
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
        imeFld.setText("");
        emailFld.setText("");
        adresaFld.setText("");
        brojFld.setText("");
        idFld.setText("");
    }//GEN-LAST:event_clearfldActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            // Priprema SQL upita za ažuriranje sa WHERE klauzulom
            pst = sqlConn.prepareStatement(
                "UPDATE korisnici SET Ime_prezime = ?, Email_adresa = ?, Adresa = ?, Broj_telefona = ?WHERE korisnik_id = ?");

            // Postavljanje vrednosti u upit
            pst.setString(1, imeFld.getText());
            pst.setString(2, emailFld.getText());
            pst.setString(3, adresaFld.getText());
            pst.setString(4, brojFld.getText());
            pst.setString(5, idFld.getText()); // ID polje na kraju

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
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Korisnici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korisnici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel adresa;
    private javax.swing.JTextField adresaFld;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel broj;
    private javax.swing.JTextField brojFld;
    private javax.swing.JButton clearfld;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailAdr;
    private javax.swing.JTextField emailFld;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField idFld;
    private javax.swing.JTextField imeFld;
    private javax.swing.JLabel imePrezime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel korisnikID;
    private javax.swing.JLabel nazad;
    private javax.swing.JLabel odjava;
    private javax.swing.JButton updateBtn2;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
