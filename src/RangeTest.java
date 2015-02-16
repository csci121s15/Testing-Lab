import junit.framework.TestCase;

public class RangeTest extends TestCase {

  public void testEmptyRange() {
    Range r = new Range(0.0, 0.0);
    
    assertTrue(r.contains(0.0));
    assertEquals(0.0, r.getWidth());
    assertEquals(0.0, r.getMin());
    assertEquals(0.0, r.getMax());
  }
  
  public void testMaxFirst() {
    Range r = new Range(4.0, 0.0);
    
    assertTrue(r.contains(2.0));
    assertEquals(4.0, r.getWidth());
    assertEquals(0.0, r.getMin());
    assertEquals(4.0, r.getMax());
  }
  
  public void testMaxLast() {
    Range r = new Range(0.0, 4.0);

    assertTrue(r.contains(2.0));
    assertEquals(4.0, r.getWidth());
    assertEquals(0.0, r.getMin());
    assertEquals(4.0, r.getMax());
  }
  
  public void testMinMax() {
    Range r = new Range(3.0, 9.0);

    assertTrue(r.contains(4.0));
    assertEquals(6.0, r.getWidth());
    assertEquals(3.0, r.getMin());
    assertEquals(9.0, r.getMax());
  }
  
  public void testMaxMin() {
    Range r = new Range(9.0, 3.0);

    assertTrue(r.contains(4.0));
    assertEquals(6.0, r.getWidth());
    assertEquals(3.0, r.getMin());
    assertEquals(9.0, r.getMax());
  }
  
  public void testOutOfRange() {
    Range r = new Range(2.0, 5.0);
    
    assertFalse(r.contains(1.0));
    assertEquals(3.0, r.getWidth());
    assertEquals(2.0, r.getMin());
    assertEquals(5.0, r.getMax());
  }
}
