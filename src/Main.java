 public class Main { public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        } else { System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия"); }

            // Task 2
            System.out.println("Task 2");
            int temperature = 4;
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + " градуса, то можно идти без шапки"); }

                // Task 3
                System.out.println("Task 3");
                int speed = 90;
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
                    } else {
                    System.out.println("Если скорость " + speed + " ,то можно ездить спокойно"); }

                    //Task 4
                    System.out.println("Task 4");
                age = 10;
                if (age >=2 && age <=6) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад"); }
                    if (age >=7 && age <=17) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу"); }
                    if (age >=18 && age <=24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет"); }
                    if (age >24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу"); }

                    //Task 5
        System.out.println("Task 5");
                    age = 12;
                    if (age < 5) {
                        System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе"); }
                    if (age >= 5 && age < 14) {
                        System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождение"); }
                    if (age > 14) {
                        System.out.println("Если возраст ребенка равен " + age + ", то можно кататься на аттракционе без сопровождения взрослого"); }

                    //Task 6
        System.out.println("Task 6");
                    int places = 102;
                    int sitPlaces = 60;
                    int people = 61;
                    if (people < sitPlaces) {
                        System.out.println("В вагоне есть сидячие места"); }
                    if (people >= sitPlaces && people < places) {
                        System.out.println("В вагоне есть стоячие места"); }
                    if (people >= places) {
                        System.out.println("В вагоне нет мест"); }

                    //Task 7
        System.out.println("Task 7");
        int one = 70;
        int two = 14;
        int three = 27;
        if (one >= two && one >= three) {
            System.out.println("Максимальное число в переменной one " + one);
        } else  {
            if (two >= three) {
                System.out.println("Максимальное число в переменной two " + two);
            } else {
                System.out.println("Максимальное число переменной three " + three);}
        }
        }
        }




