package lesson8;

import java.util.HashMap;
import java.util.HashSet;

public class WordArray {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "monkey", "cat", "hamster", "dog", "cat", "horse", "hamster", "monkey", "fox"};

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Уникальные слова:");
        for (String word : new HashSet<>(wordCount.keySet())) {
            System.out.println(word);
        }
        System.out.println("Каждое слово встречается столько раз:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}


