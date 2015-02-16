public class Range{
  private double stop;
  private double start;
  private double a;
  private double b;
  private double newMax;
  private double newMin;
  
  public Range(double a, double b){
    if (a == b) {
      start = 0.0;
      stop = 0.0;
    } else {
       start = Math.min(a, b);
       stop = Math.max(a, b);
    }
  }
  
  public boolean contains(double value){
    if (value >= start && value < stop)
      return true;
    else
      return false;
  }
  
  public double getWidth(){
    return Math.abs(start - stop);
  }
  
  public double getMin(){
    return start;
  }
  
  public double getMax(){
    return stop;
  }
  
  public Range intersection(Range other){
    //Are they equal?
    if (start == other.getMin() && stop == other.getMax())
      return new Range(start, stop);
    
    //Make sure they actually overlap
    if (other.getMin() > stop || start > other.getMax())
      return new Range(0.0, 0.0);
    
    //Determine Max, if any
    if (other.getMax() > stop)
      newMax = stop;
    else if ( stop > other.getMax())
      newMax = other.getMax(); 
    else  
      newMax = stop;
    
    //Determine Min, if any
    if ( other.getMin()  > start)
      newMin = other.getMin();
    else if (other.getMin() < start)
      newMin = start;
    else
      newMin = start;
    
    return new Range(newMin, newMax);
  }
}