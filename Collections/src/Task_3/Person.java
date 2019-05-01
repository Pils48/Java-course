package Task_3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
   /*
   * For method equals in this class return true only for arrays that have
   * the same element at the same position ([1,2,4] equal [1,2,4]) also
   * methods hashCode and toString don't mind order of element in array of addresses
   * */
public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private Address[] addresses;

    protected Person(int age, String name, Address[] addresses){
            this.addresses = addresses;
            this.age= age;
            this.name = name;
    }

    @Override
    public boolean equals(Object obj){
       if (obj == null ){
           return false;
       }else{
           Person comperingPerson = (Person) obj;
           boolean isEqual = this.age == comperingPerson.age &&
                    this.name == comperingPerson.name &&
                      Arrays.equals(this.addresses, comperingPerson.addresses);
           return isEqual;
       }
    }

    @Override
    public int hashCode(){
        return age + name.length() + addresses.length * (addresses[0].hashCode());
    }

    @Override
    public String toString(){
       return "Person: age = " + age + "\n Name: " + name + "\n Addresses: " + Arrays.toString(addresses);
    }

    @Override
    public int compareTo(Person that) {
        if (this.age - that.age != 0){
            return this.age - that.age;
        }else{
            if(this.name != null && that.name != null){
                return this.name.length() - that.name.length();
            }else if(this.name == null && that.name != null){
                return 1;
            }else if(this.name != null && that.name == null){
                return 1;
            }else{
                if(this.addresses != null && that.addresses != null){
                    return this.addresses[0].getHouseNumber() - that.addresses[0].getHouseNumber();
                }else if(this.addresses != null && that.addresses == null){
                    return 1;
                }else if(this.addresses == null && that.addresses != null){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
}
