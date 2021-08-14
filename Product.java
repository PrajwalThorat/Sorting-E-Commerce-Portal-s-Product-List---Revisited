public class Product {
    private String id;
    private String productName;
    private String brand;
    private String productUrl;
    private float retailPrice;
    private float discountPrice;
    private float productRating;


    public Product(){

    }
    public Product(String id, String productName, String brand, String productUrl, float retailPrice,
            float discountPrice, float productRating) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.productUrl = productUrl;
        this.retailPrice = retailPrice;
        this.discountPrice = discountPrice;
        this.productRating = productRating;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProductUrl() {
        return productUrl;
    }
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }
    public float getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
    }
    public float getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(float discountPrice) {
        this.discountPrice = discountPrice;
    }
    public float getProductRating() {
        return productRating;
    }
    public void setProductRating(float productRating) {
        this.productRating = productRating;
    }
    @Override
    public String toString() {
        return "Product [brand=" + brand + ", discountPrice=" + discountPrice + ", id=" + id + ", productName="
                + productName + ", productRating=" + productRating + ", productUrl=" + productUrl + ", retailPrice="
                + retailPrice + "]";
    }
}
