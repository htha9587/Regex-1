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
	private RegexView display;
	private RegexFrame baseFrame;
	
	public void start()
	{
		
	}
	
	public RegexView getDisplay() {
		return display;
	}

	public void setDisplay(RegexView display) {
		this.display = display;
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
