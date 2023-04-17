package caketest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.Cake;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for ButterCake.
 */
public class ButterCakeTest {
  private Cake butterCake;

  /**
   * set up an object of ButterCake.
   */
  @Before
  public void setUp() {
    butterCake = new ButterCake();
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake", butterCake.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(4.99, butterCake.getPrice(), 0.01);
  }
}
