package section_20.t_20_8;

public class Pair <F,S>{
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("Pair<%s,%s> {%s,%s}",
                first.getClass().getSimpleName(),
                second.getClass().getSimpleName(),
                first.toString(),
                second.toString());
    }
}
