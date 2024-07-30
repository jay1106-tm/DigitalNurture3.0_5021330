public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManager empManager = new EmployeeManager(10);

        empManager.addEmployee(new Employee("1", "Jay", "Developer", 75000));
        empManager.addEmployee(new Employee("2", "Vijay", "Manager", 90000));
        empManager.addEmployee(new Employee("3", "Ajay", "Analyst", 60000));
        empManager.addEmployee(new Employee("4", "Sanjay", "Test Engineer", 65000));

        System.out.println("Employees List:");
        empManager.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee emp = empManager.searchEmployee("2");
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Deleting employee with ID 2.");
        empManager.deleteEmployee("2");

        System.out.println("Employees List After Deletion:");
        empManager.traverseEmployees();
    }
}

/* Understand Array Representation: 
  1. Explain how arrays are represented in memory and their advantages.
  --> Arrays in memory are represented as a contiguous block of elements. Each element of the array is stored in consecutive memory locations.
  --> Since arrays allocate a contiguous block of memory, it is easy to predict and manage their memory usage.
  --> Because arrays store elements in contiguous memory locations, they are generally more cache-friendly than other data structures. This can lead to faster access times due to better cache utilization.
  --> Iterating through an array is very efficient due to the contiguous memory allocation, allowing for straightforward and fast traversal of elements.
 */

 /* Analysis: 
  1. Analyze the time complexity of each operation (add, search, traverse, delete).
  --> Add Operation:
  Time Complexity: O(1) if there's space, otherwise O(n) due to resizing.
  Explanation: Adding an element to an array takes constant time if there is available space. However, if the array needs to be resized, it takes linear time to copy the elements to a new array.
  --> Search Operation:
  Time Complexity: O(n).
  Explanation: To find an element, we may need to scan through all the elements in the worst case.
  --> Traverse Operation:
  Time Complexity: O(n).
  Explanation: Traversing through all elements of the array takes linear time.
  --> Delete Operation:
  Time Complexity: O(n).
  Explanation: Deleting an element requires shifting the subsequent elements, which takes linear time.

  2. Discuss the limitations of arrays and when to use them.
  --> Fixed Size: Arrays have a fixed size, so you need to know the maximum number of elements in advance or handle resizing, which is inefficient.
  -->Inefficient Insertion and Deletion: Inserting or deleting elements in the middle of an array requires shifting elements, leading to O(n) time complexity.
  --> Use arrays when you have a fixed number of elements and need efficient access by index.
  --> They are great for static collections of data where insertions and deletions are rare.
  */
