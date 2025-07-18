package com.example.action;
import java.util.Optional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserDAO{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public Optional<User> logIn(String email,String password){
		User user=null;
		try{
			con=DBConnection.getConnection();

			String query="select * from users where email=?";
			ps=con.prepareStatement(query);
			ps.setString(1,email);
			rs=ps.executeQuery();
			

			
			if(rs.next()){
				String dbPassword = rs.getString("password");
				if(dbPassword.equals(password)){
					user=new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					
				}
			}
			
			return Optional.ofNullable(user);
		}catch(Exception e){
			e.printStackTrace();
			return Optional.ofNullable(user);

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

	public User getUserById(int id){
		User user=new User();

		try{
                        con=DBConnection.getConnection();

                        String query="select * from users where id=?";
                        ps=con.prepareStatement(query);
                        ps.setInt(1,id);
                        rs=ps.executeQuery();



                        if(rs.next()){
                                 user.setId(rs.getInt("id"));
                                 user.setName(rs.getString("name"));
                        	 user.setEmail(rs.getString("email"));
                        }

                        return user;
                }catch(Exception e){
                        e.printStackTrace();
                        return user;

                }
                finally{
                        try { if (rs != null) rs.close(); } catch (Exception e) {}
                        try { if (ps != null) ps.close(); } catch (Exception e) {}
                        try { if (con != null) con.close(); } catch (Exception e) {}
                }


	}
}
