
public class Square extends Rectangle {
  public Square(double side) {
    super(side, side);
  }

  public double getHeight() {
    return getPanjang(); 
  }

  public double getWidth() {
    return getLebar();
  }

  public double checkLuasArea() {
    return calculateArea();
  }
}