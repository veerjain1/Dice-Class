import java.util.Random;
public class Dice {

  private int numberOfSides; //initialize variables
  private boolean shouldRoll;
  private int topSide;

  /** Constructor methods to set up number of sides and if wants to roll */
  public Dice() {
    numberOfSides = 0;
    shouldRoll = false;
    topSide = 1;
  }
  public Dice(int numberOfSides, boolean shouldRoll) {
    this.numberOfSides = numberOfSides;
    this.shouldRoll = shouldRoll;
  }

  /** Mutator method to roll dice if shouldRoll is true */
  public void diceRoller(){
    if(shouldRoll){
      //RNG
      Random rand = new Random();   //instance of random class
      int int_random = rand.nextInt(numberOfSides); 
      topSide = int_random;
    } else {
      topSide = 1;
    }
  }

  /** Accessor methods to return number of sides and top side */
  public int getNumberOfSides() {
    return numberOfSides;
  }
  public int getTopSide() {
    return topSide;
  }

}