public class Average {
  private int count;
  private double sum;

  public void addValue(double value) {
    sum += value;
    count++;
  }
  
  public double getAverage() {
    if (count == 0 ) {
      return 0.0;
    } else {
        return sum/count;
      }
  }
  
  public int getCount() {   
    return count;
  }
}