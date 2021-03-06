import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Parabol extends PApplet {



public void setup()
{
	
}

public void draw()
{
	int leftLines = 48;
	int leftWeight = 2;



    for ( int i = 0; i < 48; ++i)
    {
    	int y1 = 10 + 10 * i;
    	int x2 = 10 + 10 * i;

    	int yy1 = 480 - 10 * i;
    	int xx1 = 640 - 10 * i;

    	animatedLinesDownLeft(0, y1, x2, 480, i, leftWeight);
    	animatedLinesTopRight(640, yy1, xx1, 0, i, leftWeight);
    }
 	


// Tie fighter pls ignore
	fill(125);
	ellipse(width / 2, height / 2, 60, 60);
	line(width / 2, height / 2, width / 2 + 50, height / 2);
	line(width / 2, height / 2, width / 2 - 50, height / 2);
	line(width / 2 + 50, height / 2 - 30, width / 2 + 50, height / 2 + 30);
	line(width / 2 - 50, height / 2 - 30, width / 2 - 50, height / 2 + 30);
}

public void animatedLinesDownLeft(int x1, int y1, int x2, int y2, int lines, int weight)
{
       	if(lines % 3 == 0)
       	stroke(0);
       else //if (i % 2 == 1)
       	stroke(125);

       strokeWeight(weight);

		line(x1, y1, x2, y2);
}

public void animatedLinesTopRight(int x1, int y1, int x2, int y2, int lines2, int weight)
{

	if(lines2 % 3 == 0)
    stroke(0);
    else //if (i % 2 == 1)
    stroke(125);
	       	//int yPosA1 = 480 - 10 * i;
       //	int xPosA1 = 640 - 10 * i;
			//animatedLinesTopRight(640, yPosA1, xPosA1, 0, i);
	line(x1, y1, x2, y2);
}
  public void settings() { 	size (640, 480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Parabol" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
