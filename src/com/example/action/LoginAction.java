package com.example.action;
import com.example.action.User;
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
		System.out.println("User's ID from DAO: " + user.getId());
	        System.out.println("User's name from DAO: " + user.getName());
		System.out.println("User's Email from DAO: " + user.getEmail());
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
