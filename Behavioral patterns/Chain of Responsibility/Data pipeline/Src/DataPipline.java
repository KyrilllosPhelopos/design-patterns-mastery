public interface DataPipline {

    DataPipline setNext (DataPipline dataPipline);
    boolean handle(RawData rawData);
}
