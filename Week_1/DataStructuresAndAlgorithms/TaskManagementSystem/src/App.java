public class App {
    public static void main(String[] args) throws Exception {
        TaskManager taskLinkedList = new TaskManager();

        taskLinkedList.addTask(new Task("1", "A", "Pending"));
        taskLinkedList.addTask(new Task("2", "B", "Completed"));
        taskLinkedList.addTask(new Task("3", "C", "Scrapped"));
        taskLinkedList.addTask(new Task("4", "D", "In Progress"));

        System.out.println("Task List:");
        taskLinkedList.traverseTasks();

        System.out.println("Searching for task with ID 3:");
        Task task = taskLinkedList.searchTask("3");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task ID Invalid.");
        }

        System.out.println("Deleting task with ID 3.");
        taskLinkedList.deleteTask("3");

        System.out.println("Task List After Deletion:");
        taskLinkedList.traverseTasks();
    }
}

/* Understand Linked Lists:
  1. Explain the different types of linked lists(Singly Linked List, Doubly Linked List).
  --> A singly linked list is a data structure where each element (node) contains a reference (or pointer) to the next node in the sequence. It is unidirectional, meaning traversal is possible only in one direction - from the head to the tail.
  --> A doubly linked list is a data structure where each node contains two references: one to the next node and one to the previous node. This allows traversal in both directions - forward and backward.
  --> Singly Linked List: Each node points to the next node only. Simple and uses less memory per node. Traversal is only forward.
  Doubly Linked List: Each node points to both the next and previous nodes. More flexible with traversal and operations but uses more memory.
 */

 /* Analysis:
  1. Analyze the time complexity of each operation.
  --> Insertion (addTask): 
  Time Complexity: O(n)
  In the worst case, the method needs to traverse the entire list to reach the end (where the new node is to be inserted). The traversal takes O(n) time, where n is the number of nodes in the list.
  --> Search (searchTask):
  Time Complexity: O(n)
  The method needs to traverse the list and compare the taskId of each node's task with the given taskId. In the worst case, it might need to check every node, resulting in O(n) time complexity.
  --> Traversal (traverseTask):
  Time Complexity: O(n)
  The method visits each node in the list once to print the task details. Thus, it takes O(n) time to traverse the entire list.
  --> Deletion (deleteTask):
  Time Complexity: O(n)
  The method might need to traverse the entire list to find the node with the given taskId. In the worst case, this takes O(n) time. If the node to be deleted is found, updating the links is O(1), but the traversal still dominates the overall complexity.

  2. Discuss the advantages of linked lists over arrays for dynamic data.
  --> Linked lists can grow and shrink dynamically without the need for resizing, as each node is independently allocated. This flexibility is useful for applications where the number of elements is unknown or changes frequently.
  --> In linked lists, insertions and deletions are efficient if the position is known. Specifically, insertions and deletions at the beginning or end of a singly linked list can be done in O(1) time. Arrays, on the other hand, require shifting elements for insertions and deletions, leading to O(n) time complexity.
  --> Linked lists use memory more efficiently for dynamic datasets, as they do not require a contiguous block of memory. Each node is allocated as needed, reducing the likelihood of memory wastage compared to arrays, which may reserve more memory than needed.
  */
