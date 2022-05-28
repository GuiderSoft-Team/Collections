package day61.task;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<Sanatci> sanatcilar=new ArrayList<>(
                Arrays.asList(
                        new Sanatci("Şener Şen", 73),
                        new Sanatci("Kemal Sunal", 82),
                        new Sanatci("Filiz Akın", 116),
                        new Sanatci("Fatma Girik", 180),
                        new Sanatci("Kadir İnanır", 182),
                        new Sanatci("Hülya Koçyiğit", 200),
                        new Sanatci("Sadri Alışık", 209),
                        new Sanatci("Münir Özkul", 215),
                        new Sanatci("Türkan Şoray", 222),
                        new Sanatci("Ali Şen", 290),
                        new Sanatci("Cüneyt Arkın", 400),
                        new Sanatci("Hulusi Kentmen", 500),
                        new Sanatci("Erol Taş", 600),
                        new Sanatci("Gülşen Bubikoğlu", 50),
                        new Sanatci("Ediz Hun", 130),
                        new Sanatci("Adile Naşit", 300),
                        new Sanatci("Tarık Akan", 111)
                )
        );

        //System.out.println("Sanaçı adedi : "+sanatcilar.size());
        System.out.println("Sanatçı adedi : "+ sanatcilar.stream().count());

        long count = sanatcilar.stream()
                .filter(item -> item.filmAdedi() < 100).count();
        System.out.println("100'den az filmi olan sanatçı adedi : "+count);

        List<Sanatci> list = sanatcilar.stream()
                .filter(item -> item.filmAdedi() < 100).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println();

        sanatcilar.stream()
                .sorted(Comparator.comparing(Sanatci::isim, Collator.getInstance()))
                .forEach(System.out::println);

        Sanatci sanatci = sanatcilar.stream()
                .max(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println("En çok filmi olan Sanatçı : "+sanatci);

        Sanatci sanatci1 = sanatcilar.stream()
                .min(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println("En az filmi olan Sanatçı : "+sanatci1);

        double ortalama = sanatcilar.stream()
                .mapToDouble(Sanatci::filmAdedi).average().getAsDouble();
        System.out.println("Ortalama : "+ortalama);
    }
}

record Sanatci(String isim, int filmAdedi){}
