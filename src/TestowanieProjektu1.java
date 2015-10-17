public class TestowanieProjektu1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 0; i < 20; i++) {
            s.put(i);
        }

        try {
            while (true) {
                Pair w = s.get();
                System.out.println("Pobrano " + w.getV() + ".");
            }
        }
        catch(WyjatekPustegoStosu w){
            System.out.println(w.getMessage());
        }
    }
}