package day36_Inheritance.BookTask;

public class EBook extends Book {

    public String size;
    public int pages;

    public void setInfo(String size, int pages){
        this.size = size;
        this.pages = pages;
    }

    public void readBook() {
        System.out.println(title + " by " + author + " worths reading for at least once.");
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
