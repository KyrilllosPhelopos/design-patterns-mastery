public class TaskManagement {

    private Task task;
    private TaskState taskState;

    public TaskManagement(Task task) {
        this.task = task;
        this.taskState = new BacklogState(this);
    }

    public void changeState(TaskState changedtaskState) {
        taskState = changedtaskState;
    }

    public void markAsTodo() {
        taskState.markAsTodo();

    }

    public void markAsInProgress() {
        taskState.markAsInProgress();

    }

    public void markAsBlocked() {
        taskState.markAsBlocked();

    }

    public void markAsInReview() {

        taskState.markAsInReview();
    }

    public void markAsDone() {
        taskState.markAsDone();
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public Task getTask() {
        return task;
    }
}
