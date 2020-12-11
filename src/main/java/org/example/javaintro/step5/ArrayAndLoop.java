package org.example.javaintro.step5;

public class ArrayAndLoop {
 // typ danych w pudełku    nazwa pudełka     przechowywane dane
    static String[]          names =        {"Lukasz","Piotr","Maciek","Jan","Agata"};

    public static void main(String[] args) {
        System.out.println("Pętla for each:");
//      pojedyńczy element : tablica
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("#############################");
        System.out.println("Pętlna for");

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("Kolejnny element z tablicy: "+ name+ ", indeks: "+i);
            // kolejny element z tablicy: Lukasz, indeks: 0
        }

        System.out.println("#############################");
        System.out.println("Pojedyńczczy element o indeksie 1: "+ names[1]);

    }
}
