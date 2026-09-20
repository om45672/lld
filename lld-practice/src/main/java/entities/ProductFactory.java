package entities;
/**
 * Should have the control and the logic to create Product objects
 */
public class ProductFactory {
    public Product CreateProduct(String productType){
        if(productType.equalsIgnoreCase("ELECTRONIC")){
            return new ElectronicProduct();
        }
        else if(productType.equalsIgnoreCase("CLOTHING")){
            return new ClothingProduct();
        }
        else{
            throw new IllegalArgumentException("Invalid product type: " + productType);
        }
    }
}
