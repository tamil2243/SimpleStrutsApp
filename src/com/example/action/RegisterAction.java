package com.example.action;

import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class RegisterAction{

	private String name;
	private String email;
	private String password;
	private UserDAO userDAO =new UserDAO();
	public String execute(){

		boolean isSuccess=userDAO.register(name,email,password);
		return isSuccess?"success":"failure";
	}



	@StrutsParameter
	public void setName(String name){
		this.name=name;
	}
	@StrutsParameter
	public void setEmail(String email){
		this.email=email;
	}
	@StrutsParameter
	public void setPassword(String password){
		this.password=password;
	}
	public String getName(){return name;}
}
