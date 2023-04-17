package cake;

/**
 * This is an abstract class represents the Cake. A cake has description and price.
 */
public abstract class Cake {
  protected String description = "";
  protected double price;

  /**
   * Get the description of this cake.
   *
   * @return the description of this cake.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Get the price of this cake.
   *
   * @return the price of this cake.
   */
  public double getPrice() {
    return price;
  }
}
