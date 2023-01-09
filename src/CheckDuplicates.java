import java.util.ArrayList;

public class CheckDuplicates {

    public static void nestedLoopCheck(int[] array){

        ArrayList<Integer> duplicatedNums = new ArrayList<Integer>();

        for(int i = 0;i<array.length;i++){
            for(int j = 0;j < array.length;j++){
                if(array[i]==array[j] && i != j){
                    duplicatedNums.add(i);
                }
            }
        }
        System.out.println(duplicatedNums.toString());;
    }

    public static void linearCheck(int[] array){

    }
}
