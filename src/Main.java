import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] inputArray1 = {10876, 15021, 14826, 13990, 11121};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i : inputArray1) {
            sum += i;
        }
        for (int i : inputArray1) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : inputArray1) {
            if (min > i) {
                min = i;
            }
        }
        float middle = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, middle};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] inputArray2 = {7800, 5600, 8031, 9305, 6999};
        float[] outputArray2 = new float[5];
        int element = 0;
        for (float pay : inputArray2) {
            float tax = pay * 0.13f;
            outputArray2[element] = tax;
            element++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] inputArray3 = {3600, 5809, 4071, 6205, 3999};
        boolean[] outputArray3 = new boolean[5];
        int index = 0;
        for (int pay : inputArray3) {
            if (pay > 5000) {
                outputArray3[index] = true;
            } else {
                outputArray3[index] = false;
            }
            index++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
    }

    public static void task4() {
        System.out.println("Задача №4");
        int[] inputArray4 = {1200, 2103, 152, -627, 1006};
        boolean outputArray4 = true;
        for (int credit : inputArray4) {
            if (credit < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);
    }

    public static void task5() {
        System.out.println("Задача №5");
        int[] inputArray5 = {3100, 9103, 4152, 7627, -2006};
        boolean[] outputArray5 = new boolean[5];
        int index = 0;
        for (int pay : inputArray5) {
            if (pay > 0) {
                outputArray5[index] = true;
            } else {
                outputArray5[index] = false;
            }
            index++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}