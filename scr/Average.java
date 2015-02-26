public class Average {
  double sum = 0.0;
  int count = 0;
    
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
    else {
    return sum/count;
  }
 }
  
  public int getCount() {

    return count;
  }
}

  
                    
  