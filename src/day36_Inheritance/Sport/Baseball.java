package day36_Inheritance.Sport;

public class Baseball extends Sport{

    public String sizeOfBall;

    public void setInfo(String sizeOfBall){
        this.sizeOfBall = sizeOfBall;
    }

    public void taggingUp(){
        System.out.println(name + " is tagging up and timing the retouch");
    }

    public void bunt(){
        System.out.println(name + " bunted and ran over the pitcher");
    }

    public String toString() {
        return "Baseball{" +
                "sizeOfBall='" + sizeOfBall + '\'' +
                ", name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
