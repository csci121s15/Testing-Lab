public class averageRangeIntersection
{
  public static void main(String[] args)
  {
    Average probOverlap = new Average();
    Average avgOverlapLength = new Average();
    
    int i = 0;
    
    while (i < 1000000000)
    { 
      Range a = new Range(Math.random(), Math.random());
      Range b = new Range(Math.random(), Math.random());
    
      Range c = a.intersection(b);
      if (c.getWidth() == 0.0)
      {
        probOverlap.addValue(0);
      }
    
      if (c.getWidth() != 0.0)
      {
        probOverlap.addValue(1);
        avgOverlapLength.addValue(c.getWidth());
      }
      
      i += 1;
    }
    
    System.out.println("The probability of an overlap: " + probOverlap.getAverage());
    System.out.println("The average length of all overlaps: " + avgOverlapLength.getAverage());
    
  }
}