package decoratortest.chocolatetest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.chocolate.Chocolate;
import cakedecorator.chocolate.MilkyChocolate;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for MilkyChocolate.
 */
public class MilkyChocolateTest {
  private Chocolate milkyChocolate1;
  private Chocolate milkyChocolate2;
  private Chocolate milkyChocolate3;
  private Chocolate milkyChocolate4;
  private Chocolate milkyChocolate5;
  private Chocolate milkyChocolate6;


  /**
   * set up some objects of MilkyChocolate.
   */
  @Before
  public void setUp() {
    milkyChocolate1 = new MilkyChocolate(new ButterCake());
    milkyChocolate2 = new MilkyChocolate(new ChiffonCake());
    milkyChocolate3 = new MilkyChocolate(new GenoiseCake());
    milkyChocolate4 = new MilkyChocolate(new PoundCake());
    milkyChocolate5 = new MilkyChocolate(new SpongeCake());
    milkyChocolate6 = new MilkyChocolate(milkyChocolate1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Milk Chocolate", milkyChocolate1.getDescription());
    assertEquals("Chiffon Cake, Milk Chocolate", milkyChocolate2.getDescription());
    assertEquals("Genoise Cake, Milk Chocolate", milkyChocolate3.getDescription());
    assertEquals("Pound Cake, Milk Chocolate", milkyChocolate4.getDescription());
    assertEquals("Sponge Cake, Milk Chocolate", milkyChocolate5.getDescription());
    assertEquals("Butter Cake, Milk Chocolate, Milk Chocolate", milkyChocolate6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(5.98, milkyChocolate1.getPrice(), 0.01);
    assertEquals(5.58, milkyChocolate2.getPrice(), 0.01);
    assertEquals(6.48, milkyChocolate3.getPrice(), 0.01);
    assertEquals(6.48, milkyChocolate4.getPrice(), 0.01);
    assertEquals(6.98, milkyChocolate5.getPrice(), 0.01);
    assertEquals(6.97, milkyChocolate6.getPrice(), 0.01);
  }
}