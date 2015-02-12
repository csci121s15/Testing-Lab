import junit.framework.TestCase;

public class RangeTest extends TestCase {
  public void testNewRange() {
    Range rng = new Range(0.0, 0.0);
  }
  
  public void testMin() {
    Range r1 = new Range(1.0, 10.0);
    assertEquals(1.0, r1.getMin(), 0.001);
    
    Range r2 = new Range(5.0 ,-1.0);
    assertEquals(-1.0, r2.getMin(), 0.001);
    
  }
  
  public void testMax() {
    Range r1 = new Range(10.0, 1.0);
    assertEquals(10.0, r1.getMax(), 0.001);
    
    Range r2 = new Range(-1.0, 5.0);
    assertEquals(5.0, r2.getMax(), 0.001);
    
  }
  
  public void testWidth() {
    Range r1 = new Range(10.0, 1.0);
    assertEquals(9.0, r1.getWidth(), 0.001);
    
    Range r2 = new Range(5.0, -1.0);
    assertEquals(6.0, r2.getWidth(), 0.001);
    
  }
  
  public void testBooleanContains() {
    Range r1 = new Range(10.0, 1.0);
    assertTrue(r1.contains(4.0));
    
    Range r2 = new Range(5.0, -1.0);
    assertFalse(r2.contains(10.0));
    
    assertFalse(r1.contains(10.0));
  
    
  }
  
  public void testRangeIntersection() {
    Range r1 = new Range(10.0, 1.0);
    Range r2 = new Range(5.0, -1.0);
    Range r3 = r1.intersection(r2);
    
    assertEquals(4.0, r3.getWidth(), 0.001);
  }
  
   
    
             
}
