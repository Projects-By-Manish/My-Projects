
/**
 *
 * @author  techs
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnuExits = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnuBookMaster = new javax.swing.JMenuItem();
        MnuSearchBook = new javax.swing.JMenuItem();
        MnuBookStatus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Integrated Library System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 700, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jMenuBar1.setForeground(new java.awt.Color(153, 102, 0));
        jMenuBar1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setForeground(new java.awt.Color(153, 102, 0));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N

        MnuExits.setBackground(new java.awt.Color(255, 255, 153));
        MnuExits.setForeground(new java.awt.Color(153, 102, 0));
        MnuExits.setText("Exit");
        MnuExits.setOpaque(true);
        MnuExits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuExitsActionPerformed(evt);
            }
        });
        jMenu1.add(MnuExits);

        jMenuBar1.add(jMenu1);

        jMenu6.setBackground(new java.awt.Color(255, 255, 153));
        jMenu6.setForeground(new java.awt.Color(153, 102, 0));
        jMenu6.setText("Admin");
        jMenu6.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jMenu6.setOpaque(true);

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem7.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem7.setText("User Master");
        jMenuItem7.setOpaque(true);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem8.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem8.setText("Change Password");
        jMenuItem8.setOpaque(true);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu2.setBackground(new java.awt.Color(153, 102, 0));
        jMenu2.setForeground(new java.awt.Color(153, 102, 0));
        jMenu2.setText("Book");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        MnuBookMaster.setBackground(new java.awt.Color(255, 255, 153));
        MnuBookMaster.setForeground(new java.awt.Color(153, 102, 0));
        MnuBookMaster.setText("Book Master");
        MnuBookMaster.setOpaque(true);
        MnuBookMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuBookMasterActionPerformed(evt);
            }
        });
        jMenu2.add(MnuBookMaster);

        MnuSearchBook.setBackground(new java.awt.Color(255, 255, 153));
        MnuSearchBook.setForeground(new java.awt.Color(153, 102, 0));
        MnuSearchBook.setText("Search Book");
        MnuSearchBook.setOpaque(true);
        MnuSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuSearchBookActionPerformed(evt);
            }
        });
        jMenu2.add(MnuSearchBook);

        MnuBookStatus.setBackground(new java.awt.Color(255, 255, 153));
        MnuBookStatus.setForeground(new java.awt.Color(153, 102, 0));
        MnuBookStatus.setText("Book Status");
        MnuBookStatus.setOpaque(true);
        MnuBookStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuBookStatusActionPerformed(evt);
            }
        });
        jMenu2.add(MnuBookStatus);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 153));
        jMenu3.setForeground(new java.awt.Color(153, 102, 0));
        jMenu3.setText("Member");
        jMenu3.setFont(new java.awt.Font("Ebrima", 3, 12)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem1.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem1.setText("Member Master");
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem2.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem2.setText("Search Member");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem9.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem9.setText("Member Status");
        jMenuItem9.setOpaque(true);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(153, 102, 0));
        jMenu4.setText("Transaction");
        jMenu4.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem3.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem3.setText("Issue Book");
        jMenuItem3.setOpaque(true);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem4.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem4.setText("Receive Book");
        jMenuItem4.setOpaque(true);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem6.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem6.setText("Transaction Report ");
        jMenuItem6.setOpaque(true);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(153, 102, 0));
        jMenu5.setText("Help");
        jMenu5.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 153));
        jMenuItem5.setForeground(new java.awt.Color(153, 102, 0));
        jMenuItem5.setText("About");
        jMenuItem5.setOpaque(true);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuExitsActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MnuExitsActionPerformed

    private void MnuBookMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuBookMasterActionPerformed
        BookMaster b = new BookMaster();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_MnuBookMasterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void MnuSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuSearchBookActionPerformed
        SearchBook b = new SearchBook();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_MnuSearchBookActionPerformed

    private void MnuBookStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuBookStatusActionPerformed
        BookStatus b = new BookStatus();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_MnuBookStatusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MemberMaster b = new MemberMaster();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SearchMember b = new SearchMember();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        UserMaster b = new UserMaster();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ChangePassword b = new ChangePassword();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        About b = new About();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IssueBook b = new IssueBook();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ReceiveBook b = new ReceiveBook();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TransactionReport b = new TransactionReport();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        MemberStatus b = new MemberStatus();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuBookMaster;
    private javax.swing.JMenuItem MnuBookStatus;
    private javax.swing.JMenuItem MnuExits;
    private javax.swing.JMenuItem MnuSearchBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}
