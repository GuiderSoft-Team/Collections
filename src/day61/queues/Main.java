package day61.queues;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //FIFO : First in - First out
        Queue<String> printer=new LinkedList<>();
        printer.offer("Sayfa 1");
        printer.offer("Sayfa 2");
        printer.offer("Sayfa 3");

        System.out.println("İlk bastırılacak sayfa : "+printer.peek());
/*        String sayfa = printer.poll();
        System.out.println(sayfa+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");*/

        printer.stream().sorted(Comparator.comparing(Object::toString).reversed()).forEach(System.out::println);

    }
}
