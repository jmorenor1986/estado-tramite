package com.holding.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsernameToken", propOrder = { "userName", "password" })
public class UsernameToken {
	@XmlAttribute
	private String id;
	@XmlElement(name = "ns2:Username")
	private String userName;
	@XmlElement(name = "ns2:Password")
	private String password;
	
	public static UsernameToken of(String id , String userName, String password) {
		UsernameToken usr = new UsernameToken();
		usr.setId(id);
		usr.setPassword(password);
		usr.setUserName(userName);
		return usr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
