public class Range{
  double min = 0;
  double max = 0;
  double width = 0;
  
  public Range (double start, double stop){
    if (start == stop){
      start = 0;
      start = 0;
  }
    else{
      if (stop < start){
        min = stop;
        max = start;
        }
      if (start < stop){
        min = start;
        max = stop;
      }
    }
  }
  
  public boolean contains(double value){
    return true;
    
  }
  
  public double getWidth(){
    return 0.0;
    
  }
  
  public double getMin(){
    return min;
  }
  
  public double getMax(){
    return max;
  }
  
  public Range intersection(Range other){
    return new Range(0.0, 0.0);
  }
}
  