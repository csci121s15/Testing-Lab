public class Range {
  private double start;
  private double stop;
  
  Range(double start, double stop) {
    if (start < stop) {   
      this.start = start;
      this.stop = stop;  
    }
    else {
      this.start = stop;
      this.stop = start;
    }
  }
  
  public boolean contains(double value) {
    if (value >= start && value < stop) {
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
    double newStart = 0.0; //start for intersection
    double newStop = 0.0; //stop for intersection
    
    if (other.contains(this.getMin())) {
      newStart = this.getMin();
    } else if (this.contains(other.getMin())) {
      newStart = other.getMin();
    }

    if (other.contains(this.getMax())) {
      newStop = this.getMax();
    } else if (this.contains(other.getMax())) {
      newStop = this.getMax();
    } 
    
    return new Range(newStart, newStop);
  }
  
}
    