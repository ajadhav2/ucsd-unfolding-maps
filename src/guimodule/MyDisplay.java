package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet{
	
	PImage img;
	
	public void setup() {
//		size(400,400);
//		
//		background(200,200,200);
//		
//		fill(255,255,0);
//		ellipse(200,200,390,390);
//		
//		fill(0,0,0);
//		ellipse(120,130,50,70);
//		ellipse(280,130,50,70);
//		
//		noFill();
//		
//		arc(200,280,75,75,0,PI);
		
		size(400,400);
		
		background(255);
		
		stroke(0);
		
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		
		img.resize(0, height);
		
		image(img,0,0);
		
		
	}
	
	
	public void draw() {

		int[] color = sunColorSec(second());
		
		fill(color[0],color[1],color[2]);
		
		ellipse(width/4,height/5,width/4,height/5);
		
	
	}


	private int[] sunColorSec(float seconds) {
		// TODO Auto-generated method stub
		
		int[] rgb = new int[3];
		
		float diffTo30 = Math.abs(30-seconds);
		
		float ratio = diffTo30 / 30;
		
//		System.out.println(ratio);
		
		rgb[0] = (int) (255 * ratio);
		rgb[1] = (int) (255 * ratio);
		rgb[2] = 0;
		
		return rgb;
	}

}
