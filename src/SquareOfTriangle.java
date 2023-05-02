public class SquareOfTriangle {
    double side1;
    double side2;
    double side3;

    public SquareOfTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void SquareTriangle(double side1, double side2, double side3) {
        double p = ((side1 + side2 + side3) / 2);
        double square = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("Площадь треугольника равна:  " + square);
    }
}
