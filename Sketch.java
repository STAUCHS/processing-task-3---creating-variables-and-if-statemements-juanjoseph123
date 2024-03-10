import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    int hr = hour();
    int min = minute();

    fill(0);
    textSize(30);
    text(hr,200,300);
    text(min,200,225);
    
    
    
    
    //float ellipseX = random(0,200);
    //float ellipseY = random(0,200);
    float ellipseWidth = random(10,50);
    float ellipseHeight = random(10,50);
    //ellipse(ellipseX, ellipseY, ellipseHeight, ellipseWidth);
  
  float randomX = random(0, 400);
  float randomY = random(0, 400);
  if (randomX < 200 && randomY<200) {
    ellipse(randomX,randomY,ellipseWidth,ellipseHeight);
  }
  else if (randomX > 200 && randomY < 200) {
    ellipse(ellipseWidth, ellipseHeight, randomX, randomY);
  }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  //(public void draw() {
fill(225);
  rect(random(50, 200), random(50, 200), random(50, 200), random(50, 200));

fill(255, 0, 0);
triangle(random(100, 300), (random(100, 300)),(random(100, 300)), (random(100, 300)),(random(100, 300)), random(100, 300));

fill(153, 102, 0);
rect(random(40, 280), random(40, 280), random(40, 280), random(40, 280));

fill(51, 153, 255);
rect(random(30,250), random(30,250), random(30,250), random(30,250));





}}
