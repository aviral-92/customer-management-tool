/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.service.ui.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Aviral
 */
@Component
public class WelcomeForm extends javax.swing.JFrame {

    @Autowired
    private AddUser user;
    @Autowired
    private GetUser getUserValue;

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
        initComponents();
        super.setTitle("Welcome");
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
        jMenuBar1 = new javax.swing.JMenuBar();
        User = new javax.swing.JMenu();
        addUser = new javax.swing.JMenuItem();
        getUser = new javax.swing.JMenuItem();
        updateUser = new javax.swing.JMenuItem();
        deleteUser = new javax.swing.JMenuItem();
        Customer = new javax.swing.JMenu();
        addCustomer = new javax.swing.JMenuItem();
        getCustomer = new javax.swing.JMenuItem();
        updateCustomer = new javax.swing.JMenuItem();
        deleteCustomer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 150, 0, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        User.setText("USER");

        addUser.setText("Add User");
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Clicked(evt);
            }
        });
        User.add(addUser);

        getUser.setText("Get User");
        getUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                getUserMousePressed(evt);
            }
        });
        User.add(getUser);

        updateUser.setText("Update User");
        updateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateUserMousePressed(evt);
            }
        });
        User.add(updateUser);

        deleteUser.setText("Delete User");
        deleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteUserMousePressed(evt);
            }
        });
        User.add(deleteUser);

        jMenuBar1.add(User);

        Customer.setText("CUSTOMER");

        addCustomer.setText("Add Customer");
        Customer.add(addCustomer);

        getCustomer.setText("Get Customer");
        getCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCustomerActionPerformed(evt);
            }
        });
        Customer.add(getCustomer);

        updateCustomer.setText("Update Customer");
        Customer.add(updateCustomer);

        deleteCustomer.setText("Delete Customer");
        Customer.add(deleteCustomer);

        jMenuBar1.add(Customer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCustomerActionPerformed

    private void Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clicked
        // TODO add your handling code here:
        dispose();
        user.setTitle("Add User");
        user.setVisible(true);
        System.out.println("Hello");
    }//GEN-LAST:event_Clicked

    private void getUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getUserMousePressed
        // TODO add your handling code here:
        dispose();
        getUserValue.setTitle("Get User Details");
        getUserValue.setVisible(true);
    }//GEN-LAST:event_getUserMousePressed

    private void updateUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMousePressed
        dispose();
        getUserValue.setTitle("Update User Details");
        getUserValue.setVisible(true);
    }//GEN-LAST:event_updateUserMousePressed

    private void deleteUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMousePressed
        getUserValue.setTitle("Delete User Details");
        getUserValue.setVisible(true);
    }//GEN-LAST:event_deleteUserMousePressed

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Customer;
    private javax.swing.JMenu User;
    private javax.swing.JMenuItem addCustomer;
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenuItem deleteCustomer;
    private javax.swing.JMenuItem deleteUser;
    private javax.swing.JMenuItem getCustomer;
    private javax.swing.JMenuItem getUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem updateCustomer;
    private javax.swing.JMenuItem updateUser;
    // End of variables declaration//GEN-END:variables
}
