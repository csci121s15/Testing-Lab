public class Average {
  private double sum = 0.0;
  private int count = 0;
  
  public Average() {
   
  }
  
  public void addValue(double value) {
    count += 1;
    sum += value;
 
    
  }
  
  public double getAverage() {
    if (count == 0) {
      return 0;
    }
   
    
    return sum/count;
  }
  
  public int getCount() {
    
    return count;
  }
}
  
