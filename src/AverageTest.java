import junit.framework.TestCase;

public class AverageTest extends TestCase {
  public void testNewAverage() {
    Average avg = new Average();
    
    assertEquals(0, avg.getCount());
    assertEquals(0, avg.getAverage(), 0.001);
  }
  
  public void testSingleValue() {
    Average avg = new Average();

    avg.addValue(10.0);
    avg.addValue(10.0);
    avg.addValue(10.0);
    avg.addValue(10.0);
    avg.addValue(10.0);

    assertEquals(10.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  } 
}
