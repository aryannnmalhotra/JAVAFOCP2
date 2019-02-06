class Student{
	String firstName;
	String lastName;
	Address addr;
	String dob;
	String[] skills;
	Qualification[] qual;
	Project [] projects;
	String eMail;
	String contactNo;


 	public Student ()
 	{
		firstName = "";
		lastname = "";
		addr = null;
		dob =  "";
		skills = null;
		qual = null;
		projects = null;
		eMail = "";
		contactNo = ""; 	
 	}
 	public Student (String firstName, String dob, Address addr, String[] skills, Qualification[] qual, String projects, String eMail, String contactNo ){
 		this.firstName = firstName;
 		this.lastname = lastName;
 		this.addr = addr;
 		this.dob = dob;
 		this.skills = skills;
 		this.qual = qual;
 		this.projects = projects;
 		this.eMail = eMail;
 		this.contactNo = contactNo;
 	}
 } 