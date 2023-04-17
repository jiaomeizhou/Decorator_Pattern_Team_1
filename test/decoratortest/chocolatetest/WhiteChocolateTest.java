package decoratortest.chocolatetest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.chocolate.Chocolate;
import cakedecorator.chocolate.WhiteChocolate;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for WhiteChocolate.
 */
public class WhiteChocolateTest {
  private Chocolate whiteChocolate1;
  private Chocolate whiteChocolate2;
  private Chocolate whiteChocolate3;
  private Chocolate whiteChocolate4;
  private Chocolate whiteChocolate5;
  private Chocolate whiteChocolate6;


  /**
   * set up some objects of WhiteChocolate.
   */
  @Before
  public void setUp() {
    whiteChocolate1 = new WhiteChocolate(new ButterCake());
    whiteChocolate2 = new WhiteChocolate(new ChiffonCake());
    whiteChocolate3 = new WhiteChocolate(new GenoiseCake());
    whiteChocolate4 = new WhiteChocolate(new PoundCake());
    whiteChocolate5 = new WhiteChocolate(new SpongeCake());
    whiteChocolate6 = new WhiteChocolate(whiteChocolate1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, White Chocolate", whiteChocolate1.getDescription());
    assertEquals("Chiffon Cake, White Chocolate", whiteChocolate2.getDescription());
    assertEquals("Genoise Cake, White Chocolate", whiteChocolate3.getDescription());
    assertEquals("Pound Cake, White Chocolate", whiteChocolate4.getDescription());
    assertEquals("Sponge Cake, White Chocolate", whiteChocolate5.getDescription());
    assertEquals("Butter Cake, White Chocolate, White Chocolate", whiteChocolate6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.68, whiteChocolate1.getPrice(), 0.01);
    assertEquals(6.28, whiteChocolate2.getPrice(), 0.01);
    assertEquals(7.18, whiteChocolate3.getPrice(), 0.01);
    assertEquals(7.18, whiteChocolate4.getPrice(), 0.01);
    assertEquals(7.68, whiteChocolate5.getPrice(), 0.01);
    assertEquals(8.37, whiteChocolate6.getPrice(), 0.01);
  }
}