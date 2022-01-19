// Zad1B1
import java.util.Scanner;

public class Zad1B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj promień podstawy");
            double r = scanner.nextDouble();

            System.out.println("Podaj wysokość");
            double h = scanner.nextDouble();

            if (r <= 0 || h <= 0){
                throw new Exception("Podales zle wartosci");
            }
            else {
                System.out.println("Pole powierzchni bocznej: "+(Math.PI*r*h*2));
                System.out.println("Objetosc: "+(Math.PI*r*r*h));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
