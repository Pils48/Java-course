package Task_3;

import java.util.Arrays;

public class TesterPerson {
    public static void main(String[] args) {
//        Address[] addresses = new Address[]{new Address(State.FL, "Miami",
//                "Ocean beach", 98)};
//        Person mike = new Person(32,"Mike",addresses);
//        System.out.println(mike);
//        Address[] anotherAddress = new Address[]{new Address(State.FL, "Miami",
//                "Ocean beach", 98)};
//        System.out.println(new Person(32,"Mike", anotherAddress).equals(mike));
//        Person sarah = new Person(22,"Sarah", new Address[]{new Address(State.CA,"Los-Angeles",
//                "3th Avenue", 67)});
//        System.out.println(sarah);
//        System.out.println(sarah.hashCode());
//        System.out.println(sarah.equals(mike));
//        System.out.println(mike.hashCode());

        NewPerson nick = new NewPerson(24,"Nick",new Address[]{new Address(State.IL,"Minessota",
                "Casual st.", 98),new Address(State.FL, "Miami",
                "Ocean beach", 98)});
        System.out.println(nick);
        System.out.println(nick.hashCode());

        NewPerson nickCmp = new NewPerson(24,"Nick",new Address[]{new Address(State.FL, "Miami",
                "Ocean beach", 98), new Address(State.IL,"Minessota",
                "Casual st.", 56)});
        System.out.println(nick.equals(nickCmp));
        Arrays.sort(nick.getAddresses());
        System.out.println(Arrays.toString(nick.getAddresses()));
    }
}
