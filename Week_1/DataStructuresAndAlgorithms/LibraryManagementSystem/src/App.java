public class App {
    public static void main(String[] args) throws Exception {
        BookManager bookManager = new BookManager();

        bookManager.addBook(new Book("1", "Adventures of Sherlock Holmes", "Arthur Conan Doyle"));
        bookManager.addBook(new Book("2","Around the World in Eighty Days", "Jules Verne"));
        bookManager.addBook(new Book("2", "Baburnama", "Babur"));
        bookManager.addBook(new Book("3", "Gulliver's Travels", "Jonathan Swift"));

        System.out.println("Linear Search for 'Baburnama': ");
        Book requiredBook = bookManager.linearSearch("Baburnama");
        if(requiredBook!=null) {
            System.out.println(requiredBook);
        } else {
            System.out.println("Book is not Available");
        }

        System.out.println("Binary Search for 'Gulliver's Travels':");
        requiredBook = bookManager.binarySearch("Gulliver's Travels");
        if (requiredBook != null) {
            System.out.println(requiredBook);
        } else {
            System.out.println("Book is not Available");
        }
    }
}

/* Understand Search Algorithms: 
  1. Explain linear search and binary search algorithms.
  --> Linear search is a simple algorithm that checks each element in a list one by one until the desired element is found or the list is exhausted.
  --> Binary search is an efficient algorithm that finds an element in a sorted list by repeatedly dividing the search interval in half.
  
 */

 /* Analysis:
  1. Compare the time complexity of linear and binary search.
  --> Linear Search Time Complexity:
  Best Case: O(1) (if the element is at the start).
  Average Case: O(n) (when the element could be anywhere).
  Worst Case: O(n) (if the element is not found).
  --> Binary Search Time Complexity:
  Best Case: O(1) (if the middle element is the target).
  Average Case: O(log n) (logarithmic time due to halving the search space).
  Worst Case: O(log n) (if the search space is reduced to one element).

  2. Discuss when to use each algorithm based on the data set size and order.
  --> Linear Search: 
  Unsorted Data: Use linear search if the data is not sorted, as binary search requires sorted data.
  Small Data Sets: For small lists, the difference in performance might be negligible.
  --> Binary Search: 
  Sorted Data: Use binary search only if the data is sorted. For unsorted data, sorting must be performed first.
  Large Data Sets: For large lists, binary search is much more efficient due to its O(log n) time complexity.
  */
