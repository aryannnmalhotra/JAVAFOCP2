class project{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities;

	project(){
		name = "";
		startDate = null;
		endDate = null;
		role = "";
		responsibilities = "";

	}
		project(String name, Date startDate, Date endDate, String role, String [] responsibilities){
			this.name = name;
			this.startDate = startDate;
			this.role = role;
			this.responsibilities = responsibilities;
		}
}