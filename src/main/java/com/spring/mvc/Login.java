package com.spring.mvc;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.hibernate.validator.constraints.NotEmpty;

public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotEmpty
	private String userName;
	@NotEmpty
	private String password;
	
	private Register register;
	private boolean validFlag;
	private Set<Role> roles= new HashSet<>();
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, password, register, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(register, other.register) && Objects.equals(userName, other.userName);
	}
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public boolean isValidFlag() {
		return validFlag;
	}
	public void setValidFlag(boolean validFlag) {
		this.validFlag = validFlag;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
