public class Range {
  private double start;
  private double stop;
  
  public Range(double start, double stop) {
    if (start <= stop) {
      this.start = start;
      this.stop = stop;
    }
    else {
      this.start = stop;
      this.stop = start;
    }
    
  
    
  }
  
  public boolean contains(double value) {
    if ((value >= start) && (value < stop)) {
      return true;
    }
    return false;
      
    
  }
  
  public double getWidth() {
    return stop-start;
   
  }
  
  public double getMin() {
    return start;
    
  }
  
  public double getMax() {
    return stop;
  }
  
  public Range intersection(Range other) {
    double newMin = 0;
    double newMax = 0;
    if (other.contains(start)) {
      newMin = start;
    }
    
    if (other.contains(stop)) {
      newMax = stop;
    }
    
    if (contains(other.getMin())) {
      newMin = other.getMin();
    }
        
    if (contains(other.getMax())) {
      newMax = other.getMax();
    }
    
    
  return new Range(newMin, newMax);
  }
}
