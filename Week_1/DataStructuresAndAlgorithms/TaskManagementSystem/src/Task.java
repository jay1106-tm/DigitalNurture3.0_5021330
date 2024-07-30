public class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }
    public String getTaskName() {
        return taskName;
    }
    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Task [Id= " + taskId + ", Name= " + taskName + ", Status= " + status + "]";
    }
}
