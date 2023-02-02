
//Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Arrays;

public class ex_2 {
    public static void main(String[] args) {
        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
