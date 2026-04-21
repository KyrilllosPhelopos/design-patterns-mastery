import java.util.Stack;

public class History {
    private final Stack<DrawingState> prevStates;
    private final Stack<DrawingState> nextStates;

    public History() {
        this.prevStates = new Stack<>();
        this.nextStates = new Stack<>();
    }

    public void saveHistoryState(DrawingState drawingState)
    {
        this.prevStates.push(drawingState);
    }

    public DrawingState undo(){
        this.nextStates.push(this.prevStates.lastElement());
        return prevStates.pop();
    }

    public DrawingState redo()
    {
        return this.nextStates.pop();
    }

}
