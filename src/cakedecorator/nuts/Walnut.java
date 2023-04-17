package cakedecorator.nuts;

import cake.Cake;

/**
 * This is a class represents the Walnut. It extends all the operations mandated by the
 * Nut class.
 */
public class Walnut extends Nut {

  /**
   * Constructs a Walnut class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Walnut(Cake cake) {
    super(cake);
    this.price = 1.19;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Walnut";
  }
}
