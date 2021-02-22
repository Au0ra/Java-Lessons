import java.util.*;
import processing.core.*;


public class Lesson04_Extends extends PApplet{
	public void setup() {
		size(600,600);
		background(0);
	}
	
	ArrayList<Blob> blobs = new ArrayList<>();
	
	public void draw() {
		background(0);
		if(frameCount % 30 == 0) {
			blobs.add(new Blob(random(0,width),random(0,height)));
		}
		for (Blob b : blobs) {
			b.move();
			b.display();
		}
	}
	
	public void mousePressed() {
		blobs.add(new Zoomer() );
	}
	
	class Blob{
		float x, y;
		
		Blob(float x,float y){
			this.x = x;
			this.y = y;
		}
		
		void move() {
			x += random(-20,20);
			y += random(-10,10);
		}
		
		void display() {
			ellipse(x,y,30,30);
		}
	}
	
	class Zoomer extends Blob{
		float vx, vy;
		Zoomer(){
			super(mouseX, mouseY);
			
			vx = random(-20,20);
			vy = random(-10,10);
		}
		void move() {
			x+=vx;
			y+=vy;
		}
	}
	
}
