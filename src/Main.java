public class Main {
    public static void main(String[] args) {

        System.out.println("HW9 arrays2 starts!");
        task1();
        task2();
        task3();
        task4();
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
        int minAmount = arr[0];
        int maxAmount = arr[0];
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

    /* task3 */
    public static void task3() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int current : arr){
            total += current;
        }
        float averageValue = (float) total / 30;
        System.out.println("Средняя сумма трат за месяц составит: " + averageValue);

    }

    /* task4 */

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int temp = reverseFullName.length - 1;
        while (temp >= 0){
                System.out.print(reverseFullName[temp]);
                temp--;
        }
    }
}