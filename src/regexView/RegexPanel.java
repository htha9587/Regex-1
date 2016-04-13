package regexView;

import regexController.RegexController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JLabel firstLabel_1;
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
		baseLayout.putConstraint(SpringLayout.WEST, enterButton, 167, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enterButton, -31, SpringLayout.SOUTH, this);
		firstField = new JTextField("Enter first name",20);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 133, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -209, SpringLayout.SOUTH, this);
		secondField = new JTextField("Enter last name",20);
		baseLayout.putConstraint(SpringLayout.NORTH, secondField, 6, SpringLayout.SOUTH, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, secondField, 133, SpringLayout.WEST, this);
		thirdField = new JTextField("Enter phone #",20);
		baseLayout.putConstraint(SpringLayout.EAST, thirdField, 0, SpringLayout.EAST, firstField);
		fourthField = new JTextField("Enter email",20);
		baseLayout.putConstraint(SpringLayout.NORTH, thirdField, 6, SpringLayout.SOUTH, fourthField);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthField, 6, SpringLayout.SOUTH, secondField);
		baseLayout.putConstraint(SpringLayout.EAST, fourthField, 0, SpringLayout.EAST, firstField);
		firstLabel = new JLabel("First Name");
		firstLabel = new JLabel("Last Name");
		firstLabel = new JLabel("Phone #");
		firstLabel_1 = new JLabel("Email Address");
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel_1, 6, SpringLayout.NORTH, fourthField);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel_1, -6, SpringLayout.WEST, fourthField);
		
		
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	/**
	 * Sets up Regex Panel.
	 * 
	 */
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(enterButton);
		this.add(firstField);
		this.add(secondField);
		this.add(thirdField);
		this.add(fourthField);
		this.add(firstLabel_1);
		this.add(secondLabel);
		this.add(thirdLabel);
		this.add(fourthLabel);
		firstField.setToolTipText("Type in!");
		secondField.setToolTipText("Type in!");
		thirdField.setToolTipText("Type in!");
		fourthField.setToolTipText("Type in!");
		
	}
	
	/**
	 * Sets up Layout.
	 */
	
	private void setUpLayout()
	{
		
	}
	
	/**
	 * Sets up action listeners.
	 */
	
	private void setUpListeners()
	{
		enterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstField.setText("");
				secondField.setText("");
				thirdField.setText("");
				fourthField.setText("");
			
			}
		});
	}
	
	
}
