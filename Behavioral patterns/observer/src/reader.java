public class reader implements Subscriber{
    private String name;

    public reader(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void notify(String str) {
        System.out.println("Notifying user: " +this.name+" about: "+str);
    }
}
