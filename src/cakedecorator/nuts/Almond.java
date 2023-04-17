package cakedecorator.nuts;

import cake.Cake;

/**
 * This is a class represents the Almond. It extends all the operations mandated by the
 * Nut class.
 */
public class Almond extends Nut {

  /**
   * Constructs an Almond class and initializes it to the given cake.
   *
   * @param cake the specified cake
   */
  public Almond(Cake cake) {
    super(cake);
    this.price = 1.29;
  }

  @Override public String getDescription() {
    return this.cake.getDescription() + ", Almond";
  }
}
