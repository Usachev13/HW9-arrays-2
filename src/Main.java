public class Main {
    public static void main(String[] args) {

        System.out.println("HW9 arrays2 starts!");
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    /* task1 */
    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
       for (final int current : arr){
           total += current;
       }
        System.out.println("Сумма трат за месяц составит: " + total);
    }
}