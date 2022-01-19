// Zad2B2 - insertionsort

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Algortym4{
    void sortowanie(String filename){
        ArrayList<Integer> dane = new ArrayList<Integer>();
        try {
            Scanner scannerin = new Scanner(new File(filename));
            while (scannerin.hasNextLine()) {
                dane.add(scannerin.nextInt());
            }
            int[] danetablica = new int[dane.size()];
            for (int i = 0; i<dane.size();i++){
                danetablica[i] = dane.get(i);
            }

            sort(danetablica);

            for (int n = 0; n<danetablica.length;n++) {
                System.out.println(danetablica[n]);
            }

            scannerin.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

public class Zad2B2 {
    public static void main(String[] args) {
        Algortym a1 = new Algortym();
        a1.sortowanie("Zad2in.txt");
    }
}
