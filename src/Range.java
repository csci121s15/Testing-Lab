public class Range {
  double start;
  double stop;
  public Range(double begin, double end) {
   start = Math.min(begin, end);
   stop = Math.max(begin, end);
  }
  
  public boolean contains(double value) {
    if (value >= start && value <= stop){
      return true; 
    }
    else {
      return false;
    }
 }
  
  public double getWidth() {
    return Math.abs(start-stop);
    
  }
  
  public double getMin() {
    return start;
    
  }
  
  public double getMax() {
    return stop;
  }
  
  public Range intersection(Range other) {
    
    double other1 = other.getMin();
    double other2 = other.getMax();
    
    if (other1 > start && other2 < stop) {
      return other;
    }
    else if (other1 == start && other2 == stop) {
      return other;
    }
    else if (other1 == start && other2 > stop) {
      Range ans = new Range(other1, stop);
      return ans;
    }
    else if (other1 > start && other2 == stop) {
      Range ans = new Range(other1, stop);
      return ans;
    }
    
    else if (other1 > start && other2 > stop) {
      Range ans = new Range(other1, stop);
      return ans;
    }
    else {
      return other;
    }
    
  }
}
