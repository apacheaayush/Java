// This program is my first program in Java.
// It displays "Hello, world" on the screen.

import acm.graphics.*;
import acm.program.*;

public class HelloWorld extends GraphicsProgram
{
	public void run()
	{
		add(new GLabel( "hello, world", 100, 75 ));
	}

}
