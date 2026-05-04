public class BacklogState implements  TaskState{

    private final TaskManagement taskManagement;

    public BacklogState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {

        System.out.println("Task: " + taskManagement.getTask().getName() + "put in TO-DO list now...");
        taskManagement.changeState(new TodoState(taskManagement));

    }

    @Override
    public void markAsInProgress() {
        System.out.println("Cannot mark as in progress: " + taskManagement.getTask().getName()
                + " at the current state...");
    }

    @Override
    public void markAsBlocked() {
        System.out.println("Cannot mark as Blocked: " + taskManagement.getTask().getName()
                + " at the current state...");
    }

    @Override
    public void markAsInReview() {
        System.out.println("Cannot mark as in review: " + taskManagement.getTask().getName()
                + " at the current state...");
    }

    @Override
    public void markAsDone() {
        System.out.println("Cannot mark as in done: " + taskManagement.getTask().getName()
                + " at the current state...");
    }
}
