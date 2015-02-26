public class Range {
  private double min = 0;
  private double max = 0;
  
  public Range (double start, double stop) {
    if (start > stop) {
      min = stop;
      max = start;
    }
    else {
      min = start;
      max = stop;
    }
  }
  
  public boolean contains (double value) {
    if (value > max || value < min) {
      return false;
    }
    else {
    return true;
    }
  }
  
  public double getWidth() {
    return getMax() - getMin();
  }
  
  public double getMin() {
    
    return min;
  }
  
  public double getMax() {
    
    return max;
  }
  
  public Range intersection(Range other) {
    double newMin = 0.0;
    double newMax = 0.0;
    
    if (other.contains(min)) {
      newMin = min;
      newMax = other.getMax();
    }
    else if (other.contains(max)) {
      newMin = other.getMin();
      newMax = max;
    }
    return new Range(newMin, newMax);
  }
}