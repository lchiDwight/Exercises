import java.util.Scanner;

public class TemperatureConverter {

    public static void convertTemperature(){
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        String tempType = input.nextLine().toUpperCase();

        if(tempType.equals("F")){
            System.out.println("Please enter the temperature in Celsius");
            double tempNumber = input.nextDouble();
            double outputF = Math.round(tempNumber * 9/5 + 32);
            System.out.println("The temperature in Fahrenheit is "+outputF);
        }else if(tempType.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit");
            double tempNumber = input.nextDouble();
            double outputC =  Math.round((tempNumber -32) * 5/9);
            System.out.println("The temperature in Celsius is "+outputC);
        }
    }

    public static void CtoF(){

    }
}
