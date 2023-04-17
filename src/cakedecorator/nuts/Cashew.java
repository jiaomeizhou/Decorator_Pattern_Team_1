package cakedecorator.nuts;

import cake.Cake;

/**
 * This is a class represents the Cashew. It extends all the operations mandated by the
 * Nut class.
 */
public class Cashew extends Nut {

  /**
   * Constructs a Cashew class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Cashew(Cake cake) {
    super(cake);
    this.price = 1.39;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Cashew";
  }
}
