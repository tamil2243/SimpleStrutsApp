package com.example.action;

import org.apache.struts2.interceptor.parameter.StrutsParameter;
import java.sql.*;
//import com.opensymphony.xwork2.ActionSupport;

public class HelloAction{
    private String userName;
    private String message;
    private int age;
    private String url="jdbc:mysql://localhost:3306/temp";
    private String user="user";
    private String pwd="123456";
	public String execute() {
    		System.out.println(">>> HelloAction executed!");
		System.out.println(userName);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pwd);
			String qurie="insert into temp(name,age,message) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(qurie);
			ps.setString(1,userName);
			ps.setInt(2,age);
			ps.setString(3,message);
			ps.executeUpdate();
    			return "success";
		}catch(Exception e){
			e.printStackTrace();
		}
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

