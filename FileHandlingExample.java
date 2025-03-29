import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        String fileName = "test.txt";
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            System.out.println(br.readLine());
            
            String line ;
            while( (line = br.readLine()) != null) {
                count += line.length();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

       System.out.println("Total char : " + count);
    }
        
}
