//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Task task = new Task("Study Design Pattern");

    TaskManagement taskManagement = new TaskManagement(task);

    taskManagement.markAsTodo();
    taskManagement.markAsInProgress();
    taskManagement.markAsBlocked();
    taskManagement.markAsTodo();
    taskManagement.markAsInReview();
    taskManagement.markAsInProgress();
    taskManagement.markAsInReview();
    taskManagement.markAsDone();

}
