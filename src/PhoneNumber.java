import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    private String name;
    private String number;

    public boolean equals(Object o){
        if(o instanceof PhoneNumber){
            PhoneNumber other = (PhoneNumber)o;
            return name.equals(other.name) &&
                    number.equals(other.number);
        }else{
            return false;
        }
    }

    public PhoneNumber (String one, String two) {
        name = one;
        number = two;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return name + ": " + number;
    }
}
