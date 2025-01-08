package lesson3;
public class Employee {
        String name;
        String position;
        String email;
        String phone_number;
        int salary;
        int age;

        public Employee(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }
        public void print(){
            System.out.println("name: "+name+ " position: "+position+ " email: "+email+ " phone number: "+phone_number+ " salary: "+salary+ " age: "+age);
        }
    public static void main(String[] args)  {
            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Иван Иванов", "Финансовый директор", "ivan1@mail.ru", "+375292567233", 5000, 60);
            persArray[1] = new Employee("Петр Петров", "Маркетолог", "pyotr2@mail.ru", "+375334659800", 2000, 50);
            persArray[2] = new Employee("Сидор Сидоров", "Менеджер по продажам", "sidor3@mail.ru", "+375292656734", 2500, 40);
            persArray[3] = new Employee("Василий Васильев", "Системный администратор", "vasily4@mail.ru", "+375291235678", 1800, 30);
            persArray[4] = new Employee("Павел Павлов", "Офис-менеджер", "pawel5@mail.ru", "+375335670985", 1500, 20);

            for (int i=0; i < persArray.length; i++)
                if (persArray[i].age > 40) persArray[i].print();

        }
    }
