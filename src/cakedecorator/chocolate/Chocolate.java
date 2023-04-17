package cakedecorator.chocolate;

import cake.Cake;
import cakedecorator.Decorator;

/**
 * This is an abstract class represents the Decorator Chocolate. It extends all the operations
 * mandated by the Decorator class. It has cake.
 */
public abstract class Chocolate extends Decorator {
  protected Cake cake;

  /**
   * Constructs a Chocolate class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Chocolate(Cake cake) {
    this.cake = cake;
  }

  @Override public String getDescription() {
    return super.getDescription();
  }

  @Override public double getPrice() {
    return (this.cake.getPrice() + this.price);
  }
}
