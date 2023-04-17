package caketest;

import static org.junit.Assert.assertEquals;

import cake.Cake;
import cake.GenoiseCake;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit for GenoiseCake class.
 */
public class GenoiseCakeTest {
  private Cake genoiseCake;

  /**
   * set up an object of GenoiseCake.
   */
  @Before
  public void setUp() {
    genoiseCake = new GenoiseCake();
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Genoise Cake", genoiseCake.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(5.49, genoiseCake.getPrice(), 0.01);
  }
}
