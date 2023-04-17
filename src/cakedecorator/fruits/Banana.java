package cakedecorator.fruits;

import cake.Cake;

/**
 * This is a class represents the Banana. It extends all the operations mandated by the
 * Fruit class.
 */
public class Banana extends Fruit {

  /**
   * Constructs a Banana class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Banana(Cake cake) {
    super(cake);
    this.price = 0.69;
  }

  @Override public String getDescription() {
    return cake.getDescription() + ", Banana";
  }
}
