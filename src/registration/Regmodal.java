package registration;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class Regmodal
{
	public ArrayList<Job> l=new ArrayList<Job>();
	
	ResultSet res;
	Connection con;
	PreparedStatement pstmt;
	
	private String c_name;
	private String username;
	private String password;
	private String cpassword;
	//getter n setter methods   
	public String getc_name()
	{
		return c_name;
	}
	public void setc_name(String c_name)
	{
		this.c_name= c_name;
	}
	
	
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username= username;
	}
	
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	
		
	//connection is made
	public Regmodal()
	{
		try
		{
			DriverManager.deregisterDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521/XE", "system", "chai");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	//registration form query
	public int register()
	{
		try
		{
			String s="INSERT INTO EMPLOYEE VALUES(?,?,?)";
			pstmt=con.prepareStatement(s);
			
			pstmt.setString(1, c_name);
		    pstmt.setString(2, username);
			pstmt.setString(3, password);
			System.out.println(c_name+" "+username+" "+password);
			int x=pstmt.executeUpdate();
			return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}
	public int login() 
	{
		try 
		{
			String s="SELECT * FROM EMPLOYEE WHERE USERNAME=? AND PASSWORD=?";
			pstmt=con.prepareStatement(s);
			
			 pstmt.setString(1,username);
			 pstmt.setString(2, password);
			 
			 res=pstmt.executeQuery();
			 if(res.next()==true)
			 {
				 c_name=res.getString("C_NAME");
				 return 1;
			 }
			 else
			 {
				 return 0;
			 }
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		return 0;
	}
	
	private String name;
	private String age;
	private String tenth;
	private String puc;
	private String be;
	private String skill;
	private String location;
	private String role;
	private String mail;
	private String salary;
	//getter n setter methods   
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	
	public String getage()
	{
		return age;
	}
	public void setage(String age)
	{
		this.age=age;
	}
	
	
	public String gettenth()
	{
		return tenth;
	}
	public void settenth(String tenth)
	{
		this.tenth=tenth;
	}
	
	public String getpuc()
	{
		return puc;
	}
	public void setpuc(String puc)
	{
		this.puc=puc;
	}
	
	public String getbe()
	{
		return be;
	}
	public void setbe(String be)
	{
		this.be=be;
	}
	
	public String getskill()
	{
		return skill;
	}
	public void setskill(String skill)
	{
		this.skill=skill;
	}
	
	public String getmail()
	{
		return mail;
	}
	public void setmail(String mail)
	{
		this.mail=mail;
	}
	
	public String getrole()
	{
		return role;
	}
	public void setrole(String role)
	{
		this.role=role;
	}

	public String getsalary()
	{
		return salary;
	}
	public void setsalary(String salary)
	{
		this.salary=salary;
	}
	
	public String getlocation()
	{
		return location;
	}
	public void setlocation(String location)
	{
		this.location=location;
	}
 
	public int Sregister()
     {
	 
	 try
		{
			String s="INSERT INTO APPLICANT VALUES(?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(s);
			
			pstmt.setString(1, name);
		    pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, age);
			pstmt.setString(5, tenth);
			pstmt.setString(6, puc);
			pstmt.setString(7, be);
			pstmt.setString(8, skill);
			//System.out.println(name+" "+username+" "+password+" "+age+" "+tenth+" "+"puc"+" "+be+" "+skill);
			int x=pstmt.executeUpdate();
			return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 0;
	
   }


  public int Slogin()
{
	try 
	{
		String s="SELECT * FROM APPLICANT WHERE USERNAME=? AND PASSWORD=?";
		pstmt=con.prepareStatement(s);
		
		 pstmt.setString(1, username);
		 pstmt.setString(2, password);
		 
		 res=pstmt.executeQuery();
		 if(res.next()==true)
		 {
			 name=res.getString("name");
			 age=res.getString("age");
			 tenth=res.getString("tenth");
			 puc=res.getString("puc");
			 be=res.getString("be");
			 skill=res.getString("skill");

			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	return 0;
}

public int changepwd()
{
	System.out.println(password);
	System.out.println(username);

	try 
	{
		String s="UPDATE  EMPLOYEE SET PASSWORD=? WHERE USERNAME=?";
		pstmt=con.prepareStatement(s);
		
		 pstmt.setString(1, password);
		 pstmt.setString(2, username);
		 
		 int x=pstmt.executeUpdate();
		return x;
		
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	return 0;
}
public int jobreg() 
{
	 try
		{
			String s="INSERT INTO JOBPORTAL VALUES(?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(s);
			
			pstmt.setString(1, c_name);
		    pstmt.setString(2, mail);
			pstmt.setString(3, role);
			pstmt.setString(4, tenth);
			pstmt.setString(5, puc);
			pstmt.setString(6, be);
			pstmt.setString(7, skill);
			pstmt.setString(8, location);
			pstmt.setString(9, salary);
			//System.out.println(name+" "+mail+" "+role+" "+tenth+" "+"puc"+" "+be+" "+skill+" "+location+" "+salary);
			int x=pstmt.executeUpdate();
			return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 0;	
}


public int searchjob()
{   
	try 
	{
	String s="SELECT * FROM JOBPORTAL WHERE TENTH<=? AND PUC<=? AND BE<=?";
	pstmt=con.prepareStatement(s);
	
	 pstmt.setString(1, tenth);
	 pstmt.setString(2, puc);
	 pstmt.setString(3, be);
	 res=pstmt.executeQuery();
	 while(res.next()==true)
	 {
		c_name= res.getString("c_name"); 
		mail= res.getString("mail");
		role= res.getString("role");
		tenth= res.getString("tenth");
		 puc=res.getString("puc");
		skill= res.getString("skill");
		 location=res.getString("location");
		salary= res.getString("salary");

			 
		 l.add(new Job(c_name,mail,role,tenth,puc,be,skill,location,salary));
		 
		
	 }
	
	
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	return 0;
}


public int changetenth() 
{
	try
	{
		String s="UPDATE APPLICANT SET TENTH=? WHERE USERNAME=?";
		pstmt=con.prepareStatement(s);
		pstmt.setString(1,tenth);
		pstmt.setString(2,username);
		int x=pstmt.executeUpdate();
		return x;
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return 0;
}
public int changepu() 
{
	try
	{
		String s="UPDATE APPLICANT SET PUC=? WHERE USERNAME=?";
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, puc);
		pstmt.setString(2, username);
		int x=pstmt.executeUpdate();
		return x;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return 0;
	
}


}
