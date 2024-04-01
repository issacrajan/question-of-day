package com.issac.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	private String userId;
	private String userPwd;

	public String getId() { return id; }

	public void setId(String id) { this.id = id; }

	public String getUserId() { return userId; }

	public void setUserId(String userId) { this.userId = userId; }

	public String getUserPwd() { return userPwd; }

	public void setUserPwd(String userPwd) { this.userPwd = userPwd; }

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userId=" + userId + ", userPwd=" + userPwd + "]";
	}

}
