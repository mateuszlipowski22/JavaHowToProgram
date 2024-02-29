package section_14.example_14_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        Pattern expression = Pattern.compile("J.*\\d{2}-\\d[0-35-9]-\\d{2}");

        String string = "Julia urodziła się 12-05-75\n"+
        "Zofia urodziła się 04-11-55\n"+
        "Jan urodził się 24-03-73\n"+
        "Jacek urodził się 17-11-77";

        Matcher matcher = expression.matcher(string);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
