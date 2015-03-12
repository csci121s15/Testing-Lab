public class Average {
  
  double sum = 0;
  int count = 0;
  
  public void addValue(double value) {
    sum += value;
    count += 1;
  }
    
  public double getAverage() {
    if(count == 0) {
      return 0;
    }
    else {
      return sum / count;
    }
  }
    
  public int getCount() {
    return count;
  }
}