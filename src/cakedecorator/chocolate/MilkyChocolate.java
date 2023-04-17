package cakedecorator.chocolate;

import cake.Cake;

/**
 * This is a class represents the MilkyChocolate. It extends all the operations mandated by the
 * Chocolate class.
 */
public class MilkyChocolate extends Chocolate {

  /**
   * Constructs a MilkyChocolate class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public MilkyChocolate(Cake cake) {
    super(cake);
    this.price = 0.99;
  }

  @Override public String getDescription() {
    return cake.getDescription() + ", Milk Chocolate";
  }

}
