/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author Tim
 */
public class PastGames extends javax.swing.JFrame {

    /**
     * Creates new form PastGames
     */
    public PastGames() {
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

        jLabel1 = new javax.swing.JLabel();
        PastGamesText1 = new javax.swing.JScrollPane();
        PastGamesText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(75, 100, 120, 590));
        setMinimumSize(new java.awt.Dimension(120, 590));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("LiHei Pro", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("     Past Games");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 108, 16);

        PastGamesText1.setBackground(new java.awt.Color(153, 153, 153));
        PastGamesText1.setMaximumSize(new java.awt.Dimension(32767, 505));
        PastGamesText1.setMinimumSize(new java.awt.Dimension(23, 505));

        PastGamesText.setEditable(false);
        PastGamesText.setBackground(new java.awt.Color(153, 153, 153));
        PastGamesText.setColumns(1);
        PastGamesText.setFont(new java.awt.Font("LiHei Pro", 0, 12)); // NOI18N
        PastGamesText.setRows(1);
        PastGamesText1.setViewportView(PastGamesText);

        getContentPane().add(PastGamesText1);
        PastGamesText1.setBounds(6, 28, 108, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1280x1024-up-maroon-solid-color-background.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 590));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 590));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 590));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 120, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PastGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PastGames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea PastGamesText;
    public javax.swing.JScrollPane PastGamesText1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
