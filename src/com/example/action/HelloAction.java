package com.example.action;

import org.apache.struts2.interceptor.parameter.StrutsParameter;
//import com.opensymphony.xwork2.ActionSupport;

public class HelloAction{
    private String userName;
    private String message;
    private int age;

	public String execute() {
    		System.out.println(">>> HelloAction executed!");
		System.out.println(userName);
    		return "success";
	}
	public String create() {
    		System.out.println("Inside create");
    		return "success";
	}
	public String input() {
    		return "input";
	}


    

    public String getUserName() {
        return userName;
    }
    public String getMessage(){
	    return message;
    }
    public int getAge(){
	    return age;
    }
    @StrutsParameter
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @StrutsParameter
    public void setMessage(String message){
	    this.message=message;
    }
    @StrutsParameter
    public void setAge(int age){
	    this.age=age;
    }
}

