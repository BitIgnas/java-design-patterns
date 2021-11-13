package design_patterns.iterator;

public class Main {

    public static void main(String[] args) {

        Collection collection = new VehicleCollection();
//        for (Iterator itr = collection.getIterator(); itr.hasNext();) {
//            System.out.println(itr.next());
//        }

        Iterator itr = collection.getIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
