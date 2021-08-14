import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {

    private String file;
    private BufferedReader bufferedReader;

    public ReaderFile(String file) throws FileNotFoundException{
        this.file = file;
        init();
    }

    public void init() throws FileNotFoundException{
        bufferedReader = new BufferedReader(new FileReader(file));
    }

    public Product[] getProducts() throws IOException{
        int count = countReader();
        init();
        String header = bufferedReader.readLine();
        String record;
        Product[] productList = new Product[count];
        int index = 0;
        while ((record=bufferedReader.readLine())!=null) {
            Product product = fromProduct(record);
            productList[index++] = product;
        }
        return productList;

    }

    public int countReader() throws IOException{
        bufferedReader.readLine();
        int count = 0;
        while(bufferedReader.readLine() != null){
            count++;
        }
        return count;
    }

    public Product fromProduct(String record){
        String[] fields = record.split(",(\"(?:[^\"]|\"\")*\"|[^,]*)");
        Product product = new Product();
        product.setId(fields[0]);
        product.setProductName(fields[1]);
        product.setBrand(fields[2]);
        product.setProductUrl(fields[3]);
        product.setRetailPrice(convertToFloat(fields[4]));
        product.setDiscountPrice(convertToFloat(fields[5]));
        product.setProductRating(convertToFloat(fields[6]));

        return product;
    }

    public float convertToFloat(String value){
        try{
            return Float.parseFloat(value);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            return 0.0f;
        }
    }
    
}
