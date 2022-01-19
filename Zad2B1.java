// Zad2B1 - quicksort

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Algortym3{
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

            quickSort(danetablica, 0, danetablica.length-1);

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

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}

public class Zad2B1 {
    public static void main(String[] args) {
        Algortym a1 = new Algortym();
        a1.sortowanie("Zad2in.txt");
    }
}
