package cakedecorator.fruits;

import cake.Cake;

/**
 * This is a class represents the Blueberry. It extends all the operations mandated by the
 * Fruit class.
 */
public class Blueberry extends Fruit {

  /**
   * Constructs a Blueberry class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Blueberry(Cake cake) {
    super(cake);
    this.price = 1.99;
  }

  @Override public String getDescription() {
    return cake.getDescription() + ", Blueberry";
  }
}
