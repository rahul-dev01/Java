class CustomExceptionMessage extends Exception{
    CustomExceptionMessage(String message){
        super(message);
    }
}

public class CustomException {

    static void checkAge (int age) throws CustomExceptionMessage {
        if(age < 18) throw new CustomExceptionMessage("Age is not valid ");
    }

    public static void main(String[] args) {
        try{
            checkAge(12);
        }
        catch(CustomExceptionMessage e ){
            System.out.println(e);
        }
       
    }
}
