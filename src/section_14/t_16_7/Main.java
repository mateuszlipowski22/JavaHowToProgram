package section_14.t_16_7;

public class Main {
    public static void main(String[] args) {
        RandomSentence randomSentence = new RandomSentence();
        for(int i = 0 ; i < 20 ; i++){
            System.out.printf("%d : \"%s\"%n",i+1, randomSentence.getSentence());
        }
    }
}
