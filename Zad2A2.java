// Zad2A2 - bubblesort

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Algortym2{
    void sortowanie(String filename){
        ArrayList<Integer> dane = new ArrayList<>();
        try {
            Scanner scannerin = new Scanner(new File(filename));
            while (scannerin.hasNextLine()) {
                dane.add(scannerin.nextInt());
            }
            int[] danetablica = new int[dane.size()];
            for (int i = 0; i<dane.size();i++){
                danetablica[i] = dane.get(i);
            }

            bubbleSort(danetablica);

            PrintWriter printWriter = new PrintWriter(new FileWriter("Zad2out.txt"));
            for (int n = 0; n<danetablica.length;n++) {
                printWriter.println(danetablica[n]);
            }

            scannerin.close();
            printWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}

public class Zad2A2 {
    public static void main(String[] args) {
        Algortym2 a1 = new Algortym2();
        a1.sortowanie("Zad2in.txt");
    }
}