import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.core.PApplet; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 






public class henloscreen extends PApplet
{
  
  public void settings()
  {
        size(640, 480);


  }
  
  public void setup() 
  {
                    
  }
  
  public void draw()
  {
     background(255, 0, 100);
     strokeWeight(4);
     fill(255, 0, 200);
    line(-100, 240, width, height / 2);
    line (width / 4, height / 4, width / 4, height / 2);
    noFill();
    fill(255, 0, 200);
    arc(width / 4 + 10, height / 4 + 20, 80, 80, height / 4, height / 2, CHORD);
    noFill();
    arc(width / 3, height / 2 - 50, 80, 80, 0, HALF_PI+HALF_PI, OPEN);
    line (width / 2 - 50, height / 4, width / 2 - 50, height / 2);
    noFill();
    arc(width / 2 - 30, height / 4 + 20, 80, 80, height / 4, height / 2, CHORD);
    line (width / 2 - 50, height / 2 - 50, width / 2 + 20, height / 2 + 20);
    noFill();
    arc(width / 2 + 70, height / 2 - 50, 80, 80, 0, QUARTER_PI / 0.2f, OPEN);
    stroke(100, 0, 255);
    line (width / 2 + 70, height / 2 - 50, width / 2 + 30, height / 2 - 30);
    
  }
}
