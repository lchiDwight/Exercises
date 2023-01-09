import java.util.Scanner;

public class BankAccount {
    private String name;
    private final double balance = 1000;
    private String password = "1234$";

    public void checkBalance(){
        Scanner passWordInput = new Scanner(System.in);
        System.out.println("put your password");
        String  inputPassword = passWordInput.nextLine();

        if(inputPassword.equals(password)){
            System.out.println(this.balance);
        }else{
            System.out.println("Wrong password");
        }
    }
}
