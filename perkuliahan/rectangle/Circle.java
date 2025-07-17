public class Circle extends Shape {
  private double radius;

  // Konstruktor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Implementasi method menghitung luas
  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  // Implementasi method menghitung keliling
  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}
