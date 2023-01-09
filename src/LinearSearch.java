public class LinearSearch {

    public static void linearSearch(int target, int[] array){

        for(int i = 0; i < array.length;i++){
            if (array[i] == target){

                System.out.println("Found it at index of: "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}
