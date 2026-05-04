public interface TaskState {

    void markAsTodo();
    void markAsInProgress();
    void markAsBlocked();
    void markAsInReview();
    void markAsDone();

}