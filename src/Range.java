public class Range {
  private double start;
  private double stop;
 
  public Range(double min, double max) {
    start = min;
    stop = max;
  }
  
  
  public boolean contains(double value) {
    System.out.println(start);
    System.out.println(stop);
    System.out.println(value);
      
    if (value >= start && value < stop) {
      return true;
    }
    else{
      return false;
    }
  }
  
  public double getWidth() {
    return Math.abs(start - stop);
  }
  
  public double getMin() {
    return start;
  }
  
  public double getMax() {
    return stop;
  }
}


  
  
  