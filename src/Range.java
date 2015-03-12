public class Range {
  private double min = 0;
  private double max = 0;
  
  public Range(double start, double stop) {
    if (start < stop) {
      min = start;
      max = stop;
  }
    else if (start > stop) {
      min = stop;
      max = start;
    }
    else {
      min = 0;
      max = 0;
    }
  }
  
  public boolean contains(double value) {
    return value >= min && value < max;
  }
    
  public double getWidth() {
    if (min < max) {
      return max - min;
    }
    else if (min > max) {
      return min - max;
    }
    else {
      return 0;
    }
  }
    
  public double getMin() {
    if(min < max) {
      return min;
    }
    else {
      return max;
    }
  }
    
  public double getMax() {
    if(min > max) {
      return min;
    }
    else {
      return max;
    }
  }
  
  public Range intersection(Range other) {
    double newMin = 0;
    double newMax = 0;
    
    if (min > other.getMin()) {
      newMin = min;
    }
    else {
      newMin = other.getMin();
    }
    
    if (max < other.getMax()) {
      newMax = max;
    }
    else {
      newMax = other.getMax();
    }
    
    return new Range(newMin, newMax);
  }
}