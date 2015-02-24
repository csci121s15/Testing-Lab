public class Main{
  public static void main(String[] args){
    Average avgOverlap = new Average();
    Average avgLength = new Average();
    
    int numSimulations = 10000000;
    
    for(int i = 0; i < numSimulations; i++) {
      //Create two new ranges with random start and stop values
      Range rng1 = new Range(Math.random(), Math.random());
      Range rng2 = new Range(Math.random(), Math.random());
      
      //Create the intersection of the two ranges
      Range rngIntersection = rng1.intersection(rng2);
      
      //Check if the two ranges overlapped, add 1 if they did, otherwise add 0.
      if (rngIntersection.getWidth() != 0.0)
        avgOverlap.addValue(1.0);
      else 
        avgOverlap.addValue(0.0);
      
      //Add the width of the intersection width to the average.
      avgLength.addValue(rngIntersection.getWidth());
    }
    
    //Print the result
    System.out.println("After " + numSimulations + " simulations...");
    System.out.println("The probablity that the two random ranges will overlap is: " + avgOverlap.getAverage());
    System.out.println("The average length of overlap is: " + avgLength.getAverage());
      
      
    
  }
}
  