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
    
    assertEquals(false, rng.contains(0));
    assertEquals(0.0, rng.getWidth());
    assertEquals(0.0, rng.getMin());
    assertEquals(0.0, rng.getMax());
    
    Range rng2 = rng.intersection(new Range(1.0,1.0));
    assertEquals(0.0, rng2.getMin());
    assertEquals(0.0, rng2.getMax());
  }
 
  public void testEqualRanges() {
    Range rng1 = new Range(0.0, 5.0);
    
    assertEquals(true, rng1.contains(2.0));
    assertEquals(5.0, rng1.getWidth());
    assertEquals(0.0, rng1.getMin());
    assertEquals(5.0, rng1.getMax());
    
    Range rng2 = rng1.intersection(new Range(0.0, 5.0));
    assertEquals(0.0, rng2.getMin());
    assertEquals(5.0, rng2.getMax());
  }  

  public void testBiggerRange() {
    Range rng1 = new Range(0.0, 5.0);
    
    assertEquals(true, rng1.contains(2.0));
    assertEquals(5.0, rng1.getWidth());
    assertEquals(0.0, rng1.getMin());
    assertEquals(5.0, rng1.getMax());

    Range rng2 = rng1.intersection(new Range(2.0, 10.0));
    assertEquals(2.0, rng2.getMin());
    assertEquals(5.0, rng2.getMax());
  }
  
  public void testSmallerRange() {
    Range rng1 = new Range(0.0, 5.0);
    
    assertEquals(true, rng1.contains(2.0));
    assertEquals(5.0, rng1.getWidth());
    assertEquals(0.0, rng1.getMin());
    assertEquals(5.0, rng1.getMax());

    Range rng2 = rng1.intersection(new Range(-10.0, 2.0));
    assertEquals(0.0, rng2.getMin());
    assertEquals(2.0, rng2.getMax());
  }
  
  public void testNonIntersection() {
    Range rng1 = new Range(0.0, 5.0);
    
    assertEquals(true, rng1.contains(2.0));
    assertEquals(5.0, rng1.getWidth());
    assertEquals(0.0, rng1.getMin());
    assertEquals(5.0, rng1.getMax());

    Range rng2 = rng1.intersection(new Range(-10.0, -1.0));
    assertEquals(0.0, rng2.getMin());
    assertEquals(0.0, rng2.getMax());
  }
  
  
  
}
  
