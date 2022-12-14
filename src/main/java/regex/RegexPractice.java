package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("Cydeo", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit cydeo!");

        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("Match found!");
        }else{
            System.out.println("Match not found!");
        }


        String str = "This      is an example!!!!                  @@@@ of Example....";

        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));

        String strNew = str.replaceAll(" ", "");
        System.out.println(strNew);

    }
}
