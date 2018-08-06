package com.teradata.tag.bean;


import java.io.Serializable;

public class SysUserVO implements Serializable {

	private String userId;

	private String latnId;//属地ID

	private String latnCd;//属地编码

	private String userName;

	private String userPass;

	private String departId;//机构ID
	
	private String departName;//机构名称

	private int teamId;

	private String userRole;

	private String roleName;

	private String userStatus;

	private String lastLoginTime;

	private String creatorName;

	private String createTime;

	private String nickName;

	private String userIp;

	private String userEmail;

	private String userPhone;

	private int queryRights = 20;
	
	private String dataRight;

	private String loginLogId;
	
	private String menuUrl;
	
	private String lastModifyPswTime;
	
	private int continuousLoginFailCnt;			
		
	private String grpLatnId;//集团归属属地
	
	private String grpMemLatnId;//集团成员归属属地（订购属地）

	public SysUserVO() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLatnId() {
		return null == latnId ? "" : latnId.trim();
	}

	public void setLatnId(String latnId) {
		this.latnId = latnId;
	}
	
	public String getLatnCd() {
		return latnCd;
	}

	public void setLatnCd(String latnCd) {
		this.latnCd = latnCd;
	}

	public String getUserName() {
		return null == userName ? "" : userName.trim();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return null == userPass ? "" : userPass.trim();
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}	

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getUserRole() {
		return null == userRole ? "" : userRole.trim();
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserStatus() {
		return null == userStatus ? "" : userStatus.trim();
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getCreatorName() {
		return null == creatorName ? "" : creatorName.trim();
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCreateTime() {
		return null == createTime ? "" : createTime.trim();
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastLoginTime() {
		return null == lastLoginTime ? "" : lastLoginTime.trim();
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	
	public int getQueryRights() {
		return queryRights;
	}

	public void setQueryRights(int queryRights) {
		this.queryRights = queryRights;
	}

	public String getDataRight() {
		return dataRight;
	}

	public void setDataRight(String dataRight) {
		this.dataRight = dataRight;
	}
	
	public String getLastModifyPswTime() {
		return lastModifyPswTime;
	}

	public void setLastModifyPswTime(String lastModifyPswTime) {
		this.lastModifyPswTime = lastModifyPswTime;
	}

	public int getContinuousLoginFailCnt() {
		return continuousLoginFailCnt;
	}

	public void setContinuousLoginFailCnt(int continuousLoginFailCnt) {
		this.continuousLoginFailCnt = continuousLoginFailCnt;
	}

	public String getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(String loginLogId) {
		this.loginLogId = loginLogId;
	}

	public String getGrpLatnId() {
		return grpLatnId;
	}

	public void setGrpLatnId(String grpLatnId) {
		this.grpLatnId = grpLatnId;
	}

	public String getGrpMemLatnId() {
		return grpMemLatnId;
	}

	public void setGrpMemLatnId(String grpMemLatnId) {
		this.grpMemLatnId = grpMemLatnId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "SysUserVO{" +
				"userId='" + userId + '\'' +
				", latnId='" + latnId + '\'' +
				", latnCd='" + latnCd + '\'' +
				", userName='" + userName + '\'' +
				", userPass='" + userPass + '\'' +
				", departId='" + departId + '\'' +
				", departName='" + departName + '\'' +
				", teamId=" + teamId +
				", userRole='" + userRole + '\'' +
				", roleName='" + roleName + '\'' +
				", userStatus='" + userStatus + '\'' +
				", lastLoginTime='" + lastLoginTime + '\'' +
				", creatorName='" + creatorName + '\'' +
				", createTime='" + createTime + '\'' +
				", nickName='" + nickName + '\'' +
				", userIp='" + userIp + '\'' +
				", userEmail='" + userEmail + '\'' +
				", userPhone='" + userPhone + '\'' +
				", queryRights=" + queryRights +
				", dataRight='" + dataRight + '\'' +
				", loginLogId='" + loginLogId + '\'' +
				", menuUrl='" + menuUrl + '\'' +
				", lastModifyPswTime='" + lastModifyPswTime + '\'' +
				", continuousLoginFailCnt=" + continuousLoginFailCnt +
				", grpLatnId='" + grpLatnId + '\'' +
				", grpMemLatnId='" + grpMemLatnId + '\'' +
				'}';
	}
}
