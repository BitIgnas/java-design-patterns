package design_patterns.singleton;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        Database database1 = Database.getInstance("//postgres-database", 5432);
        Database database2 = Database.getInstance("//mysql-database", 3306);
        Database database3 = Database.getInstance("//mongo-database", 9607);

        System.out.println(database1.toString());
        System.out.println(database2.toString());
        System.out.println(database3.toString());

    }
}
