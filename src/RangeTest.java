import junit.framework.TestCase;


public class RangeTest extends TestCase {
  public void testNewRange() {
    Range rng = new Range(0.0, 0.0);
  }
  public void testMin() {
    Range r1 = new Range(1.0, 10.0);
    assertEquals(1.0, r1.getMin(), 0.001);
    Range r2 = new Range(5.0, -1.0);
    assertEquals(-1.0, r2.getMin(),0.001);
  }   
}

