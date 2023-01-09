import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void calculateAlcohol(){
        Scanner  infoInput = new Scanner(System.in);
        System.out.println("how much you drink in oz?");
        double consumptionAmount = infoInput.nextDouble();
        System.out.println("How much you weight?");
        double bodyWeight = infoInput.nextDouble();
        System.out.println("When did you last drink?");
        double timeAgo = infoInput.nextDouble();
        double TestResult = (consumptionAmount*5.14 / bodyWeight * 0.73)- 0.015*timeAgo;
        System.out.println("Alcohol consumed: "+consumptionAmount+", body weight: "+bodyWeight);
        System.out.println(TestResult);
        if(TestResult > 0.08){
            System.out.println("You had too much, don't drink");
        }

    }
}
