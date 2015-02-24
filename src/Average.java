public class Average{
  private double sum = 0.0;
  private int count = 0;
  
  public Average(){
  }
  
  void addValue(double value){
    sum += value;
    count += 1;
  }
  
  double getAverage(){
    if (count == 0)
      return 0;
    else
      return sum/count;
  }
  
  int getCount(){
    return count;
  }
  
  
}