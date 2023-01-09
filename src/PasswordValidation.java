import java.util.Scanner;
public class PasswordValidation {

    public void validatePassword(){

        int inputCount = 0;
        System.out.println("Enter your password");
        while (inputCount<3){

            Scanner passwordInput = new Scanner(System.in);
            String password = passwordInput.nextLine();

            if(password.equals("123$5")){
                System.out.println("Welcome!");
                break;
            }else{
                System.out.println("Access Denied try again");
                inputCount ++;
            }

            if(inputCount>=3){
                System.out.println("too many attempt");
            }
        }
    }
}

