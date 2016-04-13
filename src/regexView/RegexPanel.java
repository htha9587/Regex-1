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
	private JLabel titleLabel;
	private JLabel firstLabel;
	private JLabel secondLabel;
	private JLabel thirdLabel;
	private JLabel fourthLabel;
	private SpringLayout baseLayout;
	private JTextField firstField;
	private JTextField secondField;
	private JTextField thirdField;
	private JTextField fourthField;
	
	public RegexPanel(RegexController baseController2)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		enterButton = new JButton("Enter");
		firstField = new JTextField("Enter first name",20);
		secondField = new JTextField("Enter last name",20);
		thirdField = new JTextField("Enter phone #",20);
		fourthField = new JTextField("Enter email",20);
		titleLabel = new JLabel("Regex 1");
		titleLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 19));
		firstLabel = new JLabel("First Name");
		secondLabel = new JLabel("Last Name");
		thirdLabel = new JLabel("Phone #");
		fourthLabel = new JLabel("Email Address");
		
		
		setBackground(Color.cyan);
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
		this.add(titleLabel);
		this.add(firstLabel);
		this.add(secondField);
		this.add(thirdField);
		this.add(fourthField);
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
		baseLayout.putConstraint(SpringLayout.WEST, enterButton, 167, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enterButton, -31, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 133, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -209, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondField, 6, SpringLayout.SOUTH, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, secondField, 133, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, thirdField, 0, SpringLayout.EAST, firstField);
		baseLayout.putConstraint(SpringLayout.NORTH, thirdField, 6, SpringLayout.SOUTH, fourthField);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthField, 6, SpringLayout.SOUTH, secondField);
		baseLayout.putConstraint(SpringLayout.EAST, fourthField, 0, SpringLayout.EAST, firstField);
		baseLayout.putConstraint(SpringLayout.NORTH, secondLabel, 6, SpringLayout.NORTH, secondField);
		baseLayout.putConstraint(SpringLayout.EAST, secondLabel, -6, SpringLayout.WEST, secondField);
		baseLayout.putConstraint(SpringLayout.NORTH, thirdLabel, 6, SpringLayout.NORTH, thirdField);
		baseLayout.putConstraint(SpringLayout.EAST, thirdLabel, -6, SpringLayout.WEST, thirdField);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthLabel, 6, SpringLayout.NORTH, fourthField);
		baseLayout.putConstraint(SpringLayout.EAST, fourthLabel, -6, SpringLayout.WEST, fourthField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 6, SpringLayout.NORTH, firstField);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, -6, SpringLayout.WEST, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -21, SpringLayout.NORTH, firstField);
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
