public class TextFileProcesser implements DocumentProcesser{





    public void accept(DocumentProcesserVisitor documentProcesserVisitor){
        documentProcesserVisitor.visit(this);
    }

}
