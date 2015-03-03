public class Average{
  private double sum = 0;
  private int count = 0;
  
  public Average(){
  }
  
  public void addValue(double value){
    sum += value;
    count++;
  }
  public double getAverage(){
    if(count == 0){
      return 0;
    }
    return (double)sum / count;
    }
  public int getCount(){
    return count;
  }
}
  
  
  
    