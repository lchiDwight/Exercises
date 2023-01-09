import java.util.Scanner;

public class NumberToMonth {
    private static int processData(Scanner input, String question){
        System.out.println(question);
        if(input.hasNextInt()){
            return input.nextInt();
        }else{
            System.out.println("invalid input, needs to be numeric");
            System.exit(-1);
            return -1;
        }
    }
    public static void getMonthName(){
        Scanner dataInput = new Scanner(System.in);
        int monthNumber = processData(dataInput,"Please enter the number of the month: ")-1;
        if(monthNumber>11 || monthNumber <0){
            System.out.println("Invalid input");
            return;
        }
        String[] months = {"January","February","March","April","May","June","July","August","September","October",
                "November","December"};

        System.out.println("The name of the month is "+months[monthNumber]);

    }



}
