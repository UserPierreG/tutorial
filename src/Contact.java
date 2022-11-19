import java.util.ArrayList;
import java.util.List;

public class Contact{

    private String firstName;
    private String lastName;
    private String address;
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    public boolean equals(Object o){
        if(o instanceof Contact){
            Contact other = (Contact) o;
            return firstName.equals(other.firstName) &&
                    lastName.equals(other.lastName) &&
                    address.equals(other.address);
        }else{
            return false;
        }
    }

    public Contact (String one, String two){
        firstName = one;
        lastName = two;
    }

    public void addPhoneNumber (PhoneNumber one){
        phoneNumbers.add(one);
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        String pn = "";
        for (int i = 0; i < phoneNumbers.size(); i++) {
            pn = pn + phoneNumbers.get(i) + "\n";
        }
        return firstName + " " + lastName + "\n" + address.toString() + pn + "\n";
    }
}
