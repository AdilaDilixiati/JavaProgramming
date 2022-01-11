package day36_Inheritance.BookTask;

public class BookObject {

    public static void main(String[] args) {

        EBook ebook = new EBook();
        ebook.setInfo("Ana Yurt", "electric book", "Zordun Sabir", 150);
        ebook.setInfo("medium", 1500);
        ebook.readBook();

        System.out.println(ebook);

        AudioBook audiobook = new AudioBook();
        audiobook.setInfo("Iz", "audio book", "Abdurehim Ötkvr", 80);
        audiobook.setInfo(20.5, "Elkitab");
        audiobook.listen();

        System.out.println(audiobook);
    }
    
}
