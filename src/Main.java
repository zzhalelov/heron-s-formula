import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите через Enter значения сторон треугольника");

        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();

        SquareOfTriangle sq = new SquareOfTriangle(side1, side2, side3);
        sq.SquareTriangle(side1, side2, side3);
    }
}