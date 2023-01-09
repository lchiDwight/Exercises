import java.lang.Math.*;

public class MathClass {
    public static void doRandom(int base,int start,int end){
        int randomNum = (int)(Math.random()*(start+1))+(end-start);

        System.out.println(randomNum);
    }
}
