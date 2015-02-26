public class Range { 
  private double min;
  private double max;
  
  public Range(double start, double stop) {
    if (start < stop) {  
      min = start;
    } 
    else { 
      min = stop;
    }
      
    if (stop > start) { 
      max = stop; 
    } 
    else { 
      max = start;
    }
    } 
  
  public boolean contains (double value){ 
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
