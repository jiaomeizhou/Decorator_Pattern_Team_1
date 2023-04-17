package decoratortest.chocolatetest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.chocolate.Chocolate;
import cakedecorator.chocolate.DarkChocolate;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for DarkChocolate.
 */
public class DarkChocolateTest {
  private Chocolate darkChocolate1;
  private Chocolate darkChocolate2;
  private Chocolate darkChocolate3;
  private Chocolate darkChocolate4;
  private Chocolate darkChocolate5;
  private Chocolate darkChocolate6;


  /**
   * set up some objects of DarkChocolate.
   */
  @Before
  public void setUp() {
    darkChocolate1 = new DarkChocolate(new ButterCake());
    darkChocolate2 = new DarkChocolate(new ChiffonCake());
    darkChocolate3 = new DarkChocolate(new GenoiseCake());
    darkChocolate4 = new DarkChocolate(new PoundCake());
    darkChocolate5 = new DarkChocolate(new SpongeCake());
    darkChocolate6 = new DarkChocolate(darkChocolate1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Dark Chocolate", darkChocolate1.getDescription());
    assertEquals("Chiffon Cake, Dark Chocolate", darkChocolate2.getDescription());
    assertEquals("Genoise Cake, Dark Chocolate", darkChocolate3.getDescription());
    assertEquals("Pound Cake, Dark Chocolate", darkChocolate4.getDescription());
    assertEquals("Sponge Cake, Dark Chocolate", darkChocolate5.getDescription());
    assertEquals("Butter Cake, Dark Chocolate, Dark Chocolate", darkChocolate6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.48, darkChocolate1.getPrice(), 0.01);
    assertEquals(6.08, darkChocolate2.getPrice(), 0.01);
    assertEquals(6.98, darkChocolate3.getPrice(), 0.01);
    assertEquals(6.98, darkChocolate4.getPrice(), 0.01);
    assertEquals(7.48, darkChocolate5.getPrice(), 0.01);
    assertEquals(7.97, darkChocolate6.getPrice(), 0.01);
  }
}

