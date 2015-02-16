public class Average {
  private int count = 0;
  private double sum = 0;
  
  public void addValue(double value) {
    sum += value;
    count += 1;
  }
  
  public double getAverage() {
    if (count == 0)
      return 0.0;
    else
      return sum / (double) count;
  }
  
  public int getCount() {
    
    return count;
  }
}