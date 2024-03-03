package section_14.t_16_7;

import java.util.Random;

public class RandomSentence {
    private String[] article ={"pewien", "kilka","jakiś","ten","ta"};
    private String[] noun ={"chłopak", "dziewczyna","pies","ulica","samochód"};
    private String[] verb ={"kierował", "skoczył","ominął","biegł","chodził"};
    private String[] preposition ={"z", "na","nad","pod","do"};
    Random random = new Random();

    String getSentence(){
        StringBuilder buffer = new StringBuilder();
        String first = article[random.nextInt(article.length-1)];
        first = first.substring(0,1).toUpperCase()+first.substring(1);
        buffer.append(first).append(" ")
                .append(noun[random.nextInt(noun.length-1)]).append(" ")
                .append(verb[random.nextInt(verb.length-1)]).append(" ")
                .append(preposition[random.nextInt(preposition.length-1)]).append(" ")
                .append(article[random.nextInt(article.length-1)]).append(" ")
                .append(noun[random.nextInt(noun.length-1)]).append(".");
        return buffer.toString();
    }
}
