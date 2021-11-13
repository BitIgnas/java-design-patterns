package design_patterns.iterator_v1;

public class Main {

    public static void main(String[] args) {

        FastList<String> list = new FastList<>();
        list.add("Testas");
        list.add("Mikas");
        list.add("ignas");
        list.add("rytas");
//        list.print();

        System.out.println(list.getIndexSize());
        Iterator iterator = list.getIterator();
        System.out.println(iterator.next());


        iterator.removeRemaining();
        list.print();



    }
}
