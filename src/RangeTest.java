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
  public void testZeroRange() {
  
  Range r = new Range(0, 0);
  
  assertEquals(0.0, r.getWidth());
  assertEquals(0.0, r.getMin());
  assertEquals(0.0, r.getMax());
  assertEquals(false, r.contains(0));
  }
  
  public void testPositiveRange() {
  
  Range r = new Range(3, 7);
  
  assertEquals(4.0, r.getWidth());
  assertEquals(3.0, r.getMin());
  assertEquals(7.0, r.getMax());
  assertEquals(true, r.contains(3.5));
  }
  
  public void testFlipPositiveRange() {
  
  Range r = new Range(3, 7);

  assertEquals(4.0, r.getWidth());
  assertEquals(3.0, r.getMin());
  assertEquals(7.0, r.getMax());
  assertEquals(true, r.contains(3.5));
  
  }
  
  public void testNegativeRange() {
  
  Range r = new Range(-4, -1);

  assertEquals(3.0, r.getWidth());
  assertEquals(-4.0, r.getMin());
  assertEquals(-1.0, r.getMax());
  assertEquals(true, r.contains(-2.5));
  
  }
  
  public void testFlipNegativeRange() {
  
  Range r = new Range(-1, -4);

  assertEquals(3.0, r.getWidth());
  assertEquals(-4.0, r.getMin());
  assertEquals(-1.0, r.getMax());
  assertEquals(true, r.contains(-2.5));
  }
  //We now know that there isn't anything wrong with getWidth getMin getMax or contains methods.
  //If a problem arises in testing of intersection method
  //it will be because of a bug in the intersection method and not any other method
  
  public void testIntersectionRange() {
  
  Range r = new Range(3, 7);
  Range s = new Range(2, 4);
  Range bleh = r.intersection(s);

  assertEquals(1.0, bleh.getWidth());
  assertEquals(3.0, bleh.getMin());
  assertEquals(4.0, bleh.getMax());
  assertEquals(true, bleh.contains(3.5));
  }
  
  public void testReverseIntersectionRange() {
  
  Range r = new Range(3, 7);
  Range s = new Range(2, 4);
  Range bleh = s.intersection(r);

  assertEquals(1.0, bleh.getWidth());
  assertEquals(3.0, bleh.getMin());
  assertEquals(4.0, bleh.getMax());
  assertEquals(true, bleh.contains(3.5));
  }
    
  public void testSameRange() {
  
  Range r = new Range(3, 7);
  Range s = new Range(2, 4);
  Range bleh = r.intersection(r);

  assertEquals(0.0, bleh.getWidth());
  assertEquals(0.0, bleh.getMin());
  assertEquals(0.0, bleh.getMax());
  assertEquals(false, bleh.contains(0.0));
  }
    
  public void testNoIntersectionRange() {
  
  Range r = new Range(3, 7);
  Range s = new Range(2, 3);
  Range bleh = s.intersection(r);

  assertEquals(0.0, bleh.getWidth());
  assertEquals(0.0, bleh.getMin());
  assertEquals(0.0, bleh.getMax());
  assertEquals(false, bleh.contains(0.0));
  }
    
  public void testReverseNoIntersectionRange() {
  
  Range r = new Range(3, 7);
  Range s = new Range(2, 3);
  Range bleh = r.intersection(s);

  assertEquals(0.0, bleh.getWidth());
  assertEquals(0.0, bleh.getMin());
  assertEquals(0.0, bleh.getMax());
  assertEquals(false, bleh.contains(0.0));
  }
   
  public void testOneIsSmallerRange() {
  
  Range r = new Range(-3, 7);
  Range s = new Range(2, 3);
  Range bleh = r.intersection(s);

  assertEquals(1.0, bleh.getWidth());
  assertEquals(2.0, bleh.getMin());
  assertEquals(3.0, bleh.getMax());
  assertEquals(false, bleh.contains(3.0));
  }
}
  
