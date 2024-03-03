package section_14.t_14_6;

import java.util.Objects;
import java.util.Random;

public class RandomPoem {
    private String[] article ={"pewien", "kilka","jakiś","ten","ta"};
    private String[] noun ={"chłopak", "dziewczyna","pies","ulica","samochód"};
    private String[] nounRime ={"czteropak", "Pszczyna","owies","ladacznica","pochód"};
    private String[] nounRimeSecond ={"trzepak", "koniczyna","czerkies","anielica","wschód"};

    private String[] verb ={"kierował", "skoczył","ominął","biegł","chodził"};
    private String[] preposition ={"z", "na","nad","pod","do"};
    Random random = new Random();

    private String getSentence(Integer wordIndex, int number){
        StringBuilder buffer = new StringBuilder();
        String first = article[random.nextInt(article.length-1)];
        first = first.substring(0,1).toUpperCase()+first.substring(1);
        buffer.append(first).append(" ")
                .append(noun[random.nextInt(noun.length-1)]).append(" ")
                .append(verb[random.nextInt(verb.length-1)]).append(" ")
                .append(preposition[random.nextInt(preposition.length-1)]).append(" ")
                .append(article[random.nextInt(article.length-1)]).append(" ");
        if(number==1){
            buffer.append(Objects.isNull(wordIndex) ? noun[random.nextInt(noun.length-1)] : noun[wordIndex]).append(".");
        }else if(number == 2) {
            buffer.append(Objects.isNull(wordIndex) ? nounRime[random.nextInt(nounRime.length-1)] : nounRime[wordIndex]).append(".");
        }else  {
            buffer.append(Objects.isNull(wordIndex) ? nounRimeSecond[random.nextInt(nounRimeSecond.length-1)] : nounRimeSecond[wordIndex]).append(".");
        }
        return buffer.toString();
    }


    public String getPoem(){
        StringBuilder buffer = new StringBuilder();
        int firstRime = random.nextInt(noun.length-1);
        int secondRime = random.nextInt(noun.length-1);
        while(firstRime==secondRime){
            secondRime = random.nextInt(noun.length-1);
        }
        buffer.append(getSentence(firstRime,1)).append("\n")
                .append(getSentence(firstRime,2)).append("\n")
                .append(getSentence(secondRime,1)).append("\n")
                .append(getSentence(secondRime,2)).append("\n")
                .append(getSentence(firstRime,0));
        return buffer.toString();
    }
}
