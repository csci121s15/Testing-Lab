public class Range{
  private double stop;
  private double start;
  
  public Range(double start, double stop){
    
  }
  
  public boolean contains(double value){
    return true;
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
    return new Range(0.0, 0.0);
  }
}