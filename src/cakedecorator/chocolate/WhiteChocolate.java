package cakedecorator.chocolate;

import cake.Cake;

/**
 * This is a class represents the WhiteChocolate. It extends all the operations mandated by the
 * Chocolate class.
 */
public class WhiteChocolate extends Chocolate {

  /**
   * Constructs a WhiteChocolate class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public WhiteChocolate(Cake cake) {
    super(cake);
    this.price = 1.69;
  }

  @Override public String getDescription() {
    return cake.getDescription() + ", White Chocolate";
  }
}
