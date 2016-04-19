package regexModel;

/**
 * Version 1.0
 * @author htha9587
 * 4-19-16
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
	private String emailPattern;
	private String phonePattern;
	private String namePattern;
	private Matcher matcher;
	private Pattern pattern;
	//Validate first name.
	public boolean emailValidation(String emailAddress)
	{
		
		 emailPattern = new String("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z0-9]{2,})$");
		pattern = Pattern.compile(emailPattern);
		matcher = pattern.matcher(emailAddress);
		if(matcher.matches())
		{
			return (true);
		}
		else
		{
			return (false);
		}
		
	}
	
	public boolean phoneNumberValidation(String phone)
	{
	//If pattern should be without (-) symbol replace the String by “\\d{10}”
	phonePattern = new String("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
	pattern = Pattern.compile(phonePattern);
	matcher = pattern.matcher(phone);
	if(matcher.matches())
	{
	return (true);
	}
	else
	{
	return (false);
	}

	}

	
	public boolean nameValidation(String name)
	{
	// This pattern Validates like “Gowtham Raam” First Letter to be in InitCaps
	namePattern = new String("^[a-zA-Z\\s]+");
	pattern = Pattern.compile(namePattern);
	matcher = pattern.matcher(name);
	if(matcher.matches())
	{
	return (true);
	}
	else
	{
	return (false);
	}

	}
	
	

	
	
}