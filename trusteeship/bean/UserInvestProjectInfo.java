package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

public class UserInvestProjectInfo extends UserTransactionInfo{
	
	private  Integer projectId;
	private  String  projectName;
	private  BigDecimal projectMoney;
    private  String projectDescripe;
    
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public BigDecimal getProjectMoney() {
		return projectMoney;
	}
	public void setProjectMoney(BigDecimal projectMoney) {
		this.projectMoney = projectMoney;
	}
	public String getProjectDescripe() {
		return projectDescripe;
	}
	public void setProjectDescripe(String projectDescripe) {
		this.projectDescripe = projectDescripe;
	}
    
}
