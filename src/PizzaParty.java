import java.util.Scanner;

public class PizzaParty {

     private static int checkInput(Scanner input,String question){
         System.out.println(question);
         if(input.hasNextInt()){
            return Integer.parseInt(input.nextLine());
         }else{
            System.out.println("Must be a numeric");
            System.exit(-1);
            return -1;
        }
    }

    public static void dividePizza(){
        Scanner dataInput = new Scanner(System.in);
        int numOfPeople =checkInput(dataInput,"How many people do you have");
        int numOfPizza = checkInput(dataInput,"How many pizzas do you have?");
        int numOfSlice = checkInput(dataInput,"How many slices per pizza?");

        int leftOver = numOfPizza * numOfSlice - numOfPeople*2;

        System.out.println(numOfPeople + " people with "+ numOfPizza+ " pizzas");
        System.out.println("Each person gets 2 pieces of pizza");
        System.out.println("There are "+leftOver+" leftover pieces ");
    }
}
