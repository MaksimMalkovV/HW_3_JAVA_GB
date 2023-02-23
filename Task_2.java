import java.util.ArrayList;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(); // создаем список и резервируем память под него

        fillArrayList(nums, 10);// заполняет список рандомными значениями

        System.out.print("Исходный список: ");
        printArr(nums);// выводит в консоль исходный список
        System.out.println(""); // не знаю как сделать изящнее(

        deliteItem(nums); // удаляет четные значения из списка
        System.out.print("Cписок с удаленными чётными значениями: ");
        printArr(nums);// выводит полученный список

    }

    public static void deliteItem(ArrayList<Integer> nums) { // метод удаления
        for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext();) { // использовал итератор, подглядел что он може удать значения по индексам
            Integer item = iterator.next();
            if (item % 2 == 0) {
                System.out.println("Delite: " + item);// вывод какаие значения удалены
                iterator.remove();// собственно что он и делает
            }
        }
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
