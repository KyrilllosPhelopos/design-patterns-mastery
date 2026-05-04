public class DoneState implements TaskState{

    private final TaskManagement taskManagement;

    public DoneState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {
        System.out.println("Cannot mark as ToDo as it's already done");

    }

    @Override
    public void markAsInProgress() {
        System.out.println("Cannot mark as InProgress as it's already done");

    }

    @Override
    public void markAsBlocked() {
        System.out.println("Cannot mark as Blocked as it's already done");
    }

    @Override
    public void markAsInReview() {
        System.out.println("Cannot mark as InReview as it's already done");
    }

    @Override
    public void markAsDone() {
        System.out.println("Task is already at the Done list");
    }
}
