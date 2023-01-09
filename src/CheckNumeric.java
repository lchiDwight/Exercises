public class CheckNumeric {

    static boolean isNumeric(String str){
        if(str == null){
            return false;
        }
        try{
            Double.parseDouble(str);
        }catch (NumberFormatException e){

            return false;
        }
        return true;
    }
}

