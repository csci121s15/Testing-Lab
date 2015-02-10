public class Average{
  private double sum;
  private int count;
  
  public Average() {
    sum = 0.0;
    count = 0;
    
  }
  
  public void addValue(double value){
    sum += value;
    count ++;
  }
  
  public double getAverage(){
    if (count == 0)
      return 0;
    else 
      return sum/count ;
  }
  
  public int getCount(){
    return count;
  }
  
}