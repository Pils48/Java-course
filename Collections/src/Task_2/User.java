package Task_2;

public class User {
    private int age;
    private String name;

    public  User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){return age;}

    public String getName(){return name;}

    @Override
    public String toString(){
        return "User[age = " + age + ", name = " + name + "]";
    }
}
