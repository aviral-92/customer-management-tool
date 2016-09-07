/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.management.tool.ui.unused;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import com.customer.management.tool.constants.CMTMessageCode;
import com.customer.management.tool.impl.CMTGoBackImpl;
import com.customer.management.tool.impl.CMTServiceImpl;
import com.customer.management.tool.pojo.UserDetail;
import com.customer.management.tool.pojo.UserDetailHistory;

/**
 *
 * @author Aviral
 */
@Component
@Scope("prototype")
public class GetUsers extends CMTServiceImpl implements Serializable {

	private static final long serialVersionUID = 1L;
	private ResourceBundleMessageSource messageSource;

	public ResourceBundleMessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(ResourceBundleMessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Autowired
	private CMTGoBackImpl acServiceBackImpl;

	public GetUsers(ResourceBundleMessageSource resourceBundleMessageSource) {
		setMessageSource(resourceBundleMessageSource);
		initComponents(resourceBundleMessageSource);
	}

	public void displayRecords(List<UserDetailHistory> userDetails) {

		DefaultTableModel model = new DefaultTableModel();
		// Setting Column names
		model.setColumnIdentifiers(new Object[] {
				getMessageSource().getMessage(CMTMessageCode.USER_ID.getValue(), null, Locale.getDefault()),
				getMessageSource().getMessage(CMTMessageCode.NAME.getValue(), null, Locale.getDefault()),
				getMessageSource().getMessage(CMTMessageCode.USERNAME.getValue(), null, Locale.getDefault()),
				getMessageSource().getMessage(CMTMessageCode.EMAIL.getValue(), null, Locale.getDefault()),
				getMessageSource().getMessage(CMTMessageCode.MOBILE.getValue(), null, Locale.getDefault()),
				getMessageSource().getMessage(CMTMessageCode.REGISTER_DATE.getValue(), null, Locale.getDefault()) });
		for (UserDetail details : userDetails) {
			model.addRow(new Object[] { details.getUserId(), details.getName(), details.getUsername(),
					details.getEmail(), details.getMobile(), details.getRegisteredDate() });
		}
		jTable1.setModel(model);
		jTable1.setEnabled(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * 
	 * @param messageSource
	 */
	private void initComponents(ResourceBundleMessageSource messageSource) {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBounds(new java.awt.Rectangle(450, 150, 0, 0));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton1.setText(messageSource.getMessage(CMTMessageCode.BACK.getValue(), null, Locale.getDefault()));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(271, 271, 271).addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(20, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jButton1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		dispose();
		acServiceBackImpl.backButtonCode(GetUsers.class);
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
}