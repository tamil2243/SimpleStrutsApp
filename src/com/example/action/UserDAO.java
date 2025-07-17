package com.example.action;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserDAO{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public boolean logIn(String email,String password){
		User user=new User();
		try{
			con=DBConnection.getConnection();

			String query="select * from users where email=?";
			ps=con.prepareStatement(query);
			ps.setString(1,email);
			rs=ps.executeQuery();
			

			
			if(rs.next()){
				String dbPassword = rs.getString("password");
				if(dbPassword.equals(password)){

					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					//user.setPassword(dpPassword);
					return true;
				}
			}
			
			return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		finally{
			try { if (rs != null) rs.close(); } catch (Exception e) {}
    			try { if (ps != null) ps.close(); } catch (Exception e) {}
    			try { if (con != null) con.close(); } catch (Exception e) {}
		}
	}

	public boolean register(String name, String email, String password){
		
                try{
                        con=DBConnection.getConnection();

                        String query="insert into users(name,email,password) values(?,?,?)";
                        ps=con.prepareStatement(query);
                        ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
                      
                        ps.executeUpdate();
			
                        return true;
                }catch(Exception e){
                        e.printStackTrace();
                        return false;
                }
                finally{
                        try { if (rs != null) rs.close(); } catch (Exception e) {}
                        try { if (ps != null) ps.close(); } catch (Exception e) {}
                        try { if (con != null) con.close(); } catch (Exception e) {}
                }
	}


}
