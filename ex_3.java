//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex_3 {
    public static void main(String[] args) {
        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 100, 7, 8, 9, 10));
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.print("\n");
        int max = Collections.max(array);
        System.out.println("Максимум списка = " + max);
        int min = Collections.min(array);
        System.out.println("Минимум списка = " + min);
        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
            
        }
        //System.out.println(sum);
        //System.out.println(array.size());
        average = sum / array.size();
        System.out.println("Среднее арифметическое = " + average);

    }
}
