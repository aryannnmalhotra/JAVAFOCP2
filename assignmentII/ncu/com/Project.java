class project{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities;

	public project(){
		name = "";
		startDate = null;
		endDate = null;
		role = "";
		responsibilities = "";

	}
		public project(String name, Date startDate, Date endDate, String role, String [] responsibilities){
			this.name = name;
			this.startDate = startDate;
			this.role = role;
			this.responsibilities = responsibilities;
		}
}