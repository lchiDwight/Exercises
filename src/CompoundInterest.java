import java.util.Scanner;

public class CompoundInterest {

    private static double processDouble(Scanner dataInput, String question){
        System.out.println(question);
        if(dataInput.hasNextDouble()){
            return dataInput.nextDouble();
        }else{
            System.exit(0);
            return -1;
        }
    }

    private static int processInt(Scanner dataInput, String question){
        System.out.println(question);
        if(dataInput.hasNextInt()){
            return dataInput.nextInt();
        }else{
            System.exit(0);
            return -1;
        }
    }

    public static void calculateCompound(){
        Scanner inputData = new Scanner(System.in);
        System.out.println();

        double principalAmount = processDouble(inputData,"what is the principal amount?");

        double rate = processDouble(inputData,"what is the rate?")/100;

        int numOfYears = processInt(inputData,"Number of years?");

        int compoundTimes = processInt(inputData,"What is the number of times the interest is compounded per year?");

        double endAmount = Math.pow(1+rate/compoundTimes,compoundTimes*numOfYears) * principalAmount;
        double formattedAmount = Math.round(endAmount);

        System.out.println(principalAmount +" invested at "+rate+ " for "+ numOfYears+" years compounded "+compoundTimes+
                " times per year is $"+formattedAmount);
    }
}
