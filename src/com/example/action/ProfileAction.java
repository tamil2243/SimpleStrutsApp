package com.example.action;
import org.apache.struts2.interceptor.parameter.StrutsParameter;
public class ProfileAction{

	private User user;
	private int id;
	public String execute(){
		UserDAO userDao=new UserDAO();
		user=userDao.getUserById(id);
		System.out.println(id);
		System.out.println(user.getName());
		return "success";
	}
	@StrutsParameter
	public void setId(int id){
		this.id=id;
	}
	//@StrutsParameter
	//public void setUser(User user){
	//	this.user=user;
	//}
	public User getUser(){return user;}
}
