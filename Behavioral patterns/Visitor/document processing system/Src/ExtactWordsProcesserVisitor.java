public class ExtactWordsProcesserVisitor implements DocumentProcesserVisitor{
    @Override
    public void visit(PresenationFileProcesser presenationFileProcesser) {
        System.out.println("Extract Words presenation File Processer");
    }

    @Override
    public void visit(SpreadSheetProcesser spreadSheetProcesser) {
        System.out.println("Extract Words SpreadSheet File Processer");
    }

    @Override
    public void visit(TextFileProcesser textFileProcesser) {
        System.out.println("Extract Words Text File Processer");
    }
}
