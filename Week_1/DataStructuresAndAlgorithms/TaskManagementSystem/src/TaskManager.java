class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManager {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Task not found.");
            return;
        }
        previous.next = current.next;
    }
}
