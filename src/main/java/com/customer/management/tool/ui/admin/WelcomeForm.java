/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.management.tool.ui.admin;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import com.customer.management.tool.ui.customer.AddCustomer;
import com.customer.management.tool.ui.customer.GetCustomer;
import com.customer.management.tool.ui.report.CMTReport;

/**
 *
 * @author Aviral
 */
@Component
public class WelcomeForm extends javax.swing.JFrame {

	static Logger LOG = Logger.getLogger(WelcomeForm.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private AddUser addUser;
	@Autowired
	private GetUser getUser;
	@Autowired
	private AddCustomer addCustomer;
	@Autowired
	private GetCustomer getCustomer;
	@Autowired
	private CMTReport CMTReport;

	/**
	 * Creates new form WelcomeForm
	 */

	public WelcomeForm(ResourceBundleMessageSource messageSource) {
		initComponents();
		super.setTitle("WelcomeForm");
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		User = new javax.swing.JMenu();
		userAdd = new javax.swing.JMenuItem();
		userGet = new javax.swing.JMenuItem();
		updateUser = new javax.swing.JMenuItem();
		deleteUser = new javax.swing.JMenuItem();
		Customer = new javax.swing.JMenu();
		customerAdd = new javax.swing.JMenuItem();
		customerGet = new javax.swing.JMenuItem();
		updateCustomer = new javax.swing.JMenuItem();
		deleteCustomer = new javax.swing.JMenuItem();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBounds(new java.awt.Rectangle(450, 150, 0, 0));

		jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
		jLabel1.setText("WelcomeForm Admin");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addGap(92, 92, 92)
						.addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 154,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(113, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addGap(102, 102, 102)
						.addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(128, Short.MAX_VALUE)));

		User.setText("USER");

		userAdd.setText("Add User");
		userAdd.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				Clicked(evt);
			}
		});
		User.add(userAdd);

		userGet.setText("Get User");
		userGet.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				getUserMousePressed(evt);
			}
		});
		User.add(userGet);

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

		customerAdd.setText("Add Customer");
		customerAdd.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				addCustomerMousePressed(evt);
			}
		});
		Customer.add(customerAdd);

		customerGet.setText("Get Customer");
		customerGet.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				getCustomerMousePressed(evt);
			}
		});
		customerGet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getCustomerActionPerformed(evt);
			}
		});
		Customer.add(customerGet);

		updateCustomer.setText("Update Customer");
		Customer.add(updateCustomer);

		deleteCustomer.setText("Delete Customer");
		Customer.add(deleteCustomer);

		jMenuBar1.add(Customer);

		jMenu1.setText("REPORT");

		jMenuItem1.setText("Monthly Report");
		jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jMenuItem1MousePressed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(23, 23, 23)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(18, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void getCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_getCustomerActionPerformed

	}// GEN-LAST:event_getCustomerActionPerformed

	private void Clicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Clicked
		// TODO add your handling code here:
		dispose();
		addUser.setTitle("Add User");
		addUser.setVisible(true);
	}// GEN-LAST:event_Clicked

	private void getUserMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_getUserMousePressed
		// TODO add your handling code here:
		dispose();
		getUser.setTitle("Get User Details");
		getUser.setVisible(true);
	}// GEN-LAST:event_getUserMousePressed

	private void updateUserMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_updateUserMousePressed
		dispose();
		getUser.setTitle("Update User Details");
		getUser.setVisible(true);
	}// GEN-LAST:event_updateUserMousePressed

	private void deleteUserMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteUserMousePressed
		getUser.setTitle("Delete User Details");
		getUser.setVisible(true);
	}// GEN-LAST:event_deleteUserMousePressed

	private void addCustomerMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_customerAddMousePressed
		dispose();
		addCustomer.setTitle("CUSTOMER ADD");
		addCustomer.setVisible(true);
	}// GEN-LAST:event_customerAddMousePressed

	private void getCustomerMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_getCustomerMousePressed
		dispose();
		getCustomer.setTitle("Get Customer Info");
		getCustomer.setVisible(true);
	}// GEN-LAST:event_getCustomerMousePressed

	private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenuItem1MousePressed
		this.dispose();
		CMTReport.setVisible(true);
	}// GEN-LAST:event_jMenuItem1MousePressed

	/**
	 * @param args
	 *            the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JMenu Customer;
	private javax.swing.JMenu User;
	private javax.swing.JMenuItem customerAdd;
	private javax.swing.JMenuItem userAdd;
	private javax.swing.JMenuItem deleteCustomer;
	private javax.swing.JMenuItem deleteUser;
	private javax.swing.JMenuItem customerGet;
	private javax.swing.JMenuItem userGet;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JMenuItem updateCustomer;
	private javax.swing.JMenuItem updateUser;
	// End of variables declaration//GEN-END:variables
}
