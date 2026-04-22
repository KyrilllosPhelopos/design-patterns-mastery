public class PresenationFileProcesser implements DocumentProcesser{







    public void accept(DocumentProcesserVisitor documentProcesserVisitor){
        documentProcesserVisitor.visit(this);
    }
}
