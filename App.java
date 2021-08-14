import java.io.FileNotFoundException;
import java.io.IOException;


public class App {

    public static void main(String[] args) {
        try {
            SalesAnalyzer salesAnalyzer = new SalesAnalyzer("./data/purchase_details.csv");  
        } catch (FileNotFoundException e) {
            System.out.println("File is not availabe");
        }catch(IOException e){
            System.out.println("File is Not Accessible");
        }
        
    }
    
}
