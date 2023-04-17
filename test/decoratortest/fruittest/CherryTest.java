package decoratortest.fruittest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.fruits.Cherry;
import cakedecorator.fruits.Fruit;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Cherry.
 */
public class CherryTest {
  private Fruit cherry1;
  private Fruit cherry2;
  private Fruit cherry3;
  private Fruit cherry4;
  private Fruit cherry5;
  private Fruit cherry6;


  /**
   * set up some objects of Cherry.
   */
  @Before
  public void setUp() {
    cherry1 = new Cherry(new ButterCake());
    cherry2 = new Cherry(new ChiffonCake());
    cherry3 = new Cherry(new GenoiseCake());
    cherry4 = new Cherry(new PoundCake());
    cherry5 = new Cherry(new SpongeCake());
    cherry6 = new Cherry(cherry1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Cherry", cherry1.getDescription());
    assertEquals("Chiffon Cake, Cherry", cherry2.getDescription());
    assertEquals("Genoise Cake, Cherry", cherry3.getDescription());
    assertEquals("Pound Cake, Cherry", cherry4.getDescription());
    assertEquals("Sponge Cake, Cherry", cherry5.getDescription());
    assertEquals("Butter Cake, Cherry, Cherry", cherry6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(7.18, cherry1.getPrice(), 0.01);
    assertEquals(6.78, cherry2.getPrice(), 0.01);
    assertEquals(7.68, cherry3.getPrice(), 0.01);
    assertEquals(7.68, cherry4.getPrice(), 0.01);
    assertEquals(8.18, cherry5.getPrice(), 0.01);
    assertEquals(9.37, cherry6.getPrice(), 0.01);
  }
}

