package day36_Inheritance.Sport;

public class Sport{

    public String name, rules;
    public int numberOfPlayers, numberOfReferee;

    public void setInfo(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }

    public void play(){
        System.out.println("I like playing " + name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}

/*
Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferee, rules

			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google
 */
