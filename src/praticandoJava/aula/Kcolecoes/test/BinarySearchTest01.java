package praticandoJava.aula.Kcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(25);
        numbers.add(60);
        numbers.add(9);
        // (- (ponto de inserção) -1)
        // index 0, 1, 2, 3
        // value 9, 25, 60, 78
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 0));
    }
}
