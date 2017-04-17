package com.xinma.backend.domain;

public class User extends BaseEntity {

	private String name;

	private String password;

	private String salt;

	private String fullName;

	private String mobile;

	private String email;

	private Integer userType;

	private Integer status;

	private Integer eseId;

	private Integer version;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getEseId() {
		return eseId;
	}

	public void setEseId(Integer eseId) {
		this.eseId = eseId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", salt=" + salt + ", fullName=" + fullName
				+ ", mobile=" + mobile + ", email=" + email + ", userType=" + userType + ", status=" + status
				+ ", eseId=" + eseId + ", version=" + version + "]";
	}

}
