package regexView;


import javax.swing.JFrame;
import regexController.RegexController;


/**
 * Version 1.0
 * @author htha9587
 * Creates JFrame for Regex GUI.
 * 4-19-16
 */


public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController; //Assign data member parameter.
		basePanel = new RegexPanel(baseController); // Makes instance with controller reference.
		setUpFrame();
	}
	
	private RegexController baseController() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Helper method to setup JFrame and its structures.
	 */
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel); //Required for GUI frame.
		this.setResizable(true); //Optional.
		this.setTitle("Regex 1"); //Sets title.
		this.setSize(400,400); //Sets size.
		this.setVisible(true); //Last line in method.
	}
	
	public RegexController getBaseController()
	{
		return baseController;
	}
	
	
}
