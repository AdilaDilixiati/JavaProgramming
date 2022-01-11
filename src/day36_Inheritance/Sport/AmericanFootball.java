package day36_Inheritance.Sport;

import org.w3c.dom.ls.LSOutput;

public class AmericanFootball extends Sport{

    public String shapeOfBall;

    public void setInfo(String shapeOfBall) {
        this.shapeOfBall = shapeOfBall;
    }

    public void carry(){
        System.out.println(name + " is carrying the ball.");
    }

    public void trap(){
        System.out.println(name + " is trapping.");
    }

    public String toString() {
        return "AmericanFootball{" +
                "shapeOfBall='" + shapeOfBall + '\'' +
                ", name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
