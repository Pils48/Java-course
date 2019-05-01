package Task_3;

import org.jetbrains.annotations.NotNull;

public class Address implements Comparable<Address>{
    private State state;
    private String city;
    private String street;
    private int houseNumber;


    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }


    public Address(State state, String city, String street, int houseNumber){
        this.city =city;
        this.houseNumber = houseNumber;
        this.state =state;
        this.street =street;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }else{
            Address that = (Address) obj;
            return this.street == that.street &&
                    this.houseNumber == that.houseNumber &&
                      this.state == that.state &&
                        this.city == that.city;
        }
    }

    @Override
    public String toString(){
        return "Address: State " + state + ", city " + city + ", street "
                + street + ", houseNumber " + houseNumber;
    }

    @Override
    public int hashCode(){
        return 2 * city.length() + 3 * street.length() + 4 * houseNumber;
    }

    @Override
    public int compareTo(Address that) {
        if(this.houseNumber - that.houseNumber != 0){
            return  this.houseNumber - that.houseNumber;
        }else{
            if(this.state != null && that.state != null){
                return this.state.compareTo(that.state);
            }else if(this.state != null && that.state == null){
                return 1;
            }else if(this.state == null && that.state != null){
                return 1;
            }else {
                return 0;
            }
        }
    }
}
