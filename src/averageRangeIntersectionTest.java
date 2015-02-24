import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class averageRangeIntersectionTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testAvgNoOverlap() {
    Average probOverlap = new Average();
    Average avgOverlapLength = new Average();
    
    int i = 0;
    
    while (i < 100)
    { 
      Range a = new Range(.1, .3);
      Range b = new Range(.5, .6);
    
      Range c = a.intersection(b);
      if (c.getWidth() == 0.0)
      {
        probOverlap.addValue(0);
      }
    
      if (c.getWidth() != 0.0)
      {
        probOverlap.addValue(1);
        avgOverlapLength.addValue(c.getWidth());
      }
      
      i += 1;
    }
    
    assertEquals(0.0, probOverlap.getAverage());
    assertEquals(0.0, avgOverlapLength.getAverage());
  } 
  
  public void testAvgAllOverlap() {
    Average probOverlap = new Average();
    Average avgOverlapLength = new Average();
    
    int i = 0;
    
    while (i < 100)
    { 
      Range a = new Range(.1, .6);
      Range b = new Range(.5, .7);
    
      Range c = a.intersection(b);
      if (c.getWidth() == 0.0)
      {
        probOverlap.addValue(0);
      }
    
      if (c.getWidth() != 0.0)
      {
        probOverlap.addValue(1);
        avgOverlapLength.addValue(c.getWidth());
      }
      
      i += 1;
    }
    
    assertEquals(1.0, probOverlap.getAverage());
    assertEquals(.1, avgOverlapLength.getAverage(), .0001);
  } 
  
  public void testAvgOneOverlap() {
    Average probOverlap = new Average();
    Average avgOverlapLength = new Average();
    
    
      Range a = new Range(.1, .3);
      Range b = new Range(.5, .7);
      Range d = new Range(.1, .6);
    
      Range c = a.intersection(b);
      Range e = b.intersection(d);
      
      if (e.getWidth() == 0.0)
      {
        probOverlap.addValue(0);
      }
    
      if (e.getWidth() != 0.0)
      {
        probOverlap.addValue(1);
        avgOverlapLength.addValue(e.getWidth());
      }
      
      if (c.getWidth() == 0.0)
      {
        probOverlap.addValue(0);
      }
    
      if (c.getWidth() != 0.0)
      {
        probOverlap.addValue(1);
        avgOverlapLength.addValue(c.getWidth());
      }
    
    assertEquals(.5, probOverlap.getAverage());
    assertEquals(.1, avgOverlapLength.getAverage(), .0001);
  } 
}
