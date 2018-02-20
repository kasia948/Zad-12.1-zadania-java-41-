import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Numbers {
    public static void main(String[] args) {
        Random rand = new Random();

        TreeSet<Integer> zbior = new TreeSet<>();

        while (zbior.size()<50){
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

        Iterator <Integer> numIterator2 = zbior.iterator();
        double average=sum/50;
        while (numIterator2.hasNext()) {
            int liczba= numIterator2.next();
            if (liczba>average){
                System.out.print(liczba+", ");
            }
        }
    }
}
