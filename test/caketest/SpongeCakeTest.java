package caketest;

import static org.junit.Assert.assertEquals;

import cake.Cake;
import cake.SpongeCake;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit for SpongeCake class.
 */
public class SpongeCakeTest {
  private Cake spongeCake;

  /**
   * set up an object of SpongeCake.
   */
  @Before
  public void setUp() {
    spongeCake = new SpongeCake();
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Sponge Cake", spongeCake.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(5.99, spongeCake.getPrice(), 0.01);
  }
}

