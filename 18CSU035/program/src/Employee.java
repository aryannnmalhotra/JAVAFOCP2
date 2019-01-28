class Employee{
	Scanner in = new  Scanner(System.in);
	int empCode;
	String empName;
	String empDepartment;
	String empCity;
	float empSalary;
	static int empCount = 0;
	Employee(){
		empCode = 0;
		empName = "";
		empDepartment = "";
		empCity = "";
		empSalary = 0.0f;

	}
	Employee(int ec, String en, String dept, String ecity, float es){
		this.empCode = ec;
		this.empName = en;
		this.empDepartment = dept;
		this.empCity = ecity;
		this.empSalary = es;
	}
	void Display(){
		System.out.println("Code: " + empCode);
		System.out.println("Name: " + empName);
		System.out.println("Department: " + empDepartment);
		System.out.println("City: " + empCity);
		System.out.println("Salary: " + empSalary);

	}
	void Insert(){
		System.out.println("Enter the details of employee");


		System.out.println("Employee Code:");
		int empCode = in.nextline();

		System.out.println("Employee Name: ");
		String empName = in.nextline();

		System.out.println("Employee Department: ");
		String empDepartment = in.nextline();

		System.out.println("Employee City: ");
        String empCity = in.nextline();

		System.out.println("Employee Salary: ");
		float empSalary = in.nextline();


	}
	void search(int m,n){
		for(i=0;i<n;i++){
			if(Employee[i].empCode == m)
				Employee[i].Display();
		}

	}

}
public class EmployeeTest(){
	int  ch, n, i;
	System.out.println("Enter the number of records that you want to enter: ");
	n = input.nextInt();

	Employee arr[] = new Employee[n];
	System.out.println("Enter choice: " + "\n" + "1.Insert details" "\n" + "2.Display details on the basis  of the employee code" + "\n" + "3.Display all records" + "\n");
	ch = input.nextInt();
	switch(ch){
		case 1 : 
		cnt++;
		System.out.println("Enter the employee number you want to enter details for: ");
		i = input.nextInt();
		Employee[i].Insert();

		  break;

		    case 2 : System.out.println("Enter the employee code: ");
		       m = input.nextInt();
		       Search(m,n);

		        break;

		        case 3 : for(i=0;i<n;i++){
		        	Employee[i].Display();
		        }	}

}