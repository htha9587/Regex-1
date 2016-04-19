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
	public boolean emailValidation(String emailAddress)
	{
		
		Object gmail;
		
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

	
	public boolean  nameValidation(String name)
	{
	// This pattern Validates like “Gowtham Raam” First Letter to be in InitCaps

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