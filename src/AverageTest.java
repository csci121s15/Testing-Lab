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
  public void testMultipleValues() {
    Average avg = new Average();
    
    avg.addValue(5.5);
    avg.addValue(3.6);
    avg.addValue(2.1);
    avg.addValue(9.0);
    avg.addValue(1.7);
    
    assertEquals(4.38, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
  public void testAverageEqualsZero() {
    Average avg = new Average();
    
    avg.addValue(1.2);
    avg.addValue(-1.2);
    avg.addValue(5.2);
    avg.addValue(-3.5);
    avg.addValue(-1.7);
    
    assertEquals(0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }
    public void testSameValues() {
    Average avg = new Average();
    
    avg.addValue(5);
    avg.addValue(5);
    avg.addValue(5);
    avg.addValue(5);
    avg.addValue(5);
    avg.addValue(5);
    
    assertEquals(5, avg.getAverage(), 0.001);
    assertEquals(6, avg.getCount());
  }
}
