package cakedecorator.nuts;

import cake.Cake;
import cakedecorator.Decorator;

/**
 * This is an abstract class represents the Decorator Nut. It extends all the operations
 * mandated by the Decorator class. It has cake.
 */
public abstract class Nut extends Decorator {
  Cake cake;

  /**
   * Constructs a Nut class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Nut(Cake cake) {
    this.cake = cake;
  }

  @Override public String getDescription() {
    return super.getDescription();
  }

  @Override public double getPrice() {
    return this.cake.getPrice() + this.price;
  }
}
