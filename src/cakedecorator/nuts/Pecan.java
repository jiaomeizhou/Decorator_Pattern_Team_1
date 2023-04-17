package cakedecorator.nuts;

import cake.Cake;

/**
 * This is a class represents the Pecan. It extends all the operations mandated by the
 * Nut class.
 */
public class Pecan extends Nut {

  /**
   * Constructs a Pecan class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Pecan(Cake cake) {
    super(cake);
    this.price = 1.49;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Pecan";
  }
}
