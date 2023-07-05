package com.pagination.dao;  
import com.pagination.bean.*;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
public class EmpDao {  
	public static Connection con = null;
    public static Connection getConnection(){  
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/empdata","root","1234");
			
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
  
    public static List<Emp> getRecords(int start,int total){  
        List<Emp> list=new ArrayList<Emp>();  
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee limit "+(start-1)+","+total);  
            	ResultSet rs=ps.executeQuery();  
            	while(rs.next()){  
                Emp e=new Emp();  
                e.setFirstName(rs.getString(1));  
                e.setLastName(rs.getString(4));  
                e.setEmail(rs.getString(3));  
                e.setPhone(rs.getString(4));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){
        	System.out.println(e);
        }  
        return list;  
    }  
}  