package caketest;

import static org.junit.Assert.assertEquals;

import cake.Cake;
import cake.ChiffonCake;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for ChiffonCake class.
 */
public class ChiffonCakeTest {
  private Cake chiffonCake;

  /**
   * set up an object of ChiffonCake.
   */
  @Before
  public void setUp() {
    chiffonCake = new ChiffonCake();
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Chiffon Cake", chiffonCake.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(4.59, chiffonCake.getPrice(), 0.01);
  }
}