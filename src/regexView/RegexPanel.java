package regexView;

import regexController.RegexController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;
import java.util.*;

/**
 * Version 0.7
 * 4-13-16
 * @author htha9587
 *
 */


public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private RegexPanel display;
	private JButton enterButton;
	private JButton exitButton;
	private JLabel titleLabel;
	private JLabel firstLabel;
	private JLabel secondLabel;
	private JLabel thirdLabel;
	private JLabel fourthLabel;
	private SpringLayout baseLayout;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField emailField;
	private JTextField phoneField;
	
	public RegexPanel(RegexController baseController2)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		enterButton = new JButton("Enter");
		exitButton = new JButton("Exit");
		
		firstNameField = new JTextField("Enter first name",20);
		lastNameField = new JTextField("Enter last name",20);
		emailField = new JTextField("Enter phone #",20);
		phoneField = new JTextField("Enter email",20);
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
		this.add(exitButton);
		this.add(firstNameField);
		this.add(titleLabel);
		this.add(firstLabel);
		this.add(lastNameField);
		this.add(emailField);
		this.add(phoneField);
		this.add(secondLabel);
		this.add(thirdLabel);
		this.add(fourthLabel);
		firstNameField.setToolTipText("Type in!");
		lastNameField.setToolTipText("Type in!");
		emailField.setToolTipText("Type in!");
		phoneField.setToolTipText("Type in!");
		
	}
	
	/**
	 * Sets up Layout.
	 */
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, enterButton, 167, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enterButton, -31, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 133, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstNameField, -209, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, 6, SpringLayout.SOUTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 133, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, emailField, 0, SpringLayout.EAST, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 6, SpringLayout.SOUTH, phoneField);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneField, 6, SpringLayout.SOUTH, lastNameField);
		baseLayout.putConstraint(SpringLayout.EAST, phoneField, 0, SpringLayout.EAST, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, secondLabel, 6, SpringLayout.NORTH, lastNameField);
		baseLayout.putConstraint(SpringLayout.EAST, secondLabel, -6, SpringLayout.WEST, lastNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, thirdLabel, 6, SpringLayout.NORTH, emailField);
		baseLayout.putConstraint(SpringLayout.EAST, thirdLabel, -6, SpringLayout.WEST, emailField);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthLabel, 6, SpringLayout.NORTH, phoneField);
		baseLayout.putConstraint(SpringLayout.EAST, fourthLabel, -6, SpringLayout.WEST, phoneField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 6, SpringLayout.NORTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, -6, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -21, SpringLayout.NORTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, exitButton, 0, SpringLayout.NORTH, enterButton);
		baseLayout.putConstraint(SpringLayout.WEST, exitButton, 6, SpringLayout.EAST, enterButton);
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
				String firstName = firstNameField.getText();
				String lastName =  lastNameField.getText();
				String email = emailField.getText();
				String phone = phoneField.getText();
                Object answer1 = JOptionPane.showInputDialog(null, firstNameField.getText(), JOptionPane.INFORMATION_MESSAGE);
                Object answer2 = JOptionPane.showInputDialog(null, lastNameField.getText(), JOptionPane.INFORMATION_MESSAGE);
                Object answer3 = JOptionPane.showInputDialog(null, emailField.getText(), JOptionPane.INFORMATION_MESSAGE);
                Object answer4 = JOptionPane.showInputDialog(null,  phoneField.getText(), JOptionPane.INFORMATION_MESSAGE);
                String text = null;
                String emailAddress = null;
                String phoneNumber = null;
				JOptionPane.showMessageDialog(null, firstNameField.getText(), text, JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, lastNameField.getText(), text, JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, emailField.getText(), emailAddress, JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, phoneField.getText(), phoneNumber, JOptionPane.PLAIN_MESSAGE);
				//baseController
				firstNameField.setText("");
				lastNameField.setText("");
				emailField.setText("");
				phoneField.setText("");
			
			}
		});
		
		exitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.exit(0);
			}
		});
	}
	
	
}
