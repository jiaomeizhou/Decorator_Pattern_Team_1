package decoratortest.nuttest;


import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.nuts.Nut;
import cakedecorator.nuts.Pecan;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Pecan.
 */
public class PecanTest {
  private Nut pecan1;
  private Nut pecan2;
  private Nut pecan3;
  private Nut pecan4;
  private Nut pecan5;
  private Nut pecan6;


  /**
   * set up some objects of Pecan.
   */
  @Before
  public void setUp() {
    pecan1 = new Pecan(new ButterCake());
    pecan2 = new Pecan(new ChiffonCake());
    pecan3 = new Pecan(new GenoiseCake());
    pecan4 = new Pecan(new PoundCake());
    pecan5 = new Pecan(new SpongeCake());
    pecan6 = new Pecan(pecan1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Pecan", pecan1.getDescription());
    assertEquals("Chiffon Cake, Pecan", pecan2.getDescription());
    assertEquals("Genoise Cake, Pecan", pecan3.getDescription());
    assertEquals("Pound Cake, Pecan", pecan4.getDescription());
    assertEquals("Sponge Cake, Pecan", pecan5.getDescription());
    assertEquals("Butter Cake, Pecan, Pecan", pecan6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.48, pecan1.getPrice(), 0.01);
    assertEquals(6.08, pecan2.getPrice(), 0.01);
    assertEquals(6.98, pecan3.getPrice(), 0.01);
    assertEquals(6.98, pecan4.getPrice(), 0.01);
    assertEquals(7.48, pecan5.getPrice(), 0.01);
    assertEquals(7.97, pecan6.getPrice(), 0.01);
  }
}
