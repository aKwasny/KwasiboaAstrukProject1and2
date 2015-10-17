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

    public void setNext (Pair next) {
        this.next = next;
    }

    public double getV () {
        return v;
    }

    public void setV (double v) {
        this.v = v;
    }
}
