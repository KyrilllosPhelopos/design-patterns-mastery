public interface DocumentProcesserVisitor {

    public void visit(PresenationFileProcesser presenationFileProcesser );

    public void visit(SpreadSheetProcesser spreadSheetProcesser );

    public void visit(TextFileProcesser textFileProcesser );
}
