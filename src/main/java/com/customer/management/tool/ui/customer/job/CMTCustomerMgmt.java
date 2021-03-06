/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.management.tool.ui.customer.job;

import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.customer.management.tool.impl.CMTServiceImpl;
import com.customer.management.tool.pojo.Customer;
import com.customer.management.tool.pojo.CustomerJobDetail;
import com.customer.management.tool.ui.admin.WelcomeForm;

/**
 *
 * @author Aviral
 */

@Component
public class CMTCustomerMgmt extends CMTServiceImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger LOG = Logger.getLogger(CMTCustomerMgmt.class.getName());

	@Autowired
	private AddCustomerJob addCustomerJob;
	@Autowired
	private WelcomeForm welcomeForm;

	/**
	 * Creates new form Test
	 */
	public CMTCustomerMgmt() {
		initComponents();
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
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel3 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		addCustomer = new javax.swing.JButton();
		editCustomer = new javax.swing.JButton();
		back = new javax.swing.JButton();
		clearCustomer = new javax.swing.JButton();
		getCustomer = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		customerTable = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		custId = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		name = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		email = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		address = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		mobile = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		custStatus = new javax.swing.JTextField();
		jPanel4 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		addJob = new javax.swing.JButton();
		editJob = new javax.swing.JButton();
		backJob = new javax.swing.JButton();
		clearJob = new javax.swing.JButton();
		getJob = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		customerJobTable = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jobId = new javax.swing.JTextField();
		jobCustId = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jobUnique = new javax.swing.JTextField();
		jobEmail = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jobMobile = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Commands",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Commands",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		addCustomer.setText("ADD");
		addCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addCustomerActionPerformed(evt);
			}
		});

		editCustomer.setText("EDIT");
		editCustomer.setToolTipText("Search Customer and select Row which you want to update.");
		editCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editCustomerActionPerformed(evt);
			}
		});

		back.setText("BACK");
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backActionPerformed(evt);
			}
		});

		clearCustomer.setText("CLEAR");
		clearCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearCustomerActionPerformed(evt);
			}
		});

		getCustomer.setText("GET");
		getCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getCustomerActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(getCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(addCustomer, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(editCustomer, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(back, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
								.addComponent(clearCustomer, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(20, 20, 20)));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(addCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(getCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(editCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(clearCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		customerTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Customer ID", "Name", "Email", "Mobile", "Address", "Status" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, true, true, true, true, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		customerTable.setColumnSelectionAllowed(true);
		customerTable.getTableHeader().setReorderingAllowed(false);
		customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				customerTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(customerTable);
		customerTable.getColumnModel().getSelectionModel()
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Customer Details",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jLabel1.setText("Customer ID");

		jLabel2.setText("Customer Name");

		jLabel3.setText("Customer Email");

		jLabel4.setText("Customer Address");

		jLabel5.setText("Customer Mobile");

		jLabel11.setText("Status");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(28, 28, 28))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(12, 12, 12))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(15, 15, 15))
						.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(custId).addComponent(name).addComponent(email,
																javax.swing.GroupLayout.DEFAULT_SIZE, 113,
																Short.MAX_VALUE)))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(
												address, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(
														jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(custStatus).addComponent(mobile,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 112,
																		Short.MAX_VALUE))))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(custId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel11).addComponent(custStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Commands",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Commands",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		addJob.setText("ADD");
		addJob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addJobActionPerformed(evt);
			}
		});

		editJob.setText("EDIT");
		editJob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editJobActionPerformed(evt);
			}
		});

		backJob.setText("BACK");
		backJob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backActionPerformed(evt);
			}
		});

		clearJob.setText("CLEAR");
		clearJob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearJobActionPerformed(evt);
			}
		});

		getJob.setText("GET");
		getJob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				getJobActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(getJob, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(addJob, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(editJob, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(backJob, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(clearJob, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(20, 20, 20)));
		jPanel5Layout
				.setVerticalGroup(
						jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
										.addComponent(addJob, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(getJob, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(editJob, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(backJob, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(15, 15, 15)
										.addComponent(clearJob, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		customerJobTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Job Id", "Customer ID", "Name", "Amont Paid", "Order Status", "Description" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, true, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		customerJobTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				customerJobTableMousePressed(evt);
			}
		});
		jScrollPane2.setViewportView(customerJobTable);

		jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Commands",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jLabel6.setText("Customer ID");

		jLabel7.setText("Customer Email");

		jLabel8.setText("Customer Mobile");

		jLabel9.setText("Job ID");

		jLabel10.setText("Unique ID");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6)
								.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jobMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jobEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jobUnique, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
								.addComponent(jobCustId).addComponent(jobId))
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jobId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9))
						.addGap(21, 21, 21)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jobCustId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addGap(21, 21, 21)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jobUnique, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel10))
						.addGap(21, 21, 21)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jobEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7))
						.addGap(21, 21, 21)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(jobMobile, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(21, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
										.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(8, 8, 8)))
						.addGap(0, 15, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(
						jPanel3Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(33, 33, 33)
												.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(33, 33, 33).addComponent(jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)))
										.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout
										.createSequentialGroup().addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
														Short.MAX_VALUE)
												.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
														.addComponent(jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																249, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(21, 21, 21)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void customerJobTableMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_customerJobTableMousePressed
		// TODO add your handling code here:
		customerJobTable.getColumnModel().getColumn(0).setCellEditor(new CustomCell());
		customerJobTable.getColumnModel().getColumn(1).setCellEditor(new CustomCell());
		customerJobTable.getColumnModel().getColumn(7).setCellEditor(new CustomCell());
	}// GEN-LAST:event_customerJobTableMousePressed

	private void customerTableMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_customerTableMousePressed
		// TODO add your handling code here:
		int selectedRow = customerTable.getSelectedRow();
		if (selectedRow >= 0) {
			custId.setText(customerTable.getModel().getValueAt(selectedRow, 0).toString());
			name.setText(customerTable.getModel().getValueAt(selectedRow, 1).toString());
			email.setText(customerTable.getModel().getValueAt(selectedRow, 2).toString());
			mobile.setText(customerTable.getModel().getValueAt(selectedRow, 3).toString());
			address.setText(customerTable.getModel().getValueAt(selectedRow, 4).toString());
			custStatus.setText(customerTable.getModel().getValueAt(selectedRow, 5).toString());
			custId.setEditable(false);
		} else {
			JOptionPane.showMessageDialog(new JFrame(), "Please Select any one row", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_customerTableMousePressed

	private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustomerActionPerformed

		Customer customer = setCustomerData();
		try {
			String response = cmtImpl.addCustomer(customer);
			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// GEN-LAST:event_addCustomerActionPerformed

	private void editCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editCustomerActionPerformed

		Customer customerData = setCustomerData();
		String update = cmtImpl.updateCustomerWithId(customerData);
		JOptionPane.showMessageDialog(new JFrame(), update, "Info", JOptionPane.INFORMATION_MESSAGE);
	}// GEN-LAST:event_editCustomerActionPerformed

	private void clearCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearCustomerActionPerformed

		DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
		model.setRowCount(0);
		custId.setEditable(true);
		custId.setText(null);
		custStatus.setText(null);
		name.setText(null);
		address.setText(null);
		email.setText(null);
		mobile.setText(null);

	}// GEN-LAST:event_clearCustomerActionPerformed

	private void getCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_getCustomerActionPerformed

		Customer customer = setCustomerData();
		List<Customer> customerInfo = cmtImpl.getCustomerInfo(customer);
		if (!StringUtils.isEmpty(customerInfo) && !customerInfo.isEmpty()) {
			DefaultTableModel model = new DefaultTableModel();
			model.setColumnIdentifiers(new Object[] { "Customer ID", "Name", "Email", "Mobile", "Address", "Status" });
			for (Customer customer2 : customerInfo) {
				model.addRow(new Object[] { customer2.getCustomerId(), customer2.getName(), customer2.getEmail(),
						customer2.getMobile(), customer2.getAddress(), customer2.getStatus() });
			}
			model.fireTableDataChanged();
			customerTable.setModel(model);
			LOG.info("Successfully Executed...!!!");
		}
	}// GEN-LAST:event_getCustomerActionPerformed

	private void addJobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addJobActionPerformed
		// TODO add your handling code here:
		dispose();
		addCustomerJob.setVisible(true);
		addCustomerJob.setTitle("Add Customer Job");
	}// GEN-LAST:event_addJobActionPerformed

	private void editJobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editJobActionPerformed
		// TODO add your handling code here:
		int selectedRowIndex = customerJobTable.getSelectedRow();
		if (selectedRowIndex >= 0) {
			CustomerJobDetail customerJobDetail = new CustomerJobDetail();
			customerJobDetail.setJobId((int) customerJobTable.getModel().getValueAt(selectedRowIndex, 0));
			customerJobDetail.setCustomerId((int) customerJobTable.getModel().getValueAt(selectedRowIndex, 1));
			customerJobDetail.setName(customerJobTable.getModel().getValueAt(selectedRowIndex, 2).toString());
			customerJobDetail.setPaidAmount(customerJobTable.getModel().getValueAt(selectedRowIndex, 3).toString());
			customerJobDetail.setUnique_Id(customerJobTable.getModel().getValueAt(selectedRowIndex, 4).toString());
			customerJobDetail.setDueDate(customerJobTable.getModel().getValueAt(selectedRowIndex, 5).toString());
			customerJobDetail.setUpdateDate(new Date().toString());
			customerJobDetail.setWarranty(customerJobTable.getModel().getValueAt(selectedRowIndex, 7).toString());
			customerJobDetail.setReason(customerJobTable.getModel().getValueAt(selectedRowIndex, 8).toString());
			String response = cmtImpl.updateCustomerJob(customerJobDetail);
			if (!StringUtils.isEmpty(response)) {
				LOG.info(response);
				JOptionPane.showMessageDialog(new JFrame(), response, "Information Message",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(new JFrame(), "Unable to update it", "Information Message",
						JOptionPane.ERROR_MESSAGE);
			}
			// TODO need to set value in object from table
		}
	}// GEN-LAST:event_editJobActionPerformed

	private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteJobActionPerformed
		// TODO add your handling code here:
		dispose();
		welcomeForm.setTitle("Welcome");
		welcomeForm.setVisible(true);
	}// GEN-LAST:event_deleteJobActionPerformed

	private void clearJobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearJobActionPerformed
		// TODO add your handling code here:
		
		jobCustId.setText("");
		jobEmail.setText("");
		jobId.setText("");
		jobMobile.setText("");
		jobUnique.setText("");
		DefaultTableModel model = new DefaultTableModel();
		model.setRowCount(0);
		customerJobTable.setModel(model);
	}// GEN-LAST:event_clearJobActionPerformed

	private void getJobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_getJobActionPerformed
		// TODO add your handling code here:
		CustomerJobDetail customerJobDetail = setCustomerJobData();
		List<CustomerJobDetail> response = cmtImpl.getOrSearchJobList(customerJobDetail);
		if (!StringUtils.isEmpty(response) && response.size() > 0) {
			DefaultTableModel model = new DefaultTableModel();
			model.setColumnIdentifiers(new Object[] { "Job ID", "Customer ID", "Name", "Amount", "Unique ID",
					"Due Date", "Last Updated", "Warrenty", "Reason" });
			for (CustomerJobDetail jobDetail : response) {
				model.addRow(new Object[] { jobDetail.getJobId(), jobDetail.getCustomerId(), jobDetail.getName(),
						jobDetail.getPaidAmount(), jobDetail.getUnique_Id(), jobDetail.getDueDate(),
						jobDetail.getUpdateDate(), jobDetail.getWarranty(), jobDetail.getReason() });
			}
			model.fireTableDataChanged();
			customerJobTable.setModel(model);
		} else {
			JOptionPane.showMessageDialog(new JFrame(), "No data found", "Information Message",
					JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_getJobActionPerformed

	private Customer setCustomerData() {

		Customer customer = new Customer();
		if (!StringUtils.isEmpty(custId.getText())) {
			customer.setCustomerId(Integer.parseInt(custId.getText()));
		}
		customer.setName(name.getText());
		customer.setAddress(address.getText());
		customer.setEmail(email.getText());
		customer.setMobile(mobile.getText());
		customer.setStatus(custStatus.getText());
		return customer;
	}

	private CustomerJobDetail setCustomerJobData() {

		CustomerJobDetail customerJobDetail = new CustomerJobDetail();
		if (!StringUtils.isEmpty(jobId.getText()) && Integer.parseInt(jobId.getText()) > 0) {
			customerJobDetail.setJobId(Integer.parseInt(jobId.getText()));
		}
		if (!StringUtils.isEmpty(jobCustId.getText()) && Integer.parseInt(jobCustId.getText()) > 0) {
			customerJobDetail.setCustomerId(Integer.parseInt(jobCustId.getText()));
		}
		customerJobDetail.setUnique_Id(jobUnique.getText());
		customerJobDetail.setUnique_Id(jobEmail.getText());
		customerJobDetail.setUnique_Id(jobMobile.getText());
		return customerJobDetail;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton addCustomer;
	private javax.swing.JButton addJob;
	private javax.swing.JTextField address;
	private javax.swing.JButton back;
	private javax.swing.JButton backJob;
	private javax.swing.JButton clearCustomer;
	private javax.swing.JButton clearJob;
	private javax.swing.JTextField custId;
	private javax.swing.JTextField custStatus;
	private javax.swing.JTable customerJobTable;
	private javax.swing.JTable customerTable;
	private javax.swing.JButton editCustomer;
	private javax.swing.JButton editJob;
	private javax.swing.JTextField email;
	private javax.swing.JButton getCustomer;
	private javax.swing.JButton getJob;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jobCustId;
	private javax.swing.JTextField jobEmail;
	private javax.swing.JTextField jobId;
	private javax.swing.JTextField jobMobile;
	private javax.swing.JTextField jobUnique;
	private javax.swing.JTextField mobile;
	private javax.swing.JTextField name;
	// End of variables declaration//GEN-END:variables
}
