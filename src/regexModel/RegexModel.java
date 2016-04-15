package regexModel;

/**
 * Version 0.8
 * @author htha9587
 * 4-15-16
 */

import regexController.RegexController;
import regexView.RegexFrame;
import regexView.RegexPanel;
import javax.swing.*;
import java.util.regex.*;

public class RegexModel 
{

	private String name;
	private String phone;
	private String emailAddress;
	static Pattern pattern = null;
	static Matcher matcher = null;
	//Validate first name.
	public static String emailValidation(String emailAddress)
	{
		
		Object gmail;
		
		if(matcher.matches())
		{
			return ("Pattern is Matched"+emailAddress);
		}
		else
		{
			return ("Pattern is not Matched"+emailAddress);
		}
		
	}
	
	public static String phoneNumberValidation(String phone)
	{
	int[] patternvalidation=(”\\d{3}-\\d{7}”);
	//If pattern should be without (-) symbol replace the String by “\\d{10}”
	pattern = Pattern.compile();

	matcher = pattern.matcher(phone);
	if(matcher.matches())
	{
	return (“Pattern is Matched”+phone);
	}
	else
	{
	return (“Pattern is Not Matched”+phone);
	}

	}

	
	public static String nameValidation(String name)
	{
	String patternvalidation=”[A-Z][a-z]+( [A-Z][a-z]+)”;// This pattern Validates like “Gowtham Raam” First Letter to be in InitCaps
	pattern = Pattern.compile(patternvalidation);
	matcher = pattern.matcher(name);
	if(matcher.matches())
	{
	return (“Pattern is Matched”+name);
	}
	else
	{
	return (“Pattern is Not Matched”+name);
	}

	}
	
	

	
	
}