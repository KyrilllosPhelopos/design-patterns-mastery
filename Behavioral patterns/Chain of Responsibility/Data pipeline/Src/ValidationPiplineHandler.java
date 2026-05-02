public class ValidationPiplineHandler extends AbstractPiplineHandler {

    @Override
    public boolean handle(RawData rawData) {
        System.out.println("Handling Data Validation");
        return super.handle(rawData);
    }
}
