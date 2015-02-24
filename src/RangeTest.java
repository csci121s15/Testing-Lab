import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class RangeTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testSeperateRanges() {
    Range r = new Range(0.0, 10.0);
    Range o = new Range(11.0, 15.0);
    Range intersection = r.intersection(o);
    assertEquals(10.0, r.getMax());
    assertEquals(0.0, intersection.getMin());
    assertEquals(0.0, intersection.getMax());
    assertEquals(0.0, intersection.getWidth());
    
    
  }
  
  public void testSameRange() {
    Range r = new Range(0.0, 10.0);
    Range o = new Range(0.0, 10.0);
    Range intersection = r.intersection(o);
    assertEquals(0.0, intersection.getMin());
    assertEquals(10.0, intersection.getMax());
    assertEquals(10.0, intersection.getWidth());
    
  
}
  public void testOverlappingRange() {
    Range r = new Range(0.0, 10.0);
    Range o = new Range(3.0, 11.0);
    Range intersection = r.intersection(o);
    assertEquals(3.0, intersection.getMin());
    assertEquals(10.0, intersection.getMax());
    assertEquals(7.0, intersection.getWidth());
  
  
}

}