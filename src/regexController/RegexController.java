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
	
	public RegexController()
	{
		basePanel = new RegexPanel(this);
		baseFrame = new RegexFrame();
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
	
	/**
	 * End of class.
	 */
	
}
