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
public class Periferije extends javax.swing.JFrame {

  private static final String username= "root";
    private static final String password= "";
    private static final String dataConn= "jdbc:mysql://localhost:3306/betoncomputers";
  
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    int q, i, id, deleteItem;

    public Periferije() {
        initComponents();
    }
    public void updateDB() {
    try {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);

       
        pst = sqlConn.prepareStatement("SELECT * FROM periferije");

    
        rs = pst.executeQuery();  

    
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount();

     
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        RecordTable.setRowCount(0);

      
        while (rs.next()) {
    Vector columnData = new Vector();
    
    columnData.add(rs.getInt("periferija_id"));  
    columnData.add(rs.getString("Naziv"));        
    columnData.add(rs.getString("Opis"));        
    columnData.add(rs.getString("Cijena"));    
    columnData.add(rs.getInt("Kolicina"));    
    columnData.add(rs.getString("Specifikacije")); 
    
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cijenaFld = new javax.swing.JTextField();
        nazivPer = new javax.swing.JLabel();
        opisPer = new javax.swing.JLabel();
        nazivFld = new javax.swing.JTextField();
        cijenaPer = new javax.swing.JLabel();
        opisFld = new javax.swing.JTextField();
        kolPer = new javax.swing.JLabel();
        specPer = new javax.swing.JLabel();
        specFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        nazad = new javax.swing.JLabel();
        odjava = new javax.swing.JLabel();
        clearfld = new javax.swing.JButton();
        kolicinaFld = new javax.swing.JTextField();
        updateBtn2 = new javax.swing.JButton();
        idPer = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERIFERIJE");

        cijenaFld.setMinimumSize(new java.awt.Dimension(64, 20));

        nazivPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        nazivPer.setForeground(new java.awt.Color(255, 255, 255));
        nazivPer.setText("Naziv:");

        opisPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        opisPer.setForeground(new java.awt.Color(255, 255, 255));
        opisPer.setText("Opis:");

        nazivFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazivFldActionPerformed(evt);
            }
        });

        cijenaPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cijenaPer.setForeground(new java.awt.Color(255, 255, 255));
        cijenaPer.setText("Cijena:");

        kolPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        kolPer.setForeground(new java.awt.Color(255, 255, 255));
        kolPer.setText("Kolicina:");

        specPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        specPer.setForeground(new java.awt.Color(255, 255, 255));
        specPer.setText("Specifikacije:");

        backBtn.setBackground(new java.awt.Color(0, 105, 105));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 105, 105));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBtn.setBorder(null);
        deleteBtn.setBorderPainted(false);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Naziv", "Opis", "Cijena", "Kolicina", "Specifikacije"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        exitBtn.setBackground(new java.awt.Color(0, 105, 105));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 105, 105));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addBtn.setBorder(null);
        addBtn.setBorderPainted(false);
        addBtn.setContentAreaFilled(false);
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
        clearfld.setBorderPainted(false);
        clearfld.setContentAreaFilled(false);
        clearfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearfldActionPerformed(evt);
            }
        });

        kolicinaFld.setMinimumSize(new java.awt.Dimension(64, 20));

        updateBtn2.setBackground(new java.awt.Color(0, 105, 105));
        updateBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        updateBtn2.setBorderPainted(false);
        updateBtn2.setContentAreaFilled(false);
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        idPer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        idPer.setForeground(new java.awt.Color(255, 255, 255));
        idPer.setText("ID:");

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("(only for UPDATE/DELETE)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opisPer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opisFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nazivPer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nazivFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idPer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kolPer)
                            .addComponent(specPer)
                            .addComponent(cijenaPer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cijenaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kolicinaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(odjava))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn)
                                .addComponent(nazad))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearfld)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(updateBtn2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cijenaPer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cijenaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kolPer)
                            .addComponent(kolicinaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specPer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(idPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazivFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazivPer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opisFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opisPer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(odjava)
                                    .addComponent(nazad))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearfld, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nazivFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazivFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazivFldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        JFrame frame = new JFrame("BACK");
        if (JOptionPane.showConfirmDialog(frame, "Želite li se vratiti na glavni meni?", "ADMIN",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        MainMenu c=new MainMenu();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation (Periferije.EXIT_ON_CLOSE);

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
                "DELETE FROM periferije WHERE periferija_id = ?");

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
        c.setDefaultCloseOperation (Periferije.EXIT_ON_CLOSE);

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
            pst = sqlConn.prepareStatement("INSERT INTO periferije (Naziv, Opis, Cijena, Kolicina, Specifikacije) VALUES (?, ?, ?, ?, ?)");

            // Postavljanje vrednosti u upit
            pst.setString(1, nazivFld.getText());
            pst.setString(2, opisFld.getText());
            pst.setString(3, cijenaFld.getText());
            pst.setString(4, kolicinaFld.getText());
            pst.setString(5, specFld.getText());  // Pretpostavljam da treba da postoji ovo polje

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
        nazivFld.setText("");
        opisFld.setText("");
        cijenaFld.setText("");
        kolicinaFld.setText("");
        specFld.setText("");
        idFld.setText("");
    }//GEN-LAST:event_clearfldActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        try {
            // Inicijalizacija konekcije
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            // Priprema SQL upita za ažuriranje sa WHERE klauzulom
            pst = sqlConn.prepareStatement(
                "UPDATE periferije SET Naziv = ?, Opis = ?, Cijena = ?, Kolicina = ?, Specifikacije = ? WHERE periferija_id = ?");

            // Postavljanje vrednosti u upit
            pst.setString(1, nazivFld.getText());
            pst.setString(2, opisFld.getText());
            pst.setString(3, cijenaFld.getText());
            pst.setString(4, kolicinaFld.getText());
            pst.setString(5, specFld.getText());
            pst.setString(6, idFld.getText()); // ID polje na kraju

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
            java.util.logging.Logger.getLogger(Periferije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Periferije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Periferije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Periferije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Periferije().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cijenaFld;
    private javax.swing.JLabel cijenaPer;
    private javax.swing.JButton clearfld;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel idPer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kolPer;
    private javax.swing.JTextField kolicinaFld;
    private javax.swing.JLabel nazad;
    private javax.swing.JTextField nazivFld;
    private javax.swing.JLabel nazivPer;
    private javax.swing.JLabel odjava;
    private javax.swing.JTextField opisFld;
    private javax.swing.JLabel opisPer;
    private javax.swing.JTextField specFld;
    private javax.swing.JLabel specPer;
    private javax.swing.JButton updateBtn2;
    // End of variables declaration//GEN-END:variables
}
