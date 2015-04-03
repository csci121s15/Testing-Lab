public class Average {
  private int count = 0;
  private double sum  = 0;
  public Average() {
    
  }
  
  public void addValue(double value) {
    sum += value;
    count ++;
  }
  
  public double getAverage() {
    if (count == 0) {
      return 0;
    }
    else {
      return (double)sum/count;
    }
  }
  
  public int getCount() {
    return count;
  }
}

  