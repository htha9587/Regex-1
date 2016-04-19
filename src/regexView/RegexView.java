package regexView;

import javax.swing.*;

/**
 * Popup class for when user clicks the enter button.
 * @author htha9587
 *Version 1.0
 *4-19-16
 */

public class RegexView 
{

	/**
	 * Displays popup for GUI.\
	 * @param input
	 * @return user answer.
	 */
	
	private String windowMessage;
	public RegexView()
	{
		windowMessage = "Results";
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input, windowMessage, JOptionPane.PLAIN_MESSAGE);
	}
	
}
