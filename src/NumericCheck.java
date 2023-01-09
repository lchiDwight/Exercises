import java.util.Scanner;

public class NumericCheck {
    public static boolean scannerCheck(){

        Scanner strInput = new Scanner(System.in);
        System.out.println("Put in a number");
        String strNum = strInput.nextLine();


        if(strNum ==null){
            return false;
        }
        try{
            double d = Double.parseDouble(strNum);
        }catch (NumberFormatException error){
            System.out.println("not numeric");
            return false;
        }
        System.out.println("yes numeric");
        return true;
    }

    public static boolean functionCheck(String strNum){

        if(strNum == null){
            return false;
        }
        try{
            double d = Double.parseDouble(strNum);
        }catch (NumberFormatException error){
            System.out.println("Not numeric");
            return false;
        }
        System.out.println("Yes numeric");
        return true;
    }
}
