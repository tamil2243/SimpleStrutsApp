package com.example.action;

import org.apache.struts2.interceptor.parameter.StrutsParameter;
public class LoginAction{


	private String email;
	private String password;
	private UserDAO userDAO=new UserDAO();

	public String execute(){

		boolean isSuccess= userDAO.logIn(email,password);

		return isSuccess?"success":"failure";
	}
	@StrutsParameter
	public void setEmail(String email){
		this.email=email;
	}
	@StrutsParameter
	public void setPassword(String password){
		this.password=password;
	}
}
