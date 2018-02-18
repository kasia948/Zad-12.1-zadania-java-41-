import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Numbers {
    public static void main(String[] args) {
        Random rand = new Random();

        TreeSet<Integer> zbior = new TreeSet<>();

        for (int i = 0; i < 50; i++) {
            zbior.add(rand.nextInt(1000));
        }

        System.out.println(zbior.size());
        System.out.println(zbior.toString());

        System.out.println("Największa liczba zbioru to " + zbior.first());
        System.out.println("Najmniejsza liczba zbioru to " + zbior.last());

        Iterator <Integer> numIterator = zbior.iterator();
        int sum = 0;
        while (numIterator.hasNext()) {
            sum = sum + numIterator.next();
        }
        System.out.println("Suma wszystkich elementów zbioru to " + sum);

        double average=sum/50;
        while (numIterator.hasNext()) {
            int liczba= numIterator.next();
            if (liczba>average){
                System.out.print(liczba+", ");
            }
        }
    }
}
