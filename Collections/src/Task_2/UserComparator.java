package Task_2;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getName() != null && user2.getName() != null){
            return user1.getName().length() - user2.getName().length();
        }else if(user1.getName() == null && user2.getName() != null) {
            return -user2.getName().length();
        }else if(user2.getName() == null && user1.getName() != null){
            return -user1.getName().length();
        }else {
            return user1.getAge() - user2.getAge();
        }
    }
}
