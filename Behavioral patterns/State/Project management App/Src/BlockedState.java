public class BlockedState implements TaskState{

    private final TaskManagement taskManagement;

    public BlockedState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {

        System.out.println("Cannot put in Todo list: " + taskManagement.getTask().getName()
                + " at Blocked state...");

    }

    @Override
    public void markAsInProgress() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "returned to In-Progress State now...");
        taskManagement.changeState(new InProgressState(taskManagement));



    }

    @Override
    public void markAsBlocked() {

        System.out.println("Task is already at the Blocked list");

    }

    @Override
    public void markAsInReview() {
        System.out.println("Cannot mark as in Review: " + taskManagement.getTask().getName()
                + " at Blocked state...");

    }

    @Override
    public void markAsDone() {

        System.out.println("Cannot mark as in done: " + taskManagement.getTask().getName()
                + " at Blocked state...");

    }
}
