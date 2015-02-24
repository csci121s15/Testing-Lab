public class Average
{
  private double sum;
  private int count;
  
  public Average()
  {
    sum = 0.0;
    count = 0;
  }
  
  public void addValue(double value)
  {
    sum += value;
    count += 1;
  }
  
  public double getAverage()
  {
    double s = 0;
    
    if (sum == 0)
    {
      s = 0;
    }
    
    if (sum != 0)
    {
      s = sum/count;
    }
    
    return s;
  }
  
  public int getCount()
  {
    return count;
  }
}