package section_16.e_16_11;

import java.util.*;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
//        List<Character> list = new ArrayList<>();
//        list.add('P');
//        list.add('C');
//        list.add('M');

        System.out.println("lista zawiera: ");
        output(list);

        Collections.reverse(list);
        System.out.printf("%nPo wywołaniu reverse lista zawiera:%n");
        output(list);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        Collections.copy(copyList,list);
        System.out.printf("%nPo kopiowaniu copyList zawiera:%n");
        output(copyList);

//        Iterator<Character> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next().equals('M')){
//                iterator.remove();
//            }
//        }
//        list.add('T');
//
//        output(list);
//        output(copyList);

        Collections.fill(list,'R');
        System.out.printf("%nPo wywołaniu fill lista zawiera:%n");
        output(list);
        System.out.println(Arrays.toString(letters));
    }

    private static void output(List<Character> list) {
        System.out.print("Lista to: ");
        list.forEach(letter-> System.out.printf("%s ",letter));

        System.out.printf("%nMaksimum: %s ", Collections.max(list));
        System.out.printf("Minimum: %s %n", Collections.min(list));
    }


}
