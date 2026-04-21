public class CountingWordsProsserVisitor implements DocumentProcesserVisitor{


    @Override
    public void visit(PresenationFileProcesser presenationFileProcesser) {
        System.out.println("Presenation Processing Counter");
    }

    @Override
    public void visit(SpreadSheetProcesser spreadSheetProcesser) {
        System.out.println("SpreadSheet Processing Counter");
    }

    @Override
    public void visit(TextFileProcesser textFileProcesser) {
        System.out.println("Text File Processing Counter");
    }
}
