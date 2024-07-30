import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(),product);
        System.out.println("Product Added Successfully.");
    }

    public void updateProduct(Product product) {
        if(products.containsKey(product.getProductId())) {
            products.put(product.getProductId(),product);
            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Invalid Product ID");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
        System.out.println("Product deleted with ID: " + productId);
    }

    public void getProduct(String productId) {
        if(products.containsKey(productId)) {
            System.out.println(products.get(productId));
        } else {
            System.out.println("Product not Available");
        }
    }
}
