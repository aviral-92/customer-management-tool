/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.management.tool.ui.customer.job;

import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.customer.management.tool.impl.CMTServiceImpl;
import com.customer.management.tool.pojo.CMTOrderManagement;
import com.customer.management.tool.pojo.CMTOrderStatus;
import com.customer.management.tool.pojo.CustomerJobDetail;
import com.customer.management.tool.ui.admin.WelcomeForm;

/**
 *
 * @author amittal
 */

@Component
@Scope("prototype")
public class JobListByDate extends CMTServiceImpl {

	@Autowired
	private WelcomeForm welcomeForm;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form JobListByDate
	 */
	public JobListByDate() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel3 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		startDate = new com.toedter.calendar.JDateChooser();
		endDate = new com.toedter.calendar.JDateChooser();
		Search = new javax.swing.JButton();
		pending = new javax.swing.JRadioButton();
		underProcess = new javax.swing.JRadioButton();
		jLabel3 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		completed = new javax.swing.JRadioButton();
		goBack = new javax.swing.JButton();
		submit = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Get Pending Jobs",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14))); // NOI18N

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Range",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14))); // NOI18N

		jLabel2.setText("End Date");

		jLabel1.setText("Start Date");

		Search.setText("Search");
		Search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SearchActionPerformed(evt);
			}
		});

		buttonGroup1.add(pending);
		pending.setText("Pending");

		buttonGroup1.add(underProcess);
		underProcess.setText("Under Process");

		jLabel3.setText("Choose work");

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Any one of this when searching Under Process", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

		jLabel4.setText("Customer ID");

		jLabel5.setText("Job ID");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4)
								.addGap(18, 18, 18)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46).addComponent(jLabel5).addGap(39, 39, 39)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 136,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		buttonGroup1.add(completed);
		completed.setText("Completed");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										jPanel1Layout.createSequentialGroup().addGap(71, 71, 71).addComponent(jLabel3)
												.addGap(48, 48, 48).addComponent(pending)
												.addGap(60, 60, 60).addComponent(underProcess).addGap(41, 41, 41)
												.addComponent(completed))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(29, 29, 29)
										.addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(40, 40, 40).addComponent(jLabel2).addGap(34, 34, 34)
										.addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(Search)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2)
								.addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(pending).addComponent(underProcess).addComponent(jLabel3)
								.addComponent(completed))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(26, 26, 26))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
										.createSequentialGroup().addComponent(Search).addGap(42, 42, 42)))));

		goBack.setText("Go Back");
		goBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				goBackActionPerformed(evt);
			}
		});

		submit.setText("Submit");
		submit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(goBack).addGap(33, 33, 33).addComponent(submit).addGap(47, 47, 47)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(goBack).addComponent(submit))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(34, 34, 34)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel3,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void submitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitActionPerformed
		// TODO add your handling code here:
		int selectedRow = jTable1.getSelectedRow();
		if (selectedRow >= 0) {
			// int columnCount = jTable1.getColumnCount();
			CustomerJobDetail customerJobDetail = new CustomerJobDetail();
			if (jTable1.getModel().getValueAt(selectedRow, 1).toString()
					.equalsIgnoreCase(jTable1.getModel().getValueAt(selectedRow, 5).toString())) {
				JOptionPane.showMessageDialog(new JFrame(), "New Order Status is same as current status", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				customerJobDetail.setJobId(Integer.parseInt(jTable1.getModel().getValueAt(selectedRow, 0).toString()));
				CMTOrderManagement cmtOrderManagement = new CMTOrderManagement();
				CMTOrderStatus cmtOrderStatus = new CMTOrderStatus();
				cmtOrderStatus.setOrder_value(jTable1.getModel().getValueAt(selectedRow, 1).toString());
				cmtOrderStatus.setOrder_status(jTable1.getModel().getValueAt(selectedRow, 5).toString());
				cmtOrderManagement.setCmtOrderStatus(cmtOrderStatus);
				customerJobDetail.setCmtOrderManagement(cmtOrderManagement);
				customerJobDetail.setReason(jTable1.getModel().getValueAt(selectedRow, 2).toString());
				customerJobDetail.setDueDate(jTable1.getModel().getValueAt(selectedRow, 3).toString());
				customerJobDetail
						.setStartWork(Boolean.parseBoolean(jTable1.getModel().getValueAt(selectedRow, 4).toString()));
				cmtImpl.changeOrderStatus(customerJobDetail);
			}

		}

	}// GEN-LAST:event_submitActionPerformed

	private void goBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_goBackActionPerformed
		// TODO add your handling code here:
		dispose();
		welcomeForm.setVisible(true);
	}// GEN-LAST:event_goBackActionPerformed

	private void SearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchActionPerformed
		// TODO add your handling code here:
		String pendingRadioBtn = null;
		try {
			if (pending.isSelected()) {
				pendingRadioBtn = "pending";
			} else if (underProcess.isSelected()) {
				pendingRadioBtn = "underprocess";
			} else if (completed.isSelected()) {
				pendingRadioBtn = "completed";
			} else {
				throw new Exception("Please select any one work.");
			}
			List<CustomerJobDetail> customerJobDetails = cmtImpl.searchByDate(startDate.getDate(), endDate.getDate(),
					pendingRadioBtn);
			if (!StringUtils.isEmpty(customerJobDetails) && !customerJobDetails.isEmpty()) {
				display(customerJobDetails);
			} else {
				JOptionPane.showMessageDialog(new JFrame(), "No jobs in between dates", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

	}// GEN-LAST:event_SearchActionPerformed

	public void display(List<CustomerJobDetail> customerJobDetails) {

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(
				new Object[] { "JobID", "Job Status", "Reason", "Due Date", "Start Work", "Change Order Status" });
		for (CustomerJobDetail customerJobDetail : customerJobDetails) {

			model.addRow(new Object[] { customerJobDetail.getJobId(),
					customerJobDetail.getCmtOrderManagement().getCmtOrderStatus().getOrder_value(),
					customerJobDetail.getReason(), customerJobDetail.getDueDate(), false });
		}
		JComboBox<String> jc = new JComboBox<>();
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		comboModel.addElement("Nothing");
		comboModel.addElement("Pending");
		comboModel.addElement("Under Process");
		comboModel.addElement("Completed");
		jc.setModel(comboModel);

		// model.addRow(new Object[]{1,"a","","ssss",true,"data"});
		jTable1.setModel(model);
		TableColumn tc = jTable1.getColumnModel().getColumn(4);
		tc.setCellEditor(jTable1.getDefaultEditor(Boolean.class));
		tc.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
		TableColumn tc1 = jTable1.getColumnModel().getColumn(5);
		tc1.setCellEditor(new DefaultCellEditor(jc));
		// tc1.setCellEditor(jTable1.getDefaultEditor(JComboBox.class));
		// tc1.setCellRenderer(jTable1.getDefaultRenderer(JComboBox.class));
		jTable1.setEnabled(true);
		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		model.fireTableDataChanged();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	public static void main(String[] args) {
		JobListByDate jj = new JobListByDate();
		jj.setVisible(true);
		jj.display(null);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Search;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JRadioButton completed;
	private com.toedter.calendar.JDateChooser endDate;
	private javax.swing.JButton goBack;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JRadioButton pending;
	private com.toedter.calendar.JDateChooser startDate;
	private javax.swing.JButton submit;
	private javax.swing.JRadioButton underProcess;
	// End of variables declaration//GEN-END:variables
}
