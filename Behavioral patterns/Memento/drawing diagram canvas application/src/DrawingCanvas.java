public class DrawingCanvas {
    private String content;
    private String color;
    private String border;

    public DrawingCanvas(String content, String color, String border) {
        this.content = content;
        this.color = color;
        this.border = border;
    }

    public DrawingState save()
    {
        return new DrawingState(this.content , this.color , this.border);
    }

    public void restore(DrawingState drawingState)
    {
        this.content=drawingState.getContent();
        this.color = drawingState.getColor();
        this.border = drawingState.getBorder();
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }

    public String getBorder() {
        return border;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    @Override
    public String toString() {
        return "DrawingCanvas{" +
                "content='" + content + '\'' +
                ", color='" + color + '\'' +
                ", border='" + border + '\'' +
                '}';
    }
}
