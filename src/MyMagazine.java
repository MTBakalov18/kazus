public class MyMagazine extends Magazine {
    private String title;

    public MyMagazine(String name, String author, double price, String title) {
        super(name, author, price);
        this.title = title;
    }

    @Override
    public void getDetails() {

    }
}
