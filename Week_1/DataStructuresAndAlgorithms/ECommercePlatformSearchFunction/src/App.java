public class App {
    public static void main(String[] args) throws Exception {
        Product[] products = {
            new Product("P1", "HP", "Laptop"),
            new Product("P4", "Apsara", "Stationary"),
            new Product("P2", "Asus", "Laptop"),
            new Product("P3", "Natraj", "Stationary")
        };

        LinearSearch ls = new LinearSearch();
        Product searchProductLS = ls.linearSearch(products, "P3");

        Product[] sortedProducts = {
            new Product("P1", "HP", "Laptop"),
            new Product("P2", "Asus", "Laptop"),
            new Product("P3", "Natraj", "Stationary"),
            new Product("P4", "Apsara", "Stationary")
        };

        BinarySearch bs = new BinarySearch();
        Product searchProductBS = bs.binarySearch(sortedProducts, "P4");

        System.out.println(searchProductLS);
        System.out.println(searchProductBS);

    }
}

/* Understand Asymptotic Notation:
 1. Explain Big O notation and how it helps in analyzing algorithms.
 -->Big O notation describes the efficiency of an algorithm in terms of how its runtime or space requirements grow as the input size increases. It focuses on the upper bound, or worst-case scenario, and helps compare the scalability of different algorithms by ignoring constants and lower-order terms. For example: 
 * O(1): Constant time, doesn't change with input size.
 * O(n): Linear time, grows directly with input size.
 * O(n*n): Quadratic time, grows with the square of the input size.

 2. Describe the best, average, and worst-case scenarios for search operations.
 --> Best Case: The scenario where the algorithm performs the fewest steps. For example, in a search operation, finding the element on the first try, O(1) for linear search.
 -->Average Case: The expected number of steps for a random input, considering typical conditions. In linear search, it's O(n) because it generally looks through half the elements.
 -->Worst Case: The scenario where the algorithm takes the maximum number of steps. For linear search, this is O(n), occurring when the element is at the end or not present.
 */

 /* Analysis:
  1. Compare the time complexity of linear and binary search algorithms.
  --> Linear Search: This algorithm checks each element in a list one by one until it finds the target or reaches the end. Its time complexity is O(n), where n is the number of elements. This means that the time required grows linearly with the size of the list.
  --> Binary Search: This algorithm works on sorted lists by repeatedly dividing the search interval in half. It starts by comparing the middle element with the target value. If they are not equal, it eliminates half of the remaining elements and repeats the process on the remaining half. The time complexity of binary search is O(logn), where n is the number of elements. This logarithmic growth means that even for large lists, the number of comparisons needed is relatively small.

  2. Discuss which algorithm is more suitable for your platform and why.
  --> Linear Search is simple and doesn't require the list to be sorted, making it suitable for small or unsorted lists, or when the data structure doesn't support random access efficiently (e.g., linked lists).
  --> Binary Search is much faster for large datasets, but it requires the list to be sorted. It’s particularly efficient when dealing with large, sorted datasets where the cost of sorting (if needed) is less significant compared to the gains in search speed.
  --> If the platform frequently handles large datasets that are either pre-sorted or can be sorted efficiently, binary search is more suitable due to its significantly faster search time. However, if sorting is too costly or the data is typically small or unsorted, linear search might be more practical despite its slower average performance for large datasets.
  */
