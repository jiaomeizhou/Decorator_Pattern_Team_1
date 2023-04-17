package cakedecorator.fruits;

import cake.Cake;

/**
 * This is a class represents the Strawberry. It extends all the operations mandated by the
 * Fruit class.
 */
public class Strawberry extends Fruit {

  /**
   * Constructs a Strawberry class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Strawberry(Cake cake) {
    super(cake);
    this.price = 1.59;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Strawberry";
  }
}
