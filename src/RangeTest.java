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
  public void testNewRange() {
    Range range = new Range(5.0, 7.0);
    
    assertTrue(range.contains(6.5));
    assertEquals(2.0, range.getWidth());
    assertEquals(5.0, range.getMin());
    assertEquals(7.0, range.getMax());
  }
  
  public void testInstersection() {
    Range range = new Range(3.0, 10.0);
    Range other = new Range(5.0, 11.0);
    Range inter = range.intersection(other); // 5.0, 10.0
    assertEquals(5.0, inter.getWidth());
    assertEquals(5.0, inter.getMin());
    assertEquals(10.0, inter.getMax());
  }
}
