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
    Range rng = new Range(0,0);
    
    assertEquals(true, rng.contains(0));
    assertEquals(0.0, rng.getWidth());
    assertEquals(0.0, rng.getMin());
    assertEquals(0.0, rng.getMax());
    
    Range rng2 = rng.intersection(new Range(1,1));
    assertEquals(0.0, rng.getMin());
    assertEquals(0.0, rng.getMax());
    
    
  }
  
}
