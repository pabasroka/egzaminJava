// Zad7A1

import java.io.*;

public class Zad7A {
    public static void main(String[] args) {
        try {
            String content;
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Zad7in.txt"), "Cp1250"));
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
