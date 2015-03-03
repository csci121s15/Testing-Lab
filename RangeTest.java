import junit.framework.TestCase;

public class RangeTest extends TestCase {
  
 
  public void testNewRangeContains() {
    Range r = new Range(0,2);
    assertEquals(true, r.contains(0));
    assertEquals(true, r.contains(1));
    assertEquals(false, r.contains(2));
    
  }
  public void testNewWidth(){
    Range r = new Range(0,2);
    assertEquals(2.0, r.getWidth());
  }
  public void testMinMax(){
    Range r = new Range(0,2);
    assertEquals(0.0, r.getMin());
    assertEquals(2.0, r.getMax());
  }
  public void testIntersectionEqual(){
    Range r = new Range(1.0,3.0);
    Range s = new Range(1.0,3.0);
    Range intersect = r.intersection(s);
    assertEquals(1.0, intersect.getMin());
    assertEquals(3.0, intersect.getMax());
  }
  public void testIntersectionNotEqual(){
    Range r = new Range(1.0, 3.0);
    Range s = new Range(5.0, 10.0);
    Range intersect = r.intersection(s);
    assertEquals(0.0, intersect.getMin());
    assertEquals(0.0, intersect.getMax());
  }
  public void testIntersectionWithin(){
    Range r = new Range(2.0, 4.0);
    Range s = new Range(1.0, 10.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }  
  public void testIntersectionWithin2(){
    Range r = new Range(1.0, 10.0);
    Range s = new Range(2.0, 4.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  public void testIntersectionBeginEqual(){
    Range r = new Range(2.0, 4.0);
    Range s = new Range(2.0, 6.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  public void testIntersectionBeginEqual2(){
    Range r = new Range(2.0, 6.0);
    Range s = new Range(2.0, 4.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  public void testIntersectionEndEqual(){
    Range r = new Range(2.0, 6.0);
    Range s = new Range(1.0, 6.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(6.0, intersect.getMax());
  }
  public void testIntersectionEndEqual2(){
    Range r = new Range(1.0, 4.0);
    Range s = new Range(2.0, 4.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(4.0, intersect.getMax());
  }
  public void testIntersectionOverlap(){
    Range r = new Range(1.0, 3.0);
    Range s = new Range(2.0, 4.0);
    Range intersect = r.intersection(s);
    assertEquals(2.0, intersect.getMin());
    assertEquals(3.0, intersect.getMax());
  }
}
  
