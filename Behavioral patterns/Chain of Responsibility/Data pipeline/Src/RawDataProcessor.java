public class RawDataProcessor {

   private final DataPipline rawDataPipline;

    public RawDataProcessor(DataPipline rawDataPipline) {
        this.rawDataPipline = rawDataPipline;
    }

    public boolean processData(RawData rawData)
    {
        return this.rawDataPipline.handle(rawData);
    }
}
