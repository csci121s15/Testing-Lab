public class Average {
  private double sum = 0.0;
  private int count = 0;
  private double avg = 0.0;
  
  public void addValue(double value) {
    sum += value;
    count += 1;
  }
  
  public double getAverage() {
    avg = sum / count;
    return avg;
  }
  
  public int getCount() {
    return count;
  }
  
}