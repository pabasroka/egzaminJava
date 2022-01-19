// Zad2A1 - mergesort

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Algortym{
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

            mergeSort(danetablica, danetablica.length);

            for (int n = 0; n<danetablica.length;n++) {
                System.out.println(danetablica[n]);
            }
            scannerin.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}

public class Zad2A1 {
    public static void main(String[] args) {
        Algortym2 a1 = new Algortym2();
        a1.sortowanie("Zad2in.txt");
    }
}