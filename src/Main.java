public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Целочисленный массив, заполненный тремя цифрами— 1, 2 и 3— с помощью
        // ключевого слова new.
        //и
    //  Массив, в котором можно хранить три дробных
        //  числа — 1.57, 7.654, 9.986.
        //  Массив сразу заполните значениями.
        int [] chisla = new int[3];
        chisla [0] = 1;
        chisla [1] = 2;
        chisla [2] = 3;
        System.out.println(chisla [0]);
        System.out.println(chisla [1]);
        System.out.println(chisla [2]);
        int chisloOne = chisla[0];
        int chisloTwo = chisla [1];
        int chisloThree = chisla [2];
        System.out.println(chisloOne);
        System.out.println(chisloTwo);
        System.out.println(chisloThree);
        double [] drobi = {1.57, 7.654, 9.986};
        System.out.println( drobi [0]);
        System.out.println(drobi [1]);
        System.out.println(drobi[2]);

        int [] box = {15,25,55,44};
        for (int i = 0;  i<box.length; i=i+1) {
            System.out.println(box [i]);

        }
        }






    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 2
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 2
    }
}