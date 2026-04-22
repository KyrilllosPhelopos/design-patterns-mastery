public class SpreadSheetProcesser implements DocumentProcesser{




    public void accept(DocumentProcesserVisitor documentProcesserVisitor){
        documentProcesserVisitor.visit(this);
    }
}
