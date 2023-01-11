public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int t = 10;
        if (t <= 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 29;
        boolean kindergarten = age >= 2 && age < 7;
        boolean school = age < 7 && age > 18;
        boolean university = age > 18 && age < 24;
        boolean work = age > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + " ,  то ему нужно ходить в детский сад");
        } else {
            if (school) {
                System.out.println("Если возраст человека равен " + age + " ,  то ему нужно ходить в  школу");
            } else {
                if (university) {
                    System.out.println("Если возраст человека равен " + age + " ,  то его место в университете");
                } else {
                    if (work) {
                        System.out.println("Если возраст человека равен " + age + " ,  то ему нужно ходить на работу");
                    }
                }
            }
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChildren = 13;
        boolean accompaniedByAnAdult = ageChildren > 5 && ageChildren < 14;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то ему нельзя кататься на аттракционе.");
        }
        if (!accompaniedByAnAdult) {
            System.out.println("если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракцирне в сопровождении взрослого.");
        } else {
            System.out.println("если возраст ребенка равен " + ageChildren + " и врослого нет , кататься нельзя.");
        }
        if (ageChildren > 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то  ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int carCapasity = 102;
        int seating = 60;
        int plase = 100;
        if (carCapasity < plase) {
            System.out.println("вагон уже полон");
        } else {
            if (seating > plase) {
                System.out.println("есть сидячие места");
            } else {
                System.out.println("есть стоячие места");
            }
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 54;
        int two = 564;
        int tree = 87;
        if (one >= two && one >= tree) {
            System.out.println("первое число наибольшее " + one);
        } else {
            if (two >= one && two >= tree) {
                System.out.println("второее число наибольшее " + two);
            } else {
                if (tree >= one && tree >= two) {
                    System.out.println("третье число наибольшее" + tree);
                }
            }
        }

    }

}