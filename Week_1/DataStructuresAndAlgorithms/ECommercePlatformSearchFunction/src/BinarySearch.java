public class BinarySearch {
    public Product binarySearch(Product[] products, String productId) {

        int left = 0;
        int right = products.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            int compare = products[mid].getProductId().compareTo(productId);

            if(compare == 0) {
                return products[mid];
            } else if (compare<0) {
                left = mid+1;
            } else {
                right = mid+1;
            }
        }
        return null;
    }
}
