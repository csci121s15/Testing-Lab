import junit.framework.TestCase;

public class AverageTest extends TestCase
{
  public void testNewAverage()
  {
    Average avg = new Average();
    
    avg.addValue(5.5);
    
    assertEquals(1, avg.getCount());
    assertEquals(5.5, avg.getAverage(), 0.001);
  }
  
  public void testSingleValue()
  {
    Average avg = new Average();

    avg.addValue(5.5);

    assertEquals(5.5, avg.getAverage(), 0.001);
    assertEquals(1, avg.getCount());
  }
  
  public void testMultipleValues()
  {
    Average avg = new Average();
    
    avg.addValue(5.0);
    avg.addValue(3.0);
    avg.addValue(4.0);
    avg.addValue(8.0);
    avg.addValue(1.0);
    avg.addValue(6.0);
    
    assertEquals(6, avg.getCount());
    assertEquals(4.5, avg.getAverage(), 0.001);
  }
  
  public void testMultipleAverageZero()
  {
    Average avg = new Average();
    
    avg.addValue(5.5);
    avg.addValue(-5.5);
    avg.addValue(2.0);
    avg.addValue(-2.0);
    avg.addValue(1.5);
    avg.addValue(-1.5);
    
    assertEquals(6, avg.getCount());
    assertEquals(0.0, avg.getAverage(), 0.001);
  }
  
  public void testSameValues()
  {
    Average avg = new Average();

    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);
    avg.addValue(5.5);
    
    assertEquals(5, avg.getCount());
    assertEquals(5.5, avg.getAverage(), 0.001);
  }
  
}