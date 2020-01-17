package Chater6.Interface.bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백 산맥1");
        bookQueue.enQueue("태백 산맥2");
        bookQueue.enQueue("태백 산맥3");

        System.out.println(bookQueue.getSize());
        int size = bookQueue.getSize();
        for(int i=0; i < size; i++) {
            System.out.println(bookQueue.getSize()); // for문 조건에 바로 쓴다면 영향을 받음
            System.out.println(bookQueue.deQueue());
        }
    }
}
