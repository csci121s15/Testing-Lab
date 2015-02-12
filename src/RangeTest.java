import junit.framework.TestCase;

public class RangeTest extends TestCase {
  
  public void testNewRange() {
    Range r1 = new Range(1.0, 10.0);
    assertEquals(1.0, r1.getMin(), 0.001);
    Range r2 = new Range(5.0, -1.0);
    assertEquals(-1.0, r2.getMin(), 0.001);
  }
  
  public void testRangeIntersection() {
    Range r1 = new Range(0.0, 10.0);
    Range r2 = new Range(5.0, 15.0);
    Range r3 = new Range(5.0, 10.0);
    assertEquals(5.0, r3.getWidth());
    assertEquals(5.0, r3.getMin());
    assertEquals(10.0, r3.getMax());
  }     
  
}
