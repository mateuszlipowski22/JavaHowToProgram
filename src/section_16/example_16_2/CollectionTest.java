package section_16.example_16_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "CZERWONY","BIAŁY", "NIEBIESKI"};

        List<String> list = new ArrayList<>();

        for(String color : colors){
            list.add(color);
        }

        String[] removeColors = {"CZERWONY","BIAŁY", "NIEBIESKI"};

        List<String> removeList = new ArrayList<>();

        for(String color : removeColors){
            removeList.add(color);
        }

        System.out.println("ArrayList: ");

        for(int count = 0 ; count < list.size(); count++){
            System.out.printf("%s ",list.get(count));
        }

        removeColors(list, removeList);

        System.out.printf("%nArrayList po wywołaniu metody removeColors(): %n");

        for(int count = 0 ; count < list.size(); count++){
            System.out.printf("%s ",list.get(count));
        }
    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()){
            if(collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
