public class ReviewState implements TaskState{

    private final TaskManagement taskManagement;

    public ReviewState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {
        System.out.println("Cannot put in To-Do lis: " + taskManagement.getTask().getName()
                + " at Review state...");

    }

    @Override
    public void markAsInProgress() {
        System.out.println("Task: " + taskManagement.getTask().getName() + "returned to In-Progress State now...");
        taskManagement.changeState(new InProgressState(taskManagement));


    }

    @Override
    public void markAsBlocked() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "put in Blocked list now...");
        taskManagement.changeState(new BlockedState(taskManagement));


    }

    @Override
    public void markAsInReview() {
        System.out.println("Task is already at the Review state");
    }

    @Override
    public void markAsDone() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "put in Done list now...");
        taskManagement.changeState(new DoneState(taskManagement));



    }
}
