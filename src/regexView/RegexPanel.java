package regexView;

import regexController.RegexController;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 * Version 0.4
 * 4-13-16
 * @author htha9587
 *
 */


public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private JButton enterButton;
	private JLabel firstLabel;
	private JLabel secondLabel;
	private JLabel thirdLabel;
	private JLabel fourthLabel;
	private SpringLayout baseLayout;
	private JTextField firstField;
	private JTextField secondField;
	private JTextField thirdField;
	private JTextField fourthField;
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		enterButton = new JButton("Enter");
		firstField = new JTextField("Enter first name",20);
		secondField = new JTextField("Enter last name",20);
		thirdField = new JTextField("Enter phone #",20);
		fourthField = new JTextField("Enter email",20);
		firstLabel = new JLabel("First Name");
		firstLabel = new JLabel("Last Name");
		firstLabel = new JLabel("Phone #");
		firstLabel = new JLabel("Email Address");
		
		
		setUpPanel();
		setUpLayout();
		setUpListeners();
		

	}
	
}
