package cakedecorator.nuts;

import cake.Cake;

/**
 * This is a class represents the Pistachio. It extends all the operations mandated by the
 * Nut class.
 */
public class Pistachio extends Nut {

  /**
   * Constructs a Pistachio class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Pistachio(Cake cake) {
    super(cake);
    this.price = 1.79;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Pistachio";
  }
}
