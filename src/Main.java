import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();
            double height = scanner.nextDouble();
            Parallelepiped parallelepiped = new Parallelepiped(width, length, height);
            System.out.println(parallelepiped);

            System.out.println("Area : " + parallelepiped.area());
            System.out.println("Volume : " + parallelepiped.volume());

        } catch (InputMismatchException e) {
            System.out.println("Только числа!!");
        } catch (Exception e) {
            System.out.println("Число меньше нуля или больше 20");
        }
    }
}