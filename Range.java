public class Range{
    private double begin = 0.0;
    private double end = 0.0;
    private double begin2 = 0.0;
    private double end2;
    private double width = 0.0;
    private double result = 0.0;
    
  public Range(double start, double stop){
    begin = start;
    end = stop;
  }
  public boolean contains(double value){
    if(value >= begin && value < end){
      return true;
    }
    else{
      return false;
    }
  }
  public double getWidth(){
    return Math.abs(begin - end);
  }
  public double getMin(){
    return begin;
  }
  public double getMax(){
    return end;
  }
  public Range intersection(Range other){
    begin2 = other.getMin();
    end2 = other.getMax();
    
    if(begin == begin2 && end == end2){
      Range g = new Range(begin2, end2);
      return g;
    }
    else if(begin2 > begin && end2 < end){
      Range g = new Range(begin2, end2);
      return g;
    }
    else if(begin2 < begin && end2 > end){
      Range g = new Range(begin, end);
      return g;
    }
    else if(begin2 == begin && end2 > end){
      return new Range(begin2, end);
    }
    else if(begin2 == begin && end2 < end){
      Range g = new Range(begin2, end2);
      return g;
    }
    else if(begin2 < begin && end2 == end){
      Range g = new Range(begin, end2);
      return g;
    }
    else if(begin2 > begin && end2 == end){
      Range g = new Range(begin2, end2);
      return g;
    }
    // Wrong if
    else if(begin2 > begin && end < end2){
      if(begin < end2 && begin2 < end && end2 - begin2 > begin)
      {
        Range g = new Range(begin2, end);
        return g;
      }
      else if(begin < end2 && end < end2){
      Range g = new Range(0.0,0.0);
      return g;
      }
      else{
        Range g = new Range(0.0, 0.0);
        return g;
      }
    }
    else if(begin2 < begin && end > end2){
      Range g = new Range(begin, end2);
      return g;
    }
    //  
    else if(begin2 > end || begin2 < begin){
      Range g = new Range(0.0,0.0);
      return g;
      }
    else{
      Range g = new Range(0.0,0.0);
      return g;
      }
      
    }
  }
