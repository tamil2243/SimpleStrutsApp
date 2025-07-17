package com.example.action;
import java.util.Optional;
import org.apache.struts2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;
public class LoginAction extends ActionSupport{


	private String email;
	private String password;
	private User user;
	private UserDAO userDAO=new UserDAO();

	public String execute(){

		Optional<User> optionalUser= userDAO.logIn(email,password);
		if(optionalUser.isEmpty())return "failure";
		user=optionalUser.get();
		System.out.println("From login Action"); 
		return "success";
	}
	public User getUser(){return user;}
	@StrutsParameter
	public void setEmail(String email){
		this.email=email;
	}
	@StrutsParameter
	public void setPassword(String password){
		this.password=password;
	}
}
