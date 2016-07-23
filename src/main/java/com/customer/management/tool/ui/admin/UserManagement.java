/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.management.tool.ui.admin;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.customer.management.tool.constants.UserManagementCode;
import com.customer.management.tool.impl.CMTServiceImpl;
import com.customer.management.tool.pojo.CustomerReparingDetail;
import com.customer.management.tool.pojo.UserDetailHistory;

/**
 *
 * @author Aviral
 */

@Component
public class UserManagement extends CMTServiceImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form UserManagement
	 */
	public UserManagement() {
		String[] items = { UserManagementCode.ACTIVATE_USER.name(), UserManagementCode.DEACTIVATE_USER.name(),
				UserManagementCode.DELETE_USER.name() };
		ComboBoxModel<String> aModel = new DefaultComboBoxModel<String>(items);
		initComponents();
		changeStatus.setModel(aModel);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		Submit = new javax.swing.JButton();
		back = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		username = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		email = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		mobile = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		changeStatus = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setAutoCreateRowSorter(true);
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jTable1.setCellSelectionEnabled(true);
		jScrollPane1.setViewportView(jTable1);

		Submit.setText("Submit");
		Submit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SubmitActionPerformed(evt);
			}
		});

		back.setText("Back");
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addComponent(jScrollPane1).addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(back).addGap(135, 135, 135).addComponent(Submit)
												.addGap(178, 178, 178)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Submit).addComponent(back))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel1.setText("Username");

		jLabel2.setText("Email");

		jLabel3.setText("Mobile");

		jLabel4.setText("Change Status to");

		jButton1.setText("Search");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
														.addComponent(jLabel1).addGap(18, 18, 18)
														.addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE,
																119, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(32, 32, 32).addComponent(jLabel2).addGap(32, 32, 32)
														.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE,
																117, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(26, 26, 26).addComponent(jLabel3)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(
																mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup().addGap(129, 129, 129)
														.addComponent(jLabel4).addGap(46, 46, 46)
														.addComponent(changeStatus,
																javax.swing.GroupLayout.PREFERRED_SIZE, 134,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(69, 69, 69).addComponent(jButton1)))
												.addGap(0, 26, Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2)
								.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3).addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(changeStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SubmitActionPerformed

		int selectedRowIndex = jTable1.getSelectedRow();
		UserDetailHistory detailHistory = new UserDetailHistory();
		detailHistory.setUsername(jTable1.getModel().getValueAt(selectedRowIndex, 1).toString());
		detailHistory.setEmail(jTable1.getModel().getValueAt(selectedRowIndex, 2).toString());
		detailHistory.setMobile(jTable1.getModel().getValueAt(selectedRowIndex, 3).toString());
		detailHistory.setStatus(jTable1.getModel().getValueAt(selectedRowIndex, 4).toString());

		String response = acServiceUserImpl.activateDeactivateUser(detailHistory);
		System.out.println(response);
	}// GEN-LAST:event_SubmitActionPerformed

	private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_backActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		UserDetailHistory detailHistory = new UserDetailHistory();
		detailHistory.setUsername(username.getText());
		detailHistory.setEmail(email.getText());
		detailHistory.setMobile(mobile.getText());
		detailHistory.setStatus(changeStatus.getSelectedItem().toString());
		UserDetailHistory userDetailHistory = acServiceUserImpl.getSingleUser(detailHistory);
		if (!StringUtils.isEmpty(userDetailHistory)) {
			display(userDetailHistory);
		}else{
			JOptionPane.showMessageDialog(new JFrame(), "No Data Found", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	public void display(UserDetailHistory userDetails) {

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(new Object[] { "UserId", "Username", "Email", "Mobile", "status" });

		model.addRow(new Object[] { userDetails.getUserId(), userDetails.getUsername(), userDetails.getEmail(),
				userDetails.getMobile(), userDetails.getStatus() });
		jTable1.setModel(model);
		model.fireTableDataChanged();
		// dataChanged(model);
	}

	/*
	 * public void dataChanged(DefaultTableModel model){
	 * 
	 * 
	 * jTable1.setModel(model);
	 * 
	 * jTable1.getCellEditor().addCellEditorListener(new CellEditorListener() {
	 * 
	 * @Override public void editingStopped(ChangeEvent e) {
	 * 
	 * UserDetailHistory detailHistory = new UserDetailHistory();
	 * detailHistory.setUsername(jTable1.getCellEditor().getCellEditorValue().
	 * toString()); }
	 * 
	 * @Override public void editingCanceled(ChangeEvent e) { // TODO
	 * Auto-generated method stub
	 * 
	 * } }); jTable1.getSelectionModel().addListSelectionListener(new
	 * ListSelectionListener() {
	 * 
	 * @Override public void valueChanged(ListSelectionEvent e) {
	 * CustomerReparingDetail reparingDetail = new CustomerReparingDetail();
	 * reparingDetail
	 * .setCustomerId(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow
	 * (), 0).toString()));
	 * reparingDetail.setName(jTable1.getValueAt(jTable1.getSelectedRow(),
	 * 1).toString()); dispose();
	 * addRepairDetails.setCustomerID(reparingDetail);
	 * addRepairDetails.setVisible(true);
	 * 
	 * } }); }
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Submit;
	private javax.swing.JButton back;
	private javax.swing.JComboBox changeStatus;
	private javax.swing.JTextField email;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField mobile;
	private javax.swing.JTextField username;
	// End of variables declaration//GEN-END:variables
}
