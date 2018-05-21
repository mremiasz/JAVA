//Napisz program, który porównywałby dwa pliki leksykograficznie,
//zobacz https://en.wikipedia.org/wiki/Lexicographical_order.

import java.io.*;
import java.text.Collator;
import java.util.*;

public class zadanie {

    public static void main(String[] args) {

        try {
            String regex = "[ ,.:()!\\r\\n]";
            List<String> listaPlik1 = new ArrayList<>();
            List<String> listaPlik2 = new ArrayList<>();
            HashMap<String, Integer> podsumowanie1 = new HashMap<>();
            HashMap<String, Integer> podsumowanie2 = new HashMap<>();

            // scanner dla pliku1
            Scanner scFile1 = new Scanner(new File("plik1.txt")).useDelimiter(regex);
            while (scFile1.hasNext()) {
                //patrzy czy jest kolejna linia i ją wczytuje
                listaPlik1.add(scFile1.next());
            }
            scFile1.close();

            // scanner dla pliku2
            Scanner scFile2 = new Scanner(new File("plik2.txt")).useDelimiter(regex);
            while (scFile2.hasNext()) {
                //patrzy czy jest kolejna linia i ją wczytuje
                listaPlik2.add(scFile2.next());
            }
            scFile2.close();

            Collections.sort(listaPlik1, Collator.getInstance(new Locale("pl", "PL")));
            Collections.sort(listaPlik2, Collator.getInstance(new Locale("pl", "PL")));

            //usuwa pola gdzie string = ""
            while (listaPlik1.get(0).equals("")){
                listaPlik1.remove(0);
            }
            while (listaPlik2.get(0).equals("")){
                listaPlik2.remove(0);
            }

            File f1 = new File("plik1.txt");
            File f2 = new File("plik2.txt");
            System.out.println(f1.getName()+" zawiera "+listaPlik1.size()+" wyrazów.");
            System.out.println(f2.getName()+" zawiera "+listaPlik2.size()+" wyrazów.");

            if ((listaPlik1.isEmpty() && listaPlik2.isEmpty())||(Arrays.equals(listaPlik1.toArray(),listaPlik2.toArray()))) {

                System.out.println("Pliki tekstowe są równe.");
            } else {
                System.out.println("Pliki tekstowe są różne.");
            }
            //listaPlik1.stream().forEach(System.out::println);
            int counter = 0;

            //--------ta część zlicza ile jest wystąpień wyrazów rozpoczynających się na tą samą literę-----------------
            for (int j = 0; j<listaPlik1.size(); j++) {
                if (j==0) {
                    counter++;
                    podsumowanie1.put(String.valueOf(listaPlik1.get(j).toUpperCase().charAt(0)),counter);
                } else {
                    if (podsumowanie1.containsKey(String.valueOf(listaPlik1.get(j).toUpperCase().charAt(0)))) {
                        counter++;
                        podsumowanie1.put(String.valueOf(listaPlik1.get(j).toUpperCase().charAt(0)),counter);
                    } else {
                        counter = 1;
                        podsumowanie1.put(String.valueOf(listaPlik1.get(j).toUpperCase().charAt(0)),counter);
                    }
                }
            }
            //zliczenie wystąpień dla drugiego pliku -> listaPlik2
            counter = 0;
            for (int j = 0; j<listaPlik2.size(); j++) {
                if (j==0) {
                    counter++;
                    podsumowanie2.put(String.valueOf(listaPlik2.get(j).toUpperCase().charAt(0)),counter);
                } else {
                    if (podsumowanie2.containsKey(String.valueOf(listaPlik2.get(j).toUpperCase().charAt(0)))) {
                        counter++;
                        podsumowanie2.put(String.valueOf(listaPlik2.get(j).toUpperCase().charAt(0)),counter);
                    } else {
                        counter = 1;
                        podsumowanie2.put(String.valueOf(listaPlik2.get(j).toUpperCase().charAt(0)),counter);
                    }
                }
            }

            String alfabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ";
            int count1 =0;
            int count2 =0;
            for(int k = 0; k<alfabet.length();k++) {
                if (podsumowanie1.containsKey(String.valueOf(alfabet.charAt(k))) ){
                    System.out.println(String.valueOf(alfabet.charAt(k)));

                    System.out.print(f1.getName()+": ");
                    for (int i=0; podsumowanie1.get(String.valueOf(alfabet.charAt(k))) > i; i++){
                        if ( podsumowanie1.get(String.valueOf(alfabet.charAt(k))) > 2 && i < (podsumowanie1.get(String.valueOf(alfabet.charAt(k))) - 1)) {
                            System.out.print(listaPlik1.get(count1) + ", ");
                            count1++;
                        } else {
                            System.out.println(listaPlik1.get(count1));
                            count1++;
                        }
                    }

                    if (podsumowanie2.containsKey(String.valueOf(alfabet.charAt(k)))) {
                        System.out.print(f2.getName() + ": ");
                        for (int i=0; podsumowanie2.get(String.valueOf(alfabet.charAt(k))) > i; i++){
                            if ( podsumowanie2.get(String.valueOf(alfabet.charAt(k))) > 2 && i < (podsumowanie2.get(String.valueOf(alfabet.charAt(k))) - 1)) {
                                System.out.print(listaPlik2.get(count2) + ", ");
                                count2++;
                            } else {
                                System.out.println(listaPlik2.get(count2));
                                count2++;
                            }
                        }
                    } else {
                        System.out.println(f2.getName() + ": brak");
                    }
                } else if (podsumowanie2.containsKey(String.valueOf(alfabet.charAt(k))) && !podsumowanie1.containsKey(String.valueOf(alfabet.charAt(k)))){
                    System.out.println(alfabet.charAt(k));
                    System.out.print(f2.getName()+": ");
                    for (int i=0; podsumowanie2.get(String.valueOf(alfabet.charAt(k))) > i; i++){
                        if ( podsumowanie2.get(String.valueOf(alfabet.charAt(k))) > 2 && i < (podsumowanie2.get(String.valueOf(alfabet.charAt(k))) - 1)) {
                            System.out.print(listaPlik2.get(count2) + ", ");
                            count2++;
                        } else {
                            System.out.println(listaPlik2.get(count2));
                            count2++;
                        }
                    }
                    System.out.println(f1.getName() + ": brak");
                } else {
                    System.out.println(alfabet.charAt(k)+ ": brak");
                }
                System.out.println("-------------------------------------------------------------");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}