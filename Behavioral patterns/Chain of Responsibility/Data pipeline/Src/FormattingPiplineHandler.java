public class FormattingPiplineHandler extends AbstractPiplineHandler {

    @Override
    public boolean handle(RawData rawData) {
        System.out.println("Handling Formatting Data");
        return super.handle(rawData);
    }
}
