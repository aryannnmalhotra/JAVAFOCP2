package com.ncu.validators;
import java.util.*;
import java.util.regex.*;
class NameValidator{
	public boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: " + filename + "and its type is: " + filetype+ "\n");
		return true;
	}
}
class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator);
	}
	boolean emptyFileName(String filename){
		if(filename.equals("")){
			return true;
		} else {
			return false;
		}
	}
	boolean missingDot(String filename){
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(filename);
		boolean value = costMatcher.find();
		if(value == true){
			return false;
		}
		else{
			return true;
		}
	}
} 