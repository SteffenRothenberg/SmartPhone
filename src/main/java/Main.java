import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contactOne = new Friend("017612345","FriendOne");
        System.out.println(contactOne);
        Contact contactTwo = new Friend("0129318238", "FriendTwo");
        List<Contact> contactList = new ArrayList<>();
        contactList.add(contactOne);
        contactList.add(contactTwo);
        Smartphone smartphoneOne = new Smartphone("iPhone11","Apple", contactList);
        System.out.println(smartphoneOne);
        smartphoneOne.startRadio();
        smartphoneOne.stopRadio();
        System.out.println(smartphoneOne.radioStatus);
        smartphoneOne.stopRadio();
        smartphoneOne.startRadio();
        smartphoneOne.startRadio();
    }
}
