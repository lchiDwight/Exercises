public class BinarySearch {

    public static int biSearch(int target, int[] numArray){
        int lowIndex = 0;
        int highIndex = numArray.length-1;

        while(lowIndex <= highIndex){
            int midIndex = (lowIndex+highIndex) /2;
            if(target == numArray[midIndex]){
                System.out.println("Found it at index of "+midIndex);
                return midIndex;
            }else if(target<numArray[midIndex]){
                highIndex = midIndex-1;
            }else{
                lowIndex = midIndex +1;
            }
        }
        System.out.println("Not found");
        return -1;

    }
}
