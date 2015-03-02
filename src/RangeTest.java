import junit.framework.TestCase;

public class RangeTest extends TestCase {
  public void testNewRange() {
    Range r = new Range(0,2);
    
    assertEquals(true, r.contains(1));
    assertEquals(2.0, r.getWidth());
    assertEquals(0.0, r.getMin());
    assertEquals(2.0, r.getMax());
    
  }
  
  public void testIntersectionEqual() {
    Range r = new Range(1.0,3.0);
    Range t = new Range(1.0,3.0);
    
    Range intersect = r.intersection(t);
    assertEquals(1.0, intersect.getMin());
    assertEquals(3.0, intersect.getMax());    
  }
  
  public void testIntersectionSameStartDifferentEnd() {
    Range r = new Range(1.0,5.0);
    Range t = new Range(1.0,4.0);
    
    Range intersect = r.intersection(t);
    assertEquals(1.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  
  public void testIntersectionSameStartDifferentStop2() {
    Range r = new Range(1.0,4.0);
    Range t = new Range(1.0,5.0);
    
    Range intersect = r.intersection(t);
    assertEquals(1.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  
  public void testIntersectionSameStopDifferentStart() {
    Range r = new Range(1.0,5.0);
    Range t = new Range(2.0,5.0);
    
    Range intersect = r.intersection(t);
    assertEquals(2.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }
  
  public void testIntersectionSAmeStopDifferentStart2() {
    Range r = new Range(2.0,5.0);
    Range t = new Range(1.0,5.0);
    
    Range intersect = r.intersection(t);
    assertEquals(2.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }
  
  public void testIntersectionStartLessStopLess() {
    Range r = new Range(1.0,5.0);
    Range t = new Range(2.0,6.0);
    
    Range intersect = r.intersection(t);
    assertEquals(2.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }
  
  public void testIntersectionStartGreaterStopGreater() {
    Range r = new Range(2.0, 6.0);
    Range t = new Range(1.0, 5.0);
    
    Range intersect = r.intersection(t);
    assertEquals(2.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }
  
  public void testIntersectionRangeInRange2() {
    Range r = new Range(2.0, 5.0);
    Range t = new Range(1.0, 6.0);
    
    Range intersect = r.intersection(t);
    assertEquals(2.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }  
  
  public void testIntersectionRange2InRange1() {
    Range r = new Range(2.0, 6.0);
    Range t = new Range(3.0, 5.0);
    
    Range intersect = r.intersection(t);
    assertEquals(3.0, intersect.getMin());
    assertEquals(5.0, intersect.getMax());
  }
  
  public void testIntersectionDNE() {
    Range r = new Range(2.0, 5.0);
    Range t = new Range(7.0, 9.0);
    
    Range intersect = r.intersection(t);
    assertEquals(0.0, intersect.getMin());
    assertEquals(0.0, intersect.getMax());
    
  }
}
