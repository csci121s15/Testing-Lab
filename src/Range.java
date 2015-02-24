public class Range
{
  private double min;
  private double max;
  
  public Range(double start, double stop)
  {
    if (start > stop)
    {
      max = start;
      min = stop;
    }
    
    if (stop > start)
    {
      max = stop;
      min = start;
    }
    
    if (stop == start)
    {
    min = 0;
    max = 0;
    }
  }
  
  public boolean contains(double value)
  {
    boolean s = false;
    if (value >= min && value < max)
    {
      s = true;
    }
    
    if (value < min || value >= max)
    {
      s = false;
    }
    
    return s;
      
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
    double min2 = other.getMin();
    double max2 = other.getMax();
    
    double min3 = 0.0;
    double max3 = 0.0;
    
    if (min > min2)
    {
      min3 = min;
    }
    
    if (min2 > min)
    {
      min3 = min2;
    }
    
    if (min2 == min)
    {
      min3 = min;
    }
    
    if (max < max2)
    {
      max3 = max;
    }
    
    if (max2 < max)
    {
      max3 = max2;
    }
    
    if (max2 == max)
    {
      max3 = max;
    }
   
    if (max2 <= min)
    {
      min3 = 0;
      max3 = 0;
    }
    
    if (max <= min2)
    {
      min3 = 0;
      max3 = 0;
    }
    
    if (min == min2 && max == max2)
    {
      min3 = 0;
      max3 = 0;
    }
    
    Range result = new Range(min3, max3);
    return result;
  }
}