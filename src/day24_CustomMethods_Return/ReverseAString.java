package day24_CustomMethods_Return;

public class ReverseAString {

    public static void main(String[] args) {
        String s1 = reverse("I love Java");
        System.out.println(s1);
    }

    public static String reverse (String str){

        String result = "";

        for(int i= str.length()-1; i>=0; i--){

            result += str.charAt(i);
        }

        return result;
    }
}
