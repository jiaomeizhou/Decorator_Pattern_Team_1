package caketest;

import static org.junit.Assert.assertEquals;

import cake.Cake;
import cake.PoundCake;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit for PoundCake class.
 */
public class PoundCakeTest {
  private Cake poundCake;

  /**
   * set up an object of PoundCake.
   */
  @Before
  public void setUp() {
    poundCake = new PoundCake();
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Pound Cake", poundCake.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(5.49, poundCake.getPrice(), 0.01);
  }
}
