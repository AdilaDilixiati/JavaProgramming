package day36_Inheritance.Sport;

public class Basketball extends Sport{

    public String colourOfBall;

    public void setInfo(String colourOfBall) {
        this.colourOfBall = colourOfBall;
    }

    public void defense(){
        System.out.println(name + " is defensing well." );
    }

    public void passing(){
        System.out.println(name + " passed the ball to his teammate.");
    }

    public void dribbling(){
        System.out.println(name + " is good at dribbling.");
    }

    public String toString() {
        return "Basketball{" +
                "colourOfBall='" + colourOfBall + '\'' +
                ", name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
