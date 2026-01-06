abstract class Book {
    String title;

    void setTile(String title) {
        this.title = title;
    }

    void getTitle() {
        System.out.println(title);
    }
}

class MyBook extends Book {

}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new MyBook();
        b1.setTile("techincal training");
        b1.getTitle();
    }
}
