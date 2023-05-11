public class Cercle {
  private double rayon;
  private double x;
  private double y;
  
  public Cercle(double r, double xCoord, double yCoord) {
    rayon = r;
    x = xCoord;
    y = yCoord;
    System.out.println("YAY");
  }

  public double getRayon() {
    return rayon;
  }

  public void setRayon(double r) {
    rayon = r;
  }

  public double getX() {
    return x;
  }

  public void setX(double xCoord) {
    x = xCoord;
  }

  public double getY() {
    return y;
  }

  public void setY(double yCoord) {
    y = yCoord;
  }

  public double getArea() {
    return Math.PI * rayon * rayon;
  }

  public double getPerimeter() {
    return 2 * Math.PI * rayon;
  }
}

