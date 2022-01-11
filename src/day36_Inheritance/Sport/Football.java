package day36_Inheritance.Sport;

public class Football extends Sport{

    public int numberOfGoalkeeper;

    public void setInfo(int numberOfGoalkeeper){
        this.numberOfGoalkeeper = numberOfGoalkeeper;
    }

    public void pass(){
        System.out.println(name + " passed the ball to the wrong person.");
    }

    public void shoot(){
        System.out.println(name + "shot all the way to the goal.");
    }

    public String toString() {
        return "Football{" +
                "numberOfGoalkeeper=" + numberOfGoalkeeper +
                ", name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
