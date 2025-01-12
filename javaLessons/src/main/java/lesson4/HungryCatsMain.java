package lesson4;

import java.util.Scanner;

public class HungryCatsMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        HungryCat[] allHungryCats = new HungryCat[2];
        allHungryCats[0] = new HungryCat("Fluffy", 10, false);
        allHungryCats[1] = new HungryCat("Princess", 5, false);

        Plate plate = new Plate(30);
        plate.info();
        for (HungryCat allHungryCat : allHungryCats) {
            if (!allHungryCat.fullness && allHungryCat.appetite < plate.food) {
                allHungryCat.eat(plate);
                allHungryCat.fullness = true;
                System.out.println("Кот " + allHungryCat.name + " сыт");
            } else {
                System.out.println("Кот " + allHungryCat.name + " голоден");
            }
        }
        plate.info();
        System.out.println("Сколько корма добавить в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
