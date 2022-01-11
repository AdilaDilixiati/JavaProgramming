package day36_Inheritance.Sport;

public class SportObject {

    public static void main(String[] args) {

        Basketball basketball = new Basketball();
        basketball.setInfo("Daniel", "Dribbling advances the ball", 5, 2);
        basketball.setInfo("brown");
        basketball.defense();
        basketball.dribbling();

        System.out.println(basketball);

        Baseball baseball = new Baseball();
        baseball.setInfo("Justin", "tagging up", 9, 4);
        baseball.setInfo("small");
        baseball.taggingUp();
        baseball.bunt();

        System.out.println(baseball);

        Football football = new Football();
        football.setInfo("Ronaldo", "no offside", 11, 1 );
        football.setInfo(1);
        football.pass();
        football.shoot();

        System.out.println(football);

        AmericanFootball americanFootball = new AmericanFootball();
        americanFootball.setInfo("Kelvin", "defense",11, 7);
        americanFootball.setInfo("prolate spheroid");
        americanFootball.carry();
        americanFootball.trap();

        System.out.println(americanFootball);
    }
}
