import junit.framework.TestCase;


public class RangeTest extends TestCase {
  public void testNewRange() {
    Range r = new Range(0.0, 0.0);
    
  }
  public void testMin() {
    Range r1 = new Range(1.0, 10.0);
    assertEquals(1.0, r1.getMin(), 0.001);
    
    Range r2 = new Range(5.8, -1.2);
    assertEquals(-1.2, r2.getMin(), 0.001);
  }
  public void testIntersection() {
    Range r1 = new Range(1.0, 10.0);
    Range r2 = new Range(5.0, 15.0);
    Range r3 = r1.intersection(r2);
    
    assertEquals(r1.getMax(),r3.getMax());
    assertEquals(r2.getMin(),r3.getMin());
  }
}
