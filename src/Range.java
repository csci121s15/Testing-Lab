public class Range{
  private double stop;
  private double start;
  
  public Range(double start, double stop){
    if (start == stop) {
      start = 0.0;
      stop = 0.0;
    } else {
      stop = Math.max(start, stop);
      start = Math.min(start, stop);
    }
  }
  
  public boolean contains(double value){
    if (value > start && value < stop)
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
    if (stop < other.getMin)
      return new Range(other.getMin, stop);
    else if (other.getMax > start)
      return new Range(start, other.getMax);
    else if (start == other.getMin && stop == other.getMax)
      return new Range(start, stop);
    else
      return new Range(0.0, 0.0);
  }
}