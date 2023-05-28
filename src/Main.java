public class Main {
    public static void main(String[] args) {

        System.out.println("HW9 arrays2 starts!");
        task1();
        task2();
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
       for (int current : arr){
           total += current;
       }
        System.out.println("Сумма трат за месяц составит: " + total);
    }

    /* task2 */
    public static void task2() {
        int[] arr = generateRandomArray();
        int minAmount = 200_001;
        int maxAmount = -1;
        for (int current : arr){
            if (current > maxAmount){
                maxAmount = current;
            } else if (current < minAmount) {
                minAmount = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxAmount + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей");

    }
}