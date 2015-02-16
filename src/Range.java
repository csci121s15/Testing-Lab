public class Range {
  private double min = 0;
  private double max = 0;
  
  public Range(double start, double stop) {
    if(start < stop) {
       min = start;
       max = stop;
    }
    else {
       max = start;
       min = stop;
    }
  }
  public boolean contains(double value) {
    if(value >= min && value <= max) {
      return true;
    }
    else {
      return false;
    }
  }
  public double getWidth() {
    if(min == max) {
      return 0.0;
    }
    else {
    double width = max - min;
    return width;
    }
  }
  public double getMin() {
    return min;
  }
  public double getMax() {
    return max;
  }
}