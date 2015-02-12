public class Average {
  private double sum = 0.0;
  private int count = 0;
  
  public void addValue(double value) {
    sum += value;
    count += 1;
  }
  
  public double getAverage() {
    if (sum == 0 && count == 0) {
      return 0.0;
    }
    else {
      return sum/count;
    }
  }
  
  public int getCount() {
    return count;
  }
}