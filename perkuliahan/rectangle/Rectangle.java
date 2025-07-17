public class Rectangle extends Shape {
  private double panjang;
  private double lebar;

  // Konstruktor tanpa parameter (default)
  public Rectangle() {
    panjang = 1;
    lebar = 1;
  }

  // Konstruktor dengan parameter
  public Rectangle(double length, double width) {
    this.panjang = length;
    this.lebar = width;
  }

  // Getter untuk melihat nilai
  public double getPanjang() {
    return panjang;
  }

  public double getLebar() {
    return lebar;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (panjang + lebar);
  }

  @Override
  public double calculateArea() {
    return panjang * lebar;
  }
}