import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(); // Создаем пустой список и резервируем память под него

        fillArrayList(nums, 10);// заполняем список любыми значениями
        System.out.print("Исходный список: ");
        printArr(nums);
        System.out.println("");

        int minValue = Collections.min(nums); // получаем минимально значение с помощью библиотеки Collections
        System.out.println("Минимально значение списка: " + minValue);

        int maxValue = Collections.max(nums); // получаем максимальное значение с помощью библиотеки Collections
        System.out.println("Максимально значение списка: " + maxValue);

        int sumList = nums.stream().mapToInt(Integer::intValue).sum(); // получаем сумму всех элементов списка
        int average = sumList / 10; // получаем среднее арифметическое
        System.out.println("Среднее арифметическое значение списка: " + average);

    }

    public static void fillArrayList(ArrayList<Integer> nums, int size) { // метод заполнения списка
        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * 100));
        }
    }

    public static void printArr(ArrayList<Integer> nums) { // метод вывода в консоль
        for (int item : nums) {
            System.out.printf("%d ", item);
        }
    }
}
