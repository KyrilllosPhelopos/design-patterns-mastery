import javax.xml.crypto.Data;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    RawData rowData_1 = new RawData("Kyrillos's Data");
    DataPipline ValidationPiplineHandler = new ValidationPiplineHandler();
    DataPipline formattingPiplineHandler =ValidationPiplineHandler.setNext(new FormattingPiplineHandler());
    DataPipline dataSizePipLineHandler = formattingPiplineHandler.setNext(new DataSizePiplineHandler());
    DataPipline personnalInfoPipLineHander  = dataSizePipLineHandler.setNext(new PersonnalInformationPiplineHandler() );
    RawDataProcessor rawDataProcessor = new RawDataProcessor(ValidationPiplineHandler);
    rawDataProcessor.processData(rowData_1);

}
