package decoratortest.nuttest;


import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.nuts.Nut;
import cakedecorator.nuts.Pistachio;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Pistachio.
 */
public class PistachioTest {
  private Nut pistachio1;
  private Nut pistachio2;
  private Nut pistachio3;
  private Nut pistachio4;
  private Nut pistachio5;
  private Nut pistachio6;


  /**
   * set up some objects of Pistachio.
   */
  @Before
  public void setUp() {
    pistachio1 = new Pistachio(new ButterCake());
    pistachio2 = new Pistachio(new ChiffonCake());
    pistachio3 = new Pistachio(new GenoiseCake());
    pistachio4 = new Pistachio(new PoundCake());
    pistachio5 = new Pistachio(new SpongeCake());
    pistachio6 = new Pistachio(pistachio1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Pistachio", pistachio1.getDescription());
    assertEquals("Chiffon Cake, Pistachio", pistachio2.getDescription());
    assertEquals("Genoise Cake, Pistachio", pistachio3.getDescription());
    assertEquals("Pound Cake, Pistachio", pistachio4.getDescription());
    assertEquals("Sponge Cake, Pistachio", pistachio5.getDescription());
    assertEquals("Butter Cake, Pistachio, Pistachio", pistachio6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.78, pistachio1.getPrice(), 0.01);
    assertEquals(6.38, pistachio2.getPrice(), 0.01);
    assertEquals(7.28, pistachio3.getPrice(), 0.01);
    assertEquals(7.28, pistachio4.getPrice(), 0.01);
    assertEquals(7.78, pistachio5.getPrice(), 0.01);
    assertEquals(8.57, pistachio6.getPrice(), 0.01);
  }
}

