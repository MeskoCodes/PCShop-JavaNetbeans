/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package betoncomputers;

/**
 *
 * @author M E S K O
 */
public class Betoncomputers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {  // Možeš da probaš i "Windows" za izgled sličan Windows-u
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
}

        java.awt.EventQueue.invokeLater(() -> {
            new loginForm
        ().setVisible(true);
        });
    }
}

