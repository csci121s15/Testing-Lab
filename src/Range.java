public class Range {
  private double start;
  private double stop;
  private double start2;
  private double stop2;
 
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
  
  public Range intersection(Range other) {
    start2 = other.getMin();
    stop2 = other.getMax();
    
    if (start == start2 && stop == stop2) {
      Range s = new Range(start, stop);
      return s;
    }
    
    else if (start == start2 && stop > stop2) {
      Range s = new Range(start, stop2);
      return s;
    }
    
    else if (start == start2 && stop < stop2) {
      Range s = new Range(start, stop);
      return s;
    }
    
    else if (stop == stop2 && start < start2) {
      Range s = new Range(start2, stop);
      return s;
    }
    
    else if (stop == stop2 && start > start2) {
      Range s = new Range(start, stop); 
      return s;
    }
    
    else if (start < start2 && stop < stop2) {
      Range s = new Range(start2, stop);
      return s;
    }
    
    else if (start > start2 && stop > stop2) {
      Range s = new Range(start, stop2);
      return s;
    }
    
    else if (start > start2 && stop < stop2) {
      Range s = new Range(start, stop);
      return s;
    }
    
    else if (start < start2 && stop > stop2) {
      Range s = new Range(start2, stop2);
      return s;
    }  
    
    else if (stop < start2 || stop2 < start) {
      Range s = new Range(0,0);
      return s;
    }
    
    else {
      Range s = new Range(0,0);
      return s;
    }
  }
}


  
  
  