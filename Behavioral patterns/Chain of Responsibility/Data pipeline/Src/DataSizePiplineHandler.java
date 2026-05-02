public class DataSizePiplineHandler extends AbstractPiplineHandler {

    @Override
    public boolean handle(RawData rawData) {
        System.out.println("Handling Data Size");
        return super.handle(rawData);
    }
}
