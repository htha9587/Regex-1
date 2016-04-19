package regexController;

/***
 * Version 0.4
 * @author htha9587
 * 4-13-16
 */

import regexController.RegexRunner;
import regexModel.RegexModel;
import regexView.RegexView;
import regexView.RegexFrame;
import regexView.RegexPanel;

import javax.swing.*;

import java.io.*;

public class RegexController 
{
	private RegexPanel basePanel;
	private RegexFrame baseFrame;
	private RegexModel baseModel;
	
	public RegexController()
	{
		basePanel = new RegexPanel(this);
		baseFrame = new RegexFrame();
		baseModel = new RegexModel();
	}
	
	
	public void start()
	{
		
	}
	
	public RegexPanel getDisplay() {
		return basePanel;
	}

	public void setDisplay(RegexPanel display) {
		this.basePanel = display;
	}

	public RegexFrame getBaseFrame() {
		return baseFrame;
	}

	public void setBaseFrame(RegexFrame baseFrame) {
		this.baseFrame = baseFrame;
	}
	
	
	public String validateFirstName(String text)
	{
		String validated = new String("");
		
		if(baseModel.nameValidation(text))
		{
			validated = " First Name Correct!";
		}
		
		else
		{
			validated = "First Name False!";
		}
		
		
		return validated;
	}
	
	public String validateLastName(String text)
	{
		String validated = new String("");
		
		if(baseModel.nameValidation(text))
		{
			validated = "Last Name Correct!";
		}
		
		else
		{
			validated = "Last Name False!";
		}
		
		return validated;
	}
	
	public String validateEmail(String emailAddress)
	{
		String validated = new String("");
		
	
		if(baseModel.emailValidation(emailAddress))
		{
			validated = "Email Address Correct!";
		}
		else
		{
			validated = "Email Address False!";
		}
		
		return validated;
	}
	
	public String validatePhoneNumber(String phone)
	{
		String validated = new String("");
		
		if(baseModel.phoneNumberValidation(phone))
		{
			validated = "Phone Number Correct!";
		}
		else
		{
			validated = "Phone Number False!";
		}
		return validated;
	}
	/**
	 * End of class.
	 */
	
}
