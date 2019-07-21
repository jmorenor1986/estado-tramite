package com.holding.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = { "user" })
public class SecurityDto {
	@XmlElement(name = "ns2:UsernameToken")
	private UsernameToken user;

	public UsernameToken getUser() {
		return user;
	}

	public void setUser(UsernameToken user) {
		this.user = user;
	}

}
