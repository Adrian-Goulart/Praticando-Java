package praticandoJava.aula.Kcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayTest01 {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        Integer[] listToArray = numbersList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------------");
        Integer[] arrayNumbers = new Integer[3];
        arrayNumbers[0] = 1;
        arrayNumbers[1] = 2;
        arrayNumbers[2] = 3;

        List<Integer> arrayToList = Arrays.asList(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println(arrayToList);

        System.out.println("----------------");
        List<Integer> numsList = new ArrayList<>(Arrays.asList(arrayNumbers));
        numsList.add(18);
        System.out.println(numsList);

        List<String> stringList = Arrays.asList("LiSA", "AiNA THE END", "Creepy Nuts");
        List<Integer> integers = List.of(1, 2, 3);
    }
}
