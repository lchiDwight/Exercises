import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length;i++){
            int smallestIndex = i;
            for(int j = i+1; j < array.length; j ++){
                if(array[smallestIndex] > array[j]){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
