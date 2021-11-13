package design_patterns.builder_v1;

public class Main {

    public static void main(String[] args) {
        Account account = new Account.Builder()
                .withId(23L)
                .withFirstname("Mikas")
                .withLastname("Katinas")
                .withNumber(232665)
                .build();
        System.out.println(account.toString());
    }
}
