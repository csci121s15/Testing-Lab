import junit.framework.TestCase;

public class RangeTest extends TestCase {
  public void testNewRange() {
    Range rng = new Range(0.0, 0.0);
  }
  
  public void testMin() {
    Range rng1 = new Range(1.0, 10.0);
    assertEquals(1.0, rng1.getMin());
    
    Range rng2 = new Range(15.0, 10.0);
    assertEquals(10.0, rng2.getMin());
  }
  
  public void testIntersection() {
    Range rng1 = new Range(1.0, 10.0);
    Range rng2 = new Range(5.0, 15.0);
    Range rng3 = rng1.intersection(rng2);
    
    assertEquals(rng1.getMax(),rng3.getMax());
    assertEquals(rng2.getMin(),rng3.getMin());
  } 
}