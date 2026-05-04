public class InProgressState implements TaskState{

    private final TaskManagement taskManagement;

    public InProgressState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {

        System.out.println("Cannot mark as in done: " + taskManagement.getTask().getName()
                + " at Inprogress state...");
    }

    @Override
    public void markAsInProgress() {
        System.out.println("Task is already at the In-Progress list");
    }

    @Override
    public void markAsBlocked() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "put in Blocked list now...");
        taskManagement.changeState(new BlockedState(taskManagement));

    }

    @Override
    public void markAsInReview() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "Marked as  In-Review state now...");
        taskManagement.changeState(new ReviewState(taskManagement));

    }

    @Override
    public void markAsDone() {
        System.out.println("Cannot mark as in done: " + taskManagement.getTask().getName()
                + " at Inprogress state...");
    }
}
