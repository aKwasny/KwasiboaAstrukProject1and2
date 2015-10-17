public class Pair {

    public double v;
    public Pair next;

    public Pair (double value, Pair n) {
        this.v = value;
        this.next = n;
    }

    public Pair getNext () {
        return next;
    }
}
