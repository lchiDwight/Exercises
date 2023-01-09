import java.util.Scanner;

public class BMICalculator {

//    bmi = (weight / (height × height)) * 703
    private static double checkData(Scanner input, String question){
        System.out.println(question);

        if(input.hasNextDouble()){
            return input.nextDouble();
        }else{
            System.out.println("must be numeric");
            System.exit(0);
            return -1;
        }
    }

    public static void calculateBmi(){

        Scanner dataInput = new Scanner(System.in);

        double weight = checkData(dataInput,"Your weight");
        double height = checkData(dataInput,"Your height")/100;

        double bmi = Math.round(weight/(height*height));

        System.out.println("Your bmi is : "+bmi);

        if(bmi > 18.5 && bmi < 25){
            System.out.println("You are within the ideal weight range");
        }else if(bmi <18.5){
            System.out.println("you are underweight");
        }else {
            System.out.println("You are overweight");
        }
    }

}
