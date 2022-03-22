import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public int squareSize = 800;
  public float quadrantBoundaries = squareSize/2;
  public void settings() {
	// put your size call here
    size(squareSize, squareSize);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    quadrantBackgrounds();
	  quadrantOne();
    quadrantTwo();
    quadrantThree();
    quadrantFour();
  }

  public void quadrantBackgrounds(){
    strokeWeight(0);
    // quadrant 1
    fill(119, 159, 224);
    rect(0, 0, quadrantBoundaries, quadrantBoundaries);
    // quadrant 2
    fill(242, 226, 124);
    rect(quadrantBoundaries, 0, quadrantBoundaries, quadrantBoundaries);
    
    // quadrant 3
    fill(0, 0, 0);
    rect(0, quadrantBoundaries, quadrantBoundaries, quadrantBoundaries);
    
    // quadrant 4
    fill(97, 219, 86);
    rect(quadrantBoundaries, quadrantBoundaries, quadrantBoundaries, quadrantBoundaries);
  }
  
  public void quadrantOne(){

    stroke(0, 0, 0);
    strokeWeight(2);
    fill(0, 0, 0);

    float gridLineCoords = 0;

    for(int i = 1; i <= 10; i++){
      gridLineCoords = i * quadrantBoundaries / 10;
      
      line(gridLineCoords, 0, gridLineCoords, quadrantBoundaries);
      line(0, gridLineCoords, quadrantBoundaries, gridLineCoords);
    }
  }

  public void quadrantTwo(){

    stroke(0, 0, 0);
    strokeWeight(1);
    fill(189, 19, 78);
    ellipseMode(CENTER);

    float circleRow = 0;
    float circleColumn = 0;
    float circleSize = quadrantBoundaries / 10;
    for(int i = 1; i <= 5; i++){

      for(int j = 1; j <= 5; j++){

        circleRow = i * quadrantBoundaries / 6 + quadrantBoundaries;
        circleColumn = j * quadrantBoundaries / 6;

        ellipse(circleRow, circleColumn, circleSize, circleSize);
      }

    }
  }

  public void quadrantThree(){
    
    strokeWeight(1);
    fill(0, 0, 0);

    float gradiantLineX = 0;

    for(int i = 0; i <= quadrantBoundaries; i++){
      gradiantLineX = i;
      stroke(i, i, i);
      line(gradiantLineX, quadrantBoundaries, gradiantLineX, squareSize);
    }
  }
  
  public void quadrantFour(){

    strokeWeight(0);

    for(int i = 1; i <= 8; i++){

      rotate(i);
      ellipse(quadrantBoundaries + quadrantBoundaries / 2, quadrantBoundaries + quadrantBoundaries / 2, 100, 10);
    }
    //center dot
    
  }
}