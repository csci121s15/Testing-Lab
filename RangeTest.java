import junit.framework.TestCase;

public class RangeTest extends TestCase
{
  public void testNewRange()
  {
    Range r = new Range(2.0,0.0);
  }
  
  public void testContains()
  {
    Range r = new Range(2.0,0.0);
    assertEquals(true, r.contains(1.5));
  }
  
  public void testWidth()
  {
    Range r = new Range(2.0,0.0);
    assertEquals(2.0, r.getWidth());
  }
  
  public void testMin()
  {
    Range r = new Range(2.0,0.0);
    assertEquals(0.0, r.getMin());
  }
  
  public void testMax()
  {
    Range r = new Range(2.0,0.0);
    assertEquals(2.0, r.getMax());
  }
  
  public void testIntersection()
  {
    Range r1 = new Range(0.0,5.0);
    Range r2 = new Range(1.0,4.0);
    Range r3 = r1.intersection(r2);    
    assertEquals(1.0, r3.getMin());
    assertEquals(4.0, r3.getMax());
  }
}