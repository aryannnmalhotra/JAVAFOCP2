import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
class StudentValidation{
	public static void validateJavaDate(){
		
			if(dob.trim().equals(""))
				throw new DateFormatException(d1);
			else{
				SimpleDateFormat sdfrmt = new SimmpleDateFormat("dd/mm/yyyy");
				sdfrmt.setLenient(false);
			}
				try{
					Date javaDate = sdfrmt.parse(dob);
					
				} catch(ParseException e){
					
					throw new DateFormatException(d1);
					
				} 
			}
			public static void validateFields(){
				try{
					if(firstName.trim().equals("") || addr.trim().equals("") || eMail.trim().equals("") || contactNo.trim().equals("") )
						 throw new MissingMandatoryException(m);
						if(skills.length<1 || nqual.length<1)
							throw new MissingMandatoryException(f);
				}

			}


		}

	