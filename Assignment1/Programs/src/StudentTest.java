import java.util.*;
class Studentdriver{
	public static void main(String[] args)
	{
		String firstName;
		String lastName;
		Address addr;
		String dob;
		String[] skills;
		Qualification[] qual;
		Project [] projects;
		String eMail;
		String contactNo;
		String name;
		Date startDate;
		Date endDate;
		String role;
		String [] responsibilities;
		String line1;
		String line2;
		String city:
		String state;
		int pincode;
		String qualName;
		String university;
		String institute;
		float cgpa;
		int i;
		int j;
		int k;
		int a;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the details of students");

		System.out.println("First Name :")
		String firstName = in.nextline();

		System.out.println("Last Name :")
		String lastName = in.nextline();

		System.out.println("Address :")
		Address addr = in.nextline();

		System.out.println("DOB :")
		String dob = in.nextline();

		System.out.println("eMail :")
		String eMail = in.nextline();

		System.out.println("ContactNo :")
		String contactNo = in.nextline();

		System.out.println("Skills :")
		String [] skills = in.nextline();
		nskills = in.nextline();
		for(i = 0; i<nskills;i++){
			skills[i]=in.nextline();
		}
		System.out.print("Enter the Number os projects done by the students :")
		nprojects=in.nextInt();
		Project nproog[] = new Project[nprojects];
		for(j = 0; j<nprojects;j++){
			System.out.println("Name :")
		String name = in.nextline();

		System.out.println("Start Date :")
		String startDate = in.nextline();

		System.out.println("End Date :")
		Date endDate = in.nextline();

		System.out.println("role :")
		String role = in.nextline();

		System.out.println(" Responsibilities :")
		String[] responsibilities = in.nextline();
		nresp = in.nextInt();
		responsibilities = new String[nresp]
		for(a = 0;; a <nresp; a++){
			System.out.println("enter the responsibilities");
			responsibilities[a] = in.nextline();
		}	
		nprog[j] = new Project(name,startdate,endDate,role,responsibilities);
	}	
		System.out.println("please enter the Number of Qualification students have");
		numqual = in.nextInt();
		Qualification nqual[] = new Qualification[numequal];
		for(k = 0;k<numqual;k++){

		System.out.println("Qualification :")
		Qualification qual = in.nextline();

		System.out.println("University :")
		String university = in.nextline();

		System.out.println("Institute :")
		String institute = in.nextline();

		System.out.println("cgpa :")
		Float cgpa = in.nextfloat();
		nqual[k] = new Qualification(numqual,university,institute,cgpa)
	}
		System.out.println("Enter the students the Address ");

		System.out.println("LIne1 :")
		String line1 = in.nextline();

		System.out.println("Line2 :")
		String line2 = in.nextline();

		System.out.println("City :")
		String city = in.nextline();

		System.out.println("State :")
		String state = in.nextline();

		System.out.println("Pincode :")
		int pincode = in.nextline();
		Address addr = new Address(line1,line2,city,state,pincode)
		student s1 = new Student(firstName,lastName,addr,dob,skills,nqual,nprog,eMail,contactNo);
	}
}	
