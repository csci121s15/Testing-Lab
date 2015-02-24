import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class AverageTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testNewAverage() {
    Average avg = new Average();

    assertEquals(0, avg.getCount());
    assertEquals(0, avg.getAverage(), 0.001);
  }  

  public void testSingleValue(){
    Average avg = new Average();
    
    avg.addValue(5.5);
    
    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }

  public void test5DifferentAvgGreaterThanZero() {
    Average avg = new Average();
    
    int[] values = {2, 17, 16, 99, 34};
    
    for (int i = 0; i < values.length; i ++){
      avg.addValue(values[i]);
    }
    
    assertEquals(33.6, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

  public void test5DifferentAvgIsZero() {
    Average avg = new Average();
    
    int[] values = {-10, -5, -1, 9, 7};
    
    for (int i = 0; i < values.length; i ++){
      avg.addValue(values[i]);
    }
   
    assertEquals(0.0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

  public void test5samevalues() {
    Average avg = new Average();
    
    for (int i = 0; i < 5; i ++){
      avg.addValue(5.0);
    }
    
    assertEquals(5, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
    
  }
  
}
