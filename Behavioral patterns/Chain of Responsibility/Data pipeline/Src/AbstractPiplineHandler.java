public abstract class AbstractPiplineHandler implements DataPipline {


    private DataPipline next;



    @Override
    public DataPipline setNext(DataPipline dataPipline) {
        this.next = dataPipline;
        return dataPipline;
    }

    @Override
    public boolean handle(RawData rawData) {
        if (this.next ==  null)
         return false;
        else
            return this.next.handle(rawData);
    }
}
