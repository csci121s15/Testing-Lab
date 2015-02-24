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
 public void testNewAverage() 
  {
    Average avg = new Average();

    assertEquals(0, avg.getCount());
    assertEquals(0, avg.getAverage(), 0.001);
  }
 
public void testSingleValue()
  {
    Average avg = new Average();

    avg.addValue(5.5);

    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }

public void testDifferentValues()
  {
    Average avg = new Average();

    avg.addValue(5.5);
    avg.addValue(6.5);
    avg.addValue(7.5);
    avg.addValue(8.5);
    avg.addValue(9.5);

    assertEquals(7.5, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

public void testZeroValue()
  {
    Average avg = new Average();

    avg.addValue(5.5);
    avg.addValue(-5.5);
    avg.addValue(3.5);
    avg.addValue(-1.5);
    avg.addValue(-2);

    assertEquals(0, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

public void testSameValue()
  {
    Average avg = new Average();

    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);

    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(5, avg.getCount());
  }

}

