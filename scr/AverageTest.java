import junit.framework.TestCase;

public class AverageTest extends TestCase {
  public void testNewAverage() {
    Average avg = new Average();
    
    assertEquals(0, avg.getCount());
    assertEquals(0.0, avg.getAverage(), 0.001);
  }
  
  public void testSingleValue() {
    Average avg = new Average();
    
    avg.addValue(5.5);
    
    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }
  public void testFiveValuesnonzeroAverage() {
    
   Average avg = new Average();
    
    avg.addValue(1);
    avg.addValue(2);
    avg.addValue(3);
    avg.addValue(4);
    avg.addValue(5);
    
    assertEquals(3.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount()); 
}
  public void testFiveValuesZeroAverage() {
    
   Average avg = new Average();
    
    avg.addValue(0);
    avg.addValue(0);
    avg.addValue(0);
    avg.addValue(0);
    avg.addValue(0);
    
    assertEquals(0.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());   
  }
  public void testFiveValuesAverage() {
    
   Average avg = new Average();
    
    avg.addValue(2);
    avg.addValue(2);
    avg.addValue(2);
    avg.addValue(2);
    avg.addValue(2);
    
    assertEquals(2.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount()); 
  }
}


                                        