import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * SalesAnalyzer
 */
public class SalesAnalyzer {

    private Product[] product;
    public ReaderFile readerFile;

    public SalesAnalyzer(String file) throws FileNotFoundException{
        readerFile = new ReaderFile(file);
    }

    public void sort(Product[] products){
        for(int count=0 ; count<=products.length ; count++){
            for(int i=0 ; i<products.length-1 ; i++){
                if(products[i].getRetailPrice() > products[i+1].getRetailPrice()){
                    Product temp = products[i];
                    products[i] = products[i+1];
                    products[i+1] = temp;
                }
            }
        }
    }

    public void print(Product[] products){
        for(Product product : products){
            System.out.println(product);
        }
    }

    public void analyse() throws IOException{
        Product[] products = readerFile.getProducts();
        sort(products);
        print(products);
    }
}