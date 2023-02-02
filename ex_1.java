//Реализуйте алгоритм сортировки слиянием

public class ex_1 {

    public static void main(String[] args) {
        int[] array = { 5, 4, 9, 8, 3, 10, 1, 2, 7, 6, 12, 100, 15,29};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[size - mid];
        for (int i = 0; i < mid; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int j = mid; j < size; j++) {
            rightHalf[j - mid] = inputArray[j];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
