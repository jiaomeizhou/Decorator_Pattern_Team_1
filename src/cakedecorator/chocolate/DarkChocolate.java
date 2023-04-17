package cakedecorator.chocolate;

import cake.Cake;

/**
 * This is a class represents the DarkChocolate. It extends all the operations mandated by the
 * Chocolate class.
 */
public class DarkChocolate extends Chocolate {

  /**
   * Constructs a DarkChocolate class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public DarkChocolate(Cake cake) {
    super(cake);
    this.price = 1.49;
  }

  @Override
  public String getDescription() {
    return cake.getDescription() + ", Dark Chocolate";
  }
}
