package com.WB.mybatis.cn;

import java.io.Serializable;

/**
 * @time 2017-1-13
 * @author lxx
 * @address 2016luoxx@sina.com
 */
public class UserInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int Id;
	public String username; //用户名
	public String userpass; //用户密码
	public String useraddress; //用户邮箱
	
	public UserInformation(){}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	
	
}
