public class Stack {

    private Pair head; //pierwszy element

    public Stack () {
        head = null;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }
    public void put (double value)  {
        Pair pair = new Pair(value, head);
        head = pair;
    }

    public Pair get() throws ArrayIndexOutOfBoundsException {
        if (this.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Napotkano koniec stosu.");
        } else {
            Pair tmp = this.head;
            this.head = this.head.getNext();
            return tmp;
        }
    }


}
