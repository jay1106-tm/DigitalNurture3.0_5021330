public class App {
    public static void main(String[] args) throws Exception {
        Inventory productInventory = new Inventory();

        Product phone1 = new Product("P001", "Samsung", 67, 58000);
        Product fruit1 = new Product("F002", "Apple", 25, 89);

        productInventory.addProduct(phone1);
        productInventory.addProduct(fruit1);

        Product fruit2 = new Product("F002", "Orange", 32, 60);

        productInventory.updateProduct(fruit2);

        productInventory.deleteProduct("P001");

        productInventory.getProduct("F002");
    }
}


/* Understand the Problem:
  1. Explain why data structures and algorithms are essential in handling large inventories.
  --> Efficient Data Storage: Large inventories require efficient storage to handle thousands of products. Proper data structures ensure that memory is used efficiently and operations can be performed quickly.
  --> Quick Retrieval: Efficient algorithms enable fast searching, updating, and deleting of inventory items.Quick access to data is crucial for operations like stock checks, order processing, and reporting.
  --> Scalability: As the inventory grows, the data structure must handle the increased load without significant performance degradation. Good algorithms and data structures ensure the system remains responsive as the data volume increases.

  2. Discuss the types of data structures suitable for this problem.
  --> ArrayList: Suitable for a moderate number of products where quick access by index is needed.
  --> HashMap: Ideal for storing products where quick lookup by a unique identifier (e.g., productId) is needed.
  --> LinkedList: Useful for inventories where frequent insertions and deletions are needed.
 */

 /* Analysis: 
  1. Analyze the time complexity of each operation(ass, update, delete) in your chosen data structure.
  --> Add Operation: 
  Time Complexity: O(1) on average.
  --> Update Operation:
  Time Complexity: O(1) on average.
  --> Delete Operation:
  Time Complexity: O(1) on average.
  
  2. Discuss how you can optimize these operations.
  --> Use a Good Hash Function: To minimize collisions and maintain O(1) performance.
  --> Adjust Load Factor: Balance between space and performance.
  --> Set Initial Capacity: To avoid frequent resizing.
  */