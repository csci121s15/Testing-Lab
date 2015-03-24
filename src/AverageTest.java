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

  public void testMoreValues() {
    Average avg = new Average();
    
    avg.addValue(1);
    avg.addValue(2);
    avg.addValue(3);
    avg.addValue(4);
    avg.addValue(5);
    
    assertEquals(3.0, avg.getAverage());
    assertEquals(5, avg.getCount());
  }
  
  public void testZeroAvg() {
    Average avg = new Average();
    
    avg.addValue(1);
    avg.addValue(2);
    avg.addValue(3);
    avg.addValue(4);
    avg.addValue(-10);
    
    assertEquals(0.0, avg.getAverage());
  }
  
  public void testAllOnes() {
    Average avg = new Average();
    
    avg.addValue(1);
    avg.addValue(1);
    avg.addValue(1);
    avg.addValue(1);
    avg.addValue(1);
    
    assertEquals(1.0, avg.getAverage());
  }
}

