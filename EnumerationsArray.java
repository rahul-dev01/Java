
enum Level{
    LOW , MEDIUM , HIGH 
}

public class EnumerationsArray {
    public static void main(String[] args) {
        Level level = Level.MEDIUM ;

        switch (level) {
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM :
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("High");
                break;
            default:
                break;
        }
    }
}
