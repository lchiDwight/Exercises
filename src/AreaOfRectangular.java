import java.util.Scanner;

public class AreaOfRectangular {
    public static final double conversionFactor = 0.09290304;

    public static void calculateArea(){

        Scanner dataInput = new Scanner(System.in);
        int length,width;
        System.out.println("What is the length of the room in feet?");

        if(dataInput.hasNextInt()){
            length = Integer.parseInt(dataInput.nextLine());
        }else{
            System.out.println("Must be a numeric");
            return;
        }
        System.out.println("What is the width of the room in feet");

        if(dataInput.hasNextInt()){
             width = Integer.parseInt(dataInput.nextLine());
        }else{
            System.out.println("Must be a numeric");
            return;
        }

        double areaFeet = Math.round(length * width);
        double areaMetric = Math.round(areaFeet*conversionFactor);

        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet");
        System.out.println("The are is "+ areaFeet +" feet" +"\n" + areaMetric +" square " +
                "meters");
    }
}
