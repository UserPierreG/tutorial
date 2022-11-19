import java.lang.constant.Constable;
import java.util.Objects;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String postcode;

    public boolean equals(Object o){
        if(o instanceof Address){
            Address other = (Address)o;
            return addressLine1.equals(other.addressLine1) &&
                    addressLine2.equals(other.addressLine2) &&
                    addressLine3.equals(other.addressLine3) &&
                    addressLine4.equals(other.addressLine4) &&
                    postcode.equals(other.postcode);

        }else{
            return false;
        }
    }

    public Address (String one, String two, String three, String four, String five) {
        addressLine1 = one;
        addressLine2 = two;
        addressLine3 = three;
        addressLine4 = four;
        postcode = five;
    }

    public Address (String one, String two, String three, String five) {
        addressLine1 = one;
        addressLine2 = two;
        addressLine3 = three;
        addressLine4 = "";
        postcode = five;
    }

    public Address (String one, String two, String five) {
        addressLine1 = one;
        addressLine2 = two;
        addressLine3 = "";
        addressLine4 = "";
        postcode = five;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }
    public String getAddressLine4() {
        return addressLine4;
    }

    public String getPostcode() {
        return postcode;
    }

    public String toString() {
        if (Objects.equals(addressLine3, "") && Objects.equals(addressLine4, "")) {
            return addressLine1 + "\n" + addressLine2 + "\n" + postcode + "\n";
        } else if (Objects.equals(addressLine4, "")) {
            return addressLine1 + "\n" + addressLine2 + "\n" + addressLine3 + "\n" + postcode + "\n";
        }
        return addressLine1 + "\n" + addressLine2 + "\n" + addressLine3 + "\n" + addressLine4 + "\n" + postcode + "\n";
    }
}