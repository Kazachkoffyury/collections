package ru.skypro;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //getOddNumbers();
        //getEvenNumbers();
        //getUniqWords();
        getUniqWordsCount();


    }
    public static void getOddNumbers () {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsOdd = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int currentNumber = nums.get(i);
            if (currentNumber % 2 != 0) {
                numsOdd.add(currentNumber);
            }
        }
        System.out.println(numsOdd);
    }

    public static void getEvenNumbers() {
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsEven = new ArrayList<>();
        for (int i = 0; i < nums2.size(); i++) {
            int currentNumber = nums2.get(i);
            if (currentNumber % 2 == 0) {
                numsEven.add(currentNumber);
            }
        }
        Set<Integer> set = new HashSet<>(numsEven);
        numsEven.clear();
        numsEven.addAll(set);
        System.out.println(numsEven);
    }

    public static void getUniqWords() {
        List <String> words = Arrays.asList("tesla","bmw","skoda","tesla","toyota","mercedes","toyota");
        Set<String> uniqWords = new LinkedHashSet<>(words);
        System.out.println(uniqWords);
    }

    public static void getUniqWordsCount() {
        List <String> words = Arrays.asList("tesla","bmw","skoda","tesla","toyota","mercedes","toyota","toyota");
        Set<String> uniqWords = new LinkedHashSet<>(words);
        System.out.println(words.size()-uniqWords.size());
    }
}








