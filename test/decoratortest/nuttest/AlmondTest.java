package decoratortest.nuttest;

import static org.junit.Assert.assertEquals;

import cake.ButterCake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.PoundCake;
import cake.SpongeCake;
import cakedecorator.nuts.Almond;
import cakedecorator.nuts.Nut;
import org.junit.Before;
import org.junit.Test;

/**
 * These are Junit tests for Almond.
 */
public class AlmondTest {
  private Nut almond1;
  private Nut almond2;
  private Nut almond3;
  private Nut almond4;
  private Nut almond5;
  private Nut almond6;


  /**
   * set up some objects of Almond.
   */
  @Before
  public void setUp() {
    almond1 = new Almond(new ButterCake());
    almond2 = new Almond(new ChiffonCake());
    almond3 = new Almond(new GenoiseCake());
    almond4 = new Almond(new PoundCake());
    almond5 = new Almond(new SpongeCake());
    almond6 = new Almond(almond1);
  }

  /**
   * Test if getDescription() works as expected.
   */
  @Test
  public void testGetDescription() {
    assertEquals("Butter Cake, Almond", almond1.getDescription());
    assertEquals("Chiffon Cake, Almond", almond2.getDescription());
    assertEquals("Genoise Cake, Almond", almond3.getDescription());
    assertEquals("Pound Cake, Almond", almond4.getDescription());
    assertEquals("Sponge Cake, Almond", almond5.getDescription());
    assertEquals("Butter Cake, Almond, Almond", almond6.getDescription());
  }

  /**
   * Test if getDPrice() works as expected.
   */
  @Test
  public void testGetPrice() {
    assertEquals(6.28, almond1.getPrice(), 0.01);
    assertEquals(5.88, almond2.getPrice(), 0.01);
    assertEquals(6.78, almond3.getPrice(), 0.01);
    assertEquals(6.78, almond4.getPrice(), 0.01);
    assertEquals(7.28, almond5.getPrice(), 0.01);
    assertEquals(7.57, almond6.getPrice(), 0.01);
  }
}