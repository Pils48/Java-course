package Task_3;

import java.util.Arrays;
   /*
   * This class is the opposite of the class Person
   * all methods mind the order of elements in an array
   * */
public class NewPerson implements Comparable<NewPerson> {
    private int age;
    private String name;

       public Address[] getAddresses() {
           return addresses;
       }

       private Address[] addresses;

    protected NewPerson(int age, String name, Address[] addresses){
        this.addresses = addresses;
        this.age= age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        Address[] SrcTmpArr = new Address[this.addresses.length];
        for (int i = 0; i < this.addresses.length; i++){
            SrcTmpArr[i] = this.addresses[i];
        }
        Arrays.sort(SrcTmpArr);
        if (obj == null ){
            return false;
        }else{
            NewPerson comperingPerson = (NewPerson) obj;
            Address[] CmpTmpArr = new Address[comperingPerson.addresses.length];
            for (int i = 0; i < comperingPerson.addresses.length; i++){
                CmpTmpArr[i] = comperingPerson.addresses[i];
            }
            Arrays.sort(CmpTmpArr);
            boolean isEqual = this.age == comperingPerson.age &&
                    this.name == comperingPerson.name &&
                    Arrays.equals(CmpTmpArr, SrcTmpArr);
            return isEqual;
        }
    }

    @Override
    public int hashCode(){
        return age + name.length() + addresses.length * (addresses[0].hashCode());
    }

    @Override
    public String toString(){
        return "Person(new): age = " + age + "\n Name: " + name + "\n Addresses: " + Arrays.toString(addresses);
    }

    @Override
    public int compareTo(NewPerson that) {
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

