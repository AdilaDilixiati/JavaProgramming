package day15_ForLoop;

public class LettersDigitsSpecialcharacters {

    public static void main(String[] args) {

        String str = "BCd45@mn1!";

        String letters = " ";
        String digits = " ";
        String characters = " ";

        for (int i = 0; i < str.length(); i++) {

            char pw = str.charAt(i);

            if (pw >= '0' && pw <= '9') {
                digits += pw;
            } else if (pw >= 'A' && pw <= 'Z') {
                letters += pw;
            } else if (pw >= 'a' && pw <= 'z') {
                letters += pw;
            } else {
                if (pw != ' ') {
                    characters += pw;
                }
            }
        }

        System.out.println("digits : " + digits);
        System.out.println("letters : " + letters);
        System.out.println("characters : " + characters);
    }

}

/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */