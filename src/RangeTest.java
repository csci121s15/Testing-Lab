import junit.framework.TestCase;

public class RangeTest extends TestCase {
  public void testNewRange() {
    Range r = new Range(0,2);
    
    assertEquals(true, r.contains(1));
    assertEquals(2, r.getWidth());
    assertEquals(0, r.getMin());
    assertEquals(2, r.getMax());
    
  }
  
}
