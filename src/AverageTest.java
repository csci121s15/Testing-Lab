import junit.framework.TestCase;

public class AverageTest extends TestCase {
  public void testNewAverage() {
    Average avg = new Average();
    
    assertEquals(0, avg.getCount());
    assertEquals(0, avg.getAverage(), 0.001);
  }
  public void testSingleValue() {
    Average avg = new Average();

    avg.addValue(5.5);

    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }
  
  public void testFiveValuesNonzeroAverage() {
    Average avg = new Average();
    
    avg.addValue(2.0);
    avg.addValue(4.5);
    avg.addValue(6.0);
    avg.addValue(8.5);
    avg.addValue(10.0);
    
    assertEquals(6.2, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
    
  }
  
  public void testFiveValuesZeroAverage() {
    Average avg = new Average();
    
    avg.addValue(0.0);
    avg.addValue(0.0);
    avg.addValue(0.0);
    avg.addValue(0.0);
    avg.addValue(0.0);
    
    assertEquals(0.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  
  }
  
  public void testFiveValuesSame() {
    Average avg = new Average();
    
    avg.addValue(2.2);
    avg.addValue(2.2);
    avg.addValue(2.2);
    avg.addValue(2.2);
    avg.addValue(2.2);
    
    assertEquals(2.2, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  
  }
  
    
}
