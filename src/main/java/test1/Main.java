package test1;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main main = new Main();
        User user1 = new User("test1", "test1", "test@gmail.com");
        User user2 = new User("test", "test", "test@gmail.com");

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);

        users.forEach(System.out::println);
        System.out.println(Arrays.stream(new int[]{5, 4, 3}).count());
        System.out.println(Arrays.stream(new int[]{5, 4, 3}).boxed().collect(Collectors.toList()));
        System.out.println(Arrays.stream(new int[]{5, 4, 3}).mapToLong(value -> (long) value).max().getAsLong());
        System.out.println(Arrays.stream(new int[]{5, 4, 3}).mapToLong(value -> (long) value).average().getAsDouble());

        FileOutputStream fileOutputStream = new FileOutputStream("User.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user1);
        objectOutputStream.close();
        fileOutputStream.close();

        User deserializedUser = main.deserializeUser();
        System.out.println(deserializedUser);
        System.out.println(ObjectStreamClass.lookup(User.class).getSerialVersionUID());


    }

    public User deserializeUser() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("E:\\Projects\\java-playground\\User.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (User) objectInputStream.readObject();
    }
}
