public class TodoState implements TaskState{

    private final TaskManagement taskManagement;

    public TodoState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void markAsTodo() {

        System.out.println("Task is already at the To-Do list");

    }

    @Override
    public void markAsInProgress() {
        System.out.println("task: " + taskManagement.getTask().getName() + "put in IN-Progess list now...");
        taskManagement.changeState(new InProgressState(taskManagement));


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
                + " at the ToDo state...");
    }
}
