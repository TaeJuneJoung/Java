package Chapter7.object;

class Book implements Cloneable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title : " + this.title + " | Author : " + this.author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ToStringTest extends Object {
    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");
        System.out.println(book);
        String str = new String("토지");
        System.out.println(str);
    }
}
