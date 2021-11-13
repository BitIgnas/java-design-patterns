package design_patterns.singleton;


public class Database {
    private static Database instance;
    private String url;
    private Integer host;

    // Private constructor to prevent object instantiation
    // from other class
    private Database(String url, Integer host) {
        this.url = url;
        this.host = host;
    }

    // If object instance is null, new will be created.
    // Method will not create new instance if the instance
    // already exists.
    public static Database getInstance(String url, Integer host) {
        return instance == null ? instance = new Database(url, host) : instance;
    }

    @Override
    public String toString() {
        return "Database{" +
                "url='" + url + '\'' +
                ", host=" + host +
                '}';
    }

}
