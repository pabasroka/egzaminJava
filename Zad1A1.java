// Zad1A1
import java.util.Scanner;

public class Zad1A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj krawedz podstawy");
            double a = scanner.nextDouble();

            System.out.println("Podaj wysokość");
            double h = scanner.nextDouble();

            if (a <= 0 || h <= 0){
                throw new Exception("Podales zle wartosci");
            }
            else {
                System.out.println("Pole powierzchni bocznej: "+(4*h*a));
                System.out.println("Objetosc: "+(h*a*a));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}