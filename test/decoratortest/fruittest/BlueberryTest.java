package decoratortest.fruittest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.fruits.Blueberry;
import cakedecorator.fruits.Fruit;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Blueberry.
 */
public class BlueberryTest {
  private Fruit blueberry1;
  private Fruit blueberry2;
  private Fruit blueberry3;
  private Fruit blueberry4;
  private Fruit blueberry5;
  private Fruit blueberry6;


  /**
   * set up some objects of Blueberry.
   */
  @Before
  public void setUp() {
    blueberry1 = new Blueberry(new ButterCake());
    blueberry2 = new Blueberry(new ChiffonCake());
    blueberry3 = new Blueberry(new GenoiseCake());
    blueberry4 = new Blueberry(new PoundCake());
    blueberry5 = new Blueberry(new SpongeCake());
    blueberry6 = new Blueberry(blueberry1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Blueberry", blueberry1.getDescription());
    assertEquals("Chiffon Cake, Blueberry", blueberry2.getDescription());
    assertEquals("Genoise Cake, Blueberry", blueberry3.getDescription());
    assertEquals("Pound Cake, Blueberry", blueberry4.getDescription());
    assertEquals("Sponge Cake, Blueberry", blueberry5.getDescription());
    assertEquals("Butter Cake, Blueberry, Blueberry", blueberry6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.98, blueberry1.getPrice(), 0.01);
    assertEquals(6.58, blueberry2.getPrice(), 0.01);
    assertEquals(7.48, blueberry3.getPrice(), 0.01);
    assertEquals(7.48, blueberry4.getPrice(), 0.01);
    assertEquals(7.98, blueberry5.getPrice(), 0.01);
    assertEquals(8.97, blueberry6.getPrice(), 0.01);
  }
}

