
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radious of the circle : ");
        double rad = scanner.nextDouble();
        double pi = 3.14;
        double area = pi * ( rad * rad);

        System.out.println("Area of circle is :"+area);

    }
}
