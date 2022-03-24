import processing.core.PApplet;

/**
*
* A processing task in that the goal is to have each quadrant of the square screen do something different using loops.
* @author: G. Lui
*
*/


public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  // Variables that determine size and scaling of the program
  public int squareSize = 800;
  public float quadrantBoundaries = squareSize / 2;

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

    // Draw backgrounds
    quadrantBackgrounds();

    // Draw four quadrants
	  quadrantOne();
    quadrantTwo();
    quadrantThree();
    quadrantFour();
  }

  // Background for each quadrant
  public void quadrantBackgrounds(){
    
    // define colour and stroke information for the method
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
  
  // 10 x 10 grid
  public void quadrantOne(){

    stroke(0, 0, 0);
    strokeWeight(2);
    fill(0, 0, 0);

    float gridLineCoords = 0;

    for(int i = 1; i <= 10; i++){
      gridLineCoords = i * quadrantBoundaries / 10;
      
      // vertical grid
      line(gridLineCoords, 0, gridLineCoords, quadrantBoundaries);

      // horizontal grid
      line(0, gridLineCoords, quadrantBoundaries, gridLineCoords);
    }
  }

  // circle 5 x 5 grid
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

  // gradient
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
  
  // flower
  public void quadrantFour(){

    fill(250, 64, 7);
    stroke(0);
    strokeWeight(1);
    translate(quadrantBoundaries + quadrantBoundaries / 2, quadrantBoundaries + quadrantBoundaries / 2);

    // Pedals
    for(int i = 1; i <= 8; i++){

      rotate(TWO_PI / 8);
      ellipse(0, 0, quadrantBoundaries / 2 , quadrantBoundaries / 10);
    }

    // Center dot
    fill(0, 255, 42);
    ellipse(0, 0, quadrantBoundaries / 5, quadrantBoundaries / 5);
  }
}