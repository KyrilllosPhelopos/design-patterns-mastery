public class PersonnalInformationPiplineHandler extends AbstractPiplineHandler {


    @Override
    public boolean handle(RawData rawData) {
        System.out.println("Handling Personal Information Data");
        return super.handle(rawData);
    }
}
