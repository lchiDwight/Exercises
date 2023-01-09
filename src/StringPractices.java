public class StringPractices {
    public static String myName = "Li Chi";
    public static String yourName = "Whitney";

    public static void printName(){
        System.out.println(myName);
        System.out.println(yourName);
    }
    public static void getSubstring(int num){
        System.out.println(myName.substring(num));
    }

    public static void accessString(String word,int index){
        if(index > word.length()-1|| index <0){
            System.out.println("Wrong value");
        }else{
            System.out.println(word.charAt(index));
        }
    }
}
