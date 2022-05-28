package day61.lists;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //LIFO : Last in - First out
        Stack<String> kitaplar=new Stack<>();
        kitaplar.push("Kitap 1");
        kitaplar.push("Kitap 2");
        kitaplar.push("Kitap 3");

        System.out.println("Sıfıncı : "+kitaplar.get(0));
        System.out.println("En üstteki kitap hangisidir? : "+kitaplar.peek());

        String pop = kitaplar.pop();

        System.out.println("En üstteki kitap hangisidir? : "+kitaplar.peek());

        kitaplar.pop();

        System.out.println("En üstteki kitap hangisidir? : "+kitaplar.peek());

        kitaplar.push("Kitap 4");

        int size = kitaplar.size();
        System.out.println("Kitap adedi : "+size);
        System.out.println("En üstteki kitap hangisidir? : "+kitaplar.peek());

        String pop1 = kitaplar.pop();
        System.out.println("Aldığım kitap : "+pop1);
        System.out.println(kitaplar);
    }
}
