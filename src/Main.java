import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        System.out.println(numbers[0]);
        numbers[1] = 2;
        System.out.println(numbers[1]);
        numbers[2] = 3;
        System.out.println(numbers[2]);

        double[] b = {1.57, 7.654, 9.986};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        double[] c = {10.5454, 80, 322};
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);


    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        double[] b = {1.57, 7.654, 9.986};
        System.out.println(b[0] + ", " + b[1] + ", " + b[2]);
        double[] c = {10.5454, 80, 322};
        System.out.println(c[0] + ", " + c[1] + ", " + c[2]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 1;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        double[] b = {9.986, 7.654, 1.57};
        System.out.println(b[0] + ", " + b[1] + ", " + b[2]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 1; i < 12; i++) {
            if (i % 2 != 0) ;
            else
                System.out.println(i);
        }


    }
}