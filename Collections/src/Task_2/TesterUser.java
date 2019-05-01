package Task_2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TesterUser{
    public static void main(String[] args) {
        User user1 = new User(12, "Mike");
        User user2 = new User(33,"null");
        User user3 = new User(34,"Dan");
        User user4 = new User(44, "Sarah");
        User user5 = new User(23,null);
        User user6 = new User(22,null);
        NavigableSet<User> Collective = new TreeSet<>(new UserComparator());
        Collective.add(user1);
        Collective.add(user2);
        Collective.add(user3);
        Collective.add(user4);
        Collective.add(user5);
        Collective.add(user6);
        System.out.println(Collective);
    }
}
