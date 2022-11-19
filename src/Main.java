import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Address a1 = new Address("103 Borough Road", "London", "SE1 0AA");
        Address a2 = new Address("Neptune Way", "Trident Business Park", "Leeds Road",
                "Huddersfield", "HD2 1UA");
        Address a3 = new Address("24 Camrose Close", "Morden", "London", "SM4 5DQ");
        Address a4 = new Address("103 Borough Road", "London", "SE1 0AA");
        PhoneNumber p1 = new PhoneNumber("work", "02078157483");
        PhoneNumber p2 = new PhoneNumber("mobile", "07718945266");
        PhoneNumber p3 = new PhoneNumber("mobile2", "07132645275");
        PhoneNumber p4 = new PhoneNumber("mobile3", "07234288946");
        Contact c1 = new Contact("John", "Brown");
        Contact c2 = new Contact("Pierre-louis", "Guichard");
        Contact c3 = new Contact("John", "Smith");
        Contact c4 = new Contact("John", "Smith");
        c1.setAddress(String.valueOf(a3));
        c2.setAddress(String.valueOf(a2));
        c3.setAddress(String.valueOf(a1));
        c4.setAddress(String.valueOf(a1));
        c1.addPhoneNumber(p1);
        c2.addPhoneNumber(p2);
        c2.addPhoneNumber(p3);
        c2.addPhoneNumber(p4);
        c3.addPhoneNumber(p1);
        c3.addPhoneNumber(p2);
        c4.addPhoneNumber(p1);
        c4.addPhoneNumber(p2);
        Location l1 = new Location("London", 51.528308, -0.3817765);
        Location l2 = new Location("Paris", 48.8587741, 2.2069771);
        Location l3 = new Location("Paris", 48.8587741, 2.2069771);
        Location l4 = l1;
        Location l5 = l2;
        Location l6 = l5;

        Set<Location> set = new HashSet<>();
        set.add(l1);
        set.add(l2);
        set.add(l3);


        for(Location loc : set){
            System.out.println(loc);
        }
        System.out.println();
    }

}
