import java.util.Scanner;

public class ComputingInterest {

    public static double processData(Scanner inputData,String question){
        System.out.println(question);
        if(inputData.hasNextDouble()){
            return inputData.nextDouble();
        }else{
            System.out.println("must be numeric");
            System.exit(-1);
            return -1;
        }
    }
    public static void computeInterest(){
        Scanner dataInput = new Scanner(System.in);

        double principalAmount = processData(dataInput,"Enter the principal amount:");

        double interest = processData(dataInput,"Enter the rate of interest: ");

        double years = processData(dataInput,"Enter the number of years");

        double totalAmount = principalAmount + principalAmount*(interest/100)*4;

        System.out.println("After "+ years + " at "+ interest+ ", the investment will be worth $"+ totalAmount );
    }
}
