class Qualifications{
	String qualName;
	String university;
	String institute;
	float cgpa;
	public Qualifications (){
		qualName = "";
		university = "";
		institute = "";
		cgpa = 0.0f;
	}
		public Qualifications(String qualName, String university, String institute,  float cgpa)
		{
			this.qualName = qualName;
			this.university = university;
			this.institute = institute;
			this.cgpa = cgpa;
		}

	
}