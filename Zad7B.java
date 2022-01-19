// Zad7B1

import java.io.*;
import java.util.Scanner;

public class Zad7B {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj ilosc linijek: ");
            int n = scanner.nextInt();

            Writer out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Zad7out.txt"), "Cp1250"));

            for (int i = 0; i<=n;i++){
                String content = scanner.nextLine();
                out.write(content);
                out.write("\n");
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}