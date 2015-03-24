import junit.framework.TestCase;
public class RangeTest extends TestCase {
  
  public void testNewRange()
  {
    Range r = new Range(1.0, 3.0);
    
    assertEquals(1.0, r.getMin(), 0.001);
    assertEquals(3.0, r.getMax(), 0.001);
    assertEquals(true, r.contains(2));
    assertEquals(2.0, r.getWidth());
    
  }
  
  public void testInsideIntersection() {
    Range rng = new Range(1.0,10.0);
    Range rng2 = new Range(3.0,5.0);
    Range i = rng.intersection(rng2);
    assertEquals(3.0, i.getMin());
    assertEquals(5.0, i.getMax());
  }
  public void testBothEqual() {
    Range rng = new Range(1.0,10.0);
    Range rng2 = new Range(1.0,10.0);
    Range i = rng.intersection(rng2);
    assertEquals(1.0, i.getMin());
    assertEquals(10.0, i.getMax());
    
  }
  public void testMinEquals() {
    Range rng = new Range(1.0,10.0);
    Range rng2 = new Range(1,15);
    Range i = rng.intersection(rng2);
    assertEquals(1.0, i.getMin());
    assertEquals(10.0, i.getMax());
  }
  public void testMaxEquals() {
    Range rng = new Range(1.0,10.0);
    Range rng2 = new Range(2.0,10.0);
    Range i = rng.intersection(rng2);
    assertEquals(2.0, i.getMin());
    assertEquals(10.0, i.getMax());
  }
  public void testBothExceed() {
    Range rng = new Range(1.0,10.0);
    Range rng2 = new Range(3.0,12.0);
    Range i = rng.intersection(rng2);
    assertEquals(3.0, i.getMin());
    assertEquals(10.0, i.getMax());

}
}