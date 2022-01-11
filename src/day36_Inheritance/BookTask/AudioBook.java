package day36_Inheritance.BookTask;

public class AudioBook extends Book{

    public double length;
    public String narrator;

    public void setInfo(double length, String narrator){
        this.length=length;
        this.narrator=narrator;
    }

    public void listen(){
        System.out.println("I am listening " + title + " by " + author);
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
