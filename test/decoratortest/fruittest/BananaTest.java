package decoratortest.fruittest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.fruits.Banana;
import cakedecorator.fruits.Fruit;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Banana.
 */
public class BananaTest {
  private Fruit banana1;
  private Fruit banana2;
  private Fruit banana3;
  private Fruit banana4;
  private Fruit banana5;
  private Fruit banana6;


  /**
   * set up some objects of Banana.
   */
  @Before
  public void setUp() {
    banana1 = new Banana(new ButterCake());
    banana2 = new Banana(new ChiffonCake());
    banana3 = new Banana(new GenoiseCake());
    banana4 = new Banana(new PoundCake());
    banana5 = new Banana(new SpongeCake());
    banana6 = new Banana(banana1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Banana", banana1.getDescription());
    assertEquals("Chiffon Cake, Banana", banana2.getDescription());
    assertEquals("Genoise Cake, Banana", banana3.getDescription());
    assertEquals("Pound Cake, Banana", banana4.getDescription());
    assertEquals("Sponge Cake, Banana", banana5.getDescription());
    assertEquals("Butter Cake, Banana, Banana", banana6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(5.68, banana1.getPrice(), 0.01);
    assertEquals(5.28, banana2.getPrice(), 0.01);
    assertEquals(6.18, banana3.getPrice(), 0.01);
    assertEquals(6.18, banana4.getPrice(), 0.01);
    assertEquals(6.68, banana5.getPrice(), 0.01);
    assertEquals(6.37, banana6.getPrice(), 0.01);
  }
}
