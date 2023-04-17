package decoratortest.fruittest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.fruits.Strawberry;
import cakedecorator.fruits.Fruit;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Strawberry.
 */
public class StrawberryTest {
  private Fruit strawberry1;
  private Fruit strawberry2;
  private Fruit strawberry3;
  private Fruit strawberry4;
  private Fruit strawberry5;
  private Fruit strawberry6;


  /**
   * set up some objects of Strawberry.
   */
  @Before
  public void setUp() {
    strawberry1 = new Strawberry(new ButterCake());
    strawberry2 = new Strawberry(new ChiffonCake());
    strawberry3 = new Strawberry(new GenoiseCake());
    strawberry4 = new Strawberry(new PoundCake());
    strawberry5 = new Strawberry(new SpongeCake());
    strawberry6 = new Strawberry(strawberry1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Strawberry", strawberry1.getDescription());
    assertEquals("Chiffon Cake, Strawberry", strawberry2.getDescription());
    assertEquals("Genoise Cake, Strawberry", strawberry3.getDescription());
    assertEquals("Pound Cake, Strawberry", strawberry4.getDescription());
    assertEquals("Sponge Cake, Strawberry", strawberry5.getDescription());
    assertEquals("Butter Cake, Strawberry, Strawberry", strawberry6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.58, strawberry1.getPrice(), 0.01);
    assertEquals(6.18, strawberry2.getPrice(), 0.01);
    assertEquals(7.08, strawberry3.getPrice(), 0.01);
    assertEquals(7.08, strawberry4.getPrice(), 0.01);
    assertEquals(7.58, strawberry5.getPrice(), 0.01);
    assertEquals(8.17, strawberry6.getPrice(), 0.01);
  }
}

