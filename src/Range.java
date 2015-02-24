public class Range{
  private double start;
  private double stop;
  private double start1;
  private double stop1;  

  Range(double start, double stop){
    if (start == stop) {
      this.start = 0.0;
      this.stop = 0.0;
    }
    else {
      this.start = Math.min(start, stop);
      this.stop = Math.max(start, stop);
    }
  }
  
  boolean contains(double value){
    if (value >= start && value <= stop)
      return true;
    else
      return false;        
  }
  
  double getWidth(){
    return Math.abs(start - stop);
  }
  
  double getMin(){
    return start;
  }
  
  double getMax(){
    return stop;
  }
  
  Range intersection(Range other){
    
    if (start == other.getMin() && stop == other.getMax()) {
      return new Range(start, stop);}
    else if (stop < other.getMin()) {
      return new Range(0.0,0.0);}
    else if (other.getMax() < start) {
      return new Range(0.0,0.0);}
    else{
      this.start1 = Math.max(start, other.getMin());
      this.stop1 = Math.min(stop, other.getMax());
      return new Range(start1, stop1);
    }
  }
  
}