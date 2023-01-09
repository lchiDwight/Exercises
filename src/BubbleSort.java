import java.util.Arrays;

public class BubbleSort {

    public static void whileForSort(int[] array){

        int lastSortedIndex = array.length-1;
        boolean isSorted  = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < lastSortedIndex; i ++){
                if(array[i]> array[i+1]){
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            lastSortedIndex = lastSortedIndex -1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void doubleForLoops(int[] array){
        for(int i = 0; i < array.length; i ++){
            for(int j = i+1; j < array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
