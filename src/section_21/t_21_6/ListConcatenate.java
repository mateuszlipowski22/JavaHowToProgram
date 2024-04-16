package section_21.t_21_6;


public class ListConcatenate {
    public static <E> void concatenate(List<E> firstList, List<E> secondList){
        firstList.lastNode.nextNode=secondList.firstNode;
    }
}
