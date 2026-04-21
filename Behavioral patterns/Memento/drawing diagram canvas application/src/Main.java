//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    DrawingCanvas diagram = new DrawingCanvas("hiiiii_1" , "blue" , "2p");
    History history = new History();

    history.saveHistoryState(diagram.save());
    diagram.setContent("Hello_2");
    history.saveHistoryState(diagram.save());


    diagram.setContent("Hello_3");
    history.saveHistoryState(diagram.save());

    diagram.setContent("Hello_4");

    diagram.restore(history.undo());
    System.out.println(diagram.toString());

    diagram.restore(history.undo());
    System.out.println(diagram.toString());

    diagram.restore(history.redo());
    System.out.println(diagram.toString());




}
