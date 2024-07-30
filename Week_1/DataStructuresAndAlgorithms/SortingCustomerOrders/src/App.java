public class App {
    public static void main(String[] args) throws Exception {
        Order[] orders = {
            new Order("1", "Jay", 200.30),
            new Order("2", "Vijay", 190.15),
            new Order("3", "Ajay", 450.09),
            new Order("4", "Sanjay", 200.70)
        };

        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[]{
            new Order("1", "Jay", 250.50),
            new Order("2", "Vijay", 100.75),
            new Order("3", "Ajay", 150.00),
            new Order("4", "Sanjay", 200.20)
        };

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

/* Understanding Sorting Algorithms:
  1. Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).
  --> Bubble sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
  --> Insertion sort builds the final sorted array one item at a time by repeatedly picking the next item and inserting it into its correct position.
  --> Quick sort is a divide-and-conquer algorithm that selects a 'pivot' element and partitions the array into two sub-arrays: elements less than the pivot and elements greater than the pivot. It then recursively sorts the sub-arrays.
 */

 /* Analysis: 
  1. Compare the performance (time complexity) of Bubble Sort and Quick Sort.
  --> Bubble Sort Time Complexity:
  Best Case: O(n) (when the list is already sorted and optimized version is used).
  Average Case: O(n²) (general case with random order).
  Worst Case: O(n²) (when the list is sorted in reverse order).
  --> Quick Sort Time Complexity:
  Best Case: O(n log n) (when the pivot is ideally chosen, dividing the list into nearly equal halves).
  Average Case: O(n log n) (typical performance for most scenarios).
  Worst Case: O(n²) (when the pivot is the smallest or largest element in each partition, leading to unbalanced partitions).

  2. Discuss why Quick Sort is generally preferred over Bubble Sort.
  --> Bubble Sort: Has a worst-case and average-case time complexity of O(n²), making it inefficient for large lists.
  Quick Sort: Typically performs in O(n log n) time, which is significantly faster for large datasets.
  --> Bubble Sort: Not suitable for large lists due to its quadratic time complexity.
  Quick Sort: Scales well with larger datasets, providing much faster sorting for practical use cases.
  --> Bubble Sort: Involves many unnecessary comparisons and swaps, even if the list is nearly sorted. This inefficiency becomes pronounced with larger datasets.
  Quick Sort: Efficiently narrows down the search space with each recursive call and generally performs better due to its divide-and-conquer strategy.
  */