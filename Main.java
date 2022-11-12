class Main {
  public static void main(String[] args) {
    Dice cubeDice = new Dice(6, true);
    cubeDice.diceRoller();
    System.out.println("Number of sides: " + cubeDice.getNumberOfSides());
    System.out.println("Top side: " + cubeDice.getTopSide());
  }
}