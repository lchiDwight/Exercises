import java.util.Scanner;

public class PaintCalculator {

    public static void calculatePaint(){
        Scanner dataInput = new Scanner(System.in);
        System.out.println("What is length of the ceiling?");
        int length,width;
        if(dataInput.hasNextInt()){
             length = Integer.parseInt(dataInput.nextLine());
        }else {
            System.out.println("must be an integer");
            return;
        }
        if(dataInput.hasNextInt()){
            System.out.println("What is the width of the ceiling?");
            width = Integer.parseInt(dataInput.nextLine());
        }else{
            return;
        }
        int areaOfCeiling = length * width;
        int paintNeeded = (int) Math.ceil((double)areaOfCeiling / 350 );
        System.out.println(areaOfCeiling / 350 );
        System.out.println("Your ceiling is "+areaOfCeiling +" square feet"+"you will need to purchase "+paintNeeded+
                " " + "of paint to " +"cover "+areaOfCeiling + "square feet");
    }

}
