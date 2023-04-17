package cakedecorator.fruits;

import cake.Cake;

/**
 * This is a class represents the Cherry. It extends all the operations mandated by the
 * Fruit class.
 */
public class Cherry extends Fruit {

  /**
   * Constructs a Cherry class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Cherry(Cake cake) {
    super(cake);
    this.price = 2.19;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Cherry";
  }
}
