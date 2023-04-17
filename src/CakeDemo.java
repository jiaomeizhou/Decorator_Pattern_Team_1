import cake.ButterCake;
import cake.Cake;
import cake.ChiffonCake;
import cake.GenoiseCake;
import cake.SpongeCake;
import cakedecorator.chocolate.DarkChocolate;
import cakedecorator.chocolate.MilkyChocolate;
import cakedecorator.chocolate.WhiteChocolate;
import cakedecorator.fruits.Blueberry;
import cakedecorator.fruits.Cherry;
import cakedecorator.fruits.Strawberry;
import cakedecorator.nuts.Almond;
import cakedecorator.nuts.Cashew;
import cakedecorator.nuts.Pecan;

/**
 * Demonstrate how to add decorator items to a cake and calculate the final price.
 */
public class CakeDemo {
  /**
   * Constructor.
   * @param args not used
   */
  public static void main(String[] args) {
    //create first cake
    Cake cake1 = new ButterCake();
    System.out.println(cake1.getDescription() + " $ " + String.format("%.2f", cake1.getPrice()));

    //create second cake
    Cake cake2 = new ChiffonCake();
    cake2 = new DarkChocolate(cake2);
    cake2 = new Cherry(cake2);
    cake2 = new Almond(cake2);
    System.out.println(cake2.getDescription() + " $ " + String.format("%.2f", cake2.getPrice()));

    //create third cake
    Cake cake3 = new GenoiseCake();
    cake3 = new MilkyChocolate(cake3);
    cake3 = new Blueberry(cake3);
    cake3 = new Cashew(cake3);
    cake3 = new Blueberry(cake3);
    System.out.println(cake3.getDescription() + " $ " + String.format("%.2f", cake3.getPrice()));


    //create fourth cake
    Cake cake4 = new SpongeCake();
    cake4 = new WhiteChocolate(cake4);
    cake4 = new Strawberry(cake4);
    cake4 = new Strawberry(cake4);
    cake4 = new Pecan(cake4);
    System.out.println(cake4.getDescription() + " $ " + String.format("%.2f", cake4.getPrice()));

  }
}
