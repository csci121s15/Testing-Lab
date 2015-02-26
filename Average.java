public class Average
{
  private double sum = 0;
  private int count = 0;
  
  public void addValue(double value)
  {
    sum += value;
    count ++;
  }
    
  public double getAverage()
  {
    return sum/count;
  }
  
  public int getCount()
  {
    return count;
  }
}