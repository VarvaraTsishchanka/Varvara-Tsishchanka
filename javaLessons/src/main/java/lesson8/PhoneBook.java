package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private final HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сидоров", "642-951-004");
        phoneBook.add("Кузнецов", "805-174-368");
        phoneBook.add("Сидоров", "206-557-921");

        System.out.println("Телефоны Сидорова:");
        for (String phone : phoneBook.get("Сидоров")) {
            System.out.println(phone);
        }

        System.out.println("Телефоны Кузнецова:");
        for (String phone : phoneBook.get("Кузнецов")) {
            System.out.println(phone);
        }
    }
}

