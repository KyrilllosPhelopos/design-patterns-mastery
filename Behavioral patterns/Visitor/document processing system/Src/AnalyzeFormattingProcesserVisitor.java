public class AnalyzeFormattingProcesserVisitor implements DocumentProcesserVisitor{
    @Override
    public void visit(PresenationFileProcesser presenationFileProcesser) {
        System.out.println("Presenation Processing analyse formater");
    }

    @Override
    public void visit(SpreadSheetProcesser spreadSheetProcesser) {
        System.out.println("SpreadSheet Processing analyse formater");
    }

    @Override
    public void visit(TextFileProcesser textFileProcesser) {
        System.out.println("Text File Processing analyse formater");
    }
}
