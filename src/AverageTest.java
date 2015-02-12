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
  
  public void testMultValues1() {
    Average avg = new Average();
    
    avg.addValue(2);
    avg.addValue(4);
    avg.addValue(6);
    avg.addValue(8);
    avg.addValue(10);
    
    assertEquals(6.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
  
  public void testMultValues2() {
    Average avg = new Average();
    
    avg.addValue(-3);
    avg.addValue(-2);
    avg.addValue(-1);
    avg.addValue(3);
    avg.addValue(3);
    
    assertEquals(0.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
  
  public void testMultValues3() {
    Average avg = new Average();
    
    for (int i = 0; i < 5; i++) {
      avg.addValue(6);
    }
    
    assertEquals(6.0, avg.getAverage(), 0.001);
  }
    
}
