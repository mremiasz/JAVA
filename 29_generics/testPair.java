public class testPair {
    public static void main(String[] args) {
        Pair<String,Integer> p1 = new Pair<>("Tomasz",222);
        Pair<Double,Double> p2 = new Pair<>(3.14,2.67 );
        Pair<String,String> p3 = new Pair<>("Mic","Rem");

        printer(p1);
        printer(p2);
        printer(p3);
    }

    static <T,V> void printer(Pair<T,V>pair){
        System.out.println("< "+ pair.getT() + ", " + pair.getT().getClass() + "; "+ pair.getV() + ", "+pair.getV().getClass()+">");
    }
}
