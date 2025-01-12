package lesson4;

public class Cat extends Animal{
    String name;
    static int countCat = 0;

    Cat (String name){
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name+ " cannot run more than 200 m");
        } else {
            System.out.println(name + " ran " + range + " m");
        }
    }

    @Override
    void swim(int range) {
        System.out.println(name+ " cannot swim");
    }

    static int getCountCat(){
        return countCat;
    }

}
