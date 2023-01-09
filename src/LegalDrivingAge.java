import java.util.Scanner;

public class LegalDrivingAge {

    public void legalDriving(){
        System.out.println("What is your age?");
        Scanner ageInput = new Scanner(System.in);
        String dataType = ageInput.nextLine().getClass().getSimpleName();

        System.out.println(dataType);

        if(dataType.equals("Integer")){

            int age = ageInput.nextInt();
            System.out.println(dataType);
            String conclusion = age >15? "You are old enough to drive":"You are not old enough to drive";
            System.out.println(conclusion);
        }else{
            System.out.println("Please enter a valid number");
        }
//

    }

}
