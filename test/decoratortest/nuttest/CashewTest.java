package decoratortest.nuttest;


import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.nuts.Cashew;
import cakedecorator.nuts.Nut;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Cashew.
 */
public class CashewTest {
  private Nut cashew1;
  private Nut cashew2;
  private Nut cashew3;
  private Nut cashew4;
  private Nut cashew5;
  private Nut cashew6;


  /**
   * set up some objects of Cashew.
   */
  @Before
  public void setUp() {
    cashew1 = new Cashew(new ButterCake());
    cashew2 = new Cashew(new ChiffonCake());
    cashew3 = new Cashew(new GenoiseCake());
    cashew4 = new Cashew(new PoundCake());
    cashew5 = new Cashew(new SpongeCake());
    cashew6 = new Cashew(cashew1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Cashew", cashew1.getDescription());
    assertEquals("Chiffon Cake, Cashew", cashew2.getDescription());
    assertEquals("Genoise Cake, Cashew", cashew3.getDescription());
    assertEquals("Pound Cake, Cashew", cashew4.getDescription());
    assertEquals("Sponge Cake, Cashew", cashew5.getDescription());
    assertEquals("Butter Cake, Cashew, Cashew", cashew6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.38, cashew1.getPrice(), 0.01);
    assertEquals(5.98, cashew2.getPrice(), 0.01);
    assertEquals(6.88, cashew3.getPrice(), 0.01);
    assertEquals(6.88, cashew4.getPrice(), 0.01);
    assertEquals(7.38, cashew5.getPrice(), 0.01);
    assertEquals(7.77, cashew6.getPrice(), 0.01);
  }
}
