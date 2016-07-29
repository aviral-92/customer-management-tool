/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.management.tool.pojo;

import java.util.Date;

/**
 *
 * @author amittal
 */

public class CustomerJobDetail {

	private int jobId;
	private int customerId;
	private int order_id;
	private String unique_Id;
	private String description;
	private String actualAmount;
	private String paidAmount;
	private Date updateDate;
	private String status;
	private Date warranty;
	private String isWarrantyExpired;
	private String finalAmount;
	private String updatedDateRetun;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the unique_Id
	 */
	public String getUnique_Id() {
		return unique_Id;
	}

	/**
	 * @param unique_Id
	 *            the unique_Id to set
	 */
	public void setUnique_Id(String unique_Id) {
		this.unique_Id = unique_Id;
	}

	/**
	 * @return the actualAmount
	 */
	public String getActualAmount() {
		return actualAmount;
	}

	/**
	 * @param actualAmount
	 *            the actualAmount to set
	 */
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * @return the paidAmount
	 */
	public String getPaidAmount() {
		return paidAmount;
	}

	/**
	 * @param paidAmount
	 *            the paidAmount to set
	 */
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the warranty
	 */
	public Date getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty
	 *            the warranty to set
	 */
	public void setWarranty(Date warranty) {
		this.warranty = warranty;
	}

	/**
	 * @return the model_Vehicle //
	 */

	public String getIsWarrantyExpired() {
		return isWarrantyExpired;
	}

	public void setIsWarrantyExpired(String isWarrantyExpired) {
		this.isWarrantyExpired = isWarrantyExpired;
	}

	public String getUpdatedDateRetun() {
		return updatedDateRetun;
	}

	public void setUpdatedDateRetun(String updatedDateRetun) {
		this.updatedDateRetun = updatedDateRetun;
	}

	public String getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(String finalAmount) {
		this.finalAmount = finalAmount;
	}

	/**
	 * @return the jobId
	 */
	public int getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 *            the jobId to set
	 */
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
}
