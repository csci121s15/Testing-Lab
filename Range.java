public class Range
{
  private double min = 0.0;
  private double max = 0.0;

  public Range(double start, double stop)
  { 
    if(start > stop)
      min = stop;
    else
      min = start;
    
    if(start > stop)
      max = start;
    else
      max = stop;
  }
  
  public boolean contains(double value)
  {
    if(value >= min && value <= max)
      return true;
    else
      return false;
  }
  
  public double getWidth()
  {
    return max - min;
  }
  
  public double getMin()
  {
    return min;
  }
  
  public double getMax()
  {
    return max;
  }
  
  public Range intersection(Range other)
  {
    double newMin = 0;
    double newMax = 0;
   
    double minB = min;
    double maxB = max;
    
    boolean stopMin = false;
    boolean stopMax = false;
    
    while (stopMin == false)
    {
      if(other.contains(minB) == true)
      {
        newMin = minB;
        stopMin = true;
      }
      else
        minB++;
    }

    while (stopMax == false)
    {
      if(other.contains(maxB))
      {
        newMax = maxB;
        stopMax = true;
      }
      else
        maxB--;
    }

    Range newRange = new Range(newMin,newMax);
    
    return newRange;
  }
  
}