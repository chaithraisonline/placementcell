package registration;

public class Job 
{
	public String c_name;
	public String mail;
	public String role;
	public String tenth;
	public String puc;
	public String be;
	public String skill;
	public String salary;
	public String location;
	
	Job(String c_name,String mail,String role,String tenth,String puc,String be,String skill,String salary,String location)
	{
		this.c_name=c_name;
		this.mail=mail;
		this.role=role;
		this.tenth=tenth;
		this.puc=puc;
		this.be=be;
		this.skill=skill;
		this.salary=salary;
		this.location=location;
		
	}
	public String toString()
	{
		return c_name+" "+mail+" "+role+" "+" "+tenth+" "+puc+" "+be+" "+skill+" "+salary+" "+location+" " ; 
		
	}

}
