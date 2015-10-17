public class Testing {
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 0; i < 20; i++) {
            s.put(i);
        }

        try {
            while (true) {
                Pair v = s.get().getNext();
                System.out.println("Pobrano " + v.getV() + ".");
            }
        }
        catch(WyjatekPustegoStosu w){
            System.out.println(w.getMessage());
        }
    }
}