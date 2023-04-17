package decoratortest.nuttest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.nuts.Nut;
import cakedecorator.nuts.Walnut;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Walnut.
 */
public class WalnutTest {
  private Nut walnut1;
  private Nut walnut2;
  private Nut walnut3;
  private Nut walnut4;
  private Nut walnut5;
  private Nut walnut6;


  /**
   * set up some objects of Walnut.
   */
  @Before
  public void setUp() {
    walnut1 = new Walnut(new ButterCake());
    walnut2 = new Walnut(new ChiffonCake());
    walnut3 = new Walnut(new GenoiseCake());
    walnut4 = new Walnut(new PoundCake());
    walnut5 = new Walnut(new SpongeCake());
    walnut6 = new Walnut(walnut1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Walnut", walnut1.getDescription());
    assertEquals("Chiffon Cake, Walnut", walnut2.getDescription());
    assertEquals("Genoise Cake, Walnut", walnut3.getDescription());
    assertEquals("Pound Cake, Walnut", walnut4.getDescription());
    assertEquals("Sponge Cake, Walnut", walnut5.getDescription());
    assertEquals("Butter Cake, Walnut, Walnut", walnut6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.18, walnut1.getPrice(), 0.01);
    assertEquals(5.78, walnut2.getPrice(), 0.01);
    assertEquals(6.68, walnut3.getPrice(), 0.01);
    assertEquals(6.68, walnut4.getPrice(), 0.01);
    assertEquals(7.18, walnut5.getPrice(), 0.01);
    assertEquals(7.37, walnut6.getPrice(), 0.01);
  }
}
