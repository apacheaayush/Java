/*
 * File: DrawRobot.java
 * -----------------------
 * This program draws a simple robot diagram in the window. Its programming
 * style leaves much to be desired, mostly because the coordinate values are specified
 * explicitly and defined so that they automatically adjust according to specified
 * parameters of the image as a whole.
 */

import acm.graphics.*;
import acm.program.*;

public class DrawRobot extends GraphicsProgram 
{
	public void run()
	{
		add (new GOval(120, 20, 40, 40));
		add (new GRect(100, 60, 80, 110));
		add (new GRect(115, 170, 15, 70));
		add (new GRect(150, 170, 15, 70));
	}
}
