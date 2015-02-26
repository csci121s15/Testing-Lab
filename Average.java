public class Average{
  
  int count = 0;
  double sum = 0;
    
  public void addValue(double value){
      sum += value;
      count += 1;
    }
    
  public double getAverage(){
    if (count == 0){
      return 0;
    }
      else{
      return sum / count;
   }
 }
    
  public int getCount (){
      return count;
  } 
}
