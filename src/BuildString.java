public class BuildString {
    public String myString = "";
    private String secretMission = "the secret is Hacking";

    public void buildString(String word){
        myString = myString + word+" ";
        System.out.println(myString);
    }
     public static String openString = "This is a static testing";

    public String reviewSecret(){
        return this.secretMission;
    }


}
